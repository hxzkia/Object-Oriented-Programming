package view;

import dao.PembelianDAO;
import dao.ProdukDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Pembelian.DetailPembelian;
import model.Produk;
import model.User;

public class AddDetailPembelian extends javax.swing.JDialog {

    private AddPembelian parent;
    private ArrayList<DetailPembelian> daftarProduk = new ArrayList<>();
    private User user;
    private PembelianDisplay refresh;
    
    public AddDetailPembelian(java.awt.Frame parent, boolean modal, AddPembelian p, User user, PembelianDisplay refresh) {
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
        DefaultTableModel model = (DefaultTableModel) tabelDetailPembelian.getModel();
        model.setRowCount(0);
        for (DetailPembelian detail : daftarProduk) {
            Object[] row = {detail.getIdProduk(), detail.getJumlah(), detail.getHarga()};
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        popUpMenu = new javax.swing.JPopupMenu();
        deleteMenu = new javax.swing.JMenuItem();
        mainAddDetailPembelianPanel = new javax.swing.JPanel();
        formAddDetailPembelianPanel = new javax.swing.JPanel();
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
        tabelDetailPembelian = new javax.swing.JTable();

        deleteMenu.setText("Delete");
        deleteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuActionPerformed(evt);
            }
        });
        popUpMenu.add(deleteMenu);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Detail Pembelian");
        setResizable(false);

        mainAddDetailPembelianPanel.setBackground(new java.awt.Color(204, 204, 204));
        mainAddDetailPembelianPanel.setMaximumSize(new java.awt.Dimension(318, 374));
        mainAddDetailPembelianPanel.setMinimumSize(new java.awt.Dimension(318, 374));

        formAddDetailPembelianPanel.setBackground(new java.awt.Color(102, 102, 102));
        formAddDetailPembelianPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Form Add Detail Pembelian", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        formAddDetailPembelianPanel.setMaximumSize(new java.awt.Dimension(318, 255));
        formAddDetailPembelianPanel.setMinimumSize(new java.awt.Dimension(318, 255));
        formAddDetailPembelianPanel.setPreferredSize(new java.awt.Dimension(318, 255));
        formAddDetailPembelianPanel.setLayout(new java.awt.GridBagLayout());

        produkLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        produkLabel.setForeground(new java.awt.Color(255, 255, 255));
        produkLabel.setText("Produk:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 7);
        formAddDetailPembelianPanel.add(produkLabel, gridBagConstraints);

        jumlahLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jumlahLabel.setForeground(new java.awt.Color(255, 255, 255));
        jumlahLabel.setText("Jumlah:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 12, 7);
        formAddDetailPembelianPanel.add(jumlahLabel, gridBagConstraints);

        pilihanProduk.setMaximumSize(new java.awt.Dimension(122, 25));
        pilihanProduk.setMinimumSize(new java.awt.Dimension(122, 25));
        pilihanProduk.setPreferredSize(new java.awt.Dimension(122, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 62;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 0);
        formAddDetailPembelianPanel.add(pilihanProduk, gridBagConstraints);

        jumlahInput.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jumlahInput.setMaximumSize(new java.awt.Dimension(82, 25));
        jumlahInput.setMinimumSize(new java.awt.Dimension(82, 25));
        jumlahInput.setPreferredSize(new java.awt.Dimension(82, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 12, 0);
        formAddDetailPembelianPanel.add(jumlahInput, gridBagConstraints);

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

        javax.swing.GroupLayout mainAddDetailPembelianPanelLayout = new javax.swing.GroupLayout(mainAddDetailPembelianPanel);
        mainAddDetailPembelianPanel.setLayout(mainAddDetailPembelianPanelLayout);
        mainAddDetailPembelianPanelLayout.setHorizontalGroup(
            mainAddDetailPembelianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainAddDetailPembelianPanelLayout.createSequentialGroup()
                .addComponent(formAddDetailPembelianPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(mainAddDetailPembelianPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainAddDetailPembelianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(doneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainAddDetailPembelianPanelLayout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainAddDetailPembelianPanelLayout.setVerticalGroup(
            mainAddDetailPembelianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainAddDetailPembelianPanelLayout.createSequentialGroup()
                .addComponent(formAddDetailPembelianPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainAddDetailPembelianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableDetailPembelian.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabel Detail Pembelian", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        tabelDetailPembelian.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelDetailPembelian);

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
                .addComponent(mainAddDetailPembelianPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainAddDetailPembelianPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 331, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        Produk produk = ((Produk) pilihanProduk.getSelectedItem());
        int jumlah = (int) jumlahInput.getValue();
        
        boolean isfound = false;
        
        for (DetailPembelian detail : daftarProduk) {
            if(detail.getIdProduk().equals(produk.getId())) {
                detail.setJumlah(detail.getJumlah() + jumlah);
                showDetail();
                return;
            }
        }
        
        if(!isfound) {
            daftarProduk.add(parent.getPembelian().new DetailPembelian(parent.getPembelian().getNota(), produk.getId(), produk.getHarga(), jumlah));
            showDetail();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        if (tabelDetailPembelian.getRowCount() == 0 || tabelDetailPembelian.getColumnCount() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Tidak bisa menambahkan data kosong!");
            return;
        }
        
        String nota = parent.getPembelian().getNota();
        String pemasok = parent.getPembelian().getIdPemasok();
        int resultPembelian = PembelianDAO.addPembelian(nota, pemasok, user.getId());
        
        if (resultPembelian != 0) {
            for (DetailPembelian detail : daftarProduk) {
                PembelianDAO.addDetailPembelian(nota, detail.getIdProduk(), detail.getHarga(), detail.getJumlah());
            }
        }

        JOptionPane.showMessageDialog(rootPane, "Detail Pembelian berhasil ditambahkan!");
        refresh.showDetailPembelian();
        dispose();
        parent.dispose();
    }//GEN-LAST:event_doneButtonActionPerformed

    private void deleteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuActionPerformed
        
    }//GEN-LAST:event_deleteMenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JMenuItem deleteMenu;
    private javax.swing.JButton doneButton;
    private javax.swing.JPanel formAddDetailPembelianPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jumlahInput;
    private javax.swing.JLabel jumlahLabel;
    private javax.swing.JPanel mainAddDetailPembelianPanel;
    private javax.swing.JComboBox<Produk> pilihanProduk;
    private javax.swing.JPopupMenu popUpMenu;
    private javax.swing.JLabel produkLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JTable tabelDetailPembelian;
    private javax.swing.JPanel tableDetailPembelian;
    // End of variables declaration//GEN-END:variables
}
