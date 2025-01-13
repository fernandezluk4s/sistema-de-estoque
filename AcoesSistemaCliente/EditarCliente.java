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


public class EditarCliente extends javax.swing.JFrame {

    public EditarCliente() {
        initComponents(); // inicia os botões visuais
        setLocationRelativeTo(null); //abre centralizada na tela
        mostrarTdsClientesTabela(); // chama a função que mostra todos os clientes na tabela
        setColumnWidthCliente(); // Formata o tamanho da tabela
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbGeneroCli = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCpfCliPesq = new javax.swing.JTextField();
        cbGeneroCliPesq = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNomeCliPesq = new javax.swing.JTextField();
        btnPesqProd = new javax.swing.JButton();
        btnMostTdsProds = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCpfCli = new javax.swing.JTextField();
        txtEmailCli = new javax.swing.JTextField();
        txtNomeCli = new javax.swing.JTextField();
        btnEditarCli = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        txtEmailCliPesq = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar cliente no sistema");
        setResizable(false);

        cbGeneroCli.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbGeneroCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Masculino", "Feminino" }));
        cbGeneroCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGeneroCliActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("CPF:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Gênero:");

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

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Eꟼ");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("EPISODE");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("CPF:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Email:");

        txtCpfCli.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCpfCli.setName("txtCpfCli"); // NOI18N
        txtCpfCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfCliActionPerformed(evt);
            }
        });

        txtEmailCli.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtEmailCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailCliActionPerformed(evt);
            }
        });

        txtNomeCli.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNomeCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCliActionPerformed(evt);
            }
        });

        btnEditarCli.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnEditarCli.setText("Editar Cliente");
        btnEditarCli.setName("btnEditarCli"); // NOI18N
        btnEditarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCliActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSair.setText("Voltar ao menu principal");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Email:");

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
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

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
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCpfCliPesq, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEmailCliPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbGeneroCliPesq, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeCliPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPesqProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMostTdsProds, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnEditarCli, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSair, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(12, 12, 12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCpfCli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtNomeCli, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtEmailCli, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbGeneroCli, javax.swing.GroupLayout.Alignment.LEADING, 0, 221, Short.MAX_VALUE)))
                                .addGap(14, 14, 14)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmailCli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbGeneroCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditarCli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair)
                        .addGap(73, 73, 73))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbGeneroCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGeneroCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGeneroCliActionPerformed

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
        mostrarClientesTabela();
    }//GEN-LAST:event_btnPesqProdActionPerformed

    private void btnMostTdsProdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostTdsProdsActionPerformed
        mostrarTdsClientesTabela();
    }//GEN-LAST:event_btnMostTdsProdsActionPerformed

    private void txtCpfCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfCliActionPerformed

    private void txtEmailCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailCliActionPerformed

    private void txtNomeCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCliActionPerformed

    private void btnEditarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCliActionPerformed
        editarCliente();
    }//GEN-LAST:event_btnEditarCliActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose(); //sair da janela, permanecendo com o menu aberto.
    }//GEN-LAST:event_btnSairActionPerformed

    private void tblClienteHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_tblClienteHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tblClienteHierarchyChanged

    private void txtEmailCliPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailCliPesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailCliPesqActionPerformed

    // É executada quando o mouse é clicado no produto 
    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        // Lê o modelo de cada tabela
        DefaultTableModel tabelaCliente = (DefaultTableModel) tblCliente.getModel();
        // Cria uma nova tabela tabela baseada no modelo "tabelaVendaProd". Isso é útil para acessar os valores da tabela sem afetar a tabela original.
        JTable tabela = new JTable(tabelaCliente);
        // Pega a linha selecionada
        int tblLinha = tblCliente.getSelectedRow();
        // Define os componentes com os valores da linha selecionada
        txtCpfCli.setText((String) tabela.getValueAt(tblLinha,0));
        txtNomeCli.setText((String) tabela.getValueAt(tblLinha,1));
        txtEmailCli.setText((String) tabela.getValueAt(tblLinha,2));
        cbGeneroCli.setSelectedItem((String) tabela.getValueAt(tblLinha,3));
    }//GEN-LAST:event_tblClienteMouseClicked
    
    
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new EditarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarCli;
    private javax.swing.JButton btnMostTdsProds;
    private javax.swing.JButton btnPesqProd;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbGeneroCli;
    private javax.swing.JComboBox<String> cbGeneroCliPesq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtCpfCli;
    private javax.swing.JTextField txtCpfCliPesq;
    private javax.swing.JTextField txtEmailCli;
    private javax.swing.JTextField txtEmailCliPesq;
    private javax.swing.JTextField txtNomeCli;
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
    
    private void editarCliente() {
        if(tblCliente.getRowCount() == 0){ // Caso tabela vazia 
            JOptionPane.showMessageDialog(null, "Erro! Tabela de produtos está vazia!", "Erro", 0);
        }else if(tblCliente.getSelectedRowCount() > 1){ // Caso mais de um item for selecionado
            JOptionPane.showMessageDialog(null, "Erro! Mais de um item selecionado!", "Erro", 0);
        }else if(tblCliente.getSelectedRowCount() == 0){ // Caso nenhum item for selecionado
            JOptionPane.showMessageDialog(null, "Erro! Nenhum item selecionado!", "Erro", 0);
        }else{
            // Verifica se algum dos campos não foi preenchido
            if(!(txtCpfCli.getText().isEmpty()) && !(txtNomeCli.getText().isEmpty()) && !(txtEmailCli.getText().isEmpty()) && !(" ".equalsIgnoreCase((String)cbGeneroCli.getSelectedItem()))){
                // Lê o modelo de cada tabela
                DefaultTableModel tabelaClientes = (DefaultTableModel) tblCliente.getModel();
                // Cria uma nova tabela tabela baseada no modelo "tabelaVendaProd". Isso é útil para acessar os valores da tabela sem afetar a tabela original.
                JTable tabela = new JTable(tabelaClientes);
                // Pega o numero da linha a selecionada
                int tblLinha = tblCliente.getSelectedRow();
                // Pega a coluna da linha selecionada
                String tblNome = (String) tabela.getValueAt(tblLinha,1);

                // Cria um array de strings com o nome de "linhas"
                List<String> linhas = new ArrayList<>();
                // Define produto alterado como falso ate que seu valor seja alterado
                boolean produtoAlterado = false;

                try {
                    // Ler todas as linhas do arquivo
                    BufferedReader r_cliente = new BufferedReader(new FileReader(arquivoCadastro));
                    String linha;
                    int confEdição; // Cria a variável responsavél por guardar a resposta da confirmação de edição
                    while ((linha = r_cliente.readLine()) != null) {
                        linhas.add(linha);
                    }
                    r_cliente.close();

                    // Percorrer as linhas e procurar o produto pelo nome
                    for (int i = 0; i < linhas.size(); i++) {
                        String[] campo = linhas.get(i).split(","); // Separando CPF, Nome, Email e Gênero
                        String nomeAtual = campo[1];

                        UIManager.put("OptionPane.yesButtonText","Sim");
                        UIManager.put("OptionPane.noButtonText", "Não");

                        // Verifica se o nome atual corresponde ao nome do produto a ser alterado
                        if (nomeAtual.equalsIgnoreCase(tblNome)) {

                            String emailInserido, nomeInserido, generoInserido;
                            long cpfInserido;

                            cpfInserido = Long.parseLong(txtCpfCli.getText());
                            nomeInserido = txtNomeCli.getText();
                            emailInserido = txtEmailCli.getText();
                            generoInserido = (String)cbGeneroCli.getSelectedItem();
                            
                            confEdição = JOptionPane.showConfirmDialog(null, "Confirmar edição","CONFIRMAR EDIÇÃO", 0);
                            if(confEdição == 0){
                                // Altera as informações de acordo com os dados inseridos
                                String linhaAtualizada = cpfInserido + "," + nomeInserido + "," + emailInserido+ "," + generoInserido + "," + campo[4];
                                linhas.set(i, linhaAtualizada); // Atualiza a linha na lista
                                produtoAlterado = true;
                                break;
                            }else{
                                break;
                            }
                        }    
                    }

                    //Reescrever o arquivo com a linha do cliente alterada
                    BufferedWriter w_produto = new BufferedWriter(new FileWriter(arquivoCadastro));
                    for (String l : linhas) {
                        w_produto.write(l);
                        w_produto.newLine();
                    }
                    w_produto.close();
                    
                    // Limpa a tabela de clientes
                    tabelaClientes.setRowCount(0);
                    // Reescreva a tebela de clientes
                    mostrarTdsClientesTabela();

                    if (produtoAlterado) {
                        JOptionPane.showMessageDialog(null,"Cliente Alterado com sucesso!", "SALVO COM ÊXITO", 1);
                        System.out.println("Cliente Alterado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null,"Erro ao Alterar! Cliente não alterado!", "ERRO", 0);
                        System.out.println("Erro ao Alterar! Cliente não alterado!");
                    }
                    
                    txtCpfCli.setText("");
                    txtNomeCli.setText("");
                    txtEmailCli.setText("");
                    cbGeneroCli.setSelectedItem(" ");
                    txtCpfCliPesq.setText("");
                    txtNomeCliPesq.setText("");
                    txtEmailCliPesq.setText("");
                    cbGeneroCliPesq.setSelectedItem(" ");

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
