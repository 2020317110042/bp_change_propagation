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

package org.apromore.portal.dialogController;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apromore.model.GroupType;
import org.apromore.portal.common.FolderTreeNodeTypes;
import org.apromore.portal.common.UserSessionManager;
import org.apromore.portal.exception.DialogException;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Label;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

/**
 * Controller used to find access control groups in apromore and display them. usually for Security.
 */
public class SecurityFindGroupsController extends BaseController {

    private MainController mainController;
    private Button btnSave;
    private Textbox txtSearch;
    private Listbox lstGroups;

    @SuppressWarnings("unchecked")
    public SecurityFindGroupsController(final SecuritySetupController securitySetupController, Window win) throws DialogException {
        this.mainController = securitySetupController.getMainController();
        this.lstGroups = (Listbox) win.getFellow("findGroups").getFellow("lstGroups");
        Button btnSearch = (Button) win.getFellow("findGroups").getFellow("btnSearch");
        Button btnClear = (Button) win.getFellow("findGroups").getFellow("btnClear");
        this.btnSave = (Button) win.getFellow("findGroups").getFellow("btnSave");
        this.txtSearch = (Textbox) win.getFellow("findGroups").getFellow("txtSearch");
        btnSave.setDisabled(true);
        lstGroups.setPageSize(4);

        btnClear.addEventListener("onClick", new EventListener<Event>() {
            public void onEvent(Event event) throws Exception {
                txtSearch.setText("");
                lstGroups.getItems().clear();
                lstGroups.setVisible(false);
                btnSave.setDisabled(true);
            }
        });

        btnSave.addEventListener("onClick", new EventListener<Event>() {
            public void onEvent(Event event) throws Exception {
                Integer selectedId = UserSessionManager.getCurrentSecurityItem();
                FolderTreeNodeTypes selectedType = UserSessionManager.getCurrentSecurityType();
                if (selectedId == null) {
                    Messagebox.show("Please select an item from a tree on the left.", "Attention", Messagebox.OK,
                            Messagebox.ERROR);
                    return;
                }
                Set<Listitem> items = lstGroups.getSelectedItems();
                if (items.size() > 0) {
                    List<Listitem> processedItems = new ArrayList<>();
                    for (Listitem item : items) {
                        List<Component> cells = item.getChildren();
                        if (cells.size() == 6) {
                            Checkbox chkWrite = (Checkbox) cells.get(3).getChildren().get(0);
                            Checkbox chkOwner = (Checkbox) cells.get(4).getChildren().get(0);
                            Label lblId = (Label) cells.get(5).getChildren().get(0);
                            if (chkWrite != null && chkOwner != null && lblId != null) {
                                String message = "";
                                if (selectedType == FolderTreeNodeTypes.Folder) {
                                    message = mainController.getService().saveFolderPermissions(selectedId,
                                            lblId.getValue(), true, chkWrite.isChecked(), chkOwner.isChecked());
                                } else if (selectedType == FolderTreeNodeTypes.Process) {
                                    message = mainController.getService().saveProcessPermissions(selectedId,
                                            lblId.getValue(), true, chkWrite.isChecked(), chkOwner.isChecked());
                                }
                                if (message.isEmpty()) {
                                    securitySetupController.getPermissionsController().loadUsers(
                                            UserSessionManager.getCurrentSecurityItem(),
                                            UserSessionManager.getCurrentSecurityType());
                                    processedItems.add(item);
                                } else {
                                    Messagebox.show(message, "Error", Messagebox.OK, Messagebox.ERROR);
                                }
                            }
                        }
                    }

                    if (processedItems.size() > 0) {
                        Messagebox.show("Successfully saved permissions.", "Success", Messagebox.OK, Messagebox.INFORMATION);
                        lstGroups.getItems().clear();
                    }
                } else {
                    Messagebox.show("Please select at least one record to save.", "Attention", Messagebox.OK, Messagebox.ERROR);
                }
            }
        });

        btnSearch.addEventListener("onClick", new EventListener<Event>() {
            public void onEvent(Event event) throws Exception {
                if (txtSearch.getText().isEmpty()) {
                    Messagebox.show("Please type search text", "Attention", Messagebox.OK, Messagebox.ERROR);
                } else {
                    boolean hasOwnership = UserSessionManager.getCurrentSecurityOwnership();
                    lstGroups.getItems().clear();
                    List<GroupType> groups = mainController.getService().searchGroups(txtSearch.getText().replace("*", "%"));
                    lstGroups.setVisible(groups.size() > 0);
                    btnSave.setDisabled(groups.size() == 0 || !hasOwnership);

                    for (GroupType group : groups) {
                        if (true /*!(group.getId().equals(UserSessionManager.getCurrentUser().getId()))*/) {
                            Listitem newItem = new Listitem();
                            Listcell cellEmpty = new Listcell();

                            newItem.appendChild(cellEmpty);
                            newItem.appendChild(new Listcell(group.getName()));

                            Checkbox chkRead = new Checkbox();
                            chkRead.setChecked(true);
                            chkRead.setDisabled(true);
                            Listcell cellRead = new Listcell();
                            cellRead.appendChild(chkRead);
                            newItem.appendChild(cellRead);

                            Checkbox chkWrite = new Checkbox();
                            chkWrite.setChecked(false);
                            Listcell cellWrite = new Listcell();
                            cellWrite.appendChild(chkWrite);
                            newItem.appendChild(cellWrite);

                            Checkbox chkOwner = new Checkbox();
                            chkOwner.setChecked(false);
                            Listcell cellOwner = new Listcell();
                            cellOwner.appendChild(chkOwner);
                            newItem.appendChild(cellOwner);

                            Label lblId = new Label(group.getId());
                            lblId.setVisible(false);
                            Listcell cellId = new Listcell();
                            cellId.appendChild(lblId);
                            newItem.appendChild(cellId);

                            lstGroups.getItems().add(newItem);
                        }
                    }
                }
            }
        });
    }
}
