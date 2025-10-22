package view;
import dao.BicicletaDAO;
import model.Bicicleta;
import dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaBicicletas extends javax.swing.JFrame{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaBicicletas.class.getName());

    public TelaBicicletas(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        txtCodigo = new javax.swing.JTextField();
        cbStatus = new javax.swing.JComboBox<>();
        btnNovo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaBicicletas = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(547, 341));

        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigo.setText("Código");
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponível", "Locada", "Manutenção", " " }));
        cbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        tabelaBicicletas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaBicicletas);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnListar)
                    .addComponent(btnNovo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(144, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusActionPerformed
        
    }//GEN-LAST:event_cbStatusActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Bicicleta b = new Bicicleta();
        b.setCodigo(txtCodigo.getText());
        b.setStatus(cbStatus.getSelectedItem().toString());

        if (b.getCodigo().isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha o código da bicicleta!");
            return;
        }

        BicicletaDAO dao = new BicicletaDAO();
        dao.create(b);
        listarBicicletas();

        JOptionPane.showMessageDialog(this, "Bicicleta cadastrada com sucesso!");
        btnNovoActionPerformed(evt);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        listarBicicletas();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtCodigo.setText("");
        cbStatus.setSelectedIndex(0);
        txtCodigo.requestFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int selectedRow = tabelaBicicletas.getSelectedRow();
        if (selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Selecione uma bicicleta na tabela!");
            return;
        }

        Bicicleta b = new Bicicleta();
        b.setId((int) tabelaBicicletas.getValueAt(selectedRow, 0));
        b.setCodigo(txtCodigo.getText());
        b.setStatus(cbStatus.getSelectedItem().toString());

        BicicletaDAO dao = new BicicletaDAO();
        dao.update(b);

        listarBicicletas();
        JOptionPane.showMessageDialog(this, "Bicicleta atualizada com sucesso!");
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int selectedRow = tabelaBicicletas.getSelectedRow();
        if (selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Selecione uma bicicleta para excluir!");
            return;
        }

        Object idObj = tabelaBicicletas.getValueAt(selectedRow, 0);
        int id;

        try{
            if (idObj instanceof Integer){
                id = (Integer) idObj;
            } 
            
            else{
                id = Integer.parseInt(idObj.toString());
            }
        } 
        
        catch (Exception e){
            JOptionPane.showMessageDialog(this, "Erro ao obter o ID: " + e.getMessage());
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(
            this,
            "Deseja realmente excluir esta bicicleta?",
            "Confirmação",
            JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION){
            try (Connection con = ConnectionFactory.getConnection()){
                String sql = "DELETE FROM bicicleta WHERE id = ?";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1, id);

                int rows = stmt.executeUpdate();
                if (rows > 0){
                    JOptionPane.showMessageDialog(this, "Bicicleta excluída com sucesso!");
                } 
                
                else{
                    JOptionPane.showMessageDialog(this, "Nenhuma bicicleta encontrada com este ID.");
                }

                listarBicicletas();
            } 
            
            catch (Exception e){
                JOptionPane.showMessageDialog(this, "Erro ao excluir bicicleta: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tabelaBicicletasMouseClicked(java.awt.event.MouseEvent evt) {
        int row = tabelaBicicletas.getSelectedRow();
        if (row != -1) {
            txtCodigo.setText(tabelaBicicletas.getValueAt(row, 1).toString());
            cbStatus.setSelectedItem(tabelaBicicletas.getValueAt(row, 2).toString());
        }
    }

    public void listarBicicletas() {
        List<Bicicleta> lista = new BicicletaDAO().read();
        DefaultTableModel modelo = (DefaultTableModel) tabelaBicicletas.getModel();
        modelo.setRowCount(0);

        for (Bicicleta b : lista) {
            modelo.addRow(new Object[]{
                b.getId(),
                b.getCodigo(),
                b.getStatus()
            });
        }
    }

    public static void main(String args[]){
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> new TelaBicicletas().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaBicicletas;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
