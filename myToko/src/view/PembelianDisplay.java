package view;

import dao.PembelianDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Pembelian;
import model.User;

public class PembelianDisplay extends javax.swing.JPanel {
    
    private DashBoard parent;
    private User user;

    public PembelianDisplay(DashBoard parent, User user) {
        initComponents();
        this.user = user;
        showDetailPembelian();
    }
    
    public void showDetailPembelian() {
        ArrayList<Pembelian> listPembelian = PembelianDAO.getDataPembelian();
        
        DefaultTableModel model = (DefaultTableModel) tabelPembelian.getModel();
        model.setRowCount(0);
        for (Pembelian pembelian : listPembelian) {
            Object[] row = {pembelian.getNota(), pembelian.getIdPemasok(),
                pembelian.getIdAdmin(), pembelian.getTanggal()};
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulPanel = new javax.swing.JPanel();
        pembelianLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPembelian = new javax.swing.JTable();
        addButton = new javax.swing.JLabel();
        detailButton = new javax.swing.JLabel();
        listPembelianLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(800, 700));
        setMinimumSize(new java.awt.Dimension(800, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judulPanel.setBackground(new java.awt.Color(102, 102, 102));
        judulPanel.setMaximumSize(new java.awt.Dimension(796, 90));
        judulPanel.setMinimumSize(new java.awt.Dimension(796, 90));

        pembelianLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        pembelianLabel.setForeground(new java.awt.Color(255, 255, 255));
        pembelianLabel.setText("PEMBELIAN");

        javax.swing.GroupLayout judulPanelLayout = new javax.swing.GroupLayout(judulPanel);
        judulPanel.setLayout(judulPanelLayout);
        judulPanelLayout.setHorizontalGroup(
            judulPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(judulPanelLayout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(pembelianLabel)
                .addContainerGap(298, Short.MAX_VALUE))
        );
        judulPanelLayout.setVerticalGroup(
            judulPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(judulPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(pembelianLabel)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        add(judulPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 90));

        tabelPembelian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No. Nota", "Pemasok", "Admin", "Tanggal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelPembelian);

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
        add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 540, 90, 120));

        detailButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        detailButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-detail-80.png"))); // NOI18N
        detailButton.setText("DETAIL");
        detailButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        detailButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        detailButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailButtonMouseClicked(evt);
            }
        });
        add(detailButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 540, 90, 120));

        listPembelianLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        listPembelianLabel.setText("List Pembelian");
        listPembelianLabel.setToolTipText("");
        add(listPembelianLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        AddPembelian dialog = new AddPembelian(parent, true, parent, user, this);
        dialog.setVisible(true);
    }//GEN-LAST:event_addButtonMouseClicked

    private void detailButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailButtonMouseClicked
        int selectedRow = tabelPembelian.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(parent, "Pilih suatu baris terlebih dahulu!");
        }
        else {
            String nota = tabelPembelian.getModel().getValueAt(tabelPembelian.getSelectedRow(), 0).toString();
            DetailPembelianDisplay dialog = new DetailPembelianDisplay(parent, true, this, nota);
            dialog.setVisible(true);
        }
    }//GEN-LAST:event_detailButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addButton;
    private javax.swing.JLabel detailButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel judulPanel;
    private javax.swing.JLabel listPembelianLabel;
    private javax.swing.JLabel pembelianLabel;
    private javax.swing.JTable tabelPembelian;
    // End of variables declaration//GEN-END:variables
}
