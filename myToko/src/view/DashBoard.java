package view;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.User;

public class DashBoard extends javax.swing.JFrame {
    
   private User user;
   
    public DashBoard(User user) {
        initComponents();
        
        this.user = user;
        usernameLabel.setText("Halo, " + user.getFullname());
        if (user.getPrivilege() != 1) {
            userLabel.setVisible(false);
        }
    }
    
    public String getUsername() {
        return user.getUsername();
    }
    
    private void displayPanel(JPanel panel){
        displayPanel.removeAll();
        displayPanel.repaint();
        displayPanel.revalidate();
        
        displayPanel.add(panel);
        displayPanel.repaint();
        displayPanel.revalidate();
    }  
    
    private void changeColors(JLabel label) {
        JLabel[] labels = {pembelianLabel, penjualanLabel, produkLabel, kategoriLabel, pemasokLabel, pelangganLabel, userLabel};
        for (JLabel labeli : labels) {
            if (labeli.equals(label)) {
                labeli.setBackground((Color) displayPanel.getBackground());
            } else {
                labeli.setBackground((Color) panelMenu.getBackground());
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        dashboardLabel = new javax.swing.JLabel();
        pembelianLabel = new javax.swing.JLabel();
        penjualanLabel = new javax.swing.JLabel();
        produkLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        kategoriLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        pelangganLabel = new javax.swing.JLabel();
        pemasokLabel = new javax.swing.JLabel();
        setting = new javax.swing.JLabel();
        displayPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Toko");
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setResizable(false);

        panelMenu.setBackground(new java.awt.Color(102, 102, 102));
        panelMenu.setForeground(new java.awt.Color(255, 255, 255));
        panelMenu.setMaximumSize(new java.awt.Dimension(400, 700));
        panelMenu.setMinimumSize(new java.awt.Dimension(400, 700));
        panelMenu.setPreferredSize(new java.awt.Dimension(400, 700));

        dashboardLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        dashboardLabel.setForeground(new java.awt.Color(255, 255, 255));
        dashboardLabel.setText("DASHBOARD");

        pembelianLabel.setBackground(new java.awt.Color(102, 102, 102));
        pembelianLabel.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        pembelianLabel.setForeground(new java.awt.Color(255, 255, 255));
        pembelianLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pembelianLabel.setText("Pembelian");
        pembelianLabel.setMaximumSize(new java.awt.Dimension(148, 65));
        pembelianLabel.setMinimumSize(new java.awt.Dimension(148, 65));
        pembelianLabel.setOpaque(true);
        pembelianLabel.setPreferredSize(new java.awt.Dimension(148, 65));
        pembelianLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pembelianLabelMouseClicked(evt);
            }
        });

        penjualanLabel.setBackground(new java.awt.Color(102, 102, 102));
        penjualanLabel.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        penjualanLabel.setForeground(new java.awt.Color(255, 255, 255));
        penjualanLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        penjualanLabel.setText("Penjualan");
        penjualanLabel.setMaximumSize(new java.awt.Dimension(148, 65));
        penjualanLabel.setMinimumSize(new java.awt.Dimension(148, 65));
        penjualanLabel.setOpaque(true);
        penjualanLabel.setPreferredSize(new java.awt.Dimension(148, 65));
        penjualanLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                penjualanLabelMouseClicked(evt);
            }
        });

        produkLabel.setBackground(new java.awt.Color(102, 102, 102));
        produkLabel.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        produkLabel.setForeground(new java.awt.Color(255, 255, 255));
        produkLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        produkLabel.setText("Produk");
        produkLabel.setMaximumSize(new java.awt.Dimension(148, 65));
        produkLabel.setMinimumSize(new java.awt.Dimension(148, 65));
        produkLabel.setOpaque(true);
        produkLabel.setPreferredSize(new java.awt.Dimension(148, 65));
        produkLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produkLabelMouseClicked(evt);
            }
        });

        userLabel.setBackground(new java.awt.Color(102, 102, 102));
        userLabel.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel.setText("User");
        userLabel.setMaximumSize(new java.awt.Dimension(148, 65));
        userLabel.setMinimumSize(new java.awt.Dimension(148, 65));
        userLabel.setOpaque(true);
        userLabel.setPreferredSize(new java.awt.Dimension(148, 65));
        userLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userLabelMouseClicked(evt);
            }
        });

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-logout-50.png"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        kategoriLabel.setBackground(new java.awt.Color(102, 102, 102));
        kategoriLabel.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        kategoriLabel.setForeground(new java.awt.Color(255, 255, 255));
        kategoriLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kategoriLabel.setText("Kategori");
        kategoriLabel.setMaximumSize(new java.awt.Dimension(148, 65));
        kategoriLabel.setMinimumSize(new java.awt.Dimension(148, 65));
        kategoriLabel.setOpaque(true);
        kategoriLabel.setPreferredSize(new java.awt.Dimension(148, 65));
        kategoriLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kategoriLabelMouseClicked(evt);
            }
        });

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));

        pelangganLabel.setBackground(new java.awt.Color(102, 102, 102));
        pelangganLabel.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        pelangganLabel.setForeground(new java.awt.Color(255, 255, 255));
        pelangganLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pelangganLabel.setText("Pelanggan");
        pelangganLabel.setMaximumSize(new java.awt.Dimension(148, 65));
        pelangganLabel.setMinimumSize(new java.awt.Dimension(148, 65));
        pelangganLabel.setOpaque(true);
        pelangganLabel.setPreferredSize(new java.awt.Dimension(148, 65));
        pelangganLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pelangganLabelMouseClicked(evt);
            }
        });

        pemasokLabel.setBackground(new java.awt.Color(102, 102, 102));
        pemasokLabel.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        pemasokLabel.setForeground(new java.awt.Color(255, 255, 255));
        pemasokLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pemasokLabel.setText("Pemasok");
        pemasokLabel.setMaximumSize(new java.awt.Dimension(148, 65));
        pemasokLabel.setMinimumSize(new java.awt.Dimension(148, 65));
        pemasokLabel.setOpaque(true);
        pemasokLabel.setPreferredSize(new java.awt.Dimension(148, 65));
        pemasokLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pemasokLabelMouseClicked(evt);
            }
        });

        setting.setBackground(new java.awt.Color(255, 255, 255));
        setting.setForeground(new java.awt.Color(255, 255, 255));
        setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-setting-50 (2).png"))); // NOI18N
        setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pembelianLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(penjualanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(produkLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kategoriLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(userLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pelangganLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(dashboardLabel)
                        .addGap(0, 75, Short.MAX_VALUE))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(logout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(setting)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usernameLabel)))
                .addContainerGap())
            .addComponent(pemasokLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(dashboardLabel)
                .addGap(26, 26, 26)
                .addComponent(pembelianLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(penjualanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(produkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kategoriLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pemasokLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pelangganLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setting, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16))
        );

        displayPanel.setBackground(new java.awt.Color(204, 204, 204));
        displayPanel.setMaximumSize(new java.awt.Dimension(800, 700));
        displayPanel.setMinimumSize(new java.awt.Dimension(800, 700));
        displayPanel.setPreferredSize(new java.awt.Dimension(800, 700));
        displayPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(displayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(displayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pembelianLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pembelianLabelMouseClicked
        displayPanel(new PembelianDisplay(this, user));
        changeColors(pembelianLabel);
    }//GEN-LAST:event_pembelianLabelMouseClicked

    private void penjualanLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_penjualanLabelMouseClicked
        displayPanel(new PenjualanDisplay(this, user));
        changeColors(penjualanLabel);
    }//GEN-LAST:event_penjualanLabelMouseClicked

    private void produkLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produkLabelMouseClicked
        displayPanel(new ProdukDisplay(this));
        changeColors(produkLabel);
    }//GEN-LAST:event_produkLabelMouseClicked

    private void userLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userLabelMouseClicked
        displayPanel(new UserDisplay(this));
        changeColors(userLabel);
    }//GEN-LAST:event_userLabelMouseClicked

    private void kategoriLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kategoriLabelMouseClicked
        displayPanel(new KategoriDisplay(this));
        changeColors(kategoriLabel);
    }//GEN-LAST:event_kategoriLabelMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    private void pelangganLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pelangganLabelMouseClicked
        displayPanel(new PelangganDisplay(this));
        changeColors(pelangganLabel);
    }//GEN-LAST:event_pelangganLabelMouseClicked

    private void pemasokLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pemasokLabelMouseClicked
        displayPanel(new PemasokDisplay(this));
        changeColors(pemasokLabel);
    }//GEN-LAST:event_pemasokLabelMouseClicked

    private void settingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseClicked
        ChangePassword dialog = new ChangePassword(this, true, this);
        dialog.setVisible(true);
    }//GEN-LAST:event_settingMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dashboardLabel;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JLabel kategoriLabel;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JLabel pelangganLabel;
    private javax.swing.JLabel pemasokLabel;
    private javax.swing.JLabel pembelianLabel;
    private javax.swing.JLabel penjualanLabel;
    private javax.swing.JLabel produkLabel;
    private javax.swing.JLabel setting;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
