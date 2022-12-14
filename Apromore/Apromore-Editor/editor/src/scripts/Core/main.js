/**
 * Copyright (c) 2006
 * Martin Czuchra, Nicolas Peters, Daniel Polak, Willi Tscheschner
 *
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 **/

var idCounter = 0;
var ID_PREFIX = "resource";

/**
 * Main initialization method. To be called when loading
 * of the document, including all scripts, is completed.
 */
function init() {
    "use strict";

    /* When the blank image url is not set programatically to a local
     * representation, a spacer gif on the site of ext is loaded from the
     * internet. This causes problems when internet or the ext site are not
     * available. */
    Ext.BLANK_IMAGE_URL = (ORYX.CONFIG.BLANK_IMAGE) || (ORYX.PATH + 'libs/ext-2.0.2/resources/images/default/s.gif');

    var lang = ORYX.I18N.Language;
    document.documentElement.className += " " + lang.split("_").concat(lang).uniq().join(" ");
    var browser = Ext.isIE7 ? "x-ie x-ie7" : (Ext.isIE ? "x-ie" : (Ext.isGecko ? "x-gecko" : (ORYX.Utils.isIPad() ? "x-ipad" : "x-other")));
    var version = ORYX.Utils.getBrowserVersion();
    document.documentElement.className += " " + browser + " " + browser + "-" + version.replace(/\./g, "-");

    ORYX.Log.debug("Querying editor instances");
    ORYX.Editor.setMissingClasses();

    // If someone wants to create the editor instance himself
    if (window.onOryxResourcesLoaded) {
        window.onOryxResourcesLoaded();
    } else if (window.location.pathname.include(ORYX.CONFIG.ORYX_NEW_URL)) {
        new ORYX.Editor({
            id: 'oryx-canvas123',
            fullscreen: true,
            stencilset: {
                url: "/oryx" + ORYX.Utils.getParamFromUrl("stencilset")
            }
        });
    } else {
        //HACK for distinguishing between different backends
        // Backend of 2008 uses /self URL ending
        var modelUrl = window.location.href.replace(/#.*/g, "");
        if (modelUrl.endsWith("/self")) {
            modelUrl = modelUrl.replace("/self", "/json");
        } else {
            modelUrl += "&data";
        }

        ORYX.Editor.createByUrl(modelUrl, {
            id: modelUrl
        });
    }
}

/**
 @namespace Global Oryx name space
 @name ORYX
 */
if (!ORYX) {
    var ORYX = {};
}

/**
 * The Editor class.
 * @class ORYX.Editor
 * @extends Clazz
 * @param {Object} config An editor object, passed to {@link ORYX.Editor#loadSerialized}
 * @param {String} config.id Any ID that can be used inside the editor. If fullscreen=false, any HTML node with this id must be present to render the editor to this node.
 * @param {boolean} [config.fullscreen=true] Render editor in fullscreen mode or not.
 * @param {String} config.stencilset.url Stencil set URL.
 * @param {String} [config.stencil.id] Stencil type used for creating the canvas.
 * @param {Object} config.properties Any properties applied to the canvas.
 */
ORYX.Editor = {
    /** @lends ORYX.Editor.prototype */
    // Defines the global dom event listener
    DOMEventListeners: new Hash(),

    // Defines the selection
    selection: [],

    // Defines the current zoom level
    zoomLevel: 1.0,

    construct: function (config) {
        "use strict";
        // initialization.
        this._eventsQueue = [];
        this.loadedPlugins = [];
        this.pluginsData = [];
        this.modelMetaData = config;

        var model = config;
        if (config.model) {
            model = config.model;
        }

        this.id = model.resourceId;
        if (!this.id) {
            this.id = model.id;
            if (!this.id) {
                this.id = ORYX.Editor.provideId();
            }
        }

        var langs = (config.languages || []).sort(function (k, h) {
            return config.position - config.position;
        });
        this._initNumberFormat(config.numberFormat, config.currency);

        // Defines if the editor should be fullscreen or not
        this.fullscreen = config.fullscreen !== false;

        if (Signavio && Signavio.Helper && Signavio.Helper.ShowMask instanceof Function) {
            Signavio.Helper.ShowMask(true, !this.fullscreen ? this.id : Ext.getBody());
        }

        // Initialize the eventlistener
        this._initEventListener();

        // Load particular stencilset
        if (ORYX.CONFIG.BACKEND_SWITCH) {
            var ssUrl = (model.stencilset.namespace || model.stencilset.url).replace("#", "%23");
            ORYX.Core.StencilSet.loadStencilSet(ORYX.CONFIG.STENCILSET_HANDLER + ssUrl, this.id);
        } else {
            var ssUrl = model.stencilset.url;
            ORYX.Core.StencilSet.loadStencilSet(ssUrl, this.id);
        }

        this._loadStencilSetExtensionConfig();

        // Load predefined StencilSetExtensions
        if (!!ORYX.CONFIG.SSEXTS) {
            ORYX.CONFIG.SSEXTS.each(function (ssext) {
                this.loadSSExtension(ssext.namespace);
            }.bind(this));
        }

        // CREATES the canvas
        this._createCanvas(model.stencil ? model.stencil.id : null, model.properties, langs);

        // GENERATES the whole EXT.VIEWPORT
        this._generateGUI();

        // Initializing of a callback to check loading ends
        var loadPluginFinished = false;
        var loadContentFinished = false;
        var initFinished = function () {
            if (!loadPluginFinished || !loadContentFinished) {
                return;
            }
            this._finishedLoading();
        }.bind(this);

        // disable key events when Ext modal window is active
        ORYX.Editor.makeExtModalWindowKeysave(this._getPluginFacade());

        // LOAD the plugins
        window.setTimeout(function () {
            this.loadPlugins();
            loadPluginFinished = true;
            initFinished();
        }.bind(this), 100);

        // LOAD the content of the current editor instance
        window.setTimeout(function () {
            this.loadSerialized(model, langs, true); // Request the meta data as well
            this.getCanvas().update();
            loadContentFinished = true;
            initFinished();
        }.bind(this), 200);
    },

    _finishedLoading: function () {
        "use strict";
        if (Ext.getCmp('oryx-loading-panel')) {
            Ext.getCmp('oryx-loading-panel').hide();
        }

        this.renderModeSelection();

        // Do Layout for viewport
        this.layout.doLayout();

        // Generate a drop target
        new Ext.dd.DropTarget(this.getCanvas().rootNode.parentNode);

        Ext.Component.prototype.stateful = false;
        Ext.Component.prototype.saveState = Ext.Component.prototype.saveState.createInterceptor(function () {
            return this.stateful !== false;
        });

        // Fixed the problem that the viewport can not
        // start with collapsed panels correctly
        if (ORYX.CONFIG.PANEL_RIGHT_COLLAPSED === true) {
            this.layout_regions.east.collapse();
        }
        if (ORYX.CONFIG.PANEL_LEFT_COLLAPSED === true) {
            this.layout_regions.west.collapse();
        }

        if (String(window.navigator.userAgent).include("Firefox/3.5 Prism") && "function" == typeof this.layout.fireResize) {
            window.setTimeout(function (element) {
                this.layout.fireResize(element.getWidth(), element.getHeight());
            }.bind(this, Ext.getBody()), 100);
        }

        // Raise Loaded Event
        this.handleEvents({
            type: ORYX.CONFIG.EVENT_LOADED
        });

        // Rescale viewport to show the entire model
        this.zoomFitToModel();
    },

    _initNumberFormat: function (numFormat, currencyFormat) {
        "use strict";
        var format = new Signavio.Utils.NumberFormatter(numFormat, currencyFormat);
        Signavio.Utils.registerNumberFormatterFunctions(format);
    },

    // BEGIN Egregious cut'n'pasted functions from view.js

    zoomFitToModel: function () {
        "use strict";
        /* Get the size of the visible area of the canvas */
        var scrollNode = this.getCanvas().getHTMLContainer().parentNode.parentNode,
            visibleHeight = scrollNode.getHeight() - 30,
            visibleWidth = scrollNode.getWidth() - 30,
            nodes = this.getCanvas().getChildShapes();

        if (!nodes || nodes.length < 1) {
            return false;
        }

        /* Calculate size of canvas to fit the model */
        var bounds = nodes[0].absoluteBounds().clone();
        nodes.each(function (node) {
            bounds.include(node.absoluteBounds().clone());
        });


        /* Set new Zoom Level */
        var scaleFactorWidth = visibleWidth / bounds.width(),
            scaleFactorHeight = visibleHeight / bounds.height(),
            zoomFactor = scaleFactorHeight < scaleFactorWidth ? scaleFactorHeight : scaleFactorWidth;

        /*Test if maximum zoom is reached*/
        if (zoomFactor > this.maxFitToScreenLevel) {
            zoomFactor = this.maxFitToScreenLevel;
        }
        /* Do zooming */
        this.setAFixZoomLevel(zoomFactor);

        /* Set scroll bar position */
        scrollNode.scrollTop = Math.round(bounds.upperLeft().y * this.zoomLevel) - 5;
        scrollNode.scrollLeft = Math.round(bounds.upperLeft().x * this.zoomLevel) - 5;
    },

    // CONTINUE Egregious cut'n'pasted functions from view.js

    setAFixZoomLevel: function (zoomLevel) {
        "use strict";
        this.zoomLevel = zoomLevel;
        this._checkZoomLevelRange();
        this.zoom(1);
    },

    // CONTINUE Egregious cut'n'pasted functions from view.js

    _checkZoomLevelRange: function () {
        "use strict";
        if (this.zoomLevel < this.minZoomLevel) {
            this.zoomLevel = this.minZoomLevel;
        }

        if (this.zoomLevel > this.maxZoomLevel) {
            this.zoomLevel = this.maxZoomLevel;
        }
    },

    // CONTINUE Egregious cut'n'pasted functions from view.js

    zoom: function (factor) {
        "use strict";
        this.zoomLevel *= factor;
        var scrollNode = this.getCanvas().getHTMLContainer().parentNode.parentNode;
        var canvas = this.getCanvas();
        var newWidth = canvas.bounds.width() * this.zoomLevel;
        var newHeight = canvas.bounds.height() * this.zoomLevel;

        /* Set new top offset */
        var offsetTop = (canvas.node.parentNode.parentNode.parentNode.offsetHeight - newHeight) / 2.0;
        offsetTop = offsetTop > 20 ? offsetTop - 20 : 0;
        canvas.node.parentNode.parentNode.style.marginTop = offsetTop + "px";
        offsetTop += 5;
        canvas.getHTMLContainer().style.top = offsetTop + "px";

        /*readjust scrollbar*/
        var newScrollTop = scrollNode.scrollTop - Math.round((canvas.getHTMLContainer().parentNode.getHeight() - newHeight) / 2) + this.diff;
        var newScrollLeft = scrollNode.scrollLeft - Math.round((canvas.getHTMLContainer().parentNode.getWidth() - newWidth) / 2) + this.diff;

        /* Set new Zoom-Level */
        canvas.setSize({width: newWidth, height: newHeight}, true);

        /* Set Scale-Factor */
        canvas.node.setAttributeNS(null, "transform", "scale(" + this.zoomLevel + ")");

        /* Refresh the Selection */
        this.updateSelection();
        scrollNode.scrollTop = newScrollTop;
        scrollNode.scrollLeft = newScrollLeft;

        /* Update the zoom-level*/
        canvas.zoomLevel = this.zoomLevel;
    },

    // END Egregious cut'n'pasted functions from view.js

    _initEventListener: function () {
        "use strict";
        // Register on Events

        document.documentElement.addEventListener(ORYX.CONFIG.EVENT_KEYDOWN, this.catchKeyDownEvents.bind(this), false);
        document.documentElement.addEventListener(ORYX.CONFIG.EVENT_KEYUP, this.catchKeyUpEvents.bind(this), false);

        // Enable Key up and down Event
        this._keydownEnabled = true;
        this._keyupEnabled = true;

        this.DOMEventListeners[ORYX.CONFIG.EVENT_MOUSEDOWN] = [];
        this.DOMEventListeners[ORYX.CONFIG.EVENT_MOUSEUP] = [];
        this.DOMEventListeners[ORYX.CONFIG.EVENT_MOUSEOVER] = [];
        this.DOMEventListeners[ORYX.CONFIG.EVENT_MOUSEOUT] = [];
        this.DOMEventListeners[ORYX.CONFIG.EVENT_SELECTION_CHANGED] = [];
        this.DOMEventListeners[ORYX.CONFIG.EVENT_MOUSEMOVE] = [];
    },

    /**
     * Generate the whole viewport of the
     * Editor and initialized the Ext-Framework
     */
    _generateGUI: function () {
        "use strict";

        // Defines the layout height if it's NOT fullscreen
        var layoutHeight = ORYX.CONFIG.WINDOW_HEIGHT,
            canvasParent = this.getCanvas().rootNode.parentNode,

        /**
         * Extend the Region implementation so that,
         * the clicking area can be extend to the whole collapse area and
         * an title can now be shown.
         */
        oldGetCollapsedEl = Ext.layout.BorderLayout.Region.prototype.getCollapsedEl;
        Ext.layout.BorderLayout.Region.prototype.getCollapsedEl = function () {
            oldGetCollapsedEl.apply(this, arguments);

            if (this.collapseMode !== 'mini' && this.floatable === false && this.expandTriggerAll === true) {
                this.collapsedEl.addClassOnOver("x-layout-collapsed-over");
                this.collapsedEl.on("mouseover", this.collapsedEl.addClass.bind(this.collapsedEl, "x-layout-collapsed-over"));
                this.collapsedEl.on("click", this.onExpandClick, this);
            }

            if (this.collapseTitle) {
                // Use SVG to rotate text
                var svg = ORYX.Editor.graft("http://www.w3.org/2000/svg", this.collapsedEl.dom,
                    ['svg', {style: "position:relative;left:" + (this.position === "west" ? 4 : 6) + "px;top:" + (this.position === "west" ? 2 : 5) + "px;"},
                        ['text', {transform: "rotate(90)", x: 0, y: 0, "stroke-width": "0px", fill: "#EEEEEE", style: "font-weight:bold;", "font-size": "11"}, this.collapseTitle]
                    ]),
                    text = svg.childNodes[0];
                svg.setAttribute("xmlns:svg", "http://www.w3.org/2000/svg");

                // Rotate the west into the other side
                if (this.position === "west" && text.getComputedTextLength instanceof Function) {
                    // Wait till rendered
                    window.setTimeout(function () {
                        var length = text.getComputedTextLength();
                        text.setAttributeNS(null, "transform", "rotate(-90, " + ((length / 2) + 7) + ", " + ((length / 2) - 3) + ")");
                    }, 1)
                }
                delete this.collapseTitle;
            }
            return this.collapsedEl;
        };

        // DEFINITION OF THE VIEWPORT AREAS
        this.layout_regions = {

            // DEFINES TOP-AREA
            north: new Ext.Panel({ //TOOO make a composite of the oryx header and addable elements (for toolbar), second one should contain margins
                region: 'north',
                cls: 'x-panel-editor-north',
                autoEl: 'div',
                border: false
            }),

            // DEFINES RIGHT-AREA
            east: new Ext.Panel({
                region: 'east',
                layout: 'fit',
                cls: 'x-panel-editor-east',
                autoEl: 'div',
                collapseTitle: ORYX.I18N.View.East,
                titleCollapse: true,
                border: false,
                cmargins: {left: 0, right: 0},
                floatable: false,
                expandTriggerAll: true,
                collapsible: true,
                width: ORYX.CONFIG.PANEL_RIGHT_WIDTH || 200,
                split: true,
                title: "East"
            }),

            // DEFINES BOTTOM-AREA
            south: new Ext.Panel({
                region: 'south',
                cls: 'x-panel-editor-south',
                autoEl: 'div',
                border: false
            }),

            // DEFINES LEFT-AREA
            west: new Ext.Panel({
                region: 'west',
                layout: 'anchor',
                autoEl: 'div',
                cls: 'x-panel-editor-west',
                collapsible: true,
                titleCollapse: true,
                collapseTitle: ORYX.I18N.View.West,
                width: ORYX.CONFIG.PANEL_LEFT_WIDTH || 200,
                autoScroll: Ext.isIPad ? false : true,
                cmargins: {left: 0, right: 0},
                floatable: false,
                expandTriggerAll: true,
                split: true,
                title: "West"
            }),

            // DEFINES CENTER-AREA (FOR THE EDITOR)
            center: new Ext.Panel({
                region: 'center',
                cls: 'x-panel-editor-center',
                autoScroll: true,
                items: {
                    layout: "fit",
                    autoHeight: true,
                    el: canvasParent
                }
            }),

            info: new Ext.Panel({
                region: "south",
                cls: "x-panel-editor-info",
                autoEl: "div",
                border: false,
                layout: "fit",
                cmargins: {
                    top: 0,
                    bottom: 0,
                    left: 0,
                    right: 0
                },
                collapseTitle: "Information",
                floatable: false,
                titleCollapse: false,
                expandTriggerAll: true,
                collapsible: true,
                split: true,
                title: "Information",
                height: 100,
                tools: [
                    {
                        id: "close",
                        handler: function (g, f, e) {
                            e.hide();
                            e.ownerCt.layout.layout()
                        }
                    }
                ]
            })
        };

        // Config for the Ext.Viewport
        var layout_config = {
            layout: "border",
            items: [this.layout_regions.north, this.layout_regions.east, this.layout_regions.south, this.layout_regions.west, new Ext.Panel({
                layout: "border",
                region: "center",
                border: false,
                items: [this.layout_regions.center, this.layout_regions.info]
            })]
        };

        // IF Fullscreen, use a viewport
        if (this.fullscreen) {
            this.layout = new Ext.Viewport(layout_config);

            // IF NOT, use a panel and render it to the given id
        } else {
            layout_config.renderTo = this.id;
            layout_config.height = layoutHeight;
            this.layout = new Ext.Panel(layout_config)
        }

        this.layout_regions.info.hide();
        if (Ext.isIPad && "undefined" != typeof iScroll) {
            this.getCanvas().iscroll = new iScroll(this.layout_regions.center.body.dom.firstChild, {
                touchCount: 2
            })
        }

        // Set the editor to the center, and refresh the size
        canvasParent.parentNode.setAttributeNS(null, 'align', 'center');
        canvasParent.setAttributeNS(null, 'align', 'left');
        this.getCanvas().setSize({
            width: ORYX.CONFIG.CANVAS_WIDTH,
            height: ORYX.CONFIG.CANVAS_HEIGHT
        });

    },

    renderModeSelection: function () {
        if (!ORYX.CONFIG.MODE_SELECTION_ENABLED) {
            return
        }
        var b = $("header-mode-selection-container");
        if (!b) {
            return
        }
        if (this.getStencilSets().keys()[0] === "http://b3mn.org/stencilset/bpmn2.0#") {
            var a = [
                {
                    text: Signavio.I18N.ModeSelection.quickModel,
                    description: Signavio.I18N.ModeSelection.quickModelDesc,
                    icon: "/images/famfamfam/table_edit.png",
                    handler: function c() {
                        if (this.changeDifference !== 0 || (this.modelMetaData["new"] && this.modelMetaData.model.childShapes)) {
                            this.showEditorChangeDialog()
                        } else {
                            this.changeToEditor()
                        }
                    }.bind(this)
                },
                {
                    text: Signavio.I18N.ModeSelection.comparator,
                    icon: "/images/famfamfam/report.png",
                    handler: function () {
                        if (this.changeDifference !== 0 || (this.modelMetaData["new"] && this.modelMetaData.model.childShapes)) {
                            this.showComparatorChangeDialog()
                        } else {
                            this.changeToComparator()
                        }
                    }.bind(this)
                }
            ];
            if (ORYX.CONFIG.MODE_SIMULATION_ENABLED) {
                a.push({
                    text: Signavio.I18N.ModeSelection.simulation,
                    icon: "/images/famfamfam/chart_curve.png",
                    handler: function () {
                        if (this.changeDifference !== 0 || (this.modelMetaData["new"] && this.modelMetaData.model.childShapes)) {
                            this.showSimulationChangeDialog()
                        } else {
                            this.changeToSimulation()
                        }
                    }.bind(this)
                })
            }
            this.modeSelection = new Ext.Toolbar.SplitButton({
                cls: "x-btn-text",
                id: "header-mode-selection",
                renderTo: "header-mode-selection-container",
                text: Signavio.I18N.ModeSelection.graphicalEditor,
                menu: new Ext.menu.Menu({
                    cls: "mode-selection-menu",
                    items: a
                }),
                listeners: {
                    click: function (d, e) {
                        if (!d.menu.isVisible() && !d.ignoreNextClick) {
                            d.showMenu()
                        } else {
                            d.hideMenu()
                        }
                    }
                }
            });
            this.registerOnEvent(ORYX.CONFIG.EVENT_SELECTION_CHANGED, function () {
                if (!this.modeSelection.menu.hidden) {
                    this.modeSelection.menu.hide()
                }
            }.bind(this))
        }
    },

    /**
     * adds a component to the specified region
     *
     * @param {String} region
     * @param {Ext.Component} component
     * @param {String} title, optional
     * @return {Ext.Component} dom reference to the current region or null if specified region is unknown
     */
    addToRegion: function (region, component, title) {
        if (region.toLowerCase && this.layout_regions[region.toLowerCase()]) {
            var current_region = this.layout_regions[region.toLowerCase()];

            current_region.add(component);

            ORYX.Log.debug("original dimensions of region %0: %1 x %2", current_region.region, current_region.width, current_region.height);

            // update dimensions of region if required.
            if (!current_region.width && component.initialConfig && component.initialConfig.width) {
                ORYX.Log.debug("resizing width of region %0: %1", current_region.region, component.initialConfig.width);
                current_region.setWidth(component.initialConfig.width)
            }
            if (component.initialConfig && component.initialConfig.height) {
                ORYX.Log.debug("resizing height of region %0: %1", current_region.region, component.initialConfig.height);
                var current_height = current_region.height || 0;
                current_region.height = component.initialConfig.height + current_height;
                current_region.setHeight(component.initialConfig.height + current_height)
            }

            // set title if provided as parameter.
            if (typeof title == "string") {
                current_region.setTitle(title);
            }

            // trigger doLayout() and show the pane
            current_region.ownerCt.doLayout();
            current_region.show();

            if (Ext.isMac) {
                ORYX.Editor.resizeFix();
            }

            return current_region;
        }

        return null;
    },

    getAvailablePlugins: function () {
        var curAvailablePlugins = ORYX.availablePlugins.clone();
        curAvailablePlugins.each(function (plugin) {
            if (this.loadedPlugins.find(function (loadedPlugin) {
                return loadedPlugin.type == this.name;
            }.bind(plugin))) {
                plugin.engaged = true;
            } else {
                plugin.engaged = false;
            }
        }.bind(this));
        return curAvailablePlugins;
    },

    loadScript: function (url, callback) {
        var script = document.createElement("script");
        script.type = "text/javascript";
        if (script.readyState) {  //IE
            script.onreadystatechange = function () {
                if (script.readyState == "loaded" || script.readyState == "complete") {
                    script.onreadystatechange = null;
                    callback();
                }
            };
        } else {  //Others
            script.onload = function () {
                callback();
            };
        }
        script.src = url;
        document.getElementsByTagName("head")[0].appendChild(script);
    },
    /**
     * activate Plugin
     *
     * @param {String} name
     * @param {Function} callback
     *        callback(sucess, [errorCode])
     *            errorCodes: NOTUSEINSTENCILSET, REQUIRESTENCILSET, NOTFOUND, YETACTIVATED
     */
    activatePluginByName: function (name, callback, loadTry) {

        var match = this.getAvailablePlugins().find(function (value) {
            return value.name == name
        });
        if (match && (!match.engaged || (match.engaged === 'false'))) {
            var loadedStencilSetsNamespaces = this.getStencilSets().keys();
            var facade = this._getPluginFacade();
            var me = this;
            ORYX.Log.debug("Initializing plugin '%0'", match.name);

            if (!match.requires || !match.requires.namespaces || match.requires.namespaces.any(function (req) {
                return loadedStencilSetsNamespaces.indexOf(req) >= 0
            })) {
                if (!match.notUsesIn || !match.notUsesIn.namespaces || !match.notUsesIn.namespaces.any(function (req) {
                    return loadedStencilSetsNamespaces.indexOf(req) >= 0
                })) {

                    try {

                        var className = eval(match.name);
                        var newPlugin = new className(facade, match);
                        newPlugin.type = match.name;

                        // If there is an GUI-Plugin, they get all Plugins-Offer-Meta-Data
                        if (newPlugin.registryChanged)
                            newPlugin.registryChanged(me.pluginsData);

                        // If there have an onSelection-Method it will pushed to the Editor Event-Handler
                        if (newPlugin.onSelectionChanged)
                            me.registerOnEvent(ORYX.CONFIG.EVENT_SELECTION_CHANGED, newPlugin.onSelectionChanged.bind(newPlugin));
                        this.loadedPlugins.push(newPlugin);
                        this.loadedPlugins.each(function (loaded) {
                            if (loaded.registryChanged)
                                loaded.registryChanged(this.pluginsData);
                        }.bind(me));
                        callback(true);

                    } catch (e) {
                        ORYX.Log.warn("Plugin %0 is not available", match.name);
                        if (!!loadTry) {
                            callback(false, "INITFAILED");
                            return;
                        }
                        this.loadScript("plugins/scripts/" + match.source, this.activatePluginByName.bind(this, match.name, callback, true));
                    }
                } else {
                    callback(false, "NOTUSEINSTENCILSET");
                    ORYX.Log.info("Plugin need a stencilset which is not loaded'", match.name);
                }

            } else {
                callback(false, "REQUIRESTENCILSET");
                ORYX.Log.info("Plugin need a stencilset which is not loaded'", match.name);
            }


        } else {
            callback(false, match ? "NOTFOUND" : "YETACTIVATED");
            //TODO error handling
        }
    },

    /**
     *  Laden der Plugins
     */
    loadPlugins: function () {

        // if there should be plugins but still are none, try again.
        // TODO this should wait for every plugin respectively.
        /*if (!ORYX.Plugins && ORYX.availablePlugins.length > 0) {
         window.setTimeout(this.loadPlugins.bind(this), 100);
         return;
         }*/

        var me = this;
        var newPlugins = [];


        var loadedStencilSetsNamespaces = this.getStencilSets().keys();

        // Available Plugins will be initalize
        var facade = this._getPluginFacade();

        // If there is an Array where all plugins are described, than only take those
        // (that comes from the usage of oryx with a mashup api)
        if (ORYX.MashupAPI && ORYX.MashupAPI.loadablePlugins && ORYX.MashupAPI.loadablePlugins instanceof Array) {

            // Get the plugins from the available plugins (those who are in the plugins.xml)
            ORYX.availablePlugins = $A(ORYX.availablePlugins).findAll(function (value) {
                return ORYX.MashupAPI.loadablePlugins.include(value.name)
            });

            // Add those plugins to the list, which are only in the loadablePlugins list
            ORYX.MashupAPI.loadablePlugins.each(function (className) {
                if (!(ORYX.availablePlugins.find(function (val) {
                    return val.name == className
                }))) {
                    ORYX.availablePlugins.push({name: className });
                }
            })
        }


        ORYX.availablePlugins.each(function (value) {
            ORYX.Log.debug("Initializing plugin '%0'", value.name);
            if ((!value.requires || !value.requires.namespaces || value.requires.namespaces.any(function (req) {
                return loadedStencilSetsNamespaces.indexOf(req) >= 0
            }) ) &&
                (!value.notUsesIn || !value.notUsesIn.namespaces || !value.notUsesIn.namespaces.any(function (req) {
                    return loadedStencilSetsNamespaces.indexOf(req) >= 0
                }) ) &&
                /*only load activated plugins or undefined */
                (value.engaged || (value.engaged === undefined))) {

                try {
                    var className = eval(value.name);
                    if (className) {
                        var plugin = new className(facade, value);
                        plugin.type = value.name;
                        newPlugins.push(plugin);
                        plugin.engaged = true;
                    }
                } catch (e) {
                    ORYX.Log.warn("Plugin %0 is not available", value.name);
                }

            } else {
                ORYX.Log.info("Plugin need a stencilset which is not loaded'", value.name);
            }

        });

        newPlugins.each(function (value) {
            // If there is an GUI-Plugin, they get all Plugins-Offer-Meta-Data
            if (value.registryChanged)
                value.registryChanged(me.pluginsData);

            // If there have an onSelection-Method it will pushed to the Editor Event-Handler
            if (value.onSelectionChanged)
                me.registerOnEvent(ORYX.CONFIG.EVENT_SELECTION_CHANGED, value.onSelectionChanged.bind(value));
        });

        this.loadedPlugins = newPlugins;

        // Hack for the Scrollbars
        if (Ext.isMac) {
            ORYX.Editor.resizeFix();
        }

        this.registerPluginsOnKeyEvents();

        this.setSelection();

    },

    /**
     * Loads the stencil set extension file, defined in ORYX.CONFIG.SS_EXTENSIONS_CONFIG
     */
    _loadStencilSetExtensionConfig: function () {
        // load ss extensions
        new Ajax.Request(ORYX.CONFIG.SS_EXTENSIONS_CONFIG, {
            method: 'GET',
            asynchronous: false,
            onSuccess: (function (transport) {
                this.ss_extensions_def = Ext.decode(transport.responseText);
            }).bind(this),
            onFailure: (function (transport) {
                ORYX.Log.error("Editor._loadStencilSetExtensionConfig: Loading stencil set extension configuration file failed." + transport);
            }).bind(this)
        });
    },

    /**
     * Creates the Canvas
     * @param {String} [stencilType] The stencil type used for creating the canvas. If not given, a stencil with myBeRoot = true from current stencil set is taken.
     * @param {Object} [canvasConfig] Any canvas properties (like language).
     */
    _createCanvas: function (stencilType, canvasConfig, lang) {
        if (stencilType) {
            // Add namespace to stencilType
            if (stencilType.search(/^http/) === -1) {
                stencilType = this.getStencilSets().values()[0].namespace() + stencilType;
            }
        } else {
            // Get any root stencil type
            stencilType = this.getStencilSets().values()[0].findRootStencilName();
        }

        // get the stencil associated with the type
        var canvasStencil = ORYX.Core.StencilSet.stencil(stencilType);

        if (!canvasStencil) {
            ORYX.Log.fatal("Initialisation failed, because the stencil with the type %0 is not part of one of the loaded stencil sets.", stencilType);
        }

        // create all dom
        var div = ORYX.Editor.graft("http://www.w3.org/1999/xhtml", null, ['div']);
        // set class for custom styling
        div.addClassName("ORYX_Editor");

        // create the canvas
        this._canvas = new ORYX.Core.Canvas({
            width: ORYX.CONFIG.CANVAS_WIDTH,
            height: ORYX.CONFIG.CANVAS_HEIGHT,
            eventHandlerCallback: this.handleEvents.bind(this),
            id: this.id,
            parentNode: div,
            language: lang
        }, canvasStencil);

        if (canvasConfig && canvasConfig.properties) {
            // Migrate canvasConfig to an RDF-like structure
            var properties = [];
            for (field in canvasConfig.properties) {
                properties.push({
                    prefix: 'oryx',
                    name: field,
                    value: canvasConfig.properties[field],
                    format: (canvasConfig.formats ? canvasConfig.formats[field] : [])
                });
            }

            this._canvas.deserialize(properties);
            if (this.modelMetaData.model && this.modelMetaData.model.orientation) {
                this._canvas.setOrientation(this.modelMetaData.model.orientation)
            }
            if (this.modelMetaData.imageMaxWidth && this.modelMetaData.imageMaxWidth > 0) {
                this._canvas.imageMaxWidth = this.modelMetaData.imageMaxWidth
            } else {
                this._canvas.imageMaxWidth = undefined
            }
            if (this.modelMetaData.imageMaxHeight && this.modelMetaData.imageMaxHeight > 0) {
                this._canvas.imageMaxHeight = this.modelMetaData.imageMaxHeight
            } else {
                this._canvas.imageMaxHeight = undefined
            }
        }

    },

    /**
     * Returns a per-editor singleton plugin facade.
     * To be used in plugin initialization.
     */
    _getPluginFacade: function () {
        if (!(this._pluginFacade)) {
            this._pluginFacade = (function () {
                return {
                    activatePluginByName: this.activatePluginByName.bind(this),
                    //deactivatePluginByName:		this.deactivatePluginByName.bind(this),
                    getAvailablePlugins: this.getAvailablePlugins.bind(this),
                    offer: this.offer.bind(this),
                    getStencilSets: this.getStencilSets.bind(this),
                    getStencilSetExtensionDefinition: function () {
                        return Object.clone(this.ss_extensions_def || {})
                    }.bind(this),
                    getRules: this.getRules.bind(this),
                    loadStencilSet: this.loadStencilSet.bind(this),
                    createShape: this.createShape.bind(this),
                    deleteShape: this.deleteShape.bind(this),
                    getSelection: this.getSelection.bind(this),
                    setSelection: this.setSelection.bind(this),
                    updateSelection: this.updateSelection.bind(this),
                    getCanvas: this.getCanvas.bind(this),
                    importJSON: this.importJSON.bind(this),
                    importERDF: this.importERDF.bind(this),
                    getERDF: this.getERDF.bind(this),
                    getJSON: this.getJSON.bind(this),
                    getSerializedJSON: this.getSerializedJSON.bind(this),
                    executeCommands: this.executeCommands.bind(this),
                    isExecutingCommands: this.isExecutingCommands.bind(this),
                    registerOnEvent: this.registerOnEvent.bind(this),
                    unregisterOnEvent: this.unregisterOnEvent.bind(this),
                    raiseEvent: this.handleEvents.bind(this),
                    enableEvent: this.enableEvent.bind(this),
                    disableEvent: this.disableEvent.bind(this),
                    eventCoordinates: this.eventCoordinates.bind(this),
                    addToRegion: this.addToRegion.bind(this),
                    getModelMetaData: this.getModelMetaData.bind(this),
                    getAllLanguages: this.getAllLanguages.bind(this)
                }
            }.bind(this)())
        }
        return this._pluginFacade;
    },

    getAllLanguages: function () {
        var metaData = this.getModelMetaData();
        return ((metaData || {}).languages || []).sort(function (d, c) {
            return d.position - c.position
        }).pluck("rel");
    },

    isExecutingCommands: function () {
        return !!this.commandExecuting;
    },

    /**
     * Implementes the command pattern
     * (The real usage of the command pattern
     * is implemented and shown in the Plugins/undo.js)
     *
     * @param <Oryx.Core.Command>[] Array of commands
     */
    executeCommands: function (commands) {
        if (!this.commandStack) {
            this.commandStack = [];
        }
        if (!this.commandStackExecuted) {
            this.commandStackExecuted = [];
        }

        this.commandStack = [].concat(this.commandStack).concat(commands);

        // Check if already executes
        if (this.commandExecuting) {
            return;
        }

        // Start execution
        this.commandExecuting = true;

        // Iterate over all commands
        while (this.commandStack.length > 0) {
            var command = this.commandStack.shift();
            command.execute();
            this.commandStackExecuted.push(command);
            if (this.commandStack.length == 0) {
                this.handleEvents({
                    type: ORYX.CONFIG.EVENT_LAST_EXECUTE_COMMANDS,
                    commands: this.commandStackExecuted
                });
                this.getCanvas().update();
                this.updateSelection()
            }
        }

        // Raise event for executing commands
        this.handleEvents({
            type: ORYX.CONFIG.EVENT_EXECUTE_COMMANDS,
            commands: this.commandStackExecuted
        });

        // Remove temporary vars
        delete this.commandStack;
        delete this.commandStackExecuted;
        delete this.commandExecuting;


        this.updateSelection();
    },

    /**
     * Returns JSON of underlying canvas (calls ORYX.Canvas#toJSON()).
     * @return {Object} Returns JSON representation as JSON object.
     */
    getJSON: function () {
        var canvas = this.getCanvas().toJSON();
        canvas.ssextensions = this.getStencilSets().values()[0].extensions().keys().findAll(function (sse) {
            return !sse.endsWith('/meta#')
        });
        return canvas;
    },

    /**
     * Serializes a call to toJSON().
     * @return {String} Returns JSON representation as string.
     */
    getSerializedJSON: function () {
        return Ext.encode(this.getJSON());
    },

    /**
     * @return {String} Returns eRDF representation.
     * @deprecated Use ORYX.Editor#getJSON instead, if possible.
     */
    getERDF: function () {

        // Get the serialized dom
        var serializedDOM = DataManager.serializeDOM(this._getPluginFacade());

        // Add xml definition if there is no
        serializedDOM = '<?xml version="1.0" encoding="utf-8"?>' +
            '<html xmlns="http://www.w3.org/1999/xhtml" ' +
            'xmlns:b3mn="http://b3mn.org/2007/b3mn" ' +
            'xmlns:ext="http://b3mn.org/2007/ext" ' +
            'xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#" ' +
            'xmlns:atom="http://b3mn.org/2007/atom+xhtml">' +
            '<head profile="http://purl.org/NET/erdf/profile">' +
            '<link rel="schema.dc" href="http://purl.org/dc/elements/1.1/" />' +
            '<link rel="schema.dcTerms" href="http://purl.org/dc/terms/ " />' +
            '<link rel="schema.b3mn" href="http://b3mn.org" />' +
            '<link rel="schema.oryx" href="http://oryx-editor.org/" />' +
            '<link rel="schema.raziel" href="http://raziel.org/" />' +
            '<base href="' +
            location.href.split("?")[0] +
            '" />' +
            '</head><body>' +
            serializedDOM +
            '</body></html>';

        return serializedDOM;
    },

    /**
     * Imports shapes in JSON as expected by {@link ORYX.Editor#loadSerialized}
     * @param {Object|String} jsonObject The (serialized) json object to be imported
     * @param {boolean } [noSelectionAfterImport=false] Set to true if no shapes should be selected after import
     * @throws {SyntaxError} If the serialized json object contains syntax errors
     */
    importJSON: function (jsonObject, noSelectionAfterImport) {
        // check, if the imported json model can be loaded in this editor (stencil set has to fit)
        if (jsonObject.stencilset.namespace && jsonObject.stencilset.namespace !== this.getCanvas().getStencil().stencilSet().namespace()) {
            Ext.Msg.alert(ORYX.I18N.JSONImport.title, String.format(ORYX.I18N.JSONImport.wrongSS, jsonObject.stencilset.namespace, this.getCanvas().getStencil().stencilSet().namespace()));
            return null;
        } else {
            var commandClass = ORYX.Core.Command.extend({
                construct: function (jsonObject, loadSerializedCB, noSelectionAfterImport, facade) {
                    this.jsonObject = jsonObject;
                    this.noSelection = noSelectionAfterImport;
                    this.facade = facade;
                    this.shapes = undefined;
                    this.connections = [];
                    this.parents = new Hash();
                    this.selection = this.facade.getSelection();
                    this.loadSerialized = loadSerializedCB;
                },

                execute: function () {
                    try {
                        if (!this.shapes) {
                            this.shapes = this.loadSerialized(this.jsonObject);
                            this.shapes.each(function (shape) {
                                if (shape.getDockers) {
                                    var dockers = shape.getDockers();
                                    if (dockers) {
                                        if (dockers.length > 0) {
                                            this.connections.push([dockers.first(), dockers.first().getDockedShape(), dockers.first().referencePoint]);
                                        }
                                        if (dockers.length > 1) {
                                            this.connections.push([dockers.last(), dockers.last().getDockedShape(), dockers.last().referencePoint]);
                                        }
                                    }
                                }
                                this.parents[shape.id] = shape.parent;
                            }.bind(this));

                        } else {
                            this.shapes.each(function (shape) {
                                this.parents[shape.id].add(shape);
                            }.bind(this));

                            this.connections.each(function (con) {
                                con[0].setDockedShape(con[1]);
                                con[0].setReferencePoint(con[2]);
                                con[0].update();
                            });
                        }

                        this.facade.getCanvas().update();
                        if (!this.noSelection) {
                            this.facade.setSelection(this.shapes);
                        } else {
                            this.facade.updateSelection();
                        }
                        this.facade.getCanvas().updateSize();
                    } catch (err) {
                        console.log("ImportJSON error: " + err.message);
                    }
                },

                rollback: function () {
                    var selection = this.facade.getSelection();
                    this.shapes.each(function (shape) {
                        selection = selection.without(shape);
                        this.facade.deleteShape(shape);
                    }.bind(this));
                    this.facade.getCanvas().update();
                    this.facade.setSelection(selection);
                }
            });

            var command = new commandClass(jsonObject, this.loadSerialized.bind(this), noSelectionAfterImport, this._getPluginFacade());
            this.executeCommands([command]);

            return command.shapes ? command.shapes.clone() : null
        }
    },

    /**
     * This method renew all resource Ids and according references.
     * Warning: The implementation performs a substitution on the serialized object for
     * easier implementation. This results in a low performance which is acceptable if this
     * is only used when importing models.
     * @param {Object|String} jsonObject
     * @throws {SyntaxError} If the serialized json object contains syntax errors.
     * @return {Object} The jsonObject with renewed ids.
     * @private
     */
    renewResourceIds: function (jsonObject) {
        // For renewing resource ids, a serialized and object version is needed
        if (Ext.type(jsonObject) === "string") {
            try {
                var serJsonObject = jsonObject;
                jsonObject = Ext.decode(jsonObject);
            } catch (error) {
                throw new SyntaxError(error.message);
            }
        } else {
            var serJsonObject = Ext.encode(jsonObject);
        }

        // collect all resourceIds recursively
        var collectResourceIds = function (shapes) {
            if (!shapes) return [];

            return shapes.map(function (shape) {
                return collectResourceIds(shape.childShapes).concat(shape.resourceId);
            }).flatten();
        };
        var resourceIds = collectResourceIds(jsonObject.childShapes);

        // Replace each resource id by a new one
        resourceIds.each(function (oldResourceId) {
            var newResourceId = ORYX.Editor.provideId();
            serJsonObject = serJsonObject.gsub('"' + oldResourceId + '"', '"' + newResourceId + '"')
        });

        return Ext.decode(serJsonObject);
    },

    /**
     * Import erdf structure to the editor
     */
    importERDF: function (erdfDOM) {
        var serialized = this.parseToSerializeObjects(erdfDOM);

        if (serialized) {
            return this.importJSON(serialized, true);
        }
    },

    /**
     * Parses one model (eRDF) to the serialized form (JSON)
     *
     * @param {Object} oneProcessData
     * @return {Object} The JSON form of given eRDF model, or null if it couldn't be extracted
     */
    parseToSerializeObjects: function (oneProcessData) {

        // Firefox splits a long text node into chunks of 4096 characters.
        // To prevent truncation of long property values the normalize method must be called
        if (oneProcessData.normalize) {
            oneProcessData.normalize();
        }
        try {
            var xsl = "";
            var source = ORYX.PATH + "lib/extract-rdf.xsl";
            new Ajax.Request(source, {
                asynchronous: false,
                method: 'get',
                onSuccess: function (transport) {
                    xsl = transport.responseText
                }.bind(this),
                onFailure: (function (transport) {
                    ORYX.Log.error("XSL load failed" + transport);
                }).bind(this)
            });
            var domParser = new DOMParser();
            var xmlObject = oneProcessData;
            var xslObject = domParser.parseFromString(xsl, "text/xml");
            var xsltProcessor = new XSLTProcessor();
            var xslRef = document.implementation.createDocument("", "", null);
            xsltProcessor.importStylesheet(xslObject);

            var new_rdf = xsltProcessor.transformToFragment(xmlObject, document);
            var serialized_rdf = (new XMLSerializer()).serializeToString(new_rdf);
        } catch (e) {
            Ext.Msg.alert("Oryx", error);
            var serialized_rdf = "";
        }

        // Firefox 2 to 3 problem?!
        serialized_rdf = !serialized_rdf.startsWith("<?xml") ? "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + serialized_rdf : serialized_rdf;

        var req = new Ajax.Request(ORYX.CONFIG.ROOT_PATH + "rdf2json", {
            method: 'POST',
            asynchronous: false,
            onSuccess: function (transport) {
                Ext.decode(transport.responseText);
            },
            parameters: {
                rdf: serialized_rdf
            }
        });

        return Ext.decode(req.transport.responseText);
    },

    /**
     * Loads serialized model to the oryx.
     * @example
     * editor.loadSerialized({
     *    resourceId: "mymodel1",
     *    childShapes: [
     *       {
     *          stencil:{ id:"Subprocess" },
     *          outgoing:[{resourceId: 'aShape'}],
     *          target: {resourceId: 'aShape'},
     *          bounds:{ lowerRight:{ y:510, x:633 }, upperLeft:{ y:146, x:210 } },
     *          resourceId: "myshape1",
     *          childShapes:[],
     *          properties:{},
     *       }
     *    ],
     *    properties:{
     *       language: "English"
     *    },
     *    stencilset:{
     *       url:"http://localhost:80/oryx/stencilsets/bpmn1.1/bpmn1.1.json"
     *    },
     *    stencil:{
     *       id:"BPMNDiagram"
     *    }
     * });
     * @param {Object} model Description of the model to load.
     * @param {Array} [model.ssextensions] List of stenctil set extensions.
     * @param {String} model.stencilset.url
     * @param {String} model.stencil.id
     * @param {Array} model.childShapes
     * @param {Array} [model.properties]
     * @param {String} model.resourceId
     * @return {ORYX.Core.Shape[]} List of created shapes
     * @methodOf ORYX.Editor.prototype
     */
    loadSerialized: function (model, langs, requestMeta) {
        var canvas = this.getCanvas();

        // Bugfix (cf. http://code.google.com/p/oryx-editor/issues/detail?id=240)
        // Deserialize the canvas' stencil set extensions properties first!
        this.loadSSExtensions(model.ssextensions);
        this.loadIncludeAlwaysSSExtensionsWithoutPerspective();

        // Load Meta Data Extension if available
        // #Signavio
        if (requestMeta === true) {
            var metaDataExtension = this.getExtensionForMetaData();
            if (metaDataExtension) {
                this.loadSSExtension(metaDataExtension);
            }
        }

        var shapes = this.getCanvas().addShapeObjects(model.childShapes, langs, this.handleEvents.bind(this));

        if (model.properties) {
            for (var key in model.properties) {
                var value = this.getCanvas().getStencil().property("oryx-" + key);
                var prop = "undefined" != typeof canvas.hiddenProperties["oryx-" + key];
                if (value && prop) {
                    canvas.setProperty("oryx-" + key, canvas.hiddenProperties["oryx-" + key]);
                    canvas.setHiddenProperty("oryx-" + key);
                }
                var value2 = model.properties[key];
                if (Ext.type(value2) === "object" && (!value || !value.isList())) {
                    value2 = Ext.encode(value2);
                }
                if (value) {
                    value2 = canvas.migrateOldGlossarySchema(value, value2);
                }
                canvas.setProperty("oryx-" + key, value2);
            }
        }

        this.getCanvas().updateSize();
        this.getCanvas().migrateLanguage(model.language);

        // Force to update the selection
        this.selection = [null];
        this.setSelection([]);

        return shapes;
    },

    /**
     * Return the namespace of the extension which
     * provided all the self defined meta data
     * @return {String} Returns null if no extension is defined, otherwise the namespace
     *
     */
    getExtensionForMetaData: function () {
        if (!this.ss_extensions_def || !(this.ss_extensions_def.extensions instanceof Array)) {
            return null;
        }

        var stencilsets = this.getStencilSets();
        var extension = this.ss_extensions_def.extensions.find(function (ex) {
            return !!stencilsets[ex["extends"]] && ex.namespace.endsWith("/meta#");
        });

        return extension ? extension.namespace || null : null;
    },

    loadIncludeAlwaysSSExtensionsWithoutPerspective: function () {
        if (!this.ss_extensions_def || !(this.ss_extensions_def.extensions instanceof Array)) {
            return null
        }
        var b = this.ss_extensions_def.perspectives.pluck("extensions").flatten().uniq();
        var a = this.getStencilSets();
        this.ss_extensions_def.extensions.each(function (c) {
            if ( !! a[c["extends"]] && c.includeAlways && !b.include(c.namespace) && !c.namespace.endsWith("/meta#")) {
                this.loadSSExtension(c.namespace)
            }
        }.bind(this))
    },

    /**
     * Calls ORYX.Editor.prototype.ss_extension_namespace for each element
     * @param {Array} ss_extension_namespaces An array of stencil set extension namespaces.
     */
    loadSSExtensions: function (ss_extension_namespaces) {
        if (!ss_extension_namespaces) return;

        ss_extension_namespaces.each(function (ss_extension_namespace) {
            this.loadSSExtension(ss_extension_namespace);
        }.bind(this));
    },

    /**
     * Loads a stencil set extension.
     * The stencil set extensions definiton file must already
     * be loaded when the editor is initialized.
     */
    loadSSExtension: function (ss_extension_namespace) {

        if (this.ss_extensions_def) {
            var extension = this.ss_extensions_def.extensions.find(function (ex) {
                return (ex.namespace == ss_extension_namespace);
            });

            if (!extension) {
                return;
            }

            var stencilset = this.getStencilSets()[extension["extends"]];

            if (!stencilset) {
                return;
            }

            // Check if absolute or relative url
            if ((extension["definition"] || "").startsWith("/")) {
                stencilset.addExtension(extension["definition"])
            } else {
                stencilset.addExtension(ORYX.CONFIG.SS_EXTENSIONS_FOLDER + extension["definition"])
            }

            //stencilset.addExtension("/oryx/build/stencilsets/extensions/" + extension["definition"])
            this.getRules().initializeRules(stencilset);

            this._getPluginFacade().raiseEvent({
                type: ORYX.CONFIG.EVENT_STENCIL_SET_LOADED
            });
        }

    },

    disableEvent: function (eventType) {
        if (eventType == ORYX.CONFIG.EVENT_KEYDOWN) {
            this._keydownEnabled = false;
        }
        if (eventType == ORYX.CONFIG.EVENT_KEYUP) {
            this._keyupEnabled = false;
        }
        if (this.DOMEventListeners.keys().member(eventType)) {
            var value = this.DOMEventListeners.remove(eventType);
            this.DOMEventListeners['disable_' + eventType] = value;
        }
    },

    enableEvent: function (eventType) {
        if (eventType == ORYX.CONFIG.EVENT_KEYDOWN) {
            this._keydownEnabled = true;
        }

        if (eventType == ORYX.CONFIG.EVENT_KEYUP) {
            this._keyupEnabled = true;
        }

        if (this.DOMEventListeners.keys().member("disable_" + eventType)) {
            var value = this.DOMEventListeners.remove("disable_" + eventType);
            this.DOMEventListeners[eventType] = value;
        }
    },

    /**
     *  Methods for the PluginFacade
     */
    registerOnEvent: function (eventType, callback) {
        if (!(this.DOMEventListeners.keys().member(eventType))) {
            this.DOMEventListeners[eventType] = [];
        }

        this.DOMEventListeners[eventType].push(callback);
    },

    unregisterOnEvent: function (eventType, callback) {
        if (this.DOMEventListeners.keys().member(eventType)) {
            this.DOMEventListeners[eventType] = this.DOMEventListeners[eventType].without(callback);
        } else {
            // Event is not supported
            // TODO: Error Handling
        }
    },

    getSelection: function () {
        return this.selection || [];
    },

    getStencilSets: function () {
        return ORYX.Core.StencilSet.stencilSets(this.id);
    },

    getRules: function () {
        return ORYX.Core.StencilSet.rules(this.id);
    },

    loadStencilSet: function (source) {
        try {
            ORYX.Core.StencilSet.loadStencilSet(source, this.id);
            this.handleEvents({type: ORYX.CONFIG.EVENT_STENCIL_SET_LOADED});
        } catch (e) {
            ORYX.Log.warn("Requesting stencil set file failed. (" + e + ")");
        }
    },

    offer: function (pluginData) {
        if (!this.pluginsData.member(pluginData)) {
            this.pluginsData.push(pluginData);
        }
    },

    /**
     * It creates an new event or adds the callback, if already existing,
     * for the key combination that the plugin passes in keyCodes attribute
     * of the offer method.
     *
     * The new key down event fits the schema:
     *        key.event[.metactrl][.alt][.shift].'thekeyCode'
     */
    registerPluginsOnKeyEvents: function () {
        this.pluginsData.each(function (pluginData) {

            if (pluginData.keyCodes) {

                pluginData.keyCodes.each(function (keyComb) {
                    var eventName = "key.event";

                    /* Include key action */
                    eventName += '.' + keyComb.keyAction;

                    if (keyComb.metaKeys) {
                        /* Register on ctrl or apple meta key as meta key */
                        if (keyComb.metaKeys.
                            indexOf(ORYX.CONFIG.META_KEY_META_CTRL) > -1) {
                            eventName += "." + ORYX.CONFIG.META_KEY_META_CTRL;
                        }

                        /* Register on alt key as meta key */
                        if (keyComb.metaKeys.
                            indexOf(ORYX.CONFIG.META_KEY_ALT) > -1) {
                            eventName += '.' + ORYX.CONFIG.META_KEY_ALT;
                        }

                        /* Register on shift key as meta key */
                        if (keyComb.metaKeys.
                            indexOf(ORYX.CONFIG.META_KEY_SHIFT) > -1) {
                            eventName += '.' + ORYX.CONFIG.META_KEY_SHIFT;
                        }
                    }

                    /* Register on the actual key */
                    if (keyComb.keyCode) {
                        eventName += '.' + keyComb.keyCode;
                    }

                    /* Register the event */
                    ORYX.Log.debug("Register Plugin on Key Event: %0", eventName);
                    if (pluginData.toggle === true && pluginData.buttonInstance) {
                        this.registerOnEvent(eventName, function () {
                            pluginData.buttonInstance.toggle(!pluginData.buttonInstance.pressed); // Toggle
                            pluginData.functionality.call(pluginData, pluginData.buttonInstance, pluginData.buttonInstance.pressed); // Call function
                        });
                    } else {
                        this.registerOnEvent(eventName, pluginData.functionality)
                    }

                }.bind(this));
            }
        }.bind(this));
    },

    isEqual: function (a, b) {
        return a === b || (a.length === b.length && a.all(function (r) {
            return b.include(r)
        }))
    },

    isDirty: function (a) {
        return a.any(function (shape) {
            return shape.isPropertyChanged()
        })
    },

    setSelection: function (elements, subSelectionElement, force) {

        if (!elements) {
            elements = [];
        }
        if (!(elements instanceof Array)) {
            elements = [elements];
        }

        elements = elements.findAll(function (n) {
            return n && n instanceof ORYX.Core.Shape
        });

        if (elements[0] instanceof ORYX.Core.Canvas) {
            elements = [];
        }

        if (!force && this.isEqual(this.selection, elements) && !this.isDirty(elements)) {
            return;
        }

        this.selection = elements;
        this._subSelection = subSelectionElement;

        this.handleEvents({type: ORYX.CONFIG.EVENT_SELECTION_CHANGED, elements: elements, subSelection: subSelectionElement, force: !!force})
    },

    updateSelection: function () {
        this.setSelection(this.selection, this._subSelection, true);
    },

    getCanvas: function () {
        return this._canvas;
    },


    /**
     *    option = {
	*		type: string,
	*		position: {x:int, y:int},
	*		connectingType:	uiObj-Class
	*		connectedShape: uiObj
	*		draggin: bool
	*		namespace: url
	*       parent: ORYX.Core.AbstractShape
	*		template: a template shape that the newly created inherits properties from.
	*		}
     */
    createShape: function (option) {
        if (option && option.serialize && option.serialize instanceof Array) {
            var type = option.serialize.find(function (obj) {
                return (obj.prefix + "-" + obj.name) == "oryx-type"
            });
            var stencil = ORYX.Core.StencilSet.stencil(type.value);

            if (stencil.type() == 'node') {
                var newShapeObject = new ORYX.Core.Node({'eventHandlerCallback': this.handleEvents.bind(this)}, stencil);
            } else {
                var newShapeObject = new ORYX.Core.Edge({'eventHandlerCallback': this.handleEvents.bind(this)}, stencil);
            }

            this.getCanvas().add(newShapeObject);
            newShapeObject.deserialize(option.serialize);

            return newShapeObject;
        }

        // If there is no argument, throw an exception
        if (!option || !option.type || !option.namespace) {
            throw "To create a new shape you have to give an argument with type and namespace";
        }

        var canvas = this.getCanvas();
        var newShapeObject;

        // Get the shape type
        var shapetype = option.type;

        // Get the stencil set
        var sset = ORYX.Core.StencilSet.stencilSet(option.namespace);

        // Create an New Shape, dependents on an Edge or a Node
        if (sset.stencil(shapetype).type() == "node") {
            newShapeObject = new ORYX.Core.Node({'eventHandlerCallback': this.handleEvents.bind(this)}, sset.stencil(shapetype))
        } else {
            newShapeObject = new ORYX.Core.Edge({'eventHandlerCallback': this.handleEvents.bind(this)}, sset.stencil(shapetype))
        }

        // when there is a template, inherit the properties.
        if (option.template) {
            newShapeObject._jsonStencil.properties = option.template._jsonStencil.properties;
            newShapeObject.postProcessProperties();
        }

        // Add to the canvas
        if (option.parent && newShapeObject instanceof ORYX.Core.Node) {
            option.parent.add(newShapeObject);
        } else {
            canvas.add(newShapeObject);
        }

        // Set the position
        var point = option.position ? option.position : {
            x: 100, y: 200
        };

        var con;
        // If there is create a shape and in the argument there is given an ConnectingType and is instance of an edge
        if (option.connectingType && option.connectedShape && !(newShapeObject instanceof ORYX.Core.Edge)) {
            // there will be create a new Edge
            con = new ORYX.Core.Edge({
                eventHandlerCallback: this.handleEvents.bind(this)
            }, sset.stencil(option.connectingType));

            // And both endings dockers will be referenced to the both shapes
            con.dockers.first().setDockedShape(option.connectedShape);
            var magnet = option.connectedShape.getDefaultMagnet();
            var cPoint = magnet ? magnet.bounds.center() : option.connectedShape.bounds.midPoint();
            con.dockers.first().setReferencePoint(cPoint);
            con.dockers.last().setDockedShape(newShapeObject);
            con.dockers.last().setReferencePoint(newShapeObject.getDefaultMagnet().bounds.center());

            // The Edge will be added to the canvas and be updated
            canvas.add(con);
        }

        // Move the new Shape to the position
        if (newShapeObject instanceof ORYX.Core.Edge && option.connectedShape) {
            newShapeObject.dockers.first().setDockedShape(option.connectedShape);

            if (option.connectedShape instanceof ORYX.Core.Node) {
                newShapeObject.dockers.first().setReferencePoint(option.connectedShape.getDefaultMagnet().bounds.center());
                newShapeObject.dockers.last().bounds.centerMoveTo(point);
            } else {
                newShapeObject.dockers.first().setReferencePoint(option.connectedShape.bounds.midPoint());
            }
        } else {
            var b = newShapeObject.bounds;
            if (newShapeObject instanceof ORYX.Core.Node && newShapeObject.dockers.length == 1) {
                b = newShapeObject.dockers.first().bounds;
            }
            if (newShapeObject instanceof ORYX.Core.Edge) {
                b.extend({
                    x: 0,
                    y: 1
                });
                point.x -= 8;
                point.y -= 8;
            }
            b.centerMoveTo(point);

            var upL = b.upperLeft();
            b.moveBy(-Math.min(upL.x, 0), -Math.min(upL.y, 0));

            var lwR = b.lowerRight();
            b.moveBy(-Math.max(lwR.x - canvas.bounds.width(), 0), -Math.max(lwR.y - canvas.bounds.height(), 0))
        }

        // Update the shape
        if (newShapeObject instanceof ORYX.Core.Edge) {
            newShapeObject._update(false);
        }

        // And refresh the selection
        if (!(newShapeObject instanceof ORYX.Core.Edge) && !(option.dontUpdateSelection)) {
            this.setSelection([newShapeObject]);
        }

        if (con && con.alignDockers) {
            con.alignDockers();
        }
        if (newShapeObject.alignDockers) {
            newShapeObject.alignDockers();
        }

        return newShapeObject;
    },

    deleteShape: function (shape) {
        if (!shape || !shape.parent) {
            return
        }

        //remove shape from parent
        // this also removes it from DOM
        shape.parent.remove(shape);

        //delete references to outgoing edges
        shape.getOutgoingShapes().each(function (os) {
            var docker = os.getDockers().first();
            if (docker && docker.getDockedShape() == shape) {
                docker.setDockedShape(undefined);
            }
        });

        //delete references to incoming edges
        shape.getIncomingShapes().each(function (is) {
            var docker = is.getDockers().last();
            if (docker && docker.getDockedShape() == shape) {
                docker.setDockedShape(undefined);
            }
        });

        //delete references of the shape's dockers
        shape.getDockers().each(function (docker) {
            docker.setDockedShape(undefined);
        });
    },

    /**
     * Returns an object with meta data about the model.
     * Like name, description, ...
     *
     * Empty object with the current backend.
     *
     * @return {Object} Meta data about the model
     */
    getModelMetaData: function () {
        return this.modelMetaData;
    },

    /* Event-Handler Methods */

    /**
     * Helper method to execute an event immediately. The event is not
     * scheduled in the _eventsQueue. Needed to handle Layout-Callbacks.
     */
    _executeEventImmediately: function (eventObj) {
        if (this.DOMEventListeners.keys().member(eventObj.event.type)) {
            this.DOMEventListeners[eventObj.event.type].each((function (value) {
                value(eventObj.event, eventObj.arg);
            }).bind(this));
        }
    },

    _executeEvents: function () {
        this._queueRunning = true;
        while (this._eventsQueue.length > 0) {
            var val = this._eventsQueue.shift();
            this._executeEventImmediately(val);
        }
        this._queueRunning = false;
    },

    /**
     * Leitet die Events an die Editor-Spezifischen Event-Methoden weiter
     * @param {Object} event Event , welches gefeuert wurde
     * @param {Object} uiObj Target-UiObj
     */
    handleEvents: function (event, uiObj) {

        ORYX.Log.trace("Dispatching event type %0 on %1", event.type, uiObj);

        switch (event.type) {
            case ORYX.CONFIG.EVENT_MOUSEDOWN:
                this._handleMouseDown(event, uiObj);
                break;
            case ORYX.CONFIG.EVENT_MOUSEMOVE:
                this._handleMouseMove(event, uiObj);
                break;
            case ORYX.CONFIG.EVENT_MOUSEUP:
                this._handleMouseUp(event, uiObj);
                break;
            case ORYX.CONFIG.EVENT_MOUSEOVER:
                this._handleMouseHover(event, uiObj);
                break;
            case ORYX.CONFIG.EVENT_MOUSEOUT:
                this._handleMouseOut(event, uiObj);
                break;
        }
        /* Force execution if necessary. Used while handle Layout-Callbacks. */
        if (event.forceExecution) {
            this._executeEventImmediately({event: event, arg: uiObj});
        } else {
            this._eventsQueue.push({event: event, arg: uiObj});
        }

        if (!this._queueRunning) {
            this._executeEvents();
        }

        // TODO: Make this return whether no listener returned false.
        // So that, when one considers bubbling undesireable, it won't happen.
        return false;
    },

    isValidEvent: function (e) {
        try {
            var isInput = ["INPUT", "TEXTAREA"].include(e.target.tagName.toUpperCase());
            var gridHasFocus = e.target.className.include("x-grid3-focus") && !e.target.className.include("x-grid3-focus-canvas");
            return !isInput && !gridHasFocus;
        } catch (e) {
            return false;
        }
    },

    catchKeyUpEvents: function (event) {
        if (!this._keyupEnabled) {
            return;
        }
        /* assure we have the current event. */
        if (!event)
            event = window.event;

        // Checks if the event comes from some input field
        if (!this.isValidEvent(event)) {
            return;
        }

        /* Create key up event type */
        var keyUpEvent = this.createKeyCombEvent(event, ORYX.CONFIG.KEY_ACTION_UP);

        ORYX.Log.debug("Key Event to handle: %0", keyUpEvent);

        /* forward to dispatching. */
        this.handleEvents({type: keyUpEvent, event: event});
    },

    /**
     * Catches all key down events and forward the appropriated event to
     * dispatching concerning to the pressed keys.
     *
     * @param {Event}
     *        The key down event to handle
     */
    catchKeyDownEvents: function (event) {
        if (!this._keydownEnabled) {
            return;
        }
        /* Assure we have the current event. */
        if (!event)
            event = window.event;

        /* Fixed in FF3 */
        // This is a mac-specific fix. The mozilla event object has no knowledge
        // of meta key modifier on osx, however, it is needed for certain
        // shortcuts. This fix adds the metaKey field to the event object, so
        // that all listeners that registered per Oryx plugin facade profit from
        // this. The original bug is filed in
        // https://bugzilla.mozilla.org/show_bug.cgi?id=418334
        //if (this.__currentKey == ORYX.CONFIG.KEY_CODE_META) {
        //	event.appleMetaKey = true;
        //}
        //this.__currentKey = pressedKey;

        // Checks if the event comes from some input field
        if (!this.isValidEvent(event)) {
            return;
        }

        /* Create key up event type */
        var keyDownEvent = this.createKeyCombEvent(event, ORYX.CONFIG.KEY_ACTION_DOWN);

        ORYX.Log.debug("Key Event to handle: %0", keyDownEvent);

        /* Forward to dispatching. */
        this.handleEvents({type: keyDownEvent, event: event});
    },

    /**
     * Creates the event type name concerning to the pressed keys.
     *
     * @param {Event} keyDownEvent
     *        The source keyDownEvent to build up the event name
     */
    createKeyCombEvent: function (keyEvent, keyAction) {

        /* Get the currently pressed key code. */
        var pressedKey = keyEvent.which || keyEvent.keyCode;
        //this.__currentKey = pressedKey;

        /* Event name */
        var eventName = "key.event";

        /* Key action */
        if (keyAction) {
            eventName += "." + keyAction;
        }

        /* Ctrl or apple meta key is pressed */
        if (keyEvent.ctrlKey || keyEvent.metaKey) {
            eventName += "." + ORYX.CONFIG.META_KEY_META_CTRL;
        }

        /* Alt key is pressed */
        if (keyEvent.altKey) {
            eventName += "." + ORYX.CONFIG.META_KEY_ALT;
        }

        /* Alt key is pressed */
        if (keyEvent.shiftKey) {
            eventName += "." + ORYX.CONFIG.META_KEY_SHIFT;
        }

        /* Return the composed event name */
        return  eventName + "." + pressedKey;
    },

    _handleMouseDown: function (event, uiObj) {

        // get canvas.
        var canvas = this.getCanvas();
        // Try to get the focus
        canvas.focus()

        // find the shape that is responsible for this element's id.
        var element = event.currentTarget;
        var elementController = uiObj;

        // gather information on selection.
        var currentIsSelectable = (elementController !== null) &&
            (elementController !== undefined) && (elementController.isSelectable);
        var currentIsMovable = (elementController !== null) &&
            (elementController !== undefined) && (elementController.isMovable);
        var modifierKeyPressed = event.shiftKey || event.ctrlKey;
        var noObjectsSelected = this.selection.length === 0;
        var currentIsSelected = this.selection.member(elementController);


        // Rule #1: When there is nothing selected, select the clicked object.
        if (currentIsSelectable && noObjectsSelected) {

            this.setSelection([elementController]);

            ORYX.Log.trace("Rule #1 applied for mouse down on %0", element.id);

            // Rule #3: When at least one element is selected, and there is no
            // control key pressed, and the clicked object is not selected, select
            // the clicked object.
        } else if (currentIsSelectable && !noObjectsSelected && !modifierKeyPressed && !currentIsSelected) {

            this.setSelection([elementController]);

            //var objectType = elementController.readAttributes();
            //alert(objectType[0] + ": " + objectType[1]);

            ORYX.Log.trace("Rule #3 applied for mouse down on %0", element.id);

            // Rule #4: When the control key is pressed, and the current object is
            // not selected, add it to the selection.
        } else if (currentIsSelectable && modifierKeyPressed
            && !currentIsSelected) {

            var newSelection = this.selection.clone();
            newSelection.push(elementController)
            this.setSelection(newSelection)

            ORYX.Log.trace("Rule #4 applied for mouse down on %0", element.id);

            // Rule #6
        } else if (currentIsSelectable && currentIsSelected &&
            modifierKeyPressed) {

            var newSelection = this.selection.clone();
            this.setSelection(newSelection.without(elementController))

            ORYX.Log.trace("Rule #6 applied for mouse down on %0", elementController.id);

            // Rule #5: When there is at least one object selected and no control
            // key pressed, we're dragging.
            /*} else if(currentIsSelectable && !noObjectsSelected
             && !modifierKeyPressed) {

             if(this.log.isTraceEnabled())
             this.log.trace("Rule #5 applied for mouse down on "+element.id);
             */
            // Rule #2: When clicked on something that is neither
            // selectable nor movable, clear the selection, and return.
        } else if (!currentIsSelectable && !currentIsMovable) {

            this.setSelection([]);

            ORYX.Log.trace("Rule #2 applied for mouse down on %0", element.id);

            return;

            // Rule #7: When the current object is not selectable but movable,
            // it is probably a control. Leave the selection unchanged but set
            // the movedObject to the current one and enable Drag. Dockers will
            // be processed in the dragDocker plugin.
        } else if (!currentIsSelectable && currentIsMovable && !(elementController instanceof ORYX.Core.Controls.Docker)) {

            // TODO: If there is any moveable elements, do this in a plugin
            //ORYX.Core.UIEnableDrag(event, elementController);

            ORYX.Log.trace("Rule #7 applied for mouse down on %0", element.id);

            // Rule #8: When the element is selectable and is currently selected and no
            // modifier key is pressed
        } else if (currentIsSelectable && currentIsSelected && !modifierKeyPressed) {

            this._subSelection = this._subSelection != elementController ? elementController : undefined;

            this.setSelection(this.selection, this._subSelection);

            ORYX.Log.trace("Rule #8 applied for mouse down on %0", element.id);
        }


        // prevent event from bubbling, return.
        //Event.stop(event);
        return;
    },

    _handleMouseMove: function (event, uiObj) {
        return;
    },

    _handleMouseUp: function (event, uiObj) {
        // get canvas.
        var canvas = this.getCanvas();

        // find the shape that is responsible for this elemement's id.
        var elementController = uiObj;

        //get event position
        var evPos = this.eventCoordinates(event);

        //Event.stop(event);
    },

    _handleMouseHover: function (event, uiObj) {
        return;
    },

    _handleMouseOut: function (event, uiObj) {
        return;
    },

    /**
     * Calculates the event coordinates to SVG document coordinates.
     * @param {Event} event
     * @return {SVGPoint} The event coordinates in the SVG document
     */
    eventCoordinates: function (event) {

        var canvas = this.getCanvas();

        var svgPoint = canvas.node.ownerSVGElement.createSVGPoint();
        svgPoint.x = event.clientX;
        svgPoint.y = event.clientY;
        var matrix = canvas.node.getScreenCTM();
        return svgPoint.matrixTransform(matrix.inverse());
    }
};
ORYX.Editor = Clazz.extend(ORYX.Editor);

/**
 * Creates a new ORYX.Editor instance by fetching a model from given url and passing it to the constructur
 * @param {String} modelUrl The JSON URL of a model.
 * @param {Object} config Editor config passed to the constructur, merged with the response of the request to modelUrl
 */
ORYX.Editor.createByUrl = function (modelUrl, config) {
    if (!config) config = {};

    new Ajax.Request(modelUrl, {
        method: 'GET',
        onSuccess: function (transport) {
            var editorConfig = Ext.decode(transport.responseText);
            editorConfig = Ext.applyIf(editorConfig, config);
            new ORYX.Editor(editorConfig);
        }.bind(this)
    });
}

// TODO Implement namespace awareness on attribute level.
/**
 * graft() function
 * Originally by Sean M. Burke from interglacial.com, altered for usage with
 * SVG and namespace (xmlns) support. Be sure you understand xmlns before
 * using this funtion, as it creates all grafted elements in the xmlns
 * provided by you and all element's attribures in default xmlns. If you
 * need to graft elements in a certain xmlns and wish to assign attributes
 * in both that and another xmlns, you will need to do stepwise grafting,
 * adding non-default attributes yourself or you'll have to enhance this
 * function. Latter, I would appreciate: martin???apfelfabrik.de
 * @param {Object} namespace The namespace in which
 *                    elements should be grafted.
 * @param {Object} parent The element that should contain the grafted
 *                    structure after the function returned.
 * @param {Object} t the crafting structure.
 * @param {Object} doc the document in which grafting is performed.
 */
ORYX.Editor.graft = function (namespace, parent, t, doc) {

    doc = (doc || (parent && parent.ownerDocument) || document);
    var e;
    if (t === undefined) {
        throw "Can't graft an undefined value";
    } else if (t.constructor == String) {
        e = doc.createTextNode(t);
    } else {
        for (var i = 0; i < t.length; i++) {
            if (i === 0 && t[i].constructor == String) {
                var snared;
                snared = t[i].match(/^([a-z][a-z0-9]*)\.([^\s\.]+)$/i);
                if (snared) {
                    e = doc.createElementNS(namespace, snared[1]);
                    e.setAttributeNS(null, 'class', snared[2]);
                    continue;
                }
                snared = t[i].match(/^([a-z][a-z0-9]*)$/i);
                if (snared) {
                    e = doc.createElementNS(namespace, snared[1]);  // but no class
                    continue;
                }

                // Otherwise:
                e = doc.createElementNS(namespace, "span");
                e.setAttribute(null, "class", "namelessFromLOL");
            }

            if (t[i] === undefined) {
                throw "Can't graft an undefined value in a list!";
            } else if (t[i].constructor == String || t[i].constructor == Array) {
                this.graft(namespace, e, t[i], doc);
            } else if (t[i].constructor == Number) {
                this.graft(namespace, e, t[i].toString(), doc);
            } else if (t[i].constructor == Object) {
                // hash's properties => element's attributes
                for (var k in t[i]) {
                    e.setAttributeNS(null, k, t[i][k]);
                }
            } else {

            }
        }
    }
    if (parent) {
        parent.appendChild(e);
    } else {

    }
    return e; // return the topmost created node
};

ORYX.Editor.provideId = function () {
    var res = [], hex = '0123456789ABCDEF';

    for (var i = 0; i < 36; i++) res[i] = Math.floor(Math.random() * 0x10);

    res[14] = 4;
    res[19] = (res[19] & 0x3) | 0x8;

    for (var i = 0; i < 36; i++) res[i] = hex[res[i]];

    res[8] = res[13] = res[18] = res[23] = '-';

    return "oryx_" + res.join('');
};

/**
 * When working with Ext, conditionally the window needs to be resized. To do
 * so, use this class method. Resize is deferred until 100ms, and all subsequent
 * resizeBugFix calls are ignored until the initially requested resize is
 * performed.
 */
ORYX.Editor.resizeFix = function () {
    if (!ORYX.Editor._resizeFixTimeout) {
        ORYX.Editor._resizeFixTimeout = window.setTimeout(function () {
            window.resizeBy(1, 1);
            window.resizeBy(-1, -1);
            ORYX.Editor._resizefixTimeout = null;
        }, 100);
    }
};

ORYX.Editor.Cookie = {

    callbacks: [],

    onChange: function (callback, interval) {

        this.callbacks.push(callback);
        this.start(interval)

    },

    start: function (interval) {

        if (this.pe) {
            return;
        }

        var currentString = document.cookie;

        this.pe = new PeriodicalExecuter(function () {

            if (currentString != document.cookie) {
                currentString = document.cookie;
                this.callbacks.each(function (callback) {
                    callback(this.getParams())
                }.bind(this));
            }

        }.bind(this), ( interval || 10000 ) / 1000);
    },

    stop: function () {

        if (this.pe) {
            this.pe.stop();
            this.pe = null;
        }
    },

    getParams: function () {
        var res = {};

        var p = document.cookie;
        p.split("; ").each(function (param) {
            res[param.split("=")[0]] = param.split("=")[1];
        });

        return res;
    },

    toString: function () {
        return document.cookie;
    }
};

/**
 * Workaround for SAFARI/Webkit, because
 * when trying to check SVGSVGElement of instanceof there is
 * raising an error
 *
 */
ORYX.Editor.SVGClassElementsAreAvailable = true;
ORYX.Editor.setMissingClasses = function () {

    try {
        SVGElement;
    } catch (e) {
        ORYX.Editor.SVGClassElementsAreAvailable = false;
        SVGSVGElement = document.createElementNS('http://www.w3.org/2000/svg', 'svg').toString();
        SVGGElement = document.createElementNS('http://www.w3.org/2000/svg', 'g').toString();
        SVGPathElement = document.createElementNS('http://www.w3.org/2000/svg', 'path').toString();
        SVGTextElement = document.createElementNS('http://www.w3.org/2000/svg', 'text').toString();
        //SVGMarkerElement 	= document.createElementNS('http://www.w3.org/2000/svg', 'marker').toString();
        SVGRectElement = document.createElementNS('http://www.w3.org/2000/svg', 'rect').toString();
        SVGImageElement = document.createElementNS('http://www.w3.org/2000/svg', 'image').toString();
        SVGCircleElement = document.createElementNS('http://www.w3.org/2000/svg', 'circle').toString();
        SVGEllipseElement = document.createElementNS('http://www.w3.org/2000/svg', 'ellipse').toString();
        SVGLineElement = document.createElementNS('http://www.w3.org/2000/svg', 'line').toString();
        SVGPolylineElement = document.createElementNS('http://www.w3.org/2000/svg', 'polyline').toString();
        SVGPolygonElement = document.createElementNS('http://www.w3.org/2000/svg', 'polygon').toString();

    }

}
ORYX.Editor.checkClassType = function (classInst, classType) {

    if (ORYX.Editor.SVGClassElementsAreAvailable) {
        return classInst instanceof classType
    } else {
        return classInst == classType
    }
};
ORYX.Editor.makeExtModalWindowKeysave = function (facade) {
    Ext.override(Ext.Window, {
        beforeShow: function () {
            delete this.el.lastXY;
            delete this.el.lastLT;
            if (this.x === undefined || this.y === undefined) {
                var xy = this.el.getAlignToXY(this.container, 'c-c');
                var pos = this.el.translatePoints(xy[0], xy[1]);
                this.x = this.x === undefined ? pos.left : this.x;
                this.y = this.y === undefined ? pos.top : this.y;
            }
            this.el.setLeftTop(this.x, this.y);

            if (this.expandOnShow) {
                this.expand(false);
            }

            if (this.modal) {
                facade.disableEvent(ORYX.CONFIG.EVENT_KEYDOWN);
                Ext.getBody().addClass("x-body-masked");
                this.mask.setSize(Ext.lib.Dom.getViewWidth(true), Ext.lib.Dom.getViewHeight(true));
                this.mask.show();
            }
        },
        afterHide: function () {
            this.proxy.hide();
            if (this.monitorResize || this.modal || this.constrain || this.constrainHeader) {
                Ext.EventManager.removeResizeListener(this.onWindowResize, this);
            }
            if (this.modal) {
                this.mask.hide();
                facade.enableEvent(ORYX.CONFIG.EVENT_KEYDOWN);
                Ext.getBody().removeClass("x-body-masked");
            }
            if (this.keyMap) {
                this.keyMap.disable();
            }
            this.fireEvent("hide", this);
        },
        beforeDestroy: function () {
            if (this.modal)
                facade.enableEvent(ORYX.CONFIG.EVENT_KEYDOWN);
            Ext.destroy(
                this.resizer,
                this.dd,
                this.proxy,
                this.mask
            );
            Ext.Window.superclass.beforeDestroy.call(this);
        }
    });
}
