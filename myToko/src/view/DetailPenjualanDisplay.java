package view;

import dao.PelangganDAO;
import dao.PenjualanDAO;
import dao.UserDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Pelanggan;
import model.Penjualan;
import model.User;
import model.ViewDetailPenjualan;

public class DetailPenjualanDisplay extends javax.swing.JDialog {

    private PenjualanDisplay parent;
    private String nota;
    private Penjualan penjualan;
    
    public DetailPenjualanDisplay(java.awt.Frame parent, boolean modal, PenjualanDisplay p, String nota) {
        super(parent, modal);
        initComponents();
        this.parent = p;
        this.nota = nota;
        this.penjualan = PenjualanDAO.getDataPenjualanByID(nota);
        init();
        showView();
    }
    
    private void init() {
        noNotaOutput.setText(nota);
        pelangganOutput.setText(String.valueOf(getPelanggan(penjualan.getIdPelanggan())));
        adminOutput.setText(String.valueOf(getAdmin(penjualan.getIdAdmin())));
        tanggalOutput.setText(penjualan.getTanggal());
    }
    
    private void showView() {
        ArrayList<ViewDetailPenjualan> listView = PenjualanDAO.viewDetailPenjualan(nota);
        int grandTotal = 0;
        DefaultTableModel model = (DefaultTableModel) listProdukJual.getModel();
        model.setRowCount(0);
        for (ViewDetailPenjualan view : listView) {
            Object[] row = {view.getIdProduk(),
                view.getHarga(), view.getJumlah(), view.getSubtotal()};
            model.addRow(row);
            grandTotal += view.getSubtotal();
        }
        grandTotalOutput.setText("Rp " + String.valueOf(grandTotal));
    }
    
    private String getPelanggan(int id) {
        ArrayList<Pelanggan> namaPelanggan = PelangganDAO.getData();
        String nama = null;
        for (Pelanggan pelanggan : namaPelanggan) {
            if(pelanggan.getId() == id) {
                nama = pelanggan.getNama();
            }
        }
        return nama;
    }
    
    private String getAdmin(int id) {
        ArrayList<User> namaAdmin = UserDAO.getData();
        String nama = null;
        for (User user : namaAdmin) {
            if(user.getId() == id) {
                nama = user.getFullname();
            }
        }
        return nama;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        popUpMenu = new javax.swing.JPopupMenu();
        deleteMenu = new javax.swing.JMenuItem();
        judulPanel = new javax.swing.JPanel();
        noNotaLabel = new javax.swing.JLabel();
        noNotaOutput = new javax.swing.JTextField();
        pelangganLabel = new javax.swing.JLabel();
        pelangganOutput = new javax.swing.JTextField();
        adminLabel = new javax.swing.JLabel();
        adminOutput = new javax.swing.JTextField();
        tanggalLabel = new javax.swing.JLabel();
        tanggalOutput = new javax.swing.JTextField();
        tabelPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listProdukJual = new javax.swing.JTable();
        grandTotalPanel = new javax.swing.JPanel();
        grandTotalLabel = new javax.swing.JLabel();
        grandTotalOutput = new javax.swing.JTextField();

        deleteMenu.setText("Delete");
        popUpMenu.add(deleteMenu);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detail Penjualan");
        setResizable(false);

        judulPanel.setBackground(new java.awt.Color(102, 102, 102));
        judulPanel.setLayout(new java.awt.GridBagLayout());

        noNotaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        noNotaLabel.setForeground(new java.awt.Color(255, 255, 255));
        noNotaLabel.setText(" No.Nota:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(12, 5, 0, 1);
        judulPanel.add(noNotaLabel, gridBagConstraints);

        noNotaOutput.setEditable(false);
        noNotaOutput.setBackground(new java.awt.Color(102, 102, 102));
        noNotaOutput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        noNotaOutput.setForeground(new java.awt.Color(255, 255, 255));
        noNotaOutput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        noNotaOutput.setMaximumSize(new java.awt.Dimension(184, 26));
        noNotaOutput.setMinimumSize(new java.awt.Dimension(184, 26));
        noNotaOutput.setPreferredSize(new java.awt.Dimension(184, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(12, 4, 0, 40);
        judulPanel.add(noNotaOutput, gridBagConstraints);

        pelangganLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pelangganLabel.setForeground(new java.awt.Color(255, 255, 255));
        pelangganLabel.setText("Pelanggan:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(6, 3, 0, 0);
        judulPanel.add(pelangganLabel, gridBagConstraints);

        pelangganOutput.setEditable(false);
        pelangganOutput.setBackground(new java.awt.Color(102, 102, 102));
        pelangganOutput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pelangganOutput.setForeground(new java.awt.Color(255, 255, 255));
        pelangganOutput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pelangganOutput.setMaximumSize(new java.awt.Dimension(184, 26));
        pelangganOutput.setMinimumSize(new java.awt.Dimension(184, 26));
        pelangganOutput.setPreferredSize(new java.awt.Dimension(184, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(9, 4, 0, 40);
        judulPanel.add(pelangganOutput, gridBagConstraints);

        adminLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adminLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminLabel.setText("  Admin:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 24, 2);
        judulPanel.add(adminLabel, gridBagConstraints);

        adminOutput.setEditable(false);
        adminOutput.setBackground(new java.awt.Color(102, 102, 102));
        adminOutput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        adminOutput.setForeground(new java.awt.Color(255, 255, 255));
        adminOutput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adminOutput.setToolTipText("");
        adminOutput.setMaximumSize(new java.awt.Dimension(184, 26));
        adminOutput.setMinimumSize(new java.awt.Dimension(184, 26));
        adminOutput.setPreferredSize(new java.awt.Dimension(184, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(6, 4, 24, 40);
        judulPanel.add(adminOutput, gridBagConstraints);

        tanggalLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanggalLabel.setForeground(new java.awt.Color(255, 255, 255));
        tanggalLabel.setText("Tanggal:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 4);
        judulPanel.add(tanggalLabel, gridBagConstraints);

        tanggalOutput.setEditable(false);
        tanggalOutput.setBackground(new java.awt.Color(102, 102, 102));
        tanggalOutput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tanggalOutput.setForeground(new java.awt.Color(255, 255, 255));
        tanggalOutput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tanggalOutput.setMaximumSize(new java.awt.Dimension(184, 26));
        tanggalOutput.setMinimumSize(new java.awt.Dimension(184, 26));
        tanggalOutput.setPreferredSize(new java.awt.Dimension(184, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        judulPanel.add(tanggalOutput, gridBagConstraints);

        tabelPanel.setBackground(new java.awt.Color(204, 204, 204));

        listProdukJual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produk", "Harga", "Jumlah", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
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
        jScrollPane1.setViewportView(listProdukJual);
        if (listProdukJual.getColumnModel().getColumnCount() > 0) {
            listProdukJual.getColumnModel().getColumn(0).setResizable(false);
            listProdukJual.getColumnModel().getColumn(1).setResizable(false);
            listProdukJual.getColumnModel().getColumn(2).setResizable(false);
            listProdukJual.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout tabelPanelLayout = new javax.swing.GroupLayout(tabelPanel);
        tabelPanel.setLayout(tabelPanelLayout);
        tabelPanelLayout.setHorizontalGroup(
            tabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        tabelPanelLayout.setVerticalGroup(
            tabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
        );

        grandTotalPanel.setBackground(new java.awt.Color(102, 102, 102));

        grandTotalLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        grandTotalLabel.setForeground(new java.awt.Color(255, 255, 255));
        grandTotalLabel.setText("Grand Total:");

        grandTotalOutput.setEditable(false);
        grandTotalOutput.setBackground(new java.awt.Color(102, 102, 102));
        grandTotalOutput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        grandTotalOutput.setForeground(new java.awt.Color(255, 255, 255));
        grandTotalOutput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        grandTotalOutput.setMaximumSize(new java.awt.Dimension(184, 26));
        grandTotalOutput.setMinimumSize(new java.awt.Dimension(184, 26));
        grandTotalOutput.setPreferredSize(new java.awt.Dimension(184, 26));

        javax.swing.GroupLayout grandTotalPanelLayout = new javax.swing.GroupLayout(grandTotalPanel);
        grandTotalPanel.setLayout(grandTotalPanelLayout);
        grandTotalPanelLayout.setHorizontalGroup(
            grandTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grandTotalPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(grandTotalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grandTotalOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        grandTotalPanelLayout.setVerticalGroup(
            grandTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grandTotalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(grandTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grandTotalPanelLayout.createSequentialGroup()
                        .addComponent(grandTotalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(grandTotalPanelLayout.createSequentialGroup()
                        .addComponent(grandTotalOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(judulPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(grandTotalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(judulPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(grandTotalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminLabel;
    private javax.swing.JTextField adminOutput;
    private javax.swing.JMenuItem deleteMenu;
    private javax.swing.JLabel grandTotalLabel;
    private javax.swing.JTextField grandTotalOutput;
    private javax.swing.JPanel grandTotalPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel judulPanel;
    private javax.swing.JTable listProdukJual;
    private javax.swing.JLabel noNotaLabel;
    private javax.swing.JTextField noNotaOutput;
    private javax.swing.JLabel pelangganLabel;
    private javax.swing.JTextField pelangganOutput;
    private javax.swing.JPopupMenu popUpMenu;
    private javax.swing.JPanel tabelPanel;
    private javax.swing.JLabel tanggalLabel;
    private javax.swing.JTextField tanggalOutput;
    // End of variables declaration//GEN-END:variables
}
