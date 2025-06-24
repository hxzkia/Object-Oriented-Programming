package view;

import dao.UserDAO;
import javax.swing.JOptionPane;

public class ChangePassword extends javax.swing.JDialog {
    
    private UserDisplay parent;
    private DashBoard parents;
    
    public ChangePassword(java.awt.Frame parent, boolean modal, UserDisplay p) {
        super(parent, modal);
        initComponents();
        this.parent = p;
    }
    
    public ChangePassword(java.awt.Frame parent, boolean modal, DashBoard p) {
        super(parent, modal);
        initComponents();
        this.parents = p;
        usernameInput.setText(parents.getUsername());
        usernameInput.setEditable(false);
    }
    
    private void clear() {
        usernameInput.setText("");
        passwordInput.setText("");
        retypeInput.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainChangeUserPanel = new javax.swing.JPanel();
        formChangeUserPanel = new javax.swing.JPanel();
        usernameInput = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordInput = new javax.swing.JPasswordField();
        retypePasswordLabel = new javax.swing.JLabel();
        retypeInput = new javax.swing.JPasswordField();
        changeButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        doneButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change Password");
        setResizable(false);

        mainChangeUserPanel.setBackground(new java.awt.Color(204, 204, 204));
        mainChangeUserPanel.setMaximumSize(new java.awt.Dimension(773, 338));
        mainChangeUserPanel.setMinimumSize(new java.awt.Dimension(773, 338));

        formChangeUserPanel.setBackground(new java.awt.Color(102, 102, 102));
        formChangeUserPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Form Change Password", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        usernameInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameInput.setMaximumSize(new java.awt.Dimension(184, 26));
        usernameInput.setMinimumSize(new java.awt.Dimension(184, 26));
        usernameInput.setPreferredSize(new java.awt.Dimension(184, 26));

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Username:");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password:");

        passwordInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordInput.setMaximumSize(new java.awt.Dimension(184, 26));
        passwordInput.setMinimumSize(new java.awt.Dimension(184, 26));
        passwordInput.setPreferredSize(new java.awt.Dimension(184, 26));

        retypePasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        retypePasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        retypePasswordLabel.setText("Retype Password:");

        retypeInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        retypeInput.setMaximumSize(new java.awt.Dimension(184, 26));
        retypeInput.setMinimumSize(new java.awt.Dimension(184, 26));
        retypeInput.setPreferredSize(new java.awt.Dimension(184, 26));

        javax.swing.GroupLayout formChangeUserPanelLayout = new javax.swing.GroupLayout(formChangeUserPanel);
        formChangeUserPanel.setLayout(formChangeUserPanelLayout);
        formChangeUserPanelLayout.setHorizontalGroup(
            formChangeUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formChangeUserPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(formChangeUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formChangeUserPanelLayout.createSequentialGroup()
                        .addComponent(retypePasswordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(retypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formChangeUserPanelLayout.createSequentialGroup()
                        .addGroup(formChangeUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordLabel)
                            .addComponent(usernameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(formChangeUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
        );
        formChangeUserPanelLayout.setVerticalGroup(
            formChangeUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formChangeUserPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(formChangeUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formChangeUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formChangeUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retypePasswordLabel)
                    .addComponent(retypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        changeButton.setBackground(new java.awt.Color(204, 255, 204));
        changeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        changeButton.setText("CHANGE");
        changeButton.setMaximumSize(new java.awt.Dimension(140, 50));
        changeButton.setMinimumSize(new java.awt.Dimension(140, 50));
        changeButton.setPreferredSize(new java.awt.Dimension(140, 50));
        changeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(204, 204, 255));
        clearButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clearButton.setText("CLEAR");
        clearButton.setMaximumSize(new java.awt.Dimension(140, 50));
        clearButton.setMinimumSize(new java.awt.Dimension(140, 50));
        clearButton.setPreferredSize(new java.awt.Dimension(140, 50));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        doneButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        doneButton.setText("DONE");
        doneButton.setMaximumSize(new java.awt.Dimension(290, 50));
        doneButton.setMinimumSize(new java.awt.Dimension(290, 50));
        doneButton.setPreferredSize(new java.awt.Dimension(290, 50));
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainChangeUserPanelLayout = new javax.swing.GroupLayout(mainChangeUserPanel);
        mainChangeUserPanel.setLayout(mainChangeUserPanelLayout);
        mainChangeUserPanelLayout.setHorizontalGroup(
            mainChangeUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainChangeUserPanelLayout.createSequentialGroup()
                .addGroup(mainChangeUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formChangeUserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainChangeUserPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(mainChangeUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainChangeUserPanelLayout.createSequentialGroup()
                                .addComponent(changeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainChangeUserPanelLayout.setVerticalGroup(
            mainChangeUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainChangeUserPanelLayout.createSequentialGroup()
                .addComponent(formChangeUserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainChangeUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainChangeUserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 351, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainChangeUserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void changeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButtonActionPerformed
        String username = usernameInput.getText().trim();
        String password = passwordInput.getText().trim();
        String retype = retypeInput.getText().trim();

        if (username.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Username harus diisi!");
        }
        else if (password.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Password harus diisi!");
        }
        else if (retype.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Retype Password harus diisi!");
        }
        else if (retype.equals(password)) {
            int id = UserDAO.changePassword(username, password);
            if (id != 0) {
                JOptionPane.showMessageDialog(rootPane, "Password berhasil diganti!");
                clear();
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Username tidak ditemukan!");
            }
        }
        else {
              JOptionPane.showMessageDialog(rootPane, "Password tidak cocok!");      
        }
    }//GEN-LAST:event_changeButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        dispose();
    }//GEN-LAST:event_doneButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton doneButton;
    private javax.swing.JPanel formChangeUserPanel;
    private javax.swing.JPanel mainChangeUserPanel;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField retypeInput;
    private javax.swing.JLabel retypePasswordLabel;
    private javax.swing.JTextField usernameInput;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
