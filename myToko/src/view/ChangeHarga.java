package view;

import dao.ProdukDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Produk;

public class ChangeHarga extends javax.swing.JDialog {
    
    private ProdukDisplay parent;
    
    public ChangeHarga(java.awt.Frame parent, boolean modal, ProdukDisplay p) {
        super(parent, modal);
        initComponents();
        this.parent = p;
        getProduk();
    }
    
    private void clear() {
        daftarProduk.setSelectedIndex(0);
        hargaBaruInput.setText("");
    }
    
    private void getProduk() {
        ArrayList<Produk> listProduk = ProdukDAO.getData();
        for (Produk produk : listProduk) {
            daftarProduk.addItem(produk);
        }   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mainAddProdukPanel = new javax.swing.JPanel();
        formChangeHargaPanel = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        hargaLamaLabel = new javax.swing.JLabel();
        hargaLamaInput = new javax.swing.JFormattedTextField();
        hargaBaruLabel = new javax.swing.JLabel();
        hargaBaruInput = new javax.swing.JFormattedTextField();
        daftarProduk = new javax.swing.JComboBox<>();
        saveButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        doneButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change Harga");
        setResizable(false);

        mainAddProdukPanel.setBackground(new java.awt.Color(204, 204, 204));
        mainAddProdukPanel.setMaximumSize(new java.awt.Dimension(318, 374));
        mainAddProdukPanel.setMinimumSize(new java.awt.Dimension(318, 374));

        formChangeHargaPanel.setBackground(new java.awt.Color(102, 102, 102));
        formChangeHargaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Form Change Harga", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        formChangeHargaPanel.setMaximumSize(new java.awt.Dimension(318, 255));
        formChangeHargaPanel.setMinimumSize(new java.awt.Dimension(318, 255));
        formChangeHargaPanel.setPreferredSize(new java.awt.Dimension(318, 255));
        formChangeHargaPanel.setLayout(new java.awt.GridBagLayout());

        idLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(255, 255, 255));
        idLabel.setText("Nama:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 0, 7);
        formChangeHargaPanel.add(idLabel, gridBagConstraints);

        hargaLamaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hargaLamaLabel.setForeground(new java.awt.Color(255, 255, 255));
        hargaLamaLabel.setText("Harga Lama:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 7);
        formChangeHargaPanel.add(hargaLamaLabel, gridBagConstraints);

        hargaLamaInput.setEditable(false);
        hargaLamaInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        hargaLamaInput.setMaximumSize(new java.awt.Dimension(184, 26));
        hargaLamaInput.setMinimumSize(new java.awt.Dimension(184, 26));
        hargaLamaInput.setPreferredSize(new java.awt.Dimension(184, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        formChangeHargaPanel.add(hargaLamaInput, gridBagConstraints);

        hargaBaruLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hargaBaruLabel.setForeground(new java.awt.Color(255, 255, 255));
        hargaBaruLabel.setText("Harga Baru:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 7);
        formChangeHargaPanel.add(hargaBaruLabel, gridBagConstraints);

        hargaBaruInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        hargaBaruInput.setMaximumSize(new java.awt.Dimension(184, 26));
        hargaBaruInput.setMinimumSize(new java.awt.Dimension(184, 26));
        hargaBaruInput.setPreferredSize(new java.awt.Dimension(184, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        formChangeHargaPanel.add(hargaBaruInput, gridBagConstraints);

        daftarProduk.setMaximumSize(new java.awt.Dimension(184, 26));
        daftarProduk.setMinimumSize(new java.awt.Dimension(184, 26));
        daftarProduk.setPreferredSize(new java.awt.Dimension(184, 26));
        daftarProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarProdukActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        formChangeHargaPanel.add(daftarProduk, gridBagConstraints);

        saveButton.setBackground(new java.awt.Color(204, 255, 204));
        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saveButton.setText("SAVE");
        saveButton.setMaximumSize(new java.awt.Dimension(145, 50));
        saveButton.setMinimumSize(new java.awt.Dimension(145, 50));
        saveButton.setPreferredSize(new java.awt.Dimension(145, 50));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
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

        javax.swing.GroupLayout mainAddProdukPanelLayout = new javax.swing.GroupLayout(mainAddProdukPanel);
        mainAddProdukPanel.setLayout(mainAddProdukPanelLayout);
        mainAddProdukPanelLayout.setHorizontalGroup(
            mainAddProdukPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formChangeHargaPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainAddProdukPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainAddProdukPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainAddProdukPanelLayout.createSequentialGroup()
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainAddProdukPanelLayout.setVerticalGroup(
            mainAddProdukPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainAddProdukPanelLayout.createSequentialGroup()
                .addComponent(formChangeHargaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainAddProdukPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainAddProdukPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainAddProdukPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String id = ((Produk) daftarProduk.getSelectedItem()).getId();
        int hargaLama = Integer.parseInt(hargaLamaInput.getText());
        int hargaBaru = Integer.parseInt(hargaBaruInput.getText().trim());
        
        if (hargaBaru <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Harga tidak boleh kurang dari atau sama dengan 0!");
            return;
        }
        else if (hargaBaru == hargaLama) {
            JOptionPane.showMessageDialog(rootPane, "Harga baru tidak boleh sama dengan harga yang lama!");
            return;
        }
        
        int result = ProdukDAO.changeHarga(id, hargaBaru);
        
        if (result != 0) {
            JOptionPane.showMessageDialog(rootPane, "Harga berhasil diperbarui!");
            parent.showProduk();
            dispose();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        dispose();
    }//GEN-LAST:event_doneButtonActionPerformed

    private void daftarProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarProdukActionPerformed
        hargaLamaInput.setValue(((Produk) daftarProduk.getSelectedItem()).getHarga());
    }//GEN-LAST:event_daftarProdukActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<Produk
    > daftarProduk;
    private javax.swing.JButton doneButton;
    private javax.swing.JPanel formChangeHargaPanel;
    private javax.swing.JFormattedTextField hargaBaruInput;
    private javax.swing.JLabel hargaBaruLabel;
    private javax.swing.JFormattedTextField hargaLamaInput;
    private javax.swing.JLabel hargaLamaLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel mainAddProdukPanel;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
