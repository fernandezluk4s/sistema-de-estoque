package AcoesSistemaVenda;

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
import java.util.Date;
import java.text.SimpleDateFormat;

public class RealizarVenda extends javax.swing.JFrame {
    // Define o valor inicial do valor total da venda 
    double valorTotVenda = 0;

    public RealizarVenda() {
        initComponents(); // inicia os botões visuais
        setLocationRelativeTo(null); //abre centralizada na tela
        mostrarTdsProdsTabela(); // chama a função que mostra todos os produtos na tabela
        setColumnWidthProduto(); // Define a largura de cada coluna da tabela de produtos
        setColumnWidthVenda(); // Define a largura de cada coluna da tabela de venda
        txtValorTotal.setText("Valor total: " + valorTotVenda); // mostra o valor inicial da venda
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFinalizarVenda = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoProdPesq = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNomeProdPesq = new javax.swing.JTextField();
        cbGeneroProdPesq = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbClasseProdPesq = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btnPesqProd = new javax.swing.JButton();
        btnMostTdsProds = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVendaProd = new javax.swing.JTable();
        txtQuantidadeProd = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnAdicionarProd1 = new javax.swing.JButton();
        txtDescontoProd = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnRetirarProduto = new javax.swing.JButton();
        cbCliCadastrado = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtCpfCliente = new javax.swing.JTextField();
        txtValorTotal = new javax.swing.JLabel();
        btnCancelarVenda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vender produtos no sistema");
        setResizable(false);

        btnFinalizarVenda.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnFinalizarVenda.setText("Finalizar venda");
        btnFinalizarVenda.setName("btnFinalizarVenda"); // NOI18N
        btnFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarVendaActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSair.setText("Voltar ao menu principal");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
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
        tblProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblProdutoKeyPressed(evt);
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
            tblProduto.getColumnModel().getColumn(5).setHeaderValue("Classe");
        }

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

        cbClasseProdPesq.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbClasseProdPesq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Camisas", "Blusas", "Calças", "Bermudas", "Shorts", "Vestidos", "Macacões", "Saias", "Croppeds", "Tops", "Leggins", "Tênis", "Casacos", "Acessórios" }));
        cbClasseProdPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClasseProdPesqActionPerformed(evt);
            }
        });

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

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Eꟼ");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("EPISODE");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tblVendaProd.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblVendaProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Quantidade", "Preço", "Desconto", "Preço Item "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVendaProd.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblVendaProd.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                tblVendaProdHierarchyChanged(evt);
            }
        });
        jScrollPane2.setViewportView(tblVendaProd);
        if (tblVendaProd.getColumnModel().getColumnCount() > 0) {
            tblVendaProd.getColumnModel().getColumn(0).setResizable(false);
            tblVendaProd.getColumnModel().getColumn(1).setResizable(false);
            tblVendaProd.getColumnModel().getColumn(2).setResizable(false);
            tblVendaProd.getColumnModel().getColumn(3).setResizable(false);
            tblVendaProd.getColumnModel().getColumn(5).setResizable(false);
        }

        txtQuantidadeProd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtQuantidadeProd.setName("txtCodigoProd"); // NOI18N
        txtQuantidadeProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeProdActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setText("Quantidade:");

        btnAdicionarProd1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAdicionarProd1.setText("Adicionar produto");
        btnAdicionarProd1.setName("btnAdicionarProd"); // NOI18N
        btnAdicionarProd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProd1ActionPerformed(evt);
            }
        });

        txtDescontoProd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtDescontoProd.setName("txtCodigoProd"); // NOI18N
        txtDescontoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescontoProdActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setText("Desconto:");

        btnRetirarProduto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnRetirarProduto.setText("Remover produto");
        btnRetirarProduto.setName("btnAdicionarProd"); // NOI18N
        btnRetirarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarProdutoActionPerformed(evt);
            }
        });

        cbCliCadastrado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbCliCadastrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Sem cadastro", "Com cadastro" }));
        cbCliCadastrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCliCadastradoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setText("Cadastro:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setText("CPF:");

        txtCpfCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfClienteActionPerformed(evt);
            }
        });

        txtValorTotal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtValorTotal.setText("...");

        btnCancelarVenda.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCancelarVenda.setText("Cancelar venda");
        btnCancelarVenda.setName("btnFinalizarVenda"); // NOI18N
        btnCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCliCadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCpfCliente)
                        .addGap(454, 454, 454))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbGeneroProdPesq, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodigoProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeProdPesq))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbClasseProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPesqProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMostTdsProds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDescontoProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRetirarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtQuantidadeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAdicionarProd1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSair))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(119, 119, 119)
                                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCodigoProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbGeneroProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtNomeProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                    .addComponent(btnPesqProd))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbClasseProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                    .addComponent(btnMostTdsProds)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCliCadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantidadeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(btnAdicionarProd1)
                            .addComponent(btnCancelarVenda)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDescontoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(btnRetirarProduto))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFinalizarVenda)
                        .addComponent(btnSair)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarVendaActionPerformed
        // Chama a função efetuar venda
        efetuarVenda();
    }//GEN-LAST:event_btnFinalizarVendaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       dispose(); //sair da janela, permanecendo com o menu aberto.
    }//GEN-LAST:event_btnSairActionPerformed

    private void tblProdutoHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_tblProdutoHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tblProdutoHierarchyChanged

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

    private void btnPesqProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqProdActionPerformed
        // Chama a função mostar produto pesquisado
        mostrarProdsTabela();
    }//GEN-LAST:event_btnPesqProdActionPerformed

    private void btnMostTdsProdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostTdsProdsActionPerformed
        // Chama a função mostrar todos os produtos
        mostrarTdsProdsTabela();
    }//GEN-LAST:event_btnMostTdsProdsActionPerformed

    private void tblVendaProdHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_tblVendaProdHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tblVendaProdHierarchyChanged

    private void tblProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblProdutoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblProdutoKeyPressed

    private void txtQuantidadeProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeProdActionPerformed

    private void btnAdicionarProd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProd1ActionPerformed
        // Chama a função adicionar produto a venda
        adicProdVenda();
    }//GEN-LAST:event_btnAdicionarProd1ActionPerformed

    private void txtDescontoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescontoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescontoProdActionPerformed

    private void btnRetirarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarProdutoActionPerformed
        // Chama a função remover produto da venda
        removProdVenda();
    }//GEN-LAST:event_btnRetirarProdutoActionPerformed

    private void cbCliCadastradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCliCadastradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCliCadastradoActionPerformed

    private void txtCpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfClienteActionPerformed

    private void btnCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVendaActionPerformed
        // Chama a função cancelar venda
        cancVenda();
    }//GEN-LAST:event_btnCancelarVendaActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealizarVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarProd1;
    private javax.swing.JButton btnCancelarVenda;
    private javax.swing.JButton btnFinalizarVenda;
    private javax.swing.JButton btnMostTdsProds;
    private javax.swing.JButton btnPesqProd;
    private javax.swing.JButton btnRetirarProduto;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbClasseProdPesq;
    private javax.swing.JComboBox<String> cbCliCadastrado;
    private javax.swing.JComboBox<String> cbGeneroProdPesq;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTable tblVendaProd;
    private javax.swing.JTextField txtCodigoProdPesq;
    private javax.swing.JTextField txtCpfCliente;
    private javax.swing.JTextField txtDescontoProd;
    private javax.swing.JTextField txtNomeProdPesq;
    private javax.swing.JTextField txtQuantidadeProd;
    private javax.swing.JLabel txtValorTotal;
    // End of variables declaration//GEN-END:variables

    // Define os arquivos texto para armazenamento de informações
    private static final String nomeArquivo = "Produto.txt";
    private static final String arquivoCadastro = "cliente.txt";

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
    
    public void setColumnWidthVenda() {
        // Define o tamanho horizontal de cada campo da tabela de vendas
        TableColumnModel columnModel = tblVendaProd.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(75);
        columnModel.getColumn(1).setPreferredWidth(120);
        columnModel.getColumn(2).setPreferredWidth(75);
        columnModel.getColumn(3).setPreferredWidth(75);
        columnModel.getColumn(4).setPreferredWidth(75);
    }
    
    private void adicProdVenda() {
        try{
            // Se as caixas de texto quantidade e desconto não estiverem em branco 
            if(!txtQuantidadeProd.getText().isEmpty() && !txtDescontoProd.getText().isEmpty()){
                // Lê o modelo de cada tabela
                DefaultTableModel tabelaProduto = (DefaultTableModel) tblProduto.getModel();
                // Cria uma nova tabela tabela baseada no modelo "tabelaVendaProd". Isso é útil para acessar os valores da tabela sem afetar a tabela original.
                JTable tabela = new JTable(tabelaProduto);
                if(tblProduto.getRowCount() == 0){ // Caso tabela vazia 
                    JOptionPane.showMessageDialog(null, "Erro! Tabela de produtos está vazia!", "Erro", 0);
                }else if(tblProduto.getSelectedRowCount() > 1){ // Caso mais de um item for selecionado
                    JOptionPane.showMessageDialog(null, "Erro! Mais de um item selecionado!", "Erro", 0);
                }else if(tblProduto.getSelectedRowCount() == 0){ // Caso nenhum item for selecionado
                    JOptionPane.showMessageDialog(null, "Erro! Nenhum item selecionado!", "Erro", 0);
                }else{
                    int tblLinha = tblProduto.getSelectedRow();
                    // Define as variáveis 
                    String codigoProd, nomeProd; 
                    int quantidadeProdEst = Integer.parseInt((String) tabela.getValueAt(tblLinha,2)), quantidadeProdIns;
                    double precoProd, descontoProd, precoFinProd;
                    codigoProd = (String) tabela.getValueAt(tblLinha,0); // Recebe o código do produto
                    nomeProd = (String) tabela.getValueAt(tblLinha,1); // Recebe o nome do produto
                    quantidadeProdIns = Integer.parseInt(txtQuantidadeProd.getText()); // Recebe a quantidade  de produtos a serem comprados
                    precoProd = Double.parseDouble((String) tabela.getValueAt(tblLinha,3)); // Recebe o preco do produto
                    descontoProd = Double.parseDouble(txtDescontoProd.getText());// Recebe o valor do desconto
                    // Calcula o preco final com a quantidades de produtos e desconto
                    precoFinProd = ((precoProd * quantidadeProdIns) * (100 - descontoProd)) / 100;
                    if(quantidadeProdEst >= quantidadeProdIns && quantidadeProdIns != 0 && descontoProd >= 0 && descontoProd <= 100){
                        // Lê o modelo de cada tabela
                        DefaultTableModel tabelaVendaProd = (DefaultTableModel) tblVendaProd.getModel();
                        // Cria a linha a ser adicionada na tabela de vendas
                        String dataVenda[] = {codigoProd,nomeProd,Integer.toString(quantidadeProdIns),Double.toString(precoProd),Double.toString(descontoProd),Double.toString(precoFinProd)};
                        // Adiciona a linha na tabela de vendas
                        tabelaVendaProd.addRow(dataVenda);
                        mostrarTdsProdsTabela();
                        // Limpa as caixas de texto quantidade e desconto
                        txtQuantidadeProd.setText("");
                        txtDescontoProd.setText("");
                        // Adiciona o preço final do produto ao valor total da venda
                        valorTotVenda = valorTotVenda + precoFinProd;
                        // Atualiza o valor total da venda na janela de vendas
                        txtValorTotal.setText("Valor total: " + valorTotVenda);
                    }else if(quantidadeProdIns == 0){
                        // Erro se a quantidade vendida for igual a zero
                        JOptionPane.showMessageDialog(null,"Erro ao efetuar venda! Quantidade a\nser vendida deve ser maior que zero!", "ERRO", 0);
                    }else if(quantidadeProdEst < quantidadeProdIns){
                        // Erro se a quantidade vendida for maior que a quantidade em estoque
                        JOptionPane.showMessageDialog(null,"Erro ao efetuar venda! Quantidade a\nser vendida maior que a em estoque!", "ERRO", 0);
                    }else if(descontoProd < 0){
                        // Erro se o desconto for menor que zero
                        JOptionPane.showMessageDialog(null,"Erro ao efetuar venda! Desconto\nmenor que 0%", "ERRO", 0);
                    }else{
                        // Erro se o desconto for maior que cem
                        JOptionPane.showMessageDialog(null,"Erro ao efetuar venda! Desconto\nmaior que 100%", "ERRO", 0);
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Erro! Os campos quantidade e/ou\ndesconto não foram preenchidos.", "Erro", 0);
            }
        }catch (NumberFormatException e) {
            // Erro de concordância entre string e numerais
            JOptionPane.showMessageDialog(null, "Erro! Formato de dados inseridos incorreto.", "Erro", 0);
            System.err.println("Erro: Formato de dados inseridos incorreto."+ e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            // Erro ao tentar acesso obtuso no array
            JOptionPane.showMessageDialog(null,"Erro: Formato de dados incorreto no arquivo.", "ERRO", 0);
            System.err.println("Erro: Formato de dados incorreto no arquivo." + e.getMessage() );
        }
    }
    
    private void removProdVenda() {
        if(tblVendaProd.getRowCount() == 0){ // Caso tabela vazia 
            JOptionPane.showMessageDialog(null, "Erro! Tabela de produtos está vazia!", "Erro", 0);
        }else if(tblVendaProd.getSelectedRowCount() > 1){ // Caso mais de um item for selecionado
            JOptionPane.showMessageDialog(null, "Erro! Mais de um item selecionado!", "Erro", 0);
        }else if(tblVendaProd.getSelectedRowCount() == 0){ // Caso nenhum item for selecionado
            JOptionPane.showMessageDialog(null, "Erro! Nenhum item selecionado!", "Erro", 0);
        }else{
            // Lê o modelo de cada tabela
            DefaultTableModel tabelaVendaProd = (DefaultTableModel) tblVendaProd.getModel();
            // Cria uma nova tabela tabela baseada no modelo "tabelaVendaProd". Isso é útil para acessar os valores da tabela sem afetar a tabela original.
            JTable tabela = new JTable(tabelaVendaProd);
            // Recebe o numero da linha que seá excluida
            int tblLinha = tblVendaProd.getSelectedRow();
            // Recebe o preço final do item a ser excluido
            double precoFinProd = Double.parseDouble((String) tabela.getValueAt(tblLinha,5));
            // Atualiza o valor total da venda
            valorTotVenda = valorTotVenda - precoFinProd;
            // Remove a linha da tabela de vendas
            tabelaVendaProd.removeRow(tblVendaProd.getSelectedRow());
            // Imprime o valor atualizado na janela de venda
            txtValorTotal.setText("Valor total: " + valorTotVenda);
        }
    }
    
    private boolean verifCpf() {
        // Enquanto CPF não encontrado retorna falso
        boolean CpfEncontrado = false;
        //Lê cada linha do arquivo Clientes
        try (BufferedReader r_cliente = new BufferedReader(new FileReader(arquivoCadastro))) {
            String linha, cpf;
            // Percorre todas as linhas
            while ((linha = r_cliente.readLine()) != null) { 
                String[] campos = linha.split(","); // Separa os campos
                cpf = campos[0]; // Pega o campo referente ao CPF

                // Caso CPF encontrado A funcão retorna verdadeiro
                if(cpf.equalsIgnoreCase(txtCpfCliente.getText())){
                    CpfEncontrado = true;
                }
            }
            r_cliente.close();
        } catch (IOException e) {
            // Erros de entrada/saída, ao abrir, ler ou escrever em um arquivo.
            JOptionPane.showMessageDialog(null,"Ocorreu um erro ao acessar o arquivo!", "ERRO", 0);
            System.out.println("Ocorreu um erro ao acessar o arquivo: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            // Erro ao tentar acesso obtuso no array
            JOptionPane.showMessageDialog(null,"Erro: Formato de dados incorreto no arquivo.", "ERRO", 0);
            System.err.println("Erro: Formato de dados incorreto no arquivo." + e.getMessage());
        }
        return CpfEncontrado;
    }
    
    private void adicVendaCli() {
        try {
            // Cria um array de strings com o nome de "linhas"
            List<String> linhas = new ArrayList<>();
            
            // Lê todas as linhas do arquivo
            BufferedReader r_cliente = new BufferedReader(new FileReader(arquivoCadastro));
            String linha;
            while ((linha = r_cliente.readLine()) != null) {
                linhas.add(linha);
            }
            r_cliente.close();

            // Percorrer as linhas e procurar o cliente pelo CPF
            for (int i = 0; i < linhas.size(); i++) {
                String[] campo = linhas.get(i).split(","); // Separando CPF, Nome, Email e Gênero
                String cpfAtual = campo[0];

                // Verifica se o código atual corresponde ao código do produto a ser alterado
                if (cpfAtual.equalsIgnoreCase(txtCpfCliente.getText())) {
                    // Atualiza a quantidade de compras do cliente referente
                    int ComprasAtualizado =  Integer.parseInt(campo[4]) + 1;
                    // Cria a linha atualizada para ser adicionada no lugar da linha antiga
                    String linhaAtualizada = campo[0] + "," + campo[1] + "," + campo[2] + "," + campo[3] + "," + ComprasAtualizado;
                    linhas.set(i, linhaAtualizada); // Atualiza a linha na lista de clientes
                }    
            }

            //Reescrever o arquivo com a linha do produto alterada
            BufferedWriter w_produto = new BufferedWriter(new FileWriter(arquivoCadastro));
            for (String l : linhas) {
                w_produto.write(l);
                w_produto.newLine();
            }
            w_produto.close();
            
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
    }
    
    private void cancVenda() {
        // Lê o modelo de cada tabela
        DefaultTableModel tabelaVendaProd = (DefaultTableModel) tblVendaProd.getModel();
        // Cria uma nova tabela tabela baseada no modelo "tabelaVendaProd". Isso é útil para acessar os valores da tabela sem afetar a tabela original.
        tabelaVendaProd.setRowCount(0);
        txtNomeProdPesq.setText("");
        txtCodigoProdPesq.setText("");
        cbGeneroProdPesq.setSelectedItem(" ");
        cbClasseProdPesq.setSelectedItem(" ");
        cbCliCadastrado.setSelectedItem(" ");
        txtCpfCliente.setText("");
        txtQuantidadeProd.setText("");
        txtDescontoProd.setText("");
        valorTotVenda = 0;
        txtValorTotal.setText("Valor total: " + valorTotVenda);
    }
    
    private void efetuarVenda() {
        try {
            // Pega data e hora do sistema
            Date dataHoraAtual = new Date();
            // Define data e hora em variaveis separadas ja formatadas 
            String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
            String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);   

            // Define as variaveis para inicio de uma venda
            boolean relatorioEstoque = false;
            boolean vendaRealizada = false;
            // Cria os relatórios com seus respectivos títulos
            StringBuilder vendas = new StringBuilder();
            StringBuilder reporEstoque = new StringBuilder();

            // Redefine o nome das caixas de texto JOptionPane.showConfirmDialog
            UIManager.put("OptionPane.yesButtonText","Sim");
            UIManager.put("OptionPane.noButtonText", "Não");

            // Lê o modelo de cada tabela
            DefaultTableModel tabelaProdutos = (DefaultTableModel) tblProduto.getModel();
            DefaultTableModel tabelaVendaProd = (DefaultTableModel) tblVendaProd.getModel();
            // Cria uma nova tabela tabela baseada no modelo "tabelaVendaProd". Isso é útil para acessar os valores da tabela sem afetar a tabela original.
            JTable tabela = new JTable(tabelaVendaProd);

            // Verifica se as caixas de texto estão em branco
            if(tblVendaProd.getRowCount() > 0 && !(" ".equalsIgnoreCase((String)cbCliCadastrado.getSelectedItem())) && "Sem cadastro".equalsIgnoreCase((String)cbCliCadastrado.getSelectedItem()) || (!txtCpfCliente.getText().isEmpty() && verifCpf())){
                // Cria um array de strings com o nome de "linhas"
                List<String> linhas = new ArrayList<>();

                // Inicializa o CPF e o nome da venda como dados nulos
                String cpfVenda = null, nomeVenda = null;
                // Caso venda "sem cadastro", define o CPF e o nome da venda como "sem cadastro"
                if("Sem cadastro".equalsIgnoreCase((String)cbCliCadastrado.getSelectedItem())){
                    cpfVenda = "Sem Cadastro";
                    nomeVenda = "Sem Cadastro";
                // Caso venda "Com cadastro", define o CPF e o nome da venda como os dados do cliente
                }else{
                    BufferedReader r_cliente = new BufferedReader(new FileReader(arquivoCadastro));
                    String linhaCli, cpf;
                    while ((linhaCli = r_cliente.readLine()) != null) { 
                        String[] campos = linhaCli.split(",");
                        cpf = campos[0];
                        // Caso CPF igual o inserido, recebe os valores
                        if(cpf.equalsIgnoreCase(txtCpfCliente.getText())){
                            cpfVenda = campos[0];
                            nomeVenda = campos[1];
                        }
                    }
                    r_cliente.close();
                }

                // insere os dados CPF e nome na "nota fiscal"
                vendas.append("CPF cliente: " + cpfVenda + "\n");
                vendas.append("Nome cliente: " + nomeVenda + "\n");
                vendas.append("--------------------------------------------------\n");
                // Insere data e hora na "nota fiscal"
                vendas.append("Data: " + data + " - Hora: " + hora + "\n");
                vendas.append("--------------------------------------------------\n");

                // Ler todas as linhas do arquivo
                BufferedReader r_produto = new BufferedReader(new FileReader(nomeArquivo));
                String linha;
                // Adiciona Todas as linhas a um array linhas
                while ((linha = r_produto.readLine()) != null) {
                    linhas.add(linha);
                }
                r_produto.close();

                // Passa por toda a tabela de vendas lendo cada linha
                for(int item = 0; item <= (tblVendaProd.getRowCount() - 1); item++){
                    tblVendaProd.getValueAt(item,1);

                    // Percorrer as linhas e procurar o produto pelo código e/ou nome
                    for (int i = 0; i < linhas.size(); i++) {
                        String[] campo = linhas.get(i).split(","); // Separando Código, Nome, Quantidade e Preço
                        String codigoAtual = campo[0], nomeAtual = campo[1];
                        int quantidadeAtual = Integer.parseInt(campo[2]), quantidadeFinal;
                        double precoAtual = Double.parseDouble(campo[3]);

                        // Verifica se o nome atual corresponde ao nome do produto a ser alterado
                        if (nomeAtual.equals((String) tabela.getValueAt(item,1))) {

                            quantidadeFinal = (quantidadeAtual - Integer.parseInt((String) tblVendaProd.getValueAt(item,2))); //Caucula a quantidade restante no estoque
                            // Altera a quantidade do produto para o estoque
                            String linhaAtualizada = codigoAtual + "," + nomeAtual + "," + quantidadeFinal + "," + precoAtual + "," + campo[4] + "," + campo[5];
                            // Cria item para ser adicionado a uma "nota fiscal" temporária que será mostrada ao final da venda
                            String linhaVenda = (item + 1) +") "+ codigoAtual + " - " + nomeAtual + "\n" + Integer.parseInt((String) tblVendaProd.getValueAt(item,2)) + "UN X R$ " + precoAtual + " = R$ " + precoAtual * Integer.parseInt((String) tblVendaProd.getValueAt(item,2))+"\n";
                            linhas.set(i, linhaAtualizada); // Atualiza a linha na lista
                            vendas.append(linhaVenda); // Adiciona item a uma "nota fiscal" temporária

                            //Insere no relatorio de Reposição se a quantidade em estoque for menor que vinte
                            if(quantidadeFinal < 21){
                                // Cria item para ser adicionado a um aviso de necessidade de reposição de estoque
                                String linhaRelatEstoque = codigoAtual + " - " + nomeAtual + "\n" + quantidadeFinal + " Unidades\n\n"; 
                                reporEstoque.append(linhaRelatEstoque); // Adiciona item a um aviso de necessidade de reposição de estoque
                                relatorioEstoque = true; // Valida a necessidade de um aviso de reposição de estoque
                            }
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
                
                // Chama a função para adicionar mais uma compra ao cliente
                adicVendaCli();

                // Limpa sa tabelas
                tabelaVendaProd.setRowCount(0);
                tabelaProdutos.setRowCount(0);
                // Reescreve a tabela de produtos atualizada após a venda
                mostrarTdsProdsTabela();
                
                // Valida venda realizada
                vendaRealizada = true;

                // Limpa as caixas de texto
                cbCliCadastrado.setSelectedItem(" ");
                txtCpfCliente.setText("");
                txtQuantidadeProd.setText("");
                txtDescontoProd.setText("");

                // Mostra o valor de toda a compra
                vendas.append("--------------------------------------------------\n");
                vendas.append("Valor total da compra - R$ " + valorTotVenda);

                // Zera o valor total para uma nova venda e atualiza na janela
                valorTotVenda = 0;
                txtValorTotal.setText("Valor total: " + valorTotVenda);

                // Imprime os relatorios da venda e caso necessario o relatorio de reposição
                JOptionPane.showMessageDialog(null, vendas.toString(), "RELATÓRIO DE VENDAS", -1);
                if (relatorioEstoque){
                    // Mostra o relatorio de necessidade de reposicao, caso haja necessidade
                    JOptionPane.showMessageDialog(null,reporEstoque.toString(), "ALERTA PARA REPOSIÇÃO", 0);
                }

                if (vendaRealizada) {
                    // Valida o salvamento do produto no banco de dados
                    JOptionPane.showMessageDialog(null,"Venda realizada com sucesso!", "ATUALIZADO COM ÊXITO", 1);
                    System.out.println("Venda realizada com sucesso.");
                } else {
                    // Valida o não salvamento do produto no banco de dados
                    JOptionPane.showMessageDialog(null,"Erro! Não foi possível realizar a venda!", "ERRO", 0);
                    System.out.println("Erro! Não foi possível realizar a venda!");
                }

            }else if (tblVendaProd.getRowCount() <= 0){
                // Erro Nenhum item foi selecionado para venda
                JOptionPane.showMessageDialog(null, "Erro! Não há nenhum item\nna tabela de venda!", "ERRO", 0);
            }else if (" ".equalsIgnoreCase((String)cbCliCadastrado.getSelectedItem())){
                // Erro nenhuma informação sobre cadastro do cliente foi selecionada
                JOptionPane.showMessageDialog(null, "Erro! O campo cadastro\nnão foi selecionado!", "ERRO", 0);
            }else if (txtCpfCliente.getText().isEmpty()){
                // Erro nenhuma informação foi descrita sobre o CPF do cliente
                JOptionPane.showMessageDialog(null, "Erro! O campo CPF não\nfoi preenchido!", "ERRO", 0);
            }else if (!verifCpf()){
                // Erro o CPF inserido não conta como um cadastro
                JOptionPane.showMessageDialog(null, "Erro! O CPF não está\ncadastrado!", "ERRO", 0);
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
        }catch (NumberFormatException e) {
            // Erro de concordância entre string e numerais
            JOptionPane.showMessageDialog(null, "Erro! Formato de dados inseridos incorreto.", "Erro", 0);
            System.err.println("Erro: Formato de dados inseridos incorreto."+ e.getMessage());
        }
    }
}