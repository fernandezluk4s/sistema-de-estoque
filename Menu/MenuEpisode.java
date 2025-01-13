package Menu;

// Chama as outras pastas com asterisco para generalização de arquivos
import AcoesSistemaProduto.*;
import AcoesSistemaVenda.*;
import AcoesSistemaCliente.*;
import Sobre.*;
public class MenuEpisode extends javax.swing.JFrame {

    public MenuEpisode() {
        initComponents(); // inicia os botões visuais
        setLocationRelativeTo(null); //abre centralizada na tela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnProdConsultar = new javax.swing.JButton();
        btnCliConsultar = new javax.swing.JButton();
        btnVendRealizar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        opArquivo = new javax.swing.JMenu();
        opProduto = new javax.swing.JMenu();
        opProdAdicionar = new javax.swing.JMenuItem();
        opProdExcluir = new javax.swing.JMenuItem();
        opProdEditar = new javax.swing.JMenuItem();
        opCliente = new javax.swing.JMenu();
        opCliAdicionar = new javax.swing.JMenuItem();
        opCliExcluir = new javax.swing.JMenuItem();
        opCliEditar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        opSair = new javax.swing.JMenuItem();
        opAjuda = new javax.swing.JMenu();
        opSobre = new javax.swing.JMenu();
        opSobSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 260)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Eꟼ");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 72)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EPISODE");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnProdConsultar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnProdConsultar.setText("Consultar produto");
        btnProdConsultar.setName("btnProdConsultar"); // NOI18N
        btnProdConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdConsultarActionPerformed(evt);
            }
        });

        btnCliConsultar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCliConsultar.setText("Consultar cadastro cliente");
        btnCliConsultar.setName("btnAdicionarProd"); // NOI18N
        btnCliConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliConsultarActionPerformed(evt);
            }
        });

        btnVendRealizar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnVendRealizar.setText("Realizar venda");
        btnVendRealizar.setName("btnAdicionarProd"); // NOI18N
        btnVendRealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendRealizarActionPerformed(evt);
            }
        });

        opArquivo.setText("Arquivo");
        opArquivo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        opProduto.setText("Produto");

        opProdAdicionar.setText("Adicionar");
        opProdAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opProdAdicionarActionPerformed(evt);
            }
        });
        opProduto.add(opProdAdicionar);

        opProdExcluir.setText("Excluir");
        opProdExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opProdExcluirActionPerformed(evt);
            }
        });
        opProduto.add(opProdExcluir);

        opProdEditar.setText("Editar");
        opProdEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opProdEditarActionPerformed(evt);
            }
        });
        opProduto.add(opProdEditar);

        opArquivo.add(opProduto);

        opCliente.setText("Cliente");

        opCliAdicionar.setText("Cadastrar");
        opCliAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCliAdicionarActionPerformed(evt);
            }
        });
        opCliente.add(opCliAdicionar);

        opCliExcluir.setText("Excluir");
        opCliExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCliExcluirActionPerformed(evt);
            }
        });
        opCliente.add(opCliExcluir);

        opCliEditar.setText("Editar");
        opCliEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCliEditarActionPerformed(evt);
            }
        });
        opCliente.add(opCliEditar);

        opArquivo.add(opCliente);
        opArquivo.add(jSeparator1);

        opSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opSair.setText("Sair");
        opSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSairActionPerformed(evt);
            }
        });
        opArquivo.add(opSair);

        jMenuBar1.add(opArquivo);

        opAjuda.setText("Ajuda");
        opAjuda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        opSobre.setText("Sobre");

        opSobSistema.setText("Sobre o sistema");
        opSobSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSobSistemaActionPerformed(evt);
            }
        });
        opSobre.add(opSobSistema);

        opAjuda.add(opSobre);

        jMenuBar1.add(opAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVendRealizar, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProdConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnProdConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCliConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVendRealizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSairActionPerformed
        System.exit(0); //Fecha toda a aplicação
    }//GEN-LAST:event_opSairActionPerformed

    private void opSobSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSobSistemaActionPerformed
        // cria a chamada para o método sobre
        FrmSobre sobre = new FrmSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_opSobSistemaActionPerformed

    private void opProdAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opProdAdicionarActionPerformed
        // cria a chamada para o método adicionar produto
        AdicionarProduto AdicProd = new AdicionarProduto();
        AdicProd.setVisible(true);
    }//GEN-LAST:event_opProdAdicionarActionPerformed

    private void opProdExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opProdExcluirActionPerformed
        // cria a chamada para o método excluir produto
        ExcluirProduto ExcluProd = new ExcluirProduto();
        ExcluProd.setVisible(true);
    }//GEN-LAST:event_opProdExcluirActionPerformed

    private void opProdEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opProdEditarActionPerformed
        // cria a chamada para o método editar produto
        EditarProduto EditProd = new EditarProduto();
        EditProd.setVisible(true);
    }//GEN-LAST:event_opProdEditarActionPerformed

    private void opCliAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCliAdicionarActionPerformed
        // cria a chamada para o método adicionar cliente
        AdicionarCliente AdicCli = new AdicionarCliente();
        AdicCli.setVisible(true);
    }//GEN-LAST:event_opCliAdicionarActionPerformed

    private void opCliExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCliExcluirActionPerformed
        // cria a chamada para o método excluir cliente
        ExcluirCliente ExcluCli = new ExcluirCliente();
        ExcluCli.setVisible(true);
    }//GEN-LAST:event_opCliExcluirActionPerformed

    private void opCliEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCliEditarActionPerformed
        // cria a chamada para o método editar cliente
        EditarCliente EditCli = new EditarCliente();
        EditCli.setVisible(true);
    }//GEN-LAST:event_opCliEditarActionPerformed

    private void btnProdConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdConsultarActionPerformed
        // cria a chamada para o método consultar produto
        ConsultarProduto ConsuProd = new ConsultarProduto();
        ConsuProd.setVisible(true);
    }//GEN-LAST:event_btnProdConsultarActionPerformed

    private void btnCliConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliConsultarActionPerformed
        // cria a chamada para o método consultar cliente
        ConsultarCliente ConsuCli = new ConsultarCliente();
        ConsuCli.setVisible(true);
    }//GEN-LAST:event_btnCliConsultarActionPerformed

    private void btnVendRealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendRealizarActionPerformed
        // cria a chamada para o método realizar venda
        RealizarVenda RealVenda = new RealizarVenda();
        RealVenda.setVisible(true);
    }//GEN-LAST:event_btnVendRealizarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuEpisode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuEpisode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuEpisode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuEpisode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEpisode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliConsultar;
    private javax.swing.JButton btnProdConsultar;
    private javax.swing.JButton btnVendRealizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu opAjuda;
    private javax.swing.JMenu opArquivo;
    private javax.swing.JMenuItem opCliAdicionar;
    private javax.swing.JMenuItem opCliEditar;
    private javax.swing.JMenuItem opCliExcluir;
    private javax.swing.JMenu opCliente;
    private javax.swing.JMenuItem opProdAdicionar;
    private javax.swing.JMenuItem opProdEditar;
    private javax.swing.JMenuItem opProdExcluir;
    private javax.swing.JMenu opProduto;
    private javax.swing.JMenuItem opSair;
    private javax.swing.JMenuItem opSobSistema;
    private javax.swing.JMenu opSobre;
    // End of variables declaration//GEN-END:variables
}
