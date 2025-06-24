package view;

import javax.swing.JOptionPane;
import model.User;
import dao.UserDAO;

public class Login extends javax.swing.JFrame {
    
    User user;

    public Login() {
        initComponents();
        
        this.getRootPane().setDefaultButton(loginButton);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        logoPanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameInput = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordInput = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Toko");
        setMinimumSize(new java.awt.Dimension(497, 399));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoPanel.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(logoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 400));

        loginPanel.setBackground(new java.awt.Color(204, 204, 204));
        loginPanel.setLayout(new java.awt.GridBagLayout());

        loginLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(102, 102, 102));
        loginLabel.setText("LOGIN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 0);
        loginPanel.add(loginLabel, gridBagConstraints);

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(102, 102, 102));
        usernameLabel.setText("Username");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        loginPanel.add(usernameLabel, gridBagConstraints);

        usernameInput.setMaximumSize(new java.awt.Dimension(184, 32));
        usernameInput.setMinimumSize(new java.awt.Dimension(184, 32));
        usernameInput.setPreferredSize(new java.awt.Dimension(184, 32));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        loginPanel.add(usernameInput, gridBagConstraints);

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(102, 102, 102));
        passwordLabel.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        loginPanel.add(passwordLabel, gridBagConstraints);

        passwordInput.setMaximumSize(new java.awt.Dimension(184, 32));
        passwordInput.setMinimumSize(new java.awt.Dimension(184, 32));
        passwordInput.setPreferredSize(new java.awt.Dimension(184, 32));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 7, 0);
        loginPanel.add(passwordInput, gridBagConstraints);

        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginButton.setText("LOGIN");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        loginPanel.add(loginButton, gridBagConstraints);

        getContentPane().add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 0, 360, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String username = usernameInput.getText().trim();
        String password = passwordInput.getText().trim();  
        int id = UserDAO.login(username, password);
        
        if(username.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Username harus diisi!");
        }
        else if(password.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Password harus diisi!");
        }
        else if (id != 0) {
            user = UserDAO.getDataByID(id);
            dispose();
            new DashBoard(user).setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Username/password salah!");
            passwordInput.setText("");
        }                     
    }//GEN-LAST:event_loginButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField usernameInput;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
