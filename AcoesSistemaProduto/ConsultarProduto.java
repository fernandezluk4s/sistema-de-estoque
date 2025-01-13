package AcoesSistemaProduto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class ConsultarProduto extends javax.swing.JFrame {

    public ConsultarProduto() {
        initComponents(); // inicia os botões visuais
        setLocationRelativeTo(null); //abre centralizada na tela
        mostrarTdsProdsTabela(); // chama a função que mostra todos os produtos na tabela
        setColumnWidthProduto(); // Formata o tamanho da tabela
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCstProd = new javax.swing.JButton();
        btnCstTdsProds = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        btnSair1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoProd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNomeProd = new javax.swing.JTextField();
        cbGeneroProd = new javax.swing.JComboBox<>();
        cbClasseProd = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar produtos no sistema");
        setResizable(false);

        btnCstProd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCstProd.setText("Consultar produto especifico");
        btnCstProd.setName("btnCstProd"); // NOI18N
        btnCstProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCstProdActionPerformed(evt);
            }
        });

        btnCstTdsProds.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCstTdsProds.setText("Consultar todos os Produtos");
        btnCstTdsProds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCstTdsProdsActionPerformed(evt);
            }
        });

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

        btnSair1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSair1.setText("Voltar ao menu principal");
        btnSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Código:");

        txtCodigoProd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCodigoProd.setName("txtCodigoProd"); // NOI18N
        txtCodigoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProdActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Nome:");

        txtNomeProd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNomeProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdActionPerformed(evt);
            }
        });

        cbGeneroProd.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbGeneroProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Masculino", "Feminino", "Unissex" }));
        cbGeneroProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGeneroProdActionPerformed(evt);
            }
        });

        cbClasseProd.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbClasseProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Camisas", "Blusas", "Calças", "Bermudas", "Shorts", "Vestidos", "Macacões", "Saias", "Croppeds", "Tops", "Leggins", "Tênis", "Casacos", "Acessórios" }));
        cbClasseProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClasseProdActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Gênero:");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 150)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Eꟼ");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 44)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("EPISODE");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Tipo de peça:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSair1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(cbGeneroProd, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeProd))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbClasseProd, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCstTdsProds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCstProd, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCstProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCstTdsProds))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cbClasseProd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbGeneroProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnSair1)
                        .addGap(48, 48, 48))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnCstProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCstProdActionPerformed
        // Chama a função mostar produto pesquisado
        mostrarProdsTabela();
    }//GEN-LAST:event_btnCstProdActionPerformed

    private void btnCstTdsProdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCstTdsProdsActionPerformed
       // Chama a função mostrar todos os produtos
       mostrarTdsProdsTabela();
    }//GEN-LAST:event_btnCstTdsProdsActionPerformed

    private void tblProdutoHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_tblProdutoHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tblProdutoHierarchyChanged

    private void btnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair1ActionPerformed
        dispose(); //sair da janela, permanecendo com o menu aberto.
    }//GEN-LAST:event_btnSair1ActionPerformed

    private void txtCodigoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProdActionPerformed

    private void txtNomeProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdActionPerformed

    private void cbGeneroProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGeneroProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGeneroProdActionPerformed

    private void cbClasseProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClasseProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbClasseProdActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new ConsultarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCstProd;
    private javax.swing.JButton btnCstTdsProds;
    private javax.swing.JButton btnSair1;
    private javax.swing.JComboBox<String> cbClasseProd;
    private javax.swing.JComboBox<String> cbGeneroProd;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtCodigoProd;
    private javax.swing.JTextField txtNomeProd;
    // End of variables declaration//GEN-END:variables

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
                
                if(!(txtCodigoProd.getText().isEmpty())){ // Se código não está em branco
                    if(!(txtNomeProd.getText().isEmpty())){ // Se nome não está em branco
                        if(!(" ".equalsIgnoreCase((String)cbGeneroProd.getSelectedItem()))){ // Se gênero não está em branco
                            if(!(" ".equalsIgnoreCase((String)cbClasseProd.getSelectedItem()))){ // Se classe não está em branco
                                // Se código igual a código pesquisado e nome igual a nome pesquisado e gênero igual a gênero pesquisado e classe igual a classe pesquisado
                                if (codigo.toLowerCase().startsWith(txtCodigoProd.getText().toLowerCase()) && nome.toLowerCase().startsWith(txtNomeProd.getText().toLowerCase()) && genero.equalsIgnoreCase((String)cbGeneroProd.getSelectedItem()) && classe.equalsIgnoreCase((String)cbClasseProd.getSelectedItem())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }else{ // Se classe está em branco
                                // Se código igual a código pesquisado e nome igual a nome pesquisado e gênero igual a gênero pesquisado
                                if (codigo.toLowerCase().startsWith(txtCodigoProd.getText().toLowerCase()) && nome.toLowerCase().startsWith(txtNomeProd.getText().toLowerCase()) && genero.equalsIgnoreCase((String)cbGeneroProd.getSelectedItem())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }
                        }else{ // Se gênero está em branco
                            if(!(" ".equalsIgnoreCase((String)cbClasseProd.getSelectedItem()))){  // Se classe não está em branco
                                // Se código igual a código pesquisado e nome igual a nome pesquisado e classe igual a classe pesquisado
                                if (codigo.toLowerCase().startsWith(txtCodigoProd.getText().toLowerCase()) && nome.toLowerCase().startsWith(txtNomeProd.getText().toLowerCase()) && classe.equalsIgnoreCase((String)cbClasseProd.getSelectedItem())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }else{ // Se classe está em branco
                                // Se código igual a código pesquisado e nome igual a nome pesquisado
                                if (codigo.toLowerCase().startsWith(txtCodigoProd.getText().toLowerCase()) && nome.toLowerCase().startsWith(txtNomeProd.getText().toLowerCase())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }
                        }
                    }else{ // Se nome está em branco
                        if(!(" ".equalsIgnoreCase((String)cbGeneroProd.getSelectedItem()))){ // Se gênero não está em branco
                            if(!(" ".equalsIgnoreCase((String)cbClasseProd.getSelectedItem()))){ // Se classe não está em branco
                                // Se código igual a código pesquisado e gênero igual a gênero pesquisado e classe igual a classe pesquisado
                                if (codigo.toLowerCase().startsWith(txtCodigoProd.getText().toLowerCase()) && genero.equalsIgnoreCase((String)cbGeneroProd.getSelectedItem()) && classe.equalsIgnoreCase((String)cbClasseProd.getSelectedItem())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }else{ // Se classe está em branco
                                // Se código igual a código pesquisado e gênero igual a gênero pesquisado
                                if (codigo.toLowerCase().startsWith(txtCodigoProd.getText().toLowerCase()) && genero.equalsIgnoreCase((String)cbGeneroProd.getSelectedItem())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }
                        }else{ // Se gênero está em branco
                            if(!(" ".equalsIgnoreCase((String)cbClasseProd.getSelectedItem()))){ // Se classe não está em branco
                                // Se código igual a código pesquisado e classe igual a classe pesquisado
                                if (codigo.toLowerCase().startsWith(txtCodigoProd.getText().toLowerCase()) && classe.equalsIgnoreCase((String)cbClasseProd.getSelectedItem())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }else{ // Se classe está em branco
                                // Se código igual a código pesquisado
                                if (codigo.toLowerCase().startsWith(txtCodigoProd.getText().toLowerCase())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }
                        }
                    }
                }else{ // Se código está em branco
                    if(!(txtNomeProd.getText().isEmpty())){ // Se nome não está em branco
                        if(!(" ".equalsIgnoreCase((String)cbGeneroProd.getSelectedItem()))){ // Se gênero não está em branco
                            if(!(" ".equalsIgnoreCase((String)cbClasseProd.getSelectedItem()))){ // Se classe não está em branco
                                // Se nome igual a nome pesquisado e gênero igual a gênero pesquisado e classe igual a classe pesquisado
                                if (nome.toLowerCase().startsWith(txtNomeProd.getText().toLowerCase()) && genero.equalsIgnoreCase((String)cbGeneroProd.getSelectedItem()) && classe.equalsIgnoreCase((String)cbClasseProd.getSelectedItem())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }else{ // Se classe está em branco
                                // Se nome igual a nome pesquisado e gênero igual a gênero pesquisado
                                if (nome.toLowerCase().startsWith(txtNomeProd.getText().toLowerCase()) && genero.equalsIgnoreCase((String)cbGeneroProd.getSelectedItem())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }
                        }else{ // Se gênero está em branco
                            if(!(" ".equalsIgnoreCase((String)cbClasseProd.getSelectedItem()))){ // Se classe está em branco
                                // Se nome igual a nome pesquisado e classe igual a classe pesquisado
                                if (nome.toLowerCase().startsWith(txtNomeProd.getText().toLowerCase()) && classe.equalsIgnoreCase((String)cbClasseProd.getSelectedItem())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }else{ // Se classe está em branco
                                // Se nome igual a nome pesquisado
                                if (nome.toLowerCase().startsWith(txtNomeProd.getText().toLowerCase())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }
                        }
                    }else{ // Se nome está em branco
                        if(!(" ".equalsIgnoreCase((String)cbGeneroProd.getSelectedItem()))){ // Se gênero não está em branco
                            if(!(" ".equalsIgnoreCase((String)cbClasseProd.getSelectedItem()))){ // Se classe não está em branco
                                // Se gênero igual a gênero pesquisado e classe igual a classe pesquisado
                                if (genero.equalsIgnoreCase((String)cbGeneroProd.getSelectedItem()) && classe.equalsIgnoreCase((String)cbClasseProd.getSelectedItem())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }else{ // Se classe está em branco
                                // Se gênero igual a gênero pesquisado
                                if (genero.equalsIgnoreCase((String)cbGeneroProd.getSelectedItem())){
                                    // Insere a linha na tabela
                                    tabelaProdutos.addRow(data);
                                    ProdEncontrado = true;
                                }
                            }
                        }else{ // Se gênero está em branco
                            if(!(" ".equalsIgnoreCase((String)cbClasseProd.getSelectedItem()))){ // Se classe não está em branco
                                // Se classe igual a classe pesquisado
                                if (classe.equalsIgnoreCase((String)cbClasseProd.getSelectedItem())){
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
            txtNomeProd.setText("");
            txtCodigoProd.setText("");
            cbGeneroProd.setSelectedItem(" ");
            cbClasseProd.setSelectedItem(" ");
            
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
