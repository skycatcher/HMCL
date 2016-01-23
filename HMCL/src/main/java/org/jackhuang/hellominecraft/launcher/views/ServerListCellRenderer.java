/*
 * Hello Minecraft! Launcher.
 * Copyright (C) 2013  huangyuhui <huanghongxun2008@126.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see {http://www.gnu.org/licenses/}.
 */
package org.jackhuang.hellominecraft.launcher.views;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import org.jackhuang.hellominecraft.utils.C;
import org.jackhuang.hellominecraft.launcher.core.version.ServerInfo;

/**
 *
 * @author huangyuhui
 */
public class ServerListCellRenderer extends javax.swing.JPanel implements ListCellRenderer<ServerInfo> {

    /**
     * Creates new form ServerListCellRenderer
     */
    public ServerListCellRenderer() {
        initComponents();
        this.add(lblIcon, -1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        lblVersion = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();

        lblName.setText("Name");

        lblInfo.setText("Info");
        lblInfo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblVersion.setText("Version");

        lblType.setText("Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                    .addComponent(lblVersion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                    .addComponent(lblType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVersion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    JLabel lblIcon = new JLabel();

    @Override
    public Component getListCellRendererComponent(JList<? extends ServerInfo> list, ServerInfo value, int index, boolean isSelected, boolean cellHasFocus) {
        lblName.setText(C.i18n("serverlistview.name") + ": " + value.name);
        lblType.setText(C.i18n("serverlistview.type") + ": " + value.type);
        lblVersion.setText(C.i18n("serverlistview.version") + ": " + value.version);
        lblInfo.setText("<html>" + C.i18n("serverlistview.info") + ": " + value.info + "</html>");
        if (value.icon != null)
            lblIcon.setIcon(value.icon);
        lblIcon.setBounds(0, 0, list.getWidth(), (int) (((double) list.getWidth()) / value.icon.getIconWidth() * value.icon.getIconHeight()));
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
            lblName.setForeground(list.getSelectionForeground());
            lblType.setForeground(list.getSelectionForeground());
            lblVersion.setForeground(list.getSelectionForeground());
            lblInfo.setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
            lblName.setForeground(list.getForeground());
            lblType.setForeground(list.getForeground());
            lblVersion.setForeground(list.getForeground());
            lblInfo.setForeground(list.getForeground());
        }
        setFont(list.getFont());
        return this;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblVersion;
    // End of variables declaration//GEN-END:variables
}
