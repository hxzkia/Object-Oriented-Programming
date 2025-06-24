package view;

import dao.PelangganDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Pelanggan;


public class PelangganDisplay extends javax.swing.JPanel {
    
    private DashBoard parent;
    
    public PelangganDisplay(DashBoard parent) {
        initComponents();
        showPelanggan();
    }
    
    public void showPelanggan() {
        ArrayList<Pelanggan> pelanggans = PelangganDAO.getData();
        
        DefaultTableModel model = (DefaultTableModel) tabelPelanggan.getModel();
        model.setRowCount(0);
        for(Pelanggan pelanggan : pelanggans) {
            Object[]row = {pelanggan.getId(), 
                pelanggan.getNama(), 
                pelanggan.getNoHP()};
            model.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulPanel = new javax.swing.JPanel();
        pelangganLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPelanggan = new javax.swing.JTable();
        addButton = new javax.swing.JLabel();
        listPelangganLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(800, 700));
        setMinimumSize(new java.awt.Dimension(800, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judulPanel.setBackground(new java.awt.Color(102, 102, 102));
        judulPanel.setMaximumSize(new java.awt.Dimension(796, 90));
        judulPanel.setMinimumSize(new java.awt.Dimension(796, 90));

        pelangganLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        pelangganLabel.setForeground(new java.awt.Color(255, 255, 255));
        pelangganLabel.setText("PELANGGAN");

        javax.swing.GroupLayout judulPanelLayout = new javax.swing.GroupLayout(judulPanel);
        judulPanel.setLayout(judulPanelLayout);
        judulPanelLayout.setHorizontalGroup(
            judulPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(judulPanelLayout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(pelangganLabel)
                .addContainerGap(241, Short.MAX_VALUE))
        );
        judulPanelLayout.setVerticalGroup(
            judulPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(judulPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(pelangganLabel)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        add(judulPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 90));

        tabelPelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nama", "Nomor HP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(tabelPelanggan);

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
        add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 540, 90, 120));

        listPelangganLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        listPelangganLabel.setText("List Pelanggan");
        listPelangganLabel.setToolTipText("");
        add(listPelangganLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        AddPelanggan dialog = new AddPelanggan(parent, true, this);
        dialog.setVisible(true);
    }//GEN-LAST:event_addButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel judulPanel;
    private javax.swing.JLabel listPelangganLabel;
    private javax.swing.JLabel pelangganLabel;
    private javax.swing.JTable tabelPelanggan;
    // End of variables declaration//GEN-END:variables
}
