package view;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Kategori;
import dao.KategoriDAO;

public class KategoriDisplay extends javax.swing.JPanel {
    
    private DashBoard parent;
    
    public KategoriDisplay(DashBoard parent) {
        initComponents();
        showKategori();
        this.parent = parent;
    }
    
    private void showKategori() {
        ArrayList<Kategori> listKategori = KategoriDAO.getData();
        
        DefaultTableModel model = (DefaultTableModel) tabelKategori.getModel();
        model.setRowCount(0);
        for (Kategori kategori : listKategori) {
            Object[] row = {kategori.getId(), kategori.getNama()};
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulPanel = new javax.swing.JPanel();
        kategoriLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelKategori = new javax.swing.JTable();
        listKategoriLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(800, 700));
        setMinimumSize(new java.awt.Dimension(800, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judulPanel.setBackground(new java.awt.Color(102, 102, 102));
        judulPanel.setMaximumSize(new java.awt.Dimension(796, 90));
        judulPanel.setMinimumSize(new java.awt.Dimension(796, 90));

        kategoriLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        kategoriLabel.setForeground(new java.awt.Color(255, 255, 255));
        kategoriLabel.setText("KATEGORI");

        javax.swing.GroupLayout judulPanelLayout = new javax.swing.GroupLayout(judulPanel);
        judulPanel.setLayout(judulPanelLayout);
        judulPanelLayout.setHorizontalGroup(
            judulPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(judulPanelLayout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(kategoriLabel)
                .addContainerGap(324, Short.MAX_VALUE))
        );
        judulPanelLayout.setVerticalGroup(
            judulPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(judulPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(kategoriLabel)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        add(judulPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 90));

        tabelKategori.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelKategori);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 700, 470));

        listKategoriLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        listKategoriLabel.setText("List Kategori");
        listKategoriLabel.setToolTipText("");
        add(listKategoriLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel judulPanel;
    private javax.swing.JLabel kategoriLabel;
    private javax.swing.JLabel listKategoriLabel;
    private javax.swing.JTable tabelKategori;
    // End of variables declaration//GEN-END:variables
}
