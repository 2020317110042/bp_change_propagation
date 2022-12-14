/**
 * Copyright (c) 2009
 * Willi Tscheschner
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

if(!ORYX.Plugins) { ORYX.Plugins = {} }
if(!ORYX.Plugins.Layouter) { ORYX.Plugins.Layouter = {} }

new function(){
	
	/**
	 * Edge layouter is an implementation to layout an edge
	 * @class ORYX.Plugins.Layouter.EdgeLayouter
	 * @author Willi Tscheschner
	 */
	ORYX.Plugins.Layouter.EdgeLayouter = ORYX.Plugins.AbstractLayouter.extend({
		
		/**
		 * Layout only Edges
		 */
		layouted : [	"http://b3mn.org/stencilset/bpmn1.1#SequenceFlow", 
						"http://b3mn.org/stencilset/bpmn1.1#MessageFlow",
						"http://b3mn.org/stencilset/timjpdl3#SequenceFlow", 
						"http://b3mn.org/stencilset/jbpm4#SequenceFlow", 
						"http://b3mn.org/stencilset/bpmn2.0#MessageFlow",
						"http://b3mn.org/stencilset/bpmn2.0#SequenceFlow", 
						"http://b3mn.org/stencilset/bpmn2.0choreography#MessageFlow",
						"http://b3mn.org/stencilset/bpmn2.0choreography#SequenceFlow", 
						"http://b3mn.org/stencilset/bpmn2.0conversation#ConversationLink",
						"http://b3mn.org/stencilset/epc#ControlFlow",
						"http://www.signavio.com/stencilsets/processmap#ProcessLink",
						"http://www.signavio.com/stencilsets/organigram#connection"],
		
		/**
		 * Layout a set on edges
		 * @param {Object} edges
		 */
		layout: function(edges){
			edges.each(function(edge){
				this.doLayout(edge)
			}.bind(this))
		},
		
		/**
		 * Layout one edge
		 * @param {Object} edge
		 */
		doLayout: function(edge){
			// Get from and to node
			var from 	= edge.getIncomingNodes()[0];
			var to 		= edge.getOutgoingNodes()[0];
			
			// Return if one is null
			if (!from || !to) { return }
			
			var positions = this.getPositions(from, to, edge);
		
			if (positions.length > 0){
				this.setDockers(edge, positions[0].a, positions[0].b);
			}
		},
		
		/**
		 * Returns a set on positions which are not containt either 
		 * in the bounds in from or to.
		 * @param {Object} from Shape where the edge is come from
		 * @param {Object} to Shape where the edge is leading to
		 * @param {Object} edge Edge between from and to
		 */
		getPositions: function(from, to, edge){
            // Get absolute bounds
			var ab = from.absoluteBounds();
			var bb = to.absoluteBounds();
			
			// Get center from and to
			var a = ab.center();
			var b = bb.center();
			
			var am = ab.midPoint();
			var bm = bb.midPoint();

            var es = edge.getStencil().keepState();
            if (es && edge.dockers.length <= 3) {
                var folt = from.getOverlap(to);
                if (folt) {
                    var xm = Math.round(Math.min(ab.lowerRight().x, bb.lowerRight().x) - Math.max(ab.upperLeft().x, bb.upperLeft().x));
                    var ym = Math.round(Math.min(ab.lowerRight().y, bb.lowerRight().y) - Math.max(ab.upperLeft().y, bb.upperLeft().y));
                    var mn = 12;
                    if (xm > mn || ym > mn) {
                        var fp = edge.dockers.first().getAbsoluteReferencePoint();
                        var lp = edge.dockers.last().getAbsoluteReferencePoint();
                        if (folt.isIncluded({
                            x: xm > 0 ? fp.x : folt.center().x,
                            y: xm > 0 ? folt.center().y : fp.y
                        }) && folt.isIncluded({
                            x: xm > 0 ? lp.x : folt.center().x,
                            y: xm > 0 ? folt.center().y : lp.y
                        })) {
                            return []
                        }
                    } else {
                        edge.dockers.first().setReferencePoint(am);
                        edge.dockers.last().setReferencePoint(bm)
                    }
                }
            }

			// Get first and last reference point
			var first = Object.clone(edge.dockers.first().referencePoint);
			var last = Object.clone(edge.dockers.last().referencePoint);
			// Get the absolute one
			var aFirst = edge.dockers.first().getAbsoluteReferencePoint();
			var aLast = edge.dockers.last().getAbsoluteReferencePoint(); 
			
			// IF ------>
			// or  |
			//     V
			// Do nothing
			if (Math.abs(aFirst.x-aLast.x) < 1 || Math.abs(aFirst.y-aLast.y) < 1) {
				return []
			}
			
			// Calc center position, between a and b
			// depending on there weight
			var m = {};
			m.x = a.x < b.x ? 
					(((b.x - bb.width()/2) - (a.x + ab.width()/2))/2) + (a.x + ab.width()/2): 
					(((a.x - ab.width()/2) - (b.x + bb.width()/2))/2) + (b.x + bb.width()/2);

			m.y = a.y < b.y ? 
					(((b.y - bb.height()/2) - (a.y + ab.height()/2))/2) + (a.y + ab.height()/2): 
					(((a.y - ab.height()/2) - (b.y + bb.height()/2))/2) + (b.y + bb.height()/2);
								
								
			// Enlarge both bounds with 10
			ab.widen(5); // Wide the from less than 
			bb.widen(20);// the to because of the arrow from the edge
								
			var positions = [];
			var off = this.getOffset.bind(this);
			
			// Checks ----+
			//            |
			//            V
			if (!ab.isIncluded(b.x, a.y)&&!bb.isIncluded(b.x, a.y)) {
				positions.push({
					a : {x:b.x+off(last,bm,"x"),y:a.y+off(first,am,"y")},
					z : this.getWeight(from, a.x < b.x ? "r" : "l", to, a.y < b.y ? "t" : "b", edge) * (es ? 2 : 1)
				});
			}
						
			// Checks | 
			//        +--->
			if (!ab.isIncluded(a.x, b.y)&&!bb.isIncluded(a.x, b.y)) {
				positions.push({
					a : {x:a.x+off(first,am,"x"),y:b.y+off(last,bm,"y")},
					z : this.getWeight(from, a.y < b.y ? "b" : "t", to, a.x < b.x ? "l" : "r", edge) * (es ? 2 : 1)
				});
			}
						
			// Checks  --+
			//           |
			//           +--->
			if ((!ab.isIncluded(m.x, a.y)&&!bb.isIncluded(m.x, b.y)) || (!ab.isIncluded(m.x, a.y) && bb.isIncluded(m.x, a.y))) {
				positions.push({
					a : {x:m.x,y:a.y+off(first,am,"y")},
					b : {x:m.x,y:b.y+off(last,bm,"y")},
					z : this.getWeight(from, "r", to, "l", edge, a.x > b.x)
				});
			}
			
			// Checks | 
			//        +---+
			//            |
			//            V
            if ((!ab.isIncluded(a.x, m.y) && !bb.isIncluded(b.x, m.y)) || (!ab.isIncluded(a.x, b.y) && bb.isIncluded(a.x, b.y))) {
                positions.push({
					a : { x: a.x + off(first, am, "x"), y: m.y},
					b : { x: b.x + off(last, bm, "x"), y: m.y},
					z : this.getWeight(from, "b", to, "t", edge, a.y > b.y)
				});
			}	
			
			// Sort DESC of weights
			return positions.sort(function(a, b) {
                return a.z < b.z ? 1 : (a.z == b.z ? -1 : -1)
            });
		},
		
		/**
		 * Returns a offset for the pos to the center of the bounds
		 * 
		 * @param {Object} pos
		 * @param {Object} pos2
		 * @param {String} dir Direction x|y
		 */
		getOffset: function(pos, pos2, dir){
			return pos[dir] - pos2[dir];
		},
		
		/**
		 * Returns a value which shows the weight for this configuration
		 * 
		 * @param {Object} from Shape which is coming from
		 * @param {String} d1 Direction where is goes
		 * @param {Object} to Shape which goes to
		 * @param {String} d2 Direction where it comes to
		 * @param {Object} edge Edge between from and to
		 * @param {Boolean} reverse Reverse the direction (e.g. "r" -> "l")
		 */
		getWeight: function(from, d1, to, d2, edge, reverse){
			d1 = (d1||"").toLowerCase();
			d2 = (d2||"").toLowerCase();
			
			if (!["t","r","b","l"].include(d1)) {
                d1 = "r"
            }
			if (!["t","r","b","l"].include(d2)) {
                d1 = "l"
            }
			
			// If reverse is set
			if (reverse) {
				// Reverse d1 and d2
				d1 = d1 == "t" ? "b" : (d1 == "r" ? "l" : (d1 == "b" ? "t" : (d1 == "l" ? "r" : "r" )));
				d2 = d2 == "t" ? "b" : (d2 == "r" ? "l" : (d2 == "b" ? "t" : (d2 == "l" ? "r" : "r" )))
			}
			
					
			var weight = 0;
            var orientation = this.facade.getCanvas().getOrientation();
			// Get rules for from "out" and to "in"
			var dr1 = this.facade.getRules().getLayoutingRules(from, edge, orientation)["out"];
			var dr2 = this.facade.getRules().getLayoutingRules(to, edge, orientation)["in"];

			var fromWeight = dr1[d1];
			var toWeight = dr2[d2];


			/**
			 * Return a true if the center 1 is in the same direction than center 2
			 * @param {Object} direction
			 * @param {Object} center1
			 * @param {Object} center2
			 */
			var sameDirection = function(direction, center1, center2){
				switch(direction){
					case "t":
                        return Math.abs(center1.x - center2.x) < 2 && center1.y < center2.y;
					case "r":
                        return center1.x > center2.x && Math.abs(center1.y - center2.y) < 2;
					case "b":
                        return Math.abs(center1.x - center2.x) < 2 && center1.y > center2.y;
					case "l":
                        return center1.x < center2.x && Math.abs(center1.y - center2.y) < 2;
					default:
                        return false;
				}
			};

			// Check if there are same incoming edges from 'from'
			var sameIncomingFrom = from.getIncomingShapes().findAll(function(a) {
                return a instanceof ORYX.Core.Edge;
            }).any(function(e) {
                    return sameDirection(d1, e.dockers[e.dockers.length-2].bounds.center(), e.dockers.last().bounds.center());
			    });

			// Check if there are same outgoing edges from 'to'
			var sameOutgoingTo = to.getOutgoingShapes().findAll(function(a) {
                return a instanceof ORYX.Core.Edge
            }).any(function(e) {
				    return sameDirection(d2, e.dockers[1].bounds.center(), e.dockers.first().bounds.center());
			    });
			
			// Get the sum of "out" and the direction plus "in" and the direction 						
			return (sameIncomingFrom||sameOutgoingTo?0:fromWeight+toWeight);
		},
		
		/**
		 * Removes all current dockers from the node 
		 * (except the start and end) and adds two new
		 * dockers, on the position a and b.
		 * @param {Object} edge
		 * @param {Object} a
		 * @param {Object} b
		 */
		setDockers: function(edge, a, b) {
            if (!edge){ return }
			
			// Remove all dockers (implicit,
			// start and end dockers will not removed)
			edge.dockers.each(function(r){
				edge.removeDocker(r);
			});
			
			// For a and b (if exists), create
			// a new docker and set position
			[a, b].compact().each(function(pos){
				var docker = edge.createDocker(undefined, pos);
				docker.bounds.centerMoveTo(pos);
			});
			
			// Update all dockers from the edge
			edge.dockers.each(function(docker){
				docker.update()
			});
			
			// Update edge
			//edge.refresh();
			edge._update(true);
		}
	});
	
}();
