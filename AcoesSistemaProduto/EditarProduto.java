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


public class EditarProduto extends javax.swing.JFrame {

    public EditarProduto() {
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
        jLabel4 = new javax.swing.JLabel();
        cbGeneroProd = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbClasseProd = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoProd = new javax.swing.JTextField();
        txtQuantidadeProd = new javax.swing.JTextField();
        txtNomeProd = new javax.swing.JTextField();
        txtPrecoProd = new javax.swing.JTextField();
        btnInserirProd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        cbClasseProdPesq = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnPesqProd = new javax.swing.JButton();
        btnMostTdsProds = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoProdPesq = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNomeProdPesq = new javax.swing.JTextField();
        cbGeneroProdPesq = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar produtos no sistema");
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
        tblProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutoMouseClicked(evt);
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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Preço:");

        cbGeneroProd.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbGeneroProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Masculino", "Feminino", "Unissex" }));
        cbGeneroProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGeneroProdActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Gênero:");

        cbClasseProd.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbClasseProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Camisas", "Blusas", "Calças", "Bermudas", "Shorts", "Vestidos", "Macacões", "Saias", "Croppeds", "Tops", "Leggins", "Tênis", "Casacos", "Acessórios" }));
        cbClasseProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClasseProdActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Quantidade:");

        txtCodigoProd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCodigoProd.setName("txtCodigoProd"); // NOI18N
        txtCodigoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProdActionPerformed(evt);
            }
        });

        txtQuantidadeProd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtQuantidadeProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeProdActionPerformed(evt);
            }
        });

        txtNomeProd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNomeProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdActionPerformed(evt);
            }
        });

        txtPrecoProd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtPrecoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoProdActionPerformed(evt);
            }
        });

        btnInserirProd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInserirProd.setText("Editar produto");
        btnInserirProd.setName("btnInserirProd"); // NOI18N
        btnInserirProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirProdActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Tipo de peça:");

        btnSair.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSair.setText("Voltar ao menu principal");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        cbClasseProdPesq.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbClasseProdPesq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Camisas", "Blusas", "Calças", "Bermudas", "Shorts", "Vestidos", "Macacões", "Saias", "Croppeds", "Tops", "Leggins", "Tênis", "Casacos", "Acessórios" }));
        cbClasseProdPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClasseProdPesqActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Eꟼ");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("EPISODE");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Tipo de peça:");

        btnPesqProd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnPesqProd.setText("Pesquisar produto");
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

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Código:");

        txtCodigoProdPesq.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCodigoProdPesq.setName("txtCodigoProd"); // NOI18N
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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Gênero:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbGeneroProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodigoProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbClasseProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMostTdsProds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPesqProd, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtQuantidadeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbGeneroProd, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbClasseProd, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnInserirProd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSair, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(btnPesqProd)
                            .addComponent(txtNomeProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbGeneroProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(cbClasseProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnMostTdsProds))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantidadeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbGeneroProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbClasseProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(btnInserirProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void tblProdutoHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_tblProdutoHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tblProdutoHierarchyChanged

    private void cbGeneroProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGeneroProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGeneroProdActionPerformed

    private void cbClasseProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClasseProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbClasseProdActionPerformed

    private void txtCodigoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProdActionPerformed

    private void txtQuantidadeProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeProdActionPerformed

    private void txtNomeProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdActionPerformed

    private void txtPrecoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoProdActionPerformed

    private void btnInserirProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirProdActionPerformed
        editarProduto();
    }//GEN-LAST:event_btnInserirProdActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose(); //sair da janela, permanecendo com o menu aberto.
    }//GEN-LAST:event_btnSairActionPerformed
    
    // É executada quando o mouse é clicado no produto 
    private void tblProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutoMouseClicked
        // Lê o modelo de cada tabela
        DefaultTableModel tabelaProdutos = (DefaultTableModel) tblProduto.getModel();
        // Cria uma nova tabela tabela baseada no modelo "tabelaVendaProd". Isso é útil para acessar os valores da tabela sem afetar a tabela original.
        JTable tabela = new JTable(tabelaProdutos);
        // Pega a linha selecionada
        int tblLinha = tblProduto.getSelectedRow();
        // Define os componentes com os valores da linha selecionada
        txtCodigoProd.setText((String) tabela.getValueAt(tblLinha,0));
        txtNomeProd.setText((String) tabela.getValueAt(tblLinha,1));
        txtQuantidadeProd.setText((String) tabela.getValueAt(tblLinha,2));
        txtPrecoProd.setText((String) tabela.getValueAt(tblLinha,3));
        cbGeneroProd.setSelectedItem((String) tabela.getValueAt(tblLinha,4));
        cbClasseProd.setSelectedItem((String) tabela.getValueAt(tblLinha,5));
    }//GEN-LAST:event_tblProdutoMouseClicked

    private void cbClasseProdPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClasseProdPesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbClasseProdPesqActionPerformed

    private void btnPesqProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqProdActionPerformed
        mostrarProdsTabela();
    }//GEN-LAST:event_btnPesqProdActionPerformed

    private void btnMostTdsProdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostTdsProdsActionPerformed
        mostrarTdsProdsTabela();
    }//GEN-LAST:event_btnMostTdsProdsActionPerformed

    private void txtCodigoProdPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProdPesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProdPesqActionPerformed

    private void txtNomeProdPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdPesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdPesqActionPerformed

    private void cbGeneroProdPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGeneroProdPesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGeneroProdPesqActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new EditarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInserirProd;
    private javax.swing.JButton btnMostTdsProds;
    private javax.swing.JButton btnPesqProd;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbClasseProd;
    private javax.swing.JComboBox<String> cbClasseProdPesq;
    private javax.swing.JComboBox<String> cbGeneroProd;
    private javax.swing.JComboBox<String> cbGeneroProdPesq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtCodigoProd;
    private javax.swing.JTextField txtCodigoProdPesq;
    private javax.swing.JTextField txtNomeProd;
    private javax.swing.JTextField txtNomeProdPesq;
    private javax.swing.JTextField txtPrecoProd;
    private javax.swing.JTextField txtQuantidadeProd;
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
    
    private void editarProduto() {
        if(tblProduto.getRowCount() == 0){ // Caso tabela vazia 
            JOptionPane.showMessageDialog(null, "Erro! Tabela de produtos está vazia!", "Erro", 0);
        }else if(tblProduto.getSelectedRowCount() > 1){ // Caso mais de um item for selecionado
            JOptionPane.showMessageDialog(null, "Erro! Mais de um item selecionado!", "Erro", 0);
        }else if(tblProduto.getSelectedRowCount() == 0){ // Caso nenhum item for selecionado
            JOptionPane.showMessageDialog(null, "Erro! Nenhum item selecionado!", "Erro", 0);
        }else{
            // Verifica se algum dos campos não foi preenchido
            if(!(txtCodigoProd.getText().isEmpty()) && !(txtNomeProd.getText().isEmpty()) && !(txtQuantidadeProd.getText().isEmpty()) && !(txtPrecoProd.getText().isEmpty()) && !(" ".equalsIgnoreCase((String)cbGeneroProd.getSelectedItem())) && !(" ".equalsIgnoreCase((String)cbClasseProd.getSelectedItem()))){
                // Lê o modelo de cada tabela
                DefaultTableModel tabelaProdutos = (DefaultTableModel) tblProduto.getModel();
                // Cria uma nova tabela tabela baseada no modelo "tabelaVendaProd". Isso é útil para acessar os valores da tabela sem afetar a tabela original.
                JTable tabela = new JTable(tabelaProdutos);
                // Pega o numero da linha a selecionada
                int tblLinha = tblProduto.getSelectedRow();
                // Pega a coluna da linha selecionada
                String tblNome = (String) tabela.getValueAt(tblLinha,1);
                
                // Cria um array de strings com o nome de "linhas"
                List<String> linhas = new ArrayList<>();
                // Define produto alterado como falso ate que seu valor seja alterado
                boolean produtoAlterado = false;

                try {
                    // Ler todas as linhas do arquivo
                    BufferedReader r_produto = new BufferedReader(new FileReader(nomeArquivo));
                    String linha;
                    int confEdição; // Cria a variável responsavél por guardar a resposta da confirmação de edição
                    while ((linha = r_produto.readLine()) != null) {
                        linhas.add(linha);
                    }
                    r_produto.close();

                    // Percorrer as linhas e procurar o produto pelo nome
                    for (int i = 0; i < linhas.size(); i++) {
                        String[] campo = linhas.get(i).split(","); // Separando Código, Nome e Preço
                        String nomeAtual = campo[1];

                        UIManager.put("OptionPane.yesButtonText","Sim");
                        UIManager.put("OptionPane.noButtonText", "Não");

                        // Verifica se o nome atual corresponde ao nome do produto a ser alterado
                        if (nomeAtual.equalsIgnoreCase(tblNome)) {

                            String codigoInserido, nomeInserido, generoInserido, classeInserido;
                            int quantidadeInserido;
                            double precoInserido;

                            codigoInserido = txtCodigoProd.getText();
                            nomeInserido = txtNomeProd.getText();
                            quantidadeInserido = Integer.parseInt(txtQuantidadeProd.getText());
                            precoInserido = Double.parseDouble(txtPrecoProd.getText());
                            generoInserido = (String)cbGeneroProd.getSelectedItem();
                            classeInserido = (String)cbClasseProd.getSelectedItem();
                            confEdição = JOptionPane.showConfirmDialog(null, "Confirmar edição","CONFIRMAR EDIÇÃO", 0);
                            if(confEdição == 0){
                                // Altera as informações de acordo com os dados inseridos
                                String linhaAtualizada = codigoInserido + "," + nomeInserido + "," + quantidadeInserido+ "," + precoInserido + "," + generoInserido+ "," + classeInserido;
                                linhas.set(i, linhaAtualizada); // Atualiza a linha na lista
                                produtoAlterado = true;
                                break;
                            }else{
                                break;
                            }
                        }    
                    }

                    //Reescrever o arquivo com a linha do produto alterada
                    BufferedWriter w_produto = new BufferedWriter(new FileWriter(nomeArquivo));
                    for (String l : linhas) {
                        w_produto.write(l);
                        w_produto.newLine();
                    }
                    w_produto.close();
                    
                    // Limpa a tabela de produtos
                    tabelaProdutos.setRowCount(0);
                    // Reescreva a tabela de produtos
                    mostrarTdsProdsTabela();
                    
                    if (produtoAlterado) {
                        JOptionPane.showMessageDialog(null,"Produto salvo com sucesso!", "SALVO COM ÊXITO", 1);
                        System.out.println("Produto alterado com sucesso.");
                    } else {
                        JOptionPane.showMessageDialog(null,"Erro ao salvar! Produto não alterado!", "ERRO", 0);
                        System.out.println("Produto não alterado.");
                    }
                    
                    txtNomeProd.setText("");
                    txtCodigoProd.setText("");
                    txtQuantidadeProd.setText("");
                    txtPrecoProd.setText("");
                    cbGeneroProd.setSelectedItem(" ");
                    cbClasseProd.setSelectedItem(" ");
                    txtNomeProdPesq.setText("");
                    txtCodigoProdPesq.setText("");
                    cbGeneroProdPesq.setSelectedItem(" ");
                    cbClasseProdPesq.setSelectedItem(" ");

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
                }catch (NumberFormatException e) {
                    // Erro de concordância entre string e numerais
                    JOptionPane.showMessageDialog(null, "Erro! Formato de dados inseridos incorreto.", "Erro", 0);
                    System.err.println("Erro: Formato de dados inseridos incorreto."+ e.getMessage());
                }
            }else{
                JOptionPane.showMessageDialog(null, "Erro! Insira ao menos um dado para execução.", "Erro", 0);
            }
        }
    }
}
