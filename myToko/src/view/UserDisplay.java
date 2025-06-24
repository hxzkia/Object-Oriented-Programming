package view;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.User;
import dao.UserDAO;

public class UserDisplay extends javax.swing.JPanel {
    
    private DashBoard parent;
    
    public UserDisplay(DashBoard parent) {
        initComponents();
        showUser();
    }
    
    public void showUser() {
        ArrayList<User> users = UserDAO.getData();
        
        DefaultTableModel model = (DefaultTableModel) tabelUser.getModel();
        model.setRowCount(0);
        for (User user : users) {
            Object[] row = {user.getId(), user.getFullname(),
                user.getUsername(), user.getPrivilege()};
            model.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulPanel = new javax.swing.JPanel();
        userLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelUser = new javax.swing.JTable();
        addButton = new javax.swing.JLabel();
        listUserLabel = new javax.swing.JLabel();
        changeButton = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(800, 700));
        setMinimumSize(new java.awt.Dimension(800, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judulPanel.setBackground(new java.awt.Color(102, 102, 102));
        judulPanel.setMaximumSize(new java.awt.Dimension(796, 90));
        judulPanel.setMinimumSize(new java.awt.Dimension(796, 90));

        userLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("USER");

        javax.swing.GroupLayout judulPanelLayout = new javax.swing.GroupLayout(judulPanel);
        judulPanel.setLayout(judulPanelLayout);
        judulPanelLayout.setHorizontalGroup(
            judulPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(judulPanelLayout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(userLabel)
                .addContainerGap(371, Short.MAX_VALUE))
        );
        judulPanelLayout.setVerticalGroup(
            judulPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(judulPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(userLabel)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        add(judulPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 90));

        tabelUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Fullname", "Username"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelUser);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 700, 370));

        addButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-add-80.png"))); // NOI18N
        addButton.setText("ADD");
        addButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });
        add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, 90, 120));

        listUserLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        listUserLabel.setText("List User");
        listUserLabel.setToolTipText("");
        add(listUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        changeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        changeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-change-80.png"))); // NOI18N
        changeButton.setText("CHANGE");
        changeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        changeButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        changeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeButtonMouseClicked(evt);
            }
        });
        add(changeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 540, -1, 120));
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        AddUser dialog = new AddUser(parent, true, this);
        dialog.setVisible(true);
    }//GEN-LAST:event_addButtonMouseClicked

    private void changeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeButtonMouseClicked
        ChangePassword dialog = new ChangePassword(parent, true, this);
        dialog.setVisible(true);
    }//GEN-LAST:event_changeButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addButton;
    private javax.swing.JLabel changeButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel judulPanel;
    private javax.swing.JLabel listUserLabel;
    private javax.swing.JTable tabelUser;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
