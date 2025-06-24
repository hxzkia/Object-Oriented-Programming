package view;

import dao.PemasokDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Pemasok;


public class PemasokDisplay extends javax.swing.JPanel {
    
    private DashBoard parent;
    
    public PemasokDisplay(DashBoard parent) {
        initComponents();
        showPemasok();
    }
    
    public void showPemasok() {
        ArrayList<Pemasok> pemasoks = PemasokDAO.getData();
        
        DefaultTableModel model = (DefaultTableModel) tabelPemasok.getModel();
        model.setRowCount(0);
        for(Pemasok pemasok : pemasoks) {
            Object[]row = {pemasok.getId(), 
                pemasok.getNama(), 
                pemasok.getNoHP()};
            model.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulPanel = new javax.swing.JPanel();
        pemasokLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPemasok = new javax.swing.JTable();
        addButton = new javax.swing.JLabel();
        listPemasokLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(800, 700));
        setMinimumSize(new java.awt.Dimension(800, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judulPanel.setBackground(new java.awt.Color(102, 102, 102));
        judulPanel.setMaximumSize(new java.awt.Dimension(796, 90));
        judulPanel.setMinimumSize(new java.awt.Dimension(796, 90));

        pemasokLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        pemasokLabel.setForeground(new java.awt.Color(255, 255, 255));
        pemasokLabel.setText("PEMASOK");

        javax.swing.GroupLayout judulPanelLayout = new javax.swing.GroupLayout(judulPanel);
        judulPanel.setLayout(judulPanelLayout);
        judulPanelLayout.setHorizontalGroup(
            judulPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(judulPanelLayout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(pemasokLabel)
                .addContainerGap(288, Short.MAX_VALUE))
        );
        judulPanelLayout.setVerticalGroup(
            judulPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(judulPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(pemasokLabel)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        add(judulPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 90));

        tabelPemasok.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelPemasok);

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

        listPemasokLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        listPemasokLabel.setText("List Pemasok");
        listPemasokLabel.setToolTipText("");
        add(listPemasokLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        AddPemasok dialog = new AddPemasok(parent, true, this);
        dialog.setVisible(true);
    }//GEN-LAST:event_addButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel judulPanel;
    private javax.swing.JLabel listPemasokLabel;
    private javax.swing.JLabel pemasokLabel;
    private javax.swing.JTable tabelPemasok;
    // End of variables declaration//GEN-END:variables
}
