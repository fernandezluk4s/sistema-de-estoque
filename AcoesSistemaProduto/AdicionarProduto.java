package AcoesSistemaProduto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class AdicionarProduto extends javax.swing.JFrame {

    public AdicionarProduto() {
        initComponents(); // inicia os botões visuais
        setLocationRelativeTo(null); //abre centralizada na tela
        mostrarTdsProdsTabela(); // chama a função que mostra todos os produtos na tabela
        setColumnWidthProduto(); // Formata o tamanho da tabela
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoProd = new javax.swing.JTextField();
        txtQuantidadeProd = new javax.swing.JTextField();
        txtNomeProd = new javax.swing.JTextField();
        txtPrecoProd = new javax.swing.JTextField();
        btnAdicionarProd = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbGeneroProd = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbClasseProd = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar produtos no sistema");
        setResizable(false);

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

        btnAdicionarProd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAdicionarProd.setText("Adicionar produto");
        btnAdicionarProd.setName("btnAdicionarProd"); // NOI18N
        btnAdicionarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSair.setText("Voltar ao menu principal");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Tipo de peça:");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnAdicionarProd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSair, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtQuantidadeProd)
                                    .addComponent(txtPrecoProd)
                                    .addComponent(txtCodigoProd)
                                    .addComponent(txtNomeProd)
                                    .addComponent(cbGeneroProd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbClasseProd, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPesqProd, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(btnMostTdsProds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNomeProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCodigoProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(btnPesqProd)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbGeneroProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(cbClasseProdPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnMostTdsProds))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                        .addComponent(btnAdicionarProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair)))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtCodigoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProdActionPerformed

    private void txtQuantidadeProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeProdActionPerformed

    private void txtNomeProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdActionPerformed

    
    private void btnAdicionarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdActionPerformed
        // Chama a função para inserir produto no arquivo
        inserirProduto();
    }//GEN-LAST:event_btnAdicionarProdActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       dispose(); //sair da janela, permanecendo com o menu aberto.
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtPrecoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoProdActionPerformed

    private void cbGeneroProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGeneroProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGeneroProdActionPerformed

    private void cbClasseProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClasseProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbClasseProdActionPerformed

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

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new AdicionarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarProd;
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

    private void inserirProduto(){
        try{
            // Define as variáveis
            String linha, nome, codigo, genero, classe;
            int quantidade;
            double preco;
            // Verifica se todos os campos estão preenchidos
            if(!txtCodigoProd.getText().isEmpty() && !txtNomeProd.getText().isEmpty() && !txtQuantidadeProd.getText().isEmpty() && !txtPrecoProd.getText().isEmpty() && !" ".equalsIgnoreCase((String) cbGeneroProd.getSelectedItem()) && !" ".equalsIgnoreCase((String) cbClasseProd.getSelectedItem())){
                // Atribui um valor para cada variável
                codigo = txtCodigoProd.getText();
                nome = txtNomeProd.getText();
                quantidade = Integer.parseInt(txtQuantidadeProd.getText());
                preco = Double.parseDouble(txtPrecoProd.getText());
                genero = (String) cbGeneroProd.getSelectedItem();
                classe = (String) cbClasseProd.getSelectedItem();
                // Recebe a linha editada de uma função que junta todos os valores do produto 
                linha = addLinhaProduto(codigo,nome,quantidade,preco,genero,classe);
                // Chama a função exibir situação, que por sua vez chama salvar produto
                exibeSituacao(linha);
                // Limpa todos os valores da janela de adicionar produtos
                txtNomeProd.setText("");
                txtCodigoProd.setText("");
                txtQuantidadeProd.setText("");
                txtPrecoProd.setText("");
                cbGeneroProd.setSelectedItem(" ");
                cbClasseProd.setSelectedItem(" ");
                // Chama a função para mostrar todos os produtos da tabela
                mostrarTdsProdsTabela();
            }else{
                // Caso um ou mais itens Estejam em branco, exibe erro
                JOptionPane.showMessageDialog(null,"Erro: Insira todos os itens!", "ERRO", 0);
            }
        }catch (NumberFormatException e) {
            // Erro de concordância entre string e numerais
            JOptionPane.showMessageDialog(null,"Erro de Digitação! Tente novamente!", "ERRO", 0);
            System.err.println("Erro de Digitação! Tente novamente! "+ e.getMessage() );
        }
    }
    
    private static String addLinhaProduto(String codigo,String nome,int quantidade, double preco,String genero, String classe) {
        // Cria a variável linha
        String linha;
        // Cria a linha juntando os valores inseridos
        linha = codigo + "," + nome + "," + quantidade + "," + preco + "," + genero + "," + classe;
        // Retorna o valor linha 
        return linha;
    }
    
    public void exibeSituacao(String line){
        // Exibe uma mensagem de sucesso no salvamento da linha ou erro ao salvar
        if(salvarProduto(line)){
            JOptionPane.showMessageDialog(null,"Produto salvo com sucesso!", "SALVO COM ÊXITO", 1);
        }else{
            JOptionPane.showMessageDialog(null,"Erro ao salvar o produto!", "ERRO", 0);
        }
    }
     
    private static boolean salvarProduto(String linha) {
        // Escreve a linha no arquivo texto
        try (BufferedWriter w_produto = new BufferedWriter(new FileWriter(nomeArquivo, true))) {
            // Escreve a linha
            w_produto.write(linha);
            // Quebra linha
            w_produto.newLine();
            return true; // Retorna verdadeiro (executado)
        } catch (IOException e) {
            // Erros de entrada/saída, ao abrir, ler ou escrever em um arquivo.
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
            return false; // Retorna falso (não executado)
        } 
    }
    
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
                
                // Cria a linha para ser impressa na tabela
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
}
