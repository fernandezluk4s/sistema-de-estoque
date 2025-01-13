package AcoesSistemaProduto;

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


public class ExcluirProduto extends javax.swing.JFrame {

    public ExcluirProduto() {
        initComponents(); // inicia os botões visuais
        setLocationRelativeTo(null); //abre centralizada na tela
        mostrarTdsProdsTabela(); // chama a função que mostra todos os produtos na tabela
        setColumnWidthProduto(); // Formata o tamanho da tabela
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        btnExcluirProd = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoProdPesq = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNomeProdPesq = new javax.swing.JTextField();
        cbGeneroProdPesq = new javax.swing.JComboBox<>();
        cbClasseProdPesq = new javax.swing.JComboBox<>();
        btnCstProd = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnCstTdsProds = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Excluir produtos no sistema");
        setResizable(false);

        tblProduto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Quantidade", "Preço", "Gênero", "Classe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProduto.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblProduto.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                tblProdutoHierarchyChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tblProduto);
        if (tblProduto.getColumnModel().getColumnCount() > 0) {
            tblProduto.getColumnModel().getColumn(0).setResizable(false);
            tblProduto.getColumnModel().getColumn(1).setResizable(false);
            tblProduto.getColumnModel().getColumn(2).setResizable(false);
            tblProduto.getColumnModel().getColumn(3).setResizable(false);
            tblProduto.getColumnModel().getColumn(4).setResizable(false);
            tblProduto.getColumnModel().getColumn(5).setResizable(false);
        }

        btnExcluirProd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnExcluirProd.setText("Excluir produto");
        btnExcluirProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdActionPerformed(evt);
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
        jLabel7.setText("Código:");

        txtCodigoProdPesq.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCodigoProdPesq.setName("txtCodigoProdPesq"); // NOI18N
        txtCodigoProdPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProdPesqActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Nome:");

        txtNomeProdPesq.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNomeProdPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdPesqActionPerformed(evt);
            }
        });

        cbGeneroProdPesq.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbGeneroProdPesq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Masculino", "Feminino", "Unissex" }));
        cbGeneroProdPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGeneroProdPesqActionPerformed(evt);
            }
        });

        cbClasseProdPesq.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbClasseProdPesq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Camisas", "Blusas", "Calças", "Bermudas", "Shorts", "Vestidos", "Macacões", "Saias", "Croppeds", "Tops", "Leggins", "Tênis", "Casacos", "Acessórios" }));
        cbClasseProdPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClasseProdPesqActionPerformed(evt);
            }
        });

        btnCstProd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCstProd.setText("Pesquisar produto");
        btnCstProd.setName("btnCstProd"); // NOI18N
        btnCstProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCstProdActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Gênero:");

        btnCstTdsProds.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCstTdsProds.setText("Mostrar todos");
        btnCstTdsProds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCstTdsProdsActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Tipo de peça:");

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
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluirProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtCodigoProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(cbGeneroProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeProdPesq))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbClasseProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCstTdsProds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCstProd, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCstProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCstTdsProds))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cbClasseProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbGeneroProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnExcluirProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair)
                        .addGap(44, 44, 44))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void tblProdutoHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_tblProdutoHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tblProdutoHierarchyChanged

    private void btnExcluirProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdActionPerformed
        excluirProduto();
    }//GEN-LAST:event_btnExcluirProdActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose(); //sair da janela, permanecendo com o menu aberto.
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtCodigoProdPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProdPesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProdPesqActionPerformed

    private void txtNomeProdPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdPesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdPesqActionPerformed

    private void cbGeneroProdPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGeneroProdPesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGeneroProdPesqActionPerformed

    private void cbClasseProdPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClasseProdPesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbClasseProdPesqActionPerformed

    private void btnCstProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCstProdActionPerformed
        // Chama a função mostar produto pesquisado
        mostrarProdsTabela();
    }//GEN-LAST:event_btnCstProdActionPerformed

    private void btnCstTdsProdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCstTdsProdsActionPerformed
        // Chama a função mostrar todos os produtos
        mostrarTdsProdsTabela();
    }//GEN-LAST:event_btnCstTdsProdsActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new ExcluirProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCstProd;
    private javax.swing.JButton btnCstTdsProds;
    private javax.swing.JButton btnExcluirProd;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbClasseProdPesq;
    private javax.swing.JComboBox<String> cbGeneroProdPesq;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtCodigoProdPesq;
    private javax.swing.JTextField txtNomeProdPesq;
    // End of variables declaration//GEN-END:variables

    // Define o arquivo texto para armazenamento de informações
    private static final String nomeArquivo = "Produto.txt";
    
    private void mostrarTdsProdsTabela() {
        // Lê todas as linhas do arquivo
        try (BufferedReader r_produto = new BufferedReader(new FileReader(nomeArquivo))) {
            // Define as variáveis da função
            String linha, codigo, nome, quantidade, preco, genero, classe;
            
            // Lê o modelo de cada tabela
            DefaultTableModel tabelaProdutos = (DefaultTableModel) tblProduto.getModel();
            
            //Limpa a tabela para receber os itens selecionados
            tabelaProdutos.setRowCount(0);
            
            //copia todas as linhas do arquivo, para a list "linha"
            while ((linha = r_produto.readLine()) != null) { 
                String[] campos = linha.split(",");
                // Define a correspondência entre variaveis e campos do arquivo
                codigo = campos[0];
                nome = campos[1];
                quantidade = campos[2];
                preco = campos[3];
                genero = campos[4];
                classe = campos[5];

                // Cria a linha para ser impresssa na tabela
                String data[] = {codigo,nome,quantidade,preco,genero,classe};
                // Insere a linha na tabela
                tabelaProdutos.addRow(data);
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
    
    public void setColumnWidthProduto() {
        // Define o tamanho horizontal de cada campo da tabela de produtos
        TableColumnModel columnModel = tblProduto.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(75);
        columnModel.getColumn(1).setPreferredWidth(120);
        columnModel.getColumn(2).setPreferredWidth(75);
        columnModel.getColumn(3).setPreferredWidth(75);
        columnModel.getColumn(4).setPreferredWidth(75);
        columnModel.getColumn(5).setPreferredWidth(80);
    }
    
    private void mostrarProdsTabela() {
        // Lê todas as linhas do arquivo
        try (BufferedReader r_produto = new BufferedReader(new FileReader(nomeArquivo))) {
            // Define as variáveis da função
            String linha, codigo, nome, quantidade, preco, genero, classe;
            // Cria e define produto encontrado como falso até que se prove o contrário
            boolean ProdEncontrado = false;
            
            // Lê o modelo de cada tabela
            DefaultTableModel tabelaProdutos = (DefaultTableModel) tblProduto.getModel();
            
            //Limpa a tabela para receber os itens selecionados
            tabelaProdutos.setRowCount(0);
            
            //copia todas as linhas do arquivo para a list "linha"
            while ((linha = r_produto.readLine()) != null) { 
                String[] campos = linha.split(",");
                // Define a correspondência entre variaveis e campos do arquivo
                codigo = campos[0];
                nome = campos[1];
                quantidade = campos[2];
                preco = campos[3];
                genero = campos[4];
                classe = campos[5];
                
                // Cria a linha para ser impresssa na tabela
                String data[] = {codigo,nome,quantidade,preco,genero,classe};
                
                if(!(txtCodigoProdPesq.getText().isEmpty())){ // Se código não está em branco
                    if(!(txtNomeProdPesq.getText().isEmpty())){ // Se nome não está em branco
                        if(!(" ".equalsIgnoreCase((String)cbGeneroProdPesq.getSelectedItem()))){ // Se gênero não está em branco
                            if(!(" ".equalsIgnoreCase((String)cbClasseProdPesq.getSelectedItem()))){ // Se classe não está em branco
                                // Se código igual a código pesquisado e nome igual a nome pesquisado e gênero igual a gênero pesquisado e classe igual a classe pesquisado
                                if (codigo.toLowerCase().startsWith(txtCodigoProdPesq.getText().toLowerCase()) && nome.toLowerCase().startsWith(txtNomeProdPesq.getText().toLowerCase()) && genero.equalsIgnoreCase((String)cbGeneroProdPesq.getSelectedItem()) && classe.equalsIgnoreCase((String)cbClasseProdPesq.getSelectedItem())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }else{ // Se classe está em branco
                                // Se código igual a código pesquisado e nome igual a nome pesquisado e gênero igual a gênero pesquisado
                                if (codigo.toLowerCase().startsWith(txtCodigoProdPesq.getText().toLowerCase()) && nome.toLowerCase().startsWith(txtNomeProdPesq.getText().toLowerCase()) && genero.equalsIgnoreCase((String)cbGeneroProdPesq.getSelectedItem())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }
                        }else{ // Se gênero está em branco
                            if(!(" ".equalsIgnoreCase((String)cbClasseProdPesq.getSelectedItem()))){  // Se classe não está em branco
                                // Se código igual a código pesquisado e nome igual a nome pesquisado e classe igual a classe pesquisado
                                if (codigo.toLowerCase().startsWith(txtCodigoProdPesq.getText().toLowerCase()) && nome.toLowerCase().startsWith(txtNomeProdPesq.getText().toLowerCase()) && classe.equalsIgnoreCase((String)cbClasseProdPesq.getSelectedItem())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }else{ // Se classe está em branco
                                // Se código igual a código pesquisado e nome igual a nome pesquisado
                                if (codigo.toLowerCase().startsWith(txtCodigoProdPesq.getText().toLowerCase()) && nome.toLowerCase().startsWith(txtNomeProdPesq.getText().toLowerCase())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }
                        }
                    }else{ // Se nome está em branco
                        if(!(" ".equalsIgnoreCase((String)cbGeneroProdPesq.getSelectedItem()))){ // Se gênero não está em branco
                            if(!(" ".equalsIgnoreCase((String)cbClasseProdPesq.getSelectedItem()))){ // Se classe não está em branco
                                // Se código igual a código pesquisado e gênero igual a gênero pesquisado e classe igual a classe pesquisado
                                if (codigo.toLowerCase().startsWith(txtCodigoProdPesq.getText().toLowerCase()) && genero.equalsIgnoreCase((String)cbGeneroProdPesq.getSelectedItem()) && classe.equalsIgnoreCase((String)cbClasseProdPesq.getSelectedItem())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }else{ // Se classe está em branco
                                // Se código igual a código pesquisado e gênero igual a gênero pesquisado
                                if (codigo.toLowerCase().startsWith(txtCodigoProdPesq.getText().toLowerCase()) && genero.equalsIgnoreCase((String)cbGeneroProdPesq.getSelectedItem())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }
                        }else{ // Se gênero está em branco
                            if(!(" ".equalsIgnoreCase((String)cbClasseProdPesq.getSelectedItem()))){ // Se classe não está em branco
                                // Se código igual a código pesquisado e classe igual a classe pesquisado
                                if (codigo.toLowerCase().startsWith(txtCodigoProdPesq.getText().toLowerCase()) && classe.equalsIgnoreCase((String)cbClasseProdPesq.getSelectedItem())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }else{ // Se classe está em branco
                                // Se código igual a código pesquisado
                                if (codigo.toLowerCase().startsWith(txtCodigoProdPesq.getText().toLowerCase())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }
                        }
                    }
                }else{ // Se código está em branco
                    if(!(txtNomeProdPesq.getText().isEmpty())){ // Se nome não está em branco
                        if(!(" ".equalsIgnoreCase((String)cbGeneroProdPesq.getSelectedItem()))){ // Se gênero não está em branco
                            if(!(" ".equalsIgnoreCase((String)cbClasseProdPesq.getSelectedItem()))){ // Se classe não está em branco
                                // Se nome igual a nome pesquisado e gênero igual a gênero pesquisado e classe igual a classe pesquisado
                                if (nome.toLowerCase().startsWith(txtNomeProdPesq.getText().toLowerCase()) && genero.equalsIgnoreCase((String)cbGeneroProdPesq.getSelectedItem()) && classe.equalsIgnoreCase((String)cbClasseProdPesq.getSelectedItem())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }else{ // Se classe está em branco
                                // Se nome igual a nome pesquisado e gênero igual a gênero pesquisado
                                if (nome.toLowerCase().startsWith(txtNomeProdPesq.getText().toLowerCase()) && genero.equalsIgnoreCase((String)cbGeneroProdPesq.getSelectedItem())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }
                        }else{ // Se gênero está em branco
                            if(!(" ".equalsIgnoreCase((String)cbClasseProdPesq.getSelectedItem()))){ // Se classe está em branco
                                // Se nome igual a nome pesquisado e classe igual a classe pesquisado
                                if (nome.toLowerCase().startsWith(txtNomeProdPesq.getText().toLowerCase()) && classe.equalsIgnoreCase((String)cbClasseProdPesq.getSelectedItem())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }else{ // Se classe está em branco
                                // Se nome igual a nome pesquisado
                                if (nome.toLowerCase().startsWith(txtNomeProdPesq.getText().toLowerCase())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }
                        }
                    }else{ // Se nome está em branco
                        if(!(" ".equalsIgnoreCase((String)cbGeneroProdPesq.getSelectedItem()))){ // Se gênero não está em branco
                            if(!(" ".equalsIgnoreCase((String)cbClasseProdPesq.getSelectedItem()))){ // Se classe não está em branco
                                // Se gênero igual a gênero pesquisado e classe igual a classe pesquisado
                                if (genero.equalsIgnoreCase((String)cbGeneroProdPesq.getSelectedItem()) && classe.equalsIgnoreCase((String)cbClasseProdPesq.getSelectedItem())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }else{ // Se classe está em branco
                                // Se gênero igual a gênero pesquisado
                                if (genero.equalsIgnoreCase((String)cbGeneroProdPesq.getSelectedItem())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }
                        }else{ // Se gênero está em branco
                            if(!(" ".equalsIgnoreCase((String)cbClasseProdPesq.getSelectedItem()))){ // Se classe não está em branco
                                // Se classe igual a classe pesquisado
                                if (classe.equalsIgnoreCase((String)cbClasseProdPesq.getSelectedItem())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }else{ // Se classe está em branco
                                // Se nenhum campo foi escrito / selecionado
                                mostrarTdsProdsTabela();
                                JOptionPane.showMessageDialog(null,"Erro, Nenhum campo foi escrito / selecionado!", "ERRO", 0);
                                ProdEncontrado = true;
                                break;
                            }
                        }
                    }
                }
            }
            
            // Se produto não encontrado exibe mensagem de erro
            if (!ProdEncontrado){
                JOptionPane.showMessageDialog(null,"Erro, Produto não encontrado ou inexistente!", "ERRO", 0);
                // Chama a função mostrar todos os produtos da tabela
                mostrarTdsProdsTabela();
            }
            
            // Limpa as caixas de texto e seleciona os itens nulos para as combo boxes
            txtNomeProdPesq.setText("");
            txtCodigoProdPesq.setText("");
            cbGeneroProdPesq.setSelectedItem(" ");
            cbClasseProdPesq.setSelectedItem(" ");
            
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
    
    private void excluirProduto() {
        try{
            // Lê o modelo de cada tabela
            DefaultTableModel tabelaProdutos = (DefaultTableModel) tblProduto.getModel();
            //Limpa a tabela para receber os itens selecionados
            JTable tabela = new JTable(tabelaProdutos);
            if(tblProduto.getRowCount() == 0){ // Caso tabela vazia 
                JOptionPane.showMessageDialog(null, "Erro! Tabela de produtos está vazia!", "Erro", 0);
            }else if(tblProduto.getSelectedRowCount() > 1){ // Caso mais de um item for selecionado
                JOptionPane.showMessageDialog(null, "Erro! Mais de um item selecionado!", "Erro", 0);
            }else if(tblProduto.getSelectedRowCount() == 0){ // Caso nenhum item for selecionado
                JOptionPane.showMessageDialog(null, "Erro! Nenhum item selecionado!", "Erro", 0);
            }else{
                // Lê todas as linhas do arquivo
                BufferedReader r_produto = new BufferedReader(new FileReader(nomeArquivo));
                // Cria um array de strings com o nome de "linhas"
                List<String> linhas = new ArrayList<>();
                // Define as variáveis
                String linha, nome;
                int i = 0, numLinhaExcluir = 0;
                // Define qual o número da linha selecionada
                int tblLinha = tblProduto.getSelectedRow();
                // Pega o valor da linha e coluna selecionada 
                String tblNome = (String) tabela.getValueAt(tblLinha,1);
                while ((linha = r_produto.readLine()) != null) { //escreve, na lista linha, todas as linha do arquivo produto 
                    linhas.add(linha);
                    String[] campos = linha.split(",");
                    nome = campos[1];
                    // Se o nome presente na linha do arquivo for igual ao nome recebido da tabela, número da linha é igual a linha a ser excluida
                    if (nome.equalsIgnoreCase(tblNome)) {
                        numLinhaExcluir = i;
                    }
                    i++;
                }
                r_produto.close();
                
                // Redefine o nome das caixas de texto JOptionPane.showConfirmDialog
                UIManager.put("OptionPane.yesButtonText","Sim");
                UIManager.put("OptionPane.noButtonText", "Não"); 

                // Pergunta se realmente deseja excluir o produto
                int opcao = JOptionPane.showConfirmDialog(null,"Deseja excluir: " + tblNome + "?", "CONFIRMAR EXCLUSÃO", 0);
                if(opcao == 0){
                    // Excluindo a linha
                    linhas.remove(numLinhaExcluir);

                    // Reescrevendo o arquivo sem a linha excluída
                    BufferedWriter w_produto = new BufferedWriter(new FileWriter(nomeArquivo));
                    for (String l : linhas) {
                        w_produto.write(l);
                        w_produto.newLine();
                    }
                    w_produto.close();

                    // Limpa a tabela de produtos
                    tabelaProdutos.setRowCount(0);
                    // Reescreva a tebela de produtos
                    mostrarTdsProdsTabela();

                    // Exibe a mensage de sucesso ao excluir produto
                    JOptionPane.showMessageDialog(null,"Produto excluído com sucesso.!", "EXCLUIDO COM ÊXITO", 1);
                    System.out.println("produto excluído com sucesso.");
                }
            }
        } catch (FileNotFoundException e) {
            // Erro ao tentar acessar arquivo
            JOptionPane.showMessageDialog(null,"O arquivo '" + nomeArquivo + "' não foi encontrado!", "ERRO", 0);
            System.out.println("O arquivo '" + nomeArquivo + "' não foi encontrado.");
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
