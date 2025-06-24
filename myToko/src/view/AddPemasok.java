package view;

import dao.PemasokDAO;
import javax.swing.JOptionPane;

public class AddPemasok extends javax.swing.JDialog {
    
    private PemasokDisplay parent;
    
    public AddPemasok(java.awt.Frame parent, boolean modal, PemasokDisplay p) {
        super(parent, modal);
        initComponents();
        this.parent = p;
    }
    
    private void clear() {
        idInput.setText("");
        nameInput.setText("");
        phoneNumInput.setText("");
    }
    
    private static boolean checkID(String id) {
        return id.matches("P\\d{3}") || id.matches("p\\d{3}");
    }
    
    private static boolean checkPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("0\\d{11}") || phoneNumber.matches("0\\d{12}") || phoneNumber.matches("0\\d{13}");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        saveButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        doneButton = new javax.swing.JButton();
        formAddPemasokPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        phoneNumLabel = new javax.swing.JLabel();
        phoneNumInput = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        idInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Pemasok");
        setResizable(false);

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
        doneButton.setMaximumSize(new java.awt.Dimension(295, 50));
        doneButton.setMinimumSize(new java.awt.Dimension(2905, 50));
        doneButton.setPreferredSize(new java.awt.Dimension(295, 50));
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        formAddPemasokPanel.setBackground(new java.awt.Color(102, 102, 102));
        formAddPemasokPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Form Add Pemasok", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        formAddPemasokPanel.setLayout(new java.awt.GridBagLayout());

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 6);
        formAddPemasokPanel.add(nameLabel, gridBagConstraints);

        nameInput.setMaximumSize(new java.awt.Dimension(174, 30));
        nameInput.setMinimumSize(new java.awt.Dimension(174, 30));
        nameInput.setName(""); // NOI18N
        nameInput.setPreferredSize(new java.awt.Dimension(174, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        formAddPemasokPanel.add(nameInput, gridBagConstraints);

        phoneNumLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        phoneNumLabel.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumLabel.setText("Phone Number:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 12, 6);
        formAddPemasokPanel.add(phoneNumLabel, gridBagConstraints);

        phoneNumInput.setMaximumSize(new java.awt.Dimension(174, 30));
        phoneNumInput.setMinimumSize(new java.awt.Dimension(174, 30));
        phoneNumInput.setPreferredSize(new java.awt.Dimension(174, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 12, 0);
        formAddPemasokPanel.add(phoneNumInput, gridBagConstraints);

        idLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(255, 255, 255));
        idLabel.setText("ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 6);
        formAddPemasokPanel.add(idLabel, gridBagConstraints);

        idInput.setMaximumSize(new java.awt.Dimension(174, 30));
        idInput.setMinimumSize(new java.awt.Dimension(174, 30));
        idInput.setPreferredSize(new java.awt.Dimension(174, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 0);
        formAddPemasokPanel.add(idInput, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(formAddPemasokPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(formAddPemasokPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String id = idInput.getText().trim();
        String nama = nameInput.getText().trim();
        String phoneNumber = phoneNumInput.getText().trim();
        
        if (id.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "ID harus diisi!");
            return;
        }
        else if (nama.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Nama harus diisi!");
            return;
        }
        else if (phoneNumber.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Nomor HP harus diisi!");
            return;
        }
        else if (!checkPhoneNumber(phoneNumber)) {
            JOptionPane.showMessageDialog(rootPane, "Nomor HP Tidak Valid!");
            return;
        }

        int result = PemasokDAO.addPemasok(id, nama, phoneNumber);
        
        if (!checkID(id)) {
            JOptionPane.showMessageDialog(rootPane, "ID Pemasok harus diawali dengan P dan berakhir dengan 3 nomor di belakang P!");
        }
        else if (result != 0) {
            JOptionPane.showMessageDialog(rootPane, "Tambah Pemasok berhasil!");
            parent.showPemasok();
            clear();
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Nomor HP sudah terdaftar!");
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
    private javax.swing.JPanel formAddPemasokPanel;
    private javax.swing.JTextField idInput;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField phoneNumInput;
    private javax.swing.JLabel phoneNumLabel;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
