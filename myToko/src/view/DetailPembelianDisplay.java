package view;

import dao.PemasokDAO;
import dao.PembelianDAO;
import dao.UserDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Pemasok;
import model.Pembelian;
import model.User;
import model.ViewDetailPembelian;

public class DetailPembelianDisplay extends javax.swing.JDialog {

    private PembelianDisplay parent;
    private String nota;
    private Pembelian pembelian;
    
    public DetailPembelianDisplay(java.awt.Frame parent, boolean modal, PembelianDisplay p, String nota) {
        super(parent, modal);
        initComponents();
        this.parent = p;
        this.nota = nota;
        this.pembelian = PembelianDAO.getDataPembelianByID(nota);
        init();
        showView();
    }
    
    private void init() {
        noNotaOutput.setText(nota);
        pemasokOutput.setText(String.valueOf(getPemasok(pembelian.getIdPemasok())));
        adminOutput.setText(String.valueOf(getAdmin(pembelian.getIdAdmin())));
        tanggalOutput.setText(pembelian.getTanggal());
    }
    
    private void showView() {
        ArrayList<ViewDetailPembelian> listView = PembelianDAO.viewDetailPembelian(nota);
        int grandTotal = 0;
        DefaultTableModel model = (DefaultTableModel) listProdukBeli.getModel();
        model.setRowCount(0);
        for (ViewDetailPembelian view : listView) {
            Object[] row = {view.getIdProduk(),
                view.getHarga(), view.getJumlah(), view.getSubtotal()};
            model.addRow(row);
            grandTotal += view.getSubtotal();
        }
        grandTotalOutput.setText("Rp " + String.valueOf(grandTotal));
    }
    
    private String getPemasok(String id) {
        ArrayList<Pemasok> namaPemasok = PemasokDAO.getData();
        String nama = null;
        for (Pemasok pemasok : namaPemasok) {
            if(pemasok.getId().equals(id)) {
                nama = pemasok.getNama();
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
        pemasokLabel = new javax.swing.JLabel();
        pemasokOutput = new javax.swing.JTextField();
        adminLabel = new javax.swing.JLabel();
        adminOutput = new javax.swing.JTextField();
        tanggalLabel = new javax.swing.JLabel();
        tanggalOutput = new javax.swing.JTextField();
        tabelPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listProdukBeli = new javax.swing.JTable();
        grandTotalPanel = new javax.swing.JPanel();
        grandTotalLabel = new javax.swing.JLabel();
        grandTotalOutput = new javax.swing.JTextField();

        deleteMenu.setText("Delete");
        popUpMenu.add(deleteMenu);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detail Pembelian");
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

        pemasokLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pemasokLabel.setForeground(new java.awt.Color(255, 255, 255));
        pemasokLabel.setText("Pemasok:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(6, 3, 0, 0);
        judulPanel.add(pemasokLabel, gridBagConstraints);

        pemasokOutput.setEditable(false);
        pemasokOutput.setBackground(new java.awt.Color(102, 102, 102));
        pemasokOutput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pemasokOutput.setForeground(new java.awt.Color(255, 255, 255));
        pemasokOutput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pemasokOutput.setMaximumSize(new java.awt.Dimension(184, 26));
        pemasokOutput.setMinimumSize(new java.awt.Dimension(184, 26));
        pemasokOutput.setPreferredSize(new java.awt.Dimension(184, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(9, 4, 0, 40);
        judulPanel.add(pemasokOutput, gridBagConstraints);

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

        listProdukBeli.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(listProdukBeli);
        if (listProdukBeli.getColumnModel().getColumnCount() > 0) {
            listProdukBeli.getColumnModel().getColumn(0).setResizable(false);
            listProdukBeli.getColumnModel().getColumn(1).setResizable(false);
            listProdukBeli.getColumnModel().getColumn(2).setResizable(false);
            listProdukBeli.getColumnModel().getColumn(3).setResizable(false);
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
    private javax.swing.JTable listProdukBeli;
    private javax.swing.JLabel noNotaLabel;
    private javax.swing.JTextField noNotaOutput;
    private javax.swing.JLabel pemasokLabel;
    private javax.swing.JTextField pemasokOutput;
    private javax.swing.JPopupMenu popUpMenu;
    private javax.swing.JPanel tabelPanel;
    private javax.swing.JLabel tanggalLabel;
    private javax.swing.JTextField tanggalOutput;
    // End of variables declaration//GEN-END:variables
}
