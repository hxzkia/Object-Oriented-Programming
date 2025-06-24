package view;

import dao.PenjualanDAO;
import dao.ProdukDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Penjualan.DetailPenjualan;
import model.Produk;
import model.User;

public class AddDetailPenjualan extends javax.swing.JDialog {

    private AddPenjualan parent;
    private ArrayList<DetailPenjualan> daftarProduk = new ArrayList<>();
    private User user;
    private PenjualanDisplay refresh;
    
    public AddDetailPenjualan(java.awt.Frame parent, boolean modal, AddPenjualan p, User user, PenjualanDisplay refresh) {
        super(parent, modal);
        initComponents();
        this.parent = p;
        this.user = user;
        this.refresh = refresh;
        getProduk();
    }
    
    private void getProduk() {
        ArrayList<Produk> listProduk = ProdukDAO.getData();
        for (Produk produk : listProduk) {
            pilihanProduk.addItem(produk);
        }
    }
    
    private void showDetail() {
        DefaultTableModel model = (DefaultTableModel) tabelDetailPenjualan.getModel();
        model.setRowCount(0);
        for (DetailPenjualan detail : daftarProduk) {
            Object[] row = {detail.getIdProduk(), detail.getJumlah(), detail.getHarga()};
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        deletePopupMenu = new javax.swing.JPopupMenu();
        deleteMenu = new javax.swing.JMenuItem();
        mainAddDetailPenjualanPanel = new javax.swing.JPanel();
        formAddDetailPenjualanPanel = new javax.swing.JPanel();
        produkLabel = new javax.swing.JLabel();
        jumlahLabel = new javax.swing.JLabel();
        pilihanProduk = new javax.swing.JComboBox<>();
        jumlahInput = new javax.swing.JSpinner();
        saveButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        doneButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tableDetailPembelian = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDetailPenjualan = new javax.swing.JTable();

        deleteMenu.setText("Delete");
        deleteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuActionPerformed(evt);
            }
        });
        deletePopupMenu.add(deleteMenu);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Detail Pembelian");
        setResizable(false);

        mainAddDetailPenjualanPanel.setBackground(new java.awt.Color(204, 204, 204));
        mainAddDetailPenjualanPanel.setMaximumSize(new java.awt.Dimension(318, 374));
        mainAddDetailPenjualanPanel.setMinimumSize(new java.awt.Dimension(318, 374));

        formAddDetailPenjualanPanel.setBackground(new java.awt.Color(102, 102, 102));
        formAddDetailPenjualanPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Form Add Detail Penjualan", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        formAddDetailPenjualanPanel.setMaximumSize(new java.awt.Dimension(318, 255));
        formAddDetailPenjualanPanel.setMinimumSize(new java.awt.Dimension(318, 255));
        formAddDetailPenjualanPanel.setPreferredSize(new java.awt.Dimension(318, 255));
        formAddDetailPenjualanPanel.setLayout(new java.awt.GridBagLayout());

        produkLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        produkLabel.setForeground(new java.awt.Color(255, 255, 255));
        produkLabel.setText("Produk:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 7);
        formAddDetailPenjualanPanel.add(produkLabel, gridBagConstraints);

        jumlahLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jumlahLabel.setForeground(new java.awt.Color(255, 255, 255));
        jumlahLabel.setText("Jumlah:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 12, 7);
        formAddDetailPenjualanPanel.add(jumlahLabel, gridBagConstraints);

        pilihanProduk.setMaximumSize(new java.awt.Dimension(122, 25));
        pilihanProduk.setMinimumSize(new java.awt.Dimension(122, 25));
        pilihanProduk.setPreferredSize(new java.awt.Dimension(122, 25));
        pilihanProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanProdukActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 62;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 0);
        formAddDetailPenjualanPanel.add(pilihanProduk, gridBagConstraints);

        jumlahInput.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jumlahInput.setMaximumSize(new java.awt.Dimension(82, 25));
        jumlahInput.setMinimumSize(new java.awt.Dimension(82, 25));
        jumlahInput.setPreferredSize(new java.awt.Dimension(82, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 12, 0);
        formAddDetailPenjualanPanel.add(jumlahInput, gridBagConstraints);

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

        backButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.setMaximumSize(new java.awt.Dimension(290, 50));
        backButton.setMinimumSize(new java.awt.Dimension(290, 50));
        backButton.setPreferredSize(new java.awt.Dimension(290, 50));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        doneButton.setBackground(new java.awt.Color(51, 255, 255));
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

        javax.swing.GroupLayout mainAddDetailPenjualanPanelLayout = new javax.swing.GroupLayout(mainAddDetailPenjualanPanel);
        mainAddDetailPenjualanPanel.setLayout(mainAddDetailPenjualanPanelLayout);
        mainAddDetailPenjualanPanelLayout.setHorizontalGroup(
            mainAddDetailPenjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainAddDetailPenjualanPanelLayout.createSequentialGroup()
                .addComponent(formAddDetailPenjualanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(mainAddDetailPenjualanPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(mainAddDetailPenjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(doneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainAddDetailPenjualanPanelLayout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainAddDetailPenjualanPanelLayout.setVerticalGroup(
            mainAddDetailPenjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainAddDetailPenjualanPanelLayout.createSequentialGroup()
                .addComponent(formAddDetailPenjualanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainAddDetailPenjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableDetailPembelian.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabel Detail Penjualan", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        tabelDetailPenjualan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produk", "Jumlah", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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
        tabelDetailPenjualan.setComponentPopupMenu(deletePopupMenu);
        jScrollPane1.setViewportView(tabelDetailPenjualan);

        javax.swing.GroupLayout tableDetailPembelianLayout = new javax.swing.GroupLayout(tableDetailPembelian);
        tableDetailPembelian.setLayout(tableDetailPembelianLayout);
        tableDetailPembelianLayout.setHorizontalGroup(
            tableDetailPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableDetailPembelianLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tableDetailPembelianLayout.setVerticalGroup(
            tableDetailPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableDetailPembelianLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableDetailPembelian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableDetailPembelian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainAddDetailPenjualanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainAddDetailPenjualanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 331, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        Produk produk = ((Produk) pilihanProduk.getSelectedItem());
        int jumlah = (int) jumlahInput.getValue();
        
        if (jumlah == 0) {
            JOptionPane.showMessageDialog(rootPane, "Stok " + produk.getNama() + " habis!");
            return;
        }
        
        boolean isfound = false;
        
        for (DetailPenjualan detail : daftarProduk) {
            if(detail.getIdProduk().equals(produk.getId())) {
                if ((detail.getJumlah() + jumlah) > produk.getStok()) {
                    JOptionPane.showMessageDialog(rootPane, "Jumlah melebihi stok barang!");
                    return;
                }
                detail.setJumlah(detail.getJumlah() + jumlah);
                showDetail();
                return;
            }
        }
        
        if(!isfound) {
            daftarProduk.add(parent.getPenjualan().new DetailPenjualan(parent.getPenjualan().getNota(), produk.getId(), produk.getHarga(), jumlah));
            showDetail();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        if (tabelDetailPenjualan.getRowCount() == 0 || tabelDetailPenjualan.getColumnCount() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Tidak bisa menambahkan data kosong!");
            return;
        }
        
        String nota = parent.getPenjualan().getNota();
        int pelanggan = parent.getPenjualan().getIdPelanggan();
        int resultPenjualan = PenjualanDAO.addPenjualan(nota, pelanggan, user.getId());
        
        if (resultPenjualan != 0) {
            for (DetailPenjualan detail : daftarProduk) {
                PenjualanDAO.addDetailPenjualan(nota, detail.getIdProduk(), detail.getHarga(), detail.getJumlah());
            }
        }

        JOptionPane.showMessageDialog(rootPane, "Detail Penjualan berhasil ditambahkan!");
        refresh.showDetailPenjualan();
        dispose();
        parent.dispose();
    }//GEN-LAST:event_doneButtonActionPerformed

    private void pilihanProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanProdukActionPerformed
        int getStok = (((Produk) pilihanProduk.getSelectedItem()).getStok());
        if (getStok != 0) {
            jumlahInput.setModel(new javax.swing.SpinnerNumberModel(1, 1, getStok, 1));
        }
        else {
            jumlahInput.setModel(new javax.swing.SpinnerNumberModel(0, 0, 0, 0));
        }
    }//GEN-LAST:event_pilihanProdukActionPerformed

    private void deleteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuActionPerformed
//        DefaultTableModel model = (DefaultTableModel) tabelDetailPenjualan.getModel();
//        int result = JOptionPane.showConfirmDialog(rootPane, "Hapus Data Produk?");
//        int selected = tabelDetailPenjualan.getSelectedRow();
//        if (selected == -1) {
//            JOptionPane.showMessageDialog(parent, "Pilih suatu baris terlebih dahulu!");
//        }
//        else if (result == JOptionPane.YES_OPTION) {
//            String barang = tabelDetailPenjualan.getModel().getValueAt(selected , 0).toString();
//            for(DetailPenjualan detail : daftarProduk) {
//                if(detail.getIdProduk().equals(barang)) {
//                    System.out.println(detail.getIdProduk());
//                    daftarProduk.remove(detail); 
//                }
//            }
//            model.removeRow(selected);
//            JOptionPane.showMessageDialog(rootPane, "Produk telah dihapus");  
//        }
//        for(DetailPenjualan detail : daftarProduk) {
//            System.out.println(detail.getIdProduk());
//            if(detail.getIdProduk().equals(barang)) {
//                System.out.println("sama");
//            } else {
//                System.out.println("Salah");
//            }
//        }
    }//GEN-LAST:event_deleteMenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JMenuItem deleteMenu;
    private javax.swing.JPopupMenu deletePopupMenu;
    private javax.swing.JButton doneButton;
    private javax.swing.JPanel formAddDetailPenjualanPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jumlahInput;
    private javax.swing.JLabel jumlahLabel;
    private javax.swing.JPanel mainAddDetailPenjualanPanel;
    private javax.swing.JComboBox<Produk> pilihanProduk;
    private javax.swing.JLabel produkLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JTable tabelDetailPenjualan;
    private javax.swing.JPanel tableDetailPembelian;
    // End of variables declaration//GEN-END:variables
}
