/*
 * Copyright © 2009-2014 The Apromore Initiative.
 *
 * This file is part of "Apromore".
 *
 * "Apromore" is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * "Apromore" is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */

package org.apromore.portal.common;

import org.apromore.model.FolderType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zul.Hlayout;
import org.zkoss.zul.Image;
import org.zkoss.zul.Label;
import org.zkoss.zul.Treecell;
import org.zkoss.zul.Treeitem;
import org.zkoss.zul.TreeitemRenderer;
import org.zkoss.zul.Treerow;

import java.util.List;

/**
 * Handles the item render for the Folder Tree list.
 *
 * @author Igor
 */
public class MiscFolderTreeRenderer implements TreeitemRenderer {

    private static final Logger LOGGER = LoggerFactory.getLogger(MiscFolderTreeRenderer.class.getName());

    public MiscFolderTreeRenderer() {
    }

    @Override
    public void render(final Treeitem treeItem, Object treeNode, int i) throws Exception {
        FolderTreeNode ctn = (FolderTreeNode) treeNode;

        if (ctn.getType() == FolderTreeNodeTypes.Folder) {
            Hlayout hl = new Hlayout();
            Treerow dataRow = new Treerow();
            dataRow.setParent(treeItem);
            treeItem.setValue(ctn);
            treeItem.setOpen(true);

            FolderType folder = (FolderType) ctn.getData();
            String name = folder.getFolderName();

            if (folder.getParentId() == null || folder.getParentId() == 0 || checkOpenFolderTree(folder, UserSessionManager.getCurrentFolder())) {
                treeItem.setOpen(true);
                if (UserSessionManager.getCurrentFolder() != null && folder.getId().equals(UserSessionManager.getCurrentFolder().getId())) {
                    treeItem.setSelected(true);
                    UserSessionManager.setCurrentSecurityItem(folder.getId());
                }
            } else {
                treeItem.setOpen(false);
            }

            if (folder.getId() == 0) {
                hl.appendChild(new Image("/img/home-folder24.png"));
            } else {
                hl.appendChild(new Image("/img/folder24.png"));
            }

            hl.appendChild(new Label(name.length() > 15 ? name.substring(0, 13) + "..." : name));
            hl.setSclass("h-inline-block");
            Treecell treeCell = new Treecell();
            treeCell.appendChild(hl);
            dataRow.appendChild(treeCell);

            dataRow.addEventListener(Events.ON_CLICK, new EventListener<Event>() {
                @Override
                public void onEvent(Event event) throws Exception {
                    FolderTreeNode clickedNodeValue = ((Treeitem) event.getTarget().getParent()).getValue();

                    try {
                        FolderType selectedFolder = (FolderType) clickedNodeValue.getData();
                        //boolean hasOwnership = selectedFolder.isHasOwnership();

                        UserSessionManager.setCurrentSecurityItem(selectedFolder.getId());
                    } catch (Exception ex) {
                        LOGGER.error("SecurityFolderTree Renderer failed to render an item", ex);
                    }
                }
            });
        }
    }


    /* Check the folder tree and make sure we return true if we are looking at a folder that is opened by a user.
 * Could be multiples levels down the tree. */
    private boolean checkOpenFolderTree(FolderType folder, FolderType currentFolder) {
        boolean found = false;
        if (currentFolder != null) {
            if (currentFolder.getId().equals(folder.getId())) {
                found = true;
            }
            if (!found) {
                found = checkDownTheFolderTree(folder.getFolders(), currentFolder);
            }
        }
        return found;
    }


    private boolean checkDownTheFolderTree(List<FolderType> subFolders, FolderType currentFolder) {
        boolean result = false;
        for (FolderType folderType : subFolders) {
            if (folderType.getId().equals(currentFolder.getId())) {
                result = true;
                break;
            }
        }
        if (!result) {
            for (FolderType folderType : subFolders) {
                result = checkDownTheFolderTree(folderType.getFolders(), currentFolder);
                if (result) {
                    break;
                }
            }
        }
        return result;
    }
}
