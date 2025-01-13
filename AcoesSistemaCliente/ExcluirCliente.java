package AcoesSistemaCliente;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class ExcluirCliente extends javax.swing.JFrame {

    public ExcluirCliente() {
        initComponents(); // inicia os botões visuais
        setLocationRelativeTo(null); //abre centralizada na tela
        mostrarTdsClientesTabela(); // chama a função que mostra todos os clientes na tabela
        setColumnWidthCliente(); // Formata o tamanho da tabela
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExcluirCli = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtNomeCliPesq = new javax.swing.JTextField();
        btnPesqProd = new javax.swing.JButton();
        btnMostTdsProds = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtEmailCliPesq = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCpfCliPesq = new javax.swing.JTextField();
        cbGeneroCliPesq = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Excluir cliente no sistema");
        setResizable(false);

        btnExcluirCli.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnExcluirCli.setText("Excluir cliente");
        btnExcluirCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCliActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSair.setText("Voltar ao menu principal");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Gênero:");

        txtNomeCliPesq.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNomeCliPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCliPesqActionPerformed(evt);
            }
        });

        btnPesqProd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnPesqProd.setText("Pesquisar cliente");
        btnPesqProd.setName("btnPesqProd"); // NOI18N
        btnPesqProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqProdActionPerformed(evt);
            }
        });

        btnMostTdsProds.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnMostTdsProds.setText("Mostrar todos");
        btnMostTdsProds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostTdsProdsActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Email:");

        txtEmailCliPesq.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtEmailCliPesq.setName("txtCodigoProd"); // NOI18N
        txtEmailCliPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailCliPesqActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("CPF:");

        txtCpfCliPesq.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCpfCliPesq.setName("txtCodigoProd"); // NOI18N
        txtCpfCliPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfCliPesqActionPerformed(evt);
            }
        });

        cbGeneroCliPesq.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbGeneroCliPesq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Masculino", "Feminino" }));
        cbGeneroCliPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGeneroCliPesqActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Nome:");

        tblCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Email", "Gênero", "Compras"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCliente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblCliente.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                tblClienteHierarchyChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 150)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Eꟼ");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 44)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("EPISODE");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCpfCliPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExcluirCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEmailCliPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbGeneroCliPesq, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeCliPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMostTdsProds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPesqProd, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpfCliPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btnPesqProd)
                    .addComponent(txtNomeCliPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostTdsProds)
                    .addComponent(txtEmailCliPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cbGeneroCliPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnExcluirCli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair)
                        .addGap(40, 40, 40))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnExcluirCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCliActionPerformed
        // Chama a função excluir cliente
        excluirCliente();
    }//GEN-LAST:event_btnExcluirCliActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose(); //sair da janela, permanecendo com o menu aberto.
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtNomeCliPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCliPesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCliPesqActionPerformed

    private void btnPesqProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqProdActionPerformed
        // Chama a função mostrar cliente especifico
        mostrarClientesTabela();
    }//GEN-LAST:event_btnPesqProdActionPerformed

    private void btnMostTdsProdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostTdsProdsActionPerformed
        // Chama a função mostrar todos os clientes
        mostrarTdsClientesTabela();
    }//GEN-LAST:event_btnMostTdsProdsActionPerformed

    private void txtEmailCliPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailCliPesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailCliPesqActionPerformed

    private void txtCpfCliPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfCliPesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfCliPesqActionPerformed

    private void cbGeneroCliPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGeneroCliPesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGeneroCliPesqActionPerformed

    private void tblClienteHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_tblClienteHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tblClienteHierarchyChanged

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new ExcluirCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirCli;
    private javax.swing.JButton btnMostTdsProds;
    private javax.swing.JButton btnPesqProd;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbGeneroCliPesq;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtCpfCliPesq;
    private javax.swing.JTextField txtEmailCliPesq;
    private javax.swing.JTextField txtNomeCliPesq;
    // End of variables declaration//GEN-END:variables

    private static final String arquivoCadastro = "cliente.txt";
    
    private void mostrarTdsClientesTabela() {
        // Lê todas as linhas do arquivo
        try (BufferedReader r_Clientes = new BufferedReader(new FileReader(arquivoCadastro))) {
            // Define as variáveis da função
            String linha, cpf, nome, email, genero, compras;
            
            // Lê o modelo de cada tabela
            DefaultTableModel tabelaClientes = (DefaultTableModel) tblCliente.getModel();
            
            //Limpa a tabela para receber os itens selecionados
            tabelaClientes.setRowCount(0);
            
            //copia todas as linhas do arquivo, para a list "linha"
            while ((linha = r_Clientes.readLine()) != null) {
                // Define a correspondência entre variaveis e campos do arquivo
                String[] campos = linha.split(",");
                cpf = campos[0];
                nome = campos[1];
                email = campos[2];
                genero = campos[3];
                compras = campos[4];

                // Cria a linha para ser impresssa na tabela
                String data[] = {cpf, nome, email, genero, compras};
                // Insere a linha na tabela
                tabelaClientes.addRow(data);
            }
            
        } catch (IOException e) {
            // Erros de entrada/saída, ao abrir, ler ou escrever em um arquivo.
            JOptionPane.showMessageDialog(null,"Ocorreu um erro ao acessar o arquivo!", "ERRO", 0);
            System.out.println("Ocorreu um erro ao acessar o arquivo: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            // Erro ao tentar acesso obtuso no array
            JOptionPane.showMessageDialog(null,"Erro: Formato de dados incorreto no arquivo.", "ERRO", 0);
            System.err.println("Erro: Formato de dados incorreto no arquivo." + e.getMessage());
        }
    }
    
    public void setColumnWidthCliente() {
        // Define o tamanho horizontal de cada campo da tabela de clientes
        TableColumnModel columnModel = tblCliente.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(100);
        columnModel.getColumn(1).setPreferredWidth(130);
        columnModel.getColumn(2).setPreferredWidth(160);
        columnModel.getColumn(3).setPreferredWidth(75);
        columnModel.getColumn(4).setPreferredWidth(75);
    }
    
    private void mostrarClientesTabela() {
        // Lê todas as linhas do arquivo
        try (BufferedReader r_Clientes = new BufferedReader(new FileReader(arquivoCadastro))) {
            // Define as variáveis da função
            String linha, cpf, nome, email, genero, compras;
            boolean CliEncontrado = false;
            
            // Lê o modelo de cada tabela
            DefaultTableModel tabelaClientes = (DefaultTableModel) tblCliente.getModel();
            
            //Limpa a tabela para receber os itens selecionados
            tabelaClientes.setRowCount(0);
            
            //copia todas as linhas do arquivo, para a list "linha"
            while ((linha = r_Clientes.readLine()) != null) {
                // Define a correspondência entre variaveis e campos do arquivo
                String[] campos = linha.split(",");
                cpf = campos[0];
                nome = campos[1];
                email = campos[2];
                genero = campos[3];
                compras = campos[4];
                
                // Cria a linha para ser impressa na tabela
                String data[] = {cpf, nome, email, genero, compras};
                
                if(!(txtCpfCliPesq.getText().isEmpty())){ // Se cpf não está em branco
                    if(!(txtNomeCliPesq.getText().isEmpty())){ // Se nome não está em branco
                        if(!(txtEmailCliPesq.getText().isEmpty())){ // Se email não está em branco
                            if(!(" ".equalsIgnoreCase((String)cbGeneroCliPesq.getSelectedItem()))){ // Se gênero não está em branco
                                // Se cpf igual a cpf pesquisado e nome igual a nome pesquisado e email igual a email pesquisado e gênero igual a gênero pesquisado
                                if (cpf.toLowerCase().startsWith(txtCpfCliPesq.getText().toLowerCase()) && nome.toLowerCase().startsWith(txtNomeCliPesq.getText().toLowerCase()) && email.toLowerCase().startsWith(txtEmailCliPesq.getText().toLowerCase()) && genero.equalsIgnoreCase((String)cbGeneroCliPesq.getSelectedItem())){
                                    tabelaClientes.addRow(data);
                                    CliEncontrado = true;
                                }
                            }else{ // Se gênero está em branco
                                // Se cpf igual a cpf pesquisado e nome igual a nome pesquisado e email igual a email pesquisado
                                if (cpf.toLowerCase().startsWith(txtCpfCliPesq.getText().toLowerCase()) && nome.toLowerCase().startsWith(txtNomeCliPesq.getText().toLowerCase()) && email.toLowerCase().startsWith(txtEmailCliPesq.getText().toLowerCase())){
                                    tabelaClientes.addRow(data);
                                    CliEncontrado = true;
                                }
                            }
                        }else{ // Se email está em branco
                            if(!(" ".equalsIgnoreCase((String)cbGeneroCliPesq.getSelectedItem()))){ // Se gênero não está em branco
                                // Se cpf igual a cpf pesquisado e nome igual a nome pesquisado e gênero igual a gênero pesquisado
                                if (cpf.toLowerCase().startsWith(txtCpfCliPesq.getText().toLowerCase()) && nome.toLowerCase().startsWith(txtNomeCliPesq.getText().toLowerCase()) && genero.equalsIgnoreCase((String)cbGeneroCliPesq.getSelectedItem())){
                                    tabelaClientes.addRow(data);
                                    CliEncontrado = true;
                                }
                            }else{ // Se gênero está em branco
                                // Se cpf igual a cpf pesquisado e nome igual a nome pesquisado
                                if (cpf.toLowerCase().startsWith(txtCpfCliPesq.getText().toLowerCase()) && nome.toLowerCase().startsWith(txtNomeCliPesq.getText().toLowerCase())){
                                    tabelaClientes.addRow(data);
                                    CliEncontrado = true;
                                }
                            }
                        }
                    }else{ // Se nome está em branco
                        if(!(txtEmailCliPesq.getText().isEmpty())){ // Se email não está em branco
                            if(!(" ".equalsIgnoreCase((String)cbGeneroCliPesq.getSelectedItem()))){ // Se gênero não está em branco
                                // Se cpf igual a cpf pesquisado e email igual a email pesquisado e gênero igual a gênero pesquisado
                                if (cpf.toLowerCase().startsWith(txtCpfCliPesq.getText().toLowerCase()) && email.toLowerCase().startsWith(txtEmailCliPesq.getText().toLowerCase()) && genero.equalsIgnoreCase((String)cbGeneroCliPesq.getSelectedItem())){
                                    tabelaClientes.addRow(data);
                                    CliEncontrado = true;
                                }
                            }else{ // Se gênero está em branco
                                // Se cpf igual a cpf pesquisado e email igual a email pesquisado
                                if (cpf.toLowerCase().startsWith(txtCpfCliPesq.getText().toLowerCase()) && email.toLowerCase().startsWith(txtEmailCliPesq.getText().toLowerCase())){
                                    tabelaClientes.addRow(data);
                                    CliEncontrado = true;
                                }
                            }
                        }else{ // Se email está em branco
                            if(!(" ".equalsIgnoreCase((String)cbGeneroCliPesq.getSelectedItem()))){ // Se gênero não está em branco
                                // Se cpf igual a cpf pesquisado e gênero igual a gênero pesquisado
                                if (cpf.toLowerCase().startsWith(txtCpfCliPesq.getText().toLowerCase()) && genero.equalsIgnoreCase((String)cbGeneroCliPesq.getSelectedItem())){
                                    tabelaClientes.addRow(data);
                                    CliEncontrado = true;
                                }
                            }else{ // Se gênero está em branco
                                // Se cpf igual a cpf pesquisado
                                if (cpf.toLowerCase().startsWith(txtCpfCliPesq.getText().toLowerCase())){
                                    tabelaClientes.addRow(data);
                                    CliEncontrado = true;
                                }
                            }
                        }
                    }
                }else{ // Se cpf está em branco
                    if(!(txtNomeCliPesq.getText().isEmpty())){ // Se nome não está em branco
                        if(!(txtEmailCliPesq.getText().isEmpty())){ // Se email não está em branco
                            if(!(" ".equalsIgnoreCase((String)cbGeneroCliPesq.getSelectedItem()))){ // Se gênero não está em branco
                                // Se nome igual a nome pesquisado e email igual a email pesquisado e gênero igual a gênero pesquisado
                                if (nome.toLowerCase().startsWith(txtNomeCliPesq.getText().toLowerCase()) && email.toLowerCase().startsWith(txtEmailCliPesq.getText().toLowerCase()) && genero.equalsIgnoreCase((String)cbGeneroCliPesq.getSelectedItem())){
                                    tabelaClientes.addRow(data);
                                    CliEncontrado = true;
                                }
                            }else{ // Se gênero está em branco
                                // Se nome igual a nome pesquisado e email igual a email pesquisado
                                if (nome.toLowerCase().startsWith(txtNomeCliPesq.getText().toLowerCase()) && email.toLowerCase().startsWith(txtEmailCliPesq.getText().toLowerCase())){
                                    tabelaClientes.addRow(data);
                                    CliEncontrado = true;
                                }
                            }
                        }else{ // Se email está em branco
                            if(!(" ".equalsIgnoreCase((String)cbGeneroCliPesq.getSelectedItem()))){ // Se gênero não está em branco
                                // Se nome igual a nome pesquisado e gênero igual a gênero pesquisado
                                if (nome.toLowerCase().startsWith(txtNomeCliPesq.getText().toLowerCase()) && genero.equalsIgnoreCase((String)cbGeneroCliPesq.getSelectedItem())){
                                    tabelaClientes.addRow(data);
                                    CliEncontrado = true;
                                }
                            }else{ // Se gênero está em branco
                                // Se nome igual a nome pesquisado
                                if (nome.toLowerCase().startsWith(txtNomeCliPesq.getText().toLowerCase())){
                                    tabelaClientes.addRow(data);
                                    CliEncontrado = true;
                                }
                            }
                        }
                    }else{ // Se nome está em branco
                        if(!(txtEmailCliPesq.getText().isEmpty())){ // Se email não está em branco
                            if(!(" ".equalsIgnoreCase((String)cbGeneroCliPesq.getSelectedItem()))){ // Se gênero não está em branco
                                // Se email igual a email pesquisado e gênero igual a gênero pesquisado
                                if (email.toLowerCase().startsWith(txtEmailCliPesq.getText().toLowerCase()) && genero.equalsIgnoreCase((String)cbGeneroCliPesq.getSelectedItem())){
                                    tabelaClientes.addRow(data);
                                    CliEncontrado = true;
                                }
                            }else{ // Se gênero está em branco
                                // Se email igual a email pesquisado
                                if (email.toLowerCase().startsWith(txtEmailCliPesq.getText().toLowerCase())){
                                    tabelaClientes.addRow(data);
                                    CliEncontrado = true;
                                }
                            }
                        }else{ // Se email está em branco
                            if(!(" ".equalsIgnoreCase((String)cbGeneroCliPesq.getSelectedItem()))){ // Se gênero não está em branco
                                // Se gênero igual a gênero pesquisado
                                if (genero.equalsIgnoreCase((String)cbGeneroCliPesq.getSelectedItem())){
                                    tabelaClientes.addRow(data);
                                    CliEncontrado = true;
                                }
                            }else{ // Se gênero está em branco
                                // Se nenhum campo foi escrito / selecionado
                                mostrarTdsClientesTabela();
                                JOptionPane.showMessageDialog(null,"Erro, Nenhum campo foi escrito / selecionado!", "ERRO", 0);
                                CliEncontrado = true;
                                break;
                            }
                        }
                    }
                }
            }
            
            // Se produto não encontrado exibe mensagem de erro
            if (!CliEncontrado){
                JOptionPane.showMessageDialog(null,"Erro, Cliente não encontrado ou inexistente!", "ERRO", 0);
                // Chama a função mostrar todos os produtos da tabela
                mostrarTdsClientesTabela();
            }
            
            // Limpa as caixas de texto e seleciona os itens nulos para as combo boxes
            txtCpfCliPesq.setText("");
            txtNomeCliPesq.setText("");
            txtEmailCliPesq.setText("");
            cbGeneroCliPesq.setSelectedItem(" ");
            
        } catch (IOException e) {
            // Erros de entrada/saída, ao abrir, ler ou escrever em um arquivo.
            JOptionPane.showMessageDialog(null,"Ocorreu um erro ao acessar o arquivo!", "ERRO", 0);
            System.out.println("Ocorreu um erro ao acessar o arquivo: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            // Erro ao tentar acesso obtuso no array
            JOptionPane.showMessageDialog(null,"Erro: Formato de dados incorreto no arquivo.", "ERRO", 0);
            System.err.println("Erro: Formato de dados incorreto no arquivo." + e.getMessage());
        }
    }
    
    private void excluirCliente() {
        try{
            // Lê o modelo de cada tabela
            DefaultTableModel tabelaCliente = (DefaultTableModel) tblCliente.getModel();
            //Limpa a tabela para receber os itens selecionados
            JTable tabela = new JTable(tabelaCliente);
            if(tblCliente.getRowCount() == 0){ // Caso tabela vazia 
                JOptionPane.showMessageDialog(null, "Erro! Tabela de produtos está vazia!", "Erro", 0);
            }else if(tblCliente.getSelectedRowCount() > 1){ // Caso mais de um item for selecionado
                JOptionPane.showMessageDialog(null, "Erro! Mais de um item selecionado!", "Erro", 0);
            }else if(tblCliente.getSelectedRowCount() == 0){ // Caso nenhum item for selecionado
                JOptionPane.showMessageDialog(null, "Erro! Nenhum item selecionado!", "Erro", 0);
            }else{
                // Lê todas as linhas do arquivo
                BufferedReader r_Cliente = new BufferedReader(new FileReader(arquivoCadastro));
                // Cria um array de strings com o nome de "linhas"
                List<String> linhas = new ArrayList<>();
                // Define as variáveis
                String linha, nome;
                int i = 0, numLinhaExcluir = 0;
                // Define qual o número da linha selecionada
                int tblLinha = tblCliente.getSelectedRow();
                // Pega o valor da linha e coluna selecionada 
                String tblNome = (String) tabela.getValueAt(tblLinha,1);
                while ((linha = r_Cliente.readLine()) != null)  {//escreve, na lista linha, todas as linha do arquivo clientes 
                    linhas.add(linha);
                    String[] campos = linha.split(",");
                    nome = campos[1];
                    if (nome.equalsIgnoreCase(tblNome)) {
                        numLinhaExcluir = i;
                    }
                    i++;
                }
                r_Cliente.close();

                // Redefine o nome das caixas de texto JOptionPane.showConfirmDialog
                UIManager.put("OptionPane.yesButtonText","Sim");
                UIManager.put("OptionPane.noButtonText", "Não"); 

                // Pergunta se realmente deseja excluir o cliente
                int opcao = JOptionPane.showConfirmDialog(null,"Deseja excluir: " + tblNome + "?", "CONFIRMAR EXCLUSÃO", 0);
                    if(opcao == 0){
                        // Excluindo a linha
                        linhas.remove(numLinhaExcluir);

                        // Reescrevendo o arquivo sem a linha excluída
                        BufferedWriter w_Cliente = new BufferedWriter(new FileWriter(arquivoCadastro));
                        for (String l : linhas) {
                            w_Cliente.write(l);
                            w_Cliente.newLine();
                        }
                        w_Cliente.close();

                        // Limpa a tabela de clientes
                        tabelaCliente.setRowCount(0);
                        // Reescreva a tebela de clientes
                        mostrarTdsClientesTabela();

                        // Exibe a mensage de sucesso ao excluir cliente
                        JOptionPane.showMessageDialog(null,"Cliente excluído com sucesso.!", "EXCLUIDO COM ÊXITO", 1);
                        System.out.println("Cliente excluído com sucesso.");
                    }
            }
        } catch (FileNotFoundException e) {
            // Erro ao tentar acessar arquivo
            JOptionPane.showMessageDialog(null,"O arquivo '" + arquivoCadastro + "' não foi encontrado!", "ERRO", 0);
            System.out.println("O arquivo '" + arquivoCadastro + "' não foi encontrado.");
        } catch (IOException e) {
            // Erros de entrada/saída, ao abrir, ler ou escrever em um arquivo.
            JOptionPane.showMessageDialog(null,"Ocorreu um erro ao acessar o arquivo!", "ERRO", 0);
            System.out.println("Ocorreu um erro ao acessar o arquivo: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            // Erro ao tentar acesso obtuso no array
            JOptionPane.showMessageDialog(null, "Erro! Acesso indevido no arquivo.", "Erro", 0);
            System.err.println("Erro: Acesso indevido no arquivo."+ e.getMessage());
        }
    }
}
