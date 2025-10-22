package view;
import dao.BicicletaDAO;
import model.Bicicleta;
import dao.ClienteDAO;
import model.Cliente;
import dao.LocacaoDAO;
import model.Locacao;
import dao.ManutencaoDAO;
import model.Manutencao;


public class TelaRelatorios extends javax.swing.JFrame{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaRelatorios.class.getName());

    public TelaRelatorios(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbTipoRelatorio = new javax.swing.JComboBox<>();
        btnGerar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRelatorios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbTipoRelatorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clientes", "Bicicletas", "Locações", "Manutenções" }));

        btnGerar.setText("Gerar");

        tabelaRelatorios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaRelatorios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(cbTipoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(btnGerar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGerar))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]){

        java.awt.EventQueue.invokeLater(() -> new TelaRelatorios().setVisible(true));
    }
    
    
    public void gerarRelatorio(String tipo){
        switch(tipo){
            case "Cliente":
                listarClientes();
                break;
            case "Bicicleta":
                listarBicicletas();
                break;
            case "Locações":
                listarLocacoes();
                break;
            case "Manutenções":
                listarManutencoes();
                break;
        }
    }
    
    private void listarClientes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void listarBicicletas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void listarLocacoes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void listarManutencoes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerar;
    private javax.swing.JComboBox<String> cbTipoRelatorio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaRelatorios;
    // End of variables declaration//GEN-END:variables
}
