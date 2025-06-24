package view;

import dao.KategoriDAO;
import dao.ProdukDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Kategori;

public class AddProduk extends javax.swing.JDialog {
    
    private ProdukDisplay parent;
    
    public AddProduk(java.awt.Frame parent, boolean modal, ProdukDisplay p) {
        super(parent, modal);
        initComponents();
        this.parent = p;
        getKategori();
        clear();
    }
    
    private void clear() {
        idInput.setText("");
        namaInput.setText("");
        pilihanKategori.setSelectedIndex(-1);
        hargaInput.setText("");
        stokInput.setText("");
    }
    
    private void getKategori() {
        ArrayList<Kategori> listKategori = KategoriDAO.getData();
        for (Kategori kategori : listKategori) {
            pilihanKategori.addItem(kategori);
        }
    }
    
    private static boolean checkID(String id) {
        return id.matches("PR\\d{4}") || id.matches("pr\\d{4}");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mainAddProdukPanel = new javax.swing.JPanel();
        formAddProdukPanel = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        namaInput = new javax.swing.JTextField();
        namaLabel = new javax.swing.JLabel();
        idInput = new javax.swing.JTextField();
        kategoriLabel = new javax.swing.JLabel();
        pilihanKategori = new javax.swing.JComboBox<>();
        hargaLabel = new javax.swing.JLabel();
        hargaInput = new javax.swing.JFormattedTextField();
        stokLabel = new javax.swing.JLabel();
        stokInput = new javax.swing.JFormattedTextField();
        idInput1 = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        doneButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Produk");
        setResizable(false);

        mainAddProdukPanel.setBackground(new java.awt.Color(204, 204, 204));
        mainAddProdukPanel.setMaximumSize(new java.awt.Dimension(318, 374));
        mainAddProdukPanel.setMinimumSize(new java.awt.Dimension(318, 374));

        formAddProdukPanel.setBackground(new java.awt.Color(102, 102, 102));
        formAddProdukPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Form Add Produk", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        formAddProdukPanel.setMaximumSize(new java.awt.Dimension(318, 255));
        formAddProdukPanel.setMinimumSize(new java.awt.Dimension(318, 255));
        formAddProdukPanel.setPreferredSize(new java.awt.Dimension(318, 255));
        formAddProdukPanel.setLayout(new java.awt.GridBagLayout());

        idLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(255, 255, 255));
        idLabel.setText("ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 7);
        formAddProdukPanel.add(idLabel, gridBagConstraints);

        namaInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        namaInput.setMaximumSize(new java.awt.Dimension(184, 26));
        namaInput.setMinimumSize(new java.awt.Dimension(184, 26));
        namaInput.setPreferredSize(new java.awt.Dimension(184, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        formAddProdukPanel.add(namaInput, gridBagConstraints);

        namaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        namaLabel.setForeground(new java.awt.Color(255, 255, 255));
        namaLabel.setText("Nama: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(7, 5, 0, 2);
        formAddProdukPanel.add(namaLabel, gridBagConstraints);

        idInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idInput.setMaximumSize(new java.awt.Dimension(184, 26));
        idInput.setMinimumSize(new java.awt.Dimension(184, 26));
        idInput.setPreferredSize(new java.awt.Dimension(184, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 0, 0);
        formAddProdukPanel.add(idInput, gridBagConstraints);

        kategoriLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kategoriLabel.setForeground(new java.awt.Color(255, 255, 255));
        kategoriLabel.setText("Kategori:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 7);
        formAddProdukPanel.add(kategoriLabel, gridBagConstraints);

        pilihanKategori.setMaximumSize(new java.awt.Dimension(122, 26));
        pilihanKategori.setMinimumSize(new java.awt.Dimension(122, 26));
        pilihanKategori.setPreferredSize(new java.awt.Dimension(122, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 62;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 0);
        formAddProdukPanel.add(pilihanKategori, gridBagConstraints);

        hargaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hargaLabel.setForeground(new java.awt.Color(255, 255, 255));
        hargaLabel.setText("Harga:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 7);
        formAddProdukPanel.add(hargaLabel, gridBagConstraints);

        hargaInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        hargaInput.setMaximumSize(new java.awt.Dimension(184, 26));
        hargaInput.setMinimumSize(new java.awt.Dimension(184, 26));
        hargaInput.setPreferredSize(new java.awt.Dimension(184, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 0);
        formAddProdukPanel.add(hargaInput, gridBagConstraints);

        stokLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stokLabel.setForeground(new java.awt.Color(255, 255, 255));
        stokLabel.setText("Stok:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 14, 7);
        formAddProdukPanel.add(stokLabel, gridBagConstraints);

        stokInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        stokInput.setMaximumSize(new java.awt.Dimension(184, 26));
        stokInput.setMinimumSize(new java.awt.Dimension(184, 26));
        stokInput.setPreferredSize(new java.awt.Dimension(184, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 14, 0);
        formAddProdukPanel.add(stokInput, gridBagConstraints);

        idInput1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idInput1.setMaximumSize(new java.awt.Dimension(184, 26));
        idInput1.setMinimumSize(new java.awt.Dimension(184, 26));
        idInput1.setPreferredSize(new java.awt.Dimension(184, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        formAddProdukPanel.add(idInput1, gridBagConstraints);

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
            .addGroup(mainAddProdukPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainAddProdukPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainAddProdukPanelLayout.createSequentialGroup()
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 12, Short.MAX_VALUE))
            .addComponent(formAddProdukPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainAddProdukPanelLayout.setVerticalGroup(
            mainAddProdukPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainAddProdukPanelLayout.createSequentialGroup()
                .addComponent(formAddProdukPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainAddProdukPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainAddProdukPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainAddProdukPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String id = idInput.getText().trim();
        String nama = namaInput.getText().trim();
        
        if (pilihanKategori.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Tidak boleh ada field yang kosong!");
            return;
        }
        
        String kategori = ((Kategori) pilihanKategori.getSelectedItem()).getId();
        
        int harga;
        int stok;
        
        if (hargaInput.getText().trim().isEmpty() || stokInput.getText().trim().isEmpty() || id.equals("") || nama.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Tidak boleh ada field yang kosong!");
            return;
        }
        else {
            harga = Integer.parseInt(hargaInput.getText().trim());
            stok = Integer.parseInt(stokInput.getText().trim());
            if (harga <= 0 || stok <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Harga atau stok tidak boleh kurang dari atau sama dengan 0!");
                return;
            }
        }
        
        int result = ProdukDAO.addProduk(id, nama, kategori, stok, harga);
        
        if (!checkID(id)) {
            JOptionPane.showMessageDialog(rootPane, "ID Produk harus diawali dengan PR dan berakhir dengan 4 nomor di belakang PR!");
        }
        else if (result != 0) {
            JOptionPane.showMessageDialog(rootPane, "Tambah Produk berhasil!");
            parent.showProduk();
            clear();
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "ID Produk sudah terdaftar!");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        dispose();
    }//GEN-LAST:event_doneButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JButton doneButton;
    private javax.swing.JPanel formAddProdukPanel;
    private javax.swing.JFormattedTextField hargaInput;
    private javax.swing.JLabel hargaLabel;
    private javax.swing.JTextField idInput;
    private javax.swing.JTextField idInput1;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel kategoriLabel;
    private javax.swing.JPanel mainAddProdukPanel;
    private javax.swing.JTextField namaInput;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JComboBox<Kategori> pilihanKategori;
    private javax.swing.JButton saveButton;
    private javax.swing.JFormattedTextField stokInput;
    private javax.swing.JLabel stokLabel;
    // End of variables declaration//GEN-END:variables
}
