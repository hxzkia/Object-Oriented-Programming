package view;

import java.util.ArrayList;
import model.Produk;
import dao.ProdukDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProdukDisplay extends javax.swing.JPanel {
    
    private DashBoard parent;
    
    public ProdukDisplay(DashBoard parent) {
        initComponents();
        showProduk();
    }
    
    public void showProduk() {
        ArrayList<Produk> listProduk = ProdukDAO.getData();
        
        DefaultTableModel model = (DefaultTableModel) tabelProduk.getModel();
        model.setRowCount(0);
        for (Produk produk : listProduk) {
            Object[] row = {produk.getId(), produk.getNama(),
                produk.getKategori(), produk.getHarga(), produk.getStok()};
            model.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulPanel = new javax.swing.JPanel();
        produkLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelProduk = new javax.swing.JTable();
        addButton = new javax.swing.JLabel();
        listProduk = new javax.swing.JLabel();
        changeButton = new javax.swing.JLabel();
        infoButton = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(800, 700));
        setMinimumSize(new java.awt.Dimension(800, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judulPanel.setBackground(new java.awt.Color(102, 102, 102));
        judulPanel.setMaximumSize(new java.awt.Dimension(796, 90));
        judulPanel.setMinimumSize(new java.awt.Dimension(796, 90));

        produkLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        produkLabel.setForeground(new java.awt.Color(255, 255, 255));
        produkLabel.setText("PRODUK");

        javax.swing.GroupLayout judulPanelLayout = new javax.swing.GroupLayout(judulPanel);
        judulPanel.setLayout(judulPanelLayout);
        judulPanelLayout.setHorizontalGroup(
            judulPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(judulPanelLayout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(produkLabel)
                .addContainerGap(341, Short.MAX_VALUE))
        );
        judulPanelLayout.setVerticalGroup(
            judulPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(judulPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(produkLabel)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        add(judulPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 90));

        tabelProduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Kategori", "Harga", "Stok"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelProduk);

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
        add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 80, 120));

        listProduk.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        listProduk.setText("List Produk");
        listProduk.setToolTipText("");
        add(listProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

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
        add(changeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 540, -1, 120));

        infoButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        infoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-info-80.png"))); // NOI18N
        infoButton.setText("INFO");
        infoButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        infoButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        infoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoButtonMouseClicked(evt);
            }
        });
        add(infoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 540, 80, 120));
    }// </editor-fold>//GEN-END:initComponents

    private void changeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeButtonMouseClicked
        ChangeHarga dialog = new ChangeHarga(parent, true, this);
        dialog.setVisible(true);
    }//GEN-LAST:event_changeButtonMouseClicked

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        AddProduk dialog = new AddProduk(parent, true, this);
        dialog.setVisible(true);
    }//GEN-LAST:event_addButtonMouseClicked

    private void infoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoButtonMouseClicked
        ArrayList<Produk> listProduk = ProdukDAO.getData();
        for (Produk produk : listProduk) {
            if (produk.getStok() == 0) {
                JOptionPane.showMessageDialog(parent, "Stok " + produk.getNama() + " kosong!");
            }
        }
    }//GEN-LAST:event_infoButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addButton;
    private javax.swing.JLabel changeButton;
    private javax.swing.JLabel infoButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel judulPanel;
    private javax.swing.JLabel listProduk;
    private javax.swing.JLabel produkLabel;
    private javax.swing.JTable tabelProduk;
    // End of variables declaration//GEN-END:variables
}
