package AcoesSistemaCliente;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class ConsultarCliente extends javax.swing.JFrame {

    public ConsultarCliente() {
        initComponents(); // inicia os botões visuais
        setLocationRelativeTo(null); //abre centralizada na tela
        mostrarTdsClientesTabela(); // chama a função que mostra todos os clientes na tabela
        setColumnWidthCliente(); // Formata o tamanho da tabela
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSair1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtCpfCliPesq = new javax.swing.JTextField();
        cbGeneroCliPesq = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNomeCliPesq = new javax.swing.JTextField();
        btnPesqProd = new javax.swing.JButton();
        btnMostTdsProds = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtEmailCliPesq = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar cliente no sistema");
        setResizable(false);

        btnSair1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSair1.setText("Voltar ao menu principal");
        btnSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 150)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Eꟼ");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 44)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("EPISODE");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("CPF:");

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

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Nome:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Gênero:");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCpfCliPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSair1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailCliPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbGeneroCliPesq, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeCliPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPesqProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMostTdsProds, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpfCliPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btnPesqProd)
                    .addComponent(txtNomeCliPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostTdsProds)
                    .addComponent(txtEmailCliPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cbGeneroCliPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnSair1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair1ActionPerformed
        dispose(); //sair da janela, permanecendo com o menu aberto.
    }//GEN-LAST:event_btnSair1ActionPerformed

    private void tblClienteHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_tblClienteHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tblClienteHierarchyChanged

    private void txtCpfCliPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfCliPesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfCliPesqActionPerformed

    private void cbGeneroCliPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGeneroCliPesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGeneroCliPesqActionPerformed

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

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new ConsultarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostTdsProds;
    private javax.swing.JButton btnPesqProd;
    private javax.swing.JButton btnSair1;
    private javax.swing.JComboBox<String> cbGeneroCliPesq;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtCpfCliPesq;
    private javax.swing.JTextField txtEmailCliPesq;
    private javax.swing.JTextField txtNomeCliPesq;
    // End of variables declaration//GEN-END:variables

    // Define o arquivo texto para armazenamento de informações
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
}
