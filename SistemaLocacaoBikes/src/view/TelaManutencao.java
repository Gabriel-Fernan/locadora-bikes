package view;
import dao.ManutencaoDAO;
import model.Manutencao;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class TelaManutencao extends javax.swing.JFrame{
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaManutencao.class.getName());
    private List<Manutencao> listaManutencoes;
    private int proximoIdManutencao = 1;

    public TelaManutencao(){
        initComponents();
        listaManutencoes = new ArrayList<>();
        configurarTabela();
        cbBicicletas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Bicicleta 1", "Bicicleta 2", "Bicicleta 3", "Bicicleta 4"}));
    }

    private void configurarTabela(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[][]{}, new String[]{"ID", "Bicicleta ID", "Descrição", "Data"});
        tabelaManutencao.setModel(modelo);
    }

    private void carregarTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tabelaManutencao.getModel();
        modelo.setRowCount(0); 
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        for (Manutencao manutencao : listaManutencoes){
            String dataFormatada = (manutencao.getData() != null) ? sdf.format(manutencao.getData()) : "";
            modelo.addRow(new Object[]{
                manutencao.getId(),
                manutencao.getBicicletaId(),
                manutencao.getDescricao(),
                dataFormatada
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbBicicletas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        txtData = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaManutencao = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(547, 341));
        setResizable(false);

        cbBicicletas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bicicleta", "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        txtDescricao.setText("Descrição");
        jScrollPane1.setViewportView(txtDescricao);

        txtData.setText("Data");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        tabelaManutencao.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabelaManutencao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(btnListar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(113, 113, 113))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(cbBicicletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbBicicletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnListar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String bicicletaSelecionada = (String) cbBicicletas.getSelectedItem();
        String descricao = txtDescricao.getText();
        String dataStr = txtData.getText();

        if (bicicletaSelecionada != null && !descricao.isEmpty() && !dataStr.isEmpty()){
            try{
                int bicicletaId = Integer.parseInt(bicicletaSelecionada.replaceAll("[^0-9]", ""));

                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date data = sdf.parse(dataStr);

                Manutencao novaManutencao = new Manutencao();
                novaManutencao.setId(proximoIdManutencao++); 
                novaManutencao.setBicicletaId(bicicletaId);
                novaManutencao.setDescricao(descricao);
                novaManutencao.setData(data);

                listaManutencoes.add(novaManutencao);
                carregarTabela();

                txtDescricao.setText("");
                txtData.setText("");
                cbBicicletas.setSelectedIndex(0);

                JOptionPane.showMessageDialog(this, "Manutenção registrada com sucesso!");
            } 
            
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(this, "ID da bicicleta inválido. Por favor, selecione um item válido.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
                logger.log(java.util.logging.Level.SEVERE, "Erro ao converter ID da bicicleta", e);
            } 
            
            catch (ParseException e){
                JOptionPane.showMessageDialog(this, "Formato de data inválido. Use dd/MM/yyyy.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
                logger.log(java.util.logging.Level.SEVERE, "Erro ao converter data", e);
            }
        } 
        
        else{
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        carregarTabela();
        if (listaManutencoes.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nenhuma manutenção registrada para listar.");
        } 
        
        else{
            JOptionPane.showMessageDialog(this, "Tabela atualizada com as manutenções registradas.");
        }
    }//GEN-LAST:event_btnListarActionPerformed

    public static void main(String args[]){
        try{
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if ("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        
        catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex){
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new TelaManutencao().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbBicicletas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaManutencao;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextArea txtDescricao;
    // End of variables declaration//GEN-END:variables
}
