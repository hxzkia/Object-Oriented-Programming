package view;

import dao.PelangganDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Pelanggan;
import model.Penjualan;
import model.User;

public class AddPenjualan extends javax.swing.JDialog {

    private DashBoard parent;
    private User user;
    private Penjualan penjualan;
    private PenjualanDisplay refresh;
    
    public AddPenjualan(java.awt.Frame parent, boolean modal, DashBoard p, User user, PenjualanDisplay refresh) {
        super(parent, modal);
        initComponents();
        this.parent = p;
        this.user = user;
        this.refresh = refresh;
        adminInput.setText(user.getFullname());
        getIdPelanggan();
    }
    
    private void clear() {
        noNotaInput.setText("");
        daftarPelanggan.setSelectedIndex(-1);
    }
    
    private static boolean checkNota(String nota) {
        return nota.matches("\\d{6}");
    }
    
    private void getIdPelanggan() {
        ArrayList<Pelanggan> listPelanggan = PelangganDAO.getData();
        for (Pelanggan pelanggan : listPelanggan) {
            daftarPelanggan.addItem(pelanggan);
        }
    }

    public Penjualan getPenjualan() {
        return penjualan;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mainAddPenjualanPanel = new javax.swing.JPanel();
        formAddPenjualanPanel = new javax.swing.JPanel();
        noNotaLabel = new javax.swing.JLabel();
        idAdminLabel = new javax.swing.JLabel();
        idPelangganLabel = new javax.swing.JLabel();
        daftarPelanggan = new javax.swing.JComboBox<>();
        adminInput = new javax.swing.JTextField();
        noNotaInput = new javax.swing.JTextField();
        nextButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        doneButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Penjualan");
        setResizable(false);

        mainAddPenjualanPanel.setBackground(new java.awt.Color(204, 204, 204));
        mainAddPenjualanPanel.setMaximumSize(new java.awt.Dimension(318, 374));
        mainAddPenjualanPanel.setMinimumSize(new java.awt.Dimension(318, 374));

        formAddPenjualanPanel.setBackground(new java.awt.Color(102, 102, 102));
        formAddPenjualanPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Form Add Penjualan", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        formAddPenjualanPanel.setMaximumSize(new java.awt.Dimension(318, 255));
        formAddPenjualanPanel.setMinimumSize(new java.awt.Dimension(318, 255));
        formAddPenjualanPanel.setPreferredSize(new java.awt.Dimension(318, 255));
        formAddPenjualanPanel.setLayout(new java.awt.GridBagLayout());

        noNotaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        noNotaLabel.setForeground(new java.awt.Color(255, 255, 255));
        noNotaLabel.setText("No. Nota:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 0, 7);
        formAddPenjualanPanel.add(noNotaLabel, gridBagConstraints);

        idAdminLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idAdminLabel.setForeground(new java.awt.Color(255, 255, 255));
        idAdminLabel.setText("Admin:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 7);
        formAddPenjualanPanel.add(idAdminLabel, gridBagConstraints);

        idPelangganLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idPelangganLabel.setForeground(new java.awt.Color(255, 255, 255));
        idPelangganLabel.setText("Pelanggan:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 17, 7);
        formAddPenjualanPanel.add(idPelangganLabel, gridBagConstraints);

        daftarPelanggan.setMaximumSize(new java.awt.Dimension(122, 22));
        daftarPelanggan.setMinimumSize(new java.awt.Dimension(122, 22));
        daftarPelanggan.setPreferredSize(new java.awt.Dimension(122, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 62;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 14, 0);
        formAddPenjualanPanel.add(daftarPelanggan, gridBagConstraints);

        adminInput.setEditable(false);
        adminInput.setMaximumSize(new java.awt.Dimension(184, 26));
        adminInput.setMinimumSize(new java.awt.Dimension(184, 26));
        adminInput.setPreferredSize(new java.awt.Dimension(184, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 0, 0);
        formAddPenjualanPanel.add(adminInput, gridBagConstraints);

        noNotaInput.setMaximumSize(new java.awt.Dimension(184, 26));
        noNotaInput.setMinimumSize(new java.awt.Dimension(184, 26));
        noNotaInput.setPreferredSize(new java.awt.Dimension(184, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 0, 0);
        formAddPenjualanPanel.add(noNotaInput, gridBagConstraints);

        nextButton.setBackground(new java.awt.Color(204, 255, 204));
        nextButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nextButton.setText("NEXT");
        nextButton.setMaximumSize(new java.awt.Dimension(145, 50));
        nextButton.setMinimumSize(new java.awt.Dimension(145, 50));
        nextButton.setPreferredSize(new java.awt.Dimension(145, 50));
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
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

        javax.swing.GroupLayout mainAddPenjualanPanelLayout = new javax.swing.GroupLayout(mainAddPenjualanPanel);
        mainAddPenjualanPanel.setLayout(mainAddPenjualanPanelLayout);
        mainAddPenjualanPanelLayout.setHorizontalGroup(
            mainAddPenjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainAddPenjualanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainAddPenjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainAddPenjualanPanelLayout.createSequentialGroup()
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainAddPenjualanPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(formAddPenjualanPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainAddPenjualanPanelLayout.setVerticalGroup(
            mainAddPenjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainAddPenjualanPanelLayout.createSequentialGroup()
                .addComponent(formAddPenjualanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainAddPenjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainAddPenjualanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainAddPenjualanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        String nota = noNotaInput.getText();
        int idAdmin = user.getId();
        
        if (daftarPelanggan.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(rootPane, "ID Pelanggan tidak boleh kosong!");
            return;
        }
        
        int idPelanggan = ((Pelanggan) daftarPelanggan.getSelectedItem()).getId();
        
        if (!checkNota(nota)) {
            JOptionPane.showMessageDialog(rootPane, "ID Nota harus berupa nomor yang berjumlah 6 digit!");
            return;
        }
        
        penjualan = new Penjualan(nota, idPelanggan, idAdmin);
        
        AddDetailPenjualan dialog = new AddDetailPenjualan(parent, true, this, user, refresh);
        dialog.setVisible(true);
    }//GEN-LAST:event_nextButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        dispose();
    }//GEN-LAST:event_doneButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminInput;
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<Pelanggan> daftarPelanggan;
    private javax.swing.JButton doneButton;
    private javax.swing.JPanel formAddPenjualanPanel;
    private javax.swing.JLabel idAdminLabel;
    private javax.swing.JLabel idPelangganLabel;
    private javax.swing.JPanel mainAddPenjualanPanel;
    private javax.swing.JButton nextButton;
    private javax.swing.JTextField noNotaInput;
    private javax.swing.JLabel noNotaLabel;
    // End of variables declaration//GEN-END:variables
}
