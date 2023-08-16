
package br.com.projeto.view;

import br.com.projeto.dao.ProdutosDAO;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class FrmMenu extends javax.swing.JFrame {

    public String usuarioLogado;
   
    public FrmMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon=new ImageIcon(getClass().getResource("/image/PDV.SISTEM.png"));
        Image image=icon.getImage();
        panel_desktop = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        controle_funcionario = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        menu_posicao = new javax.swing.JMenuItem();
        controle_vendas = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu5 = new javax.swing.JMenu();
        trocaUser = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Controle de Estoque");
        setBackground(new java.awt.Color(0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        panel_desktop.setForeground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Usuário Logado:");

        lbNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNome.setForeground(new java.awt.Color(255, 255, 255));
        lbNome.setText("João Lucas");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/conectado.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbNome)
                .addContainerGap(655, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lbNome))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panel_desktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panel_desktopLayout = new javax.swing.GroupLayout(panel_desktop);
        panel_desktop.setLayout(panel_desktopLayout);
        panel_desktopLayout.setHorizontalGroup(
            panel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_desktopLayout.setVerticalGroup(
            panel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_desktopLayout.createSequentialGroup()
                .addGap(0, 353, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 0, 0));
        jMenuBar1.setForeground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setEnabled(false);
        jMenuBar1.setOpaque(true);

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clientes.png"))); // NOI18N
        jMenu1.setText("Clientes");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/novo.png"))); // NOI18N
        jMenuItem1.setText("Controle de Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/funcionarios.png"))); // NOI18N
        jMenu2.setText("Funcionários");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        controle_funcionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        controle_funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/editar.png"))); // NOI18N
        controle_funcionario.setText("Controle de Funcionários");
        controle_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controle_funcionarioActionPerformed(evt);
            }
        });
        jMenu2.add(controle_funcionario);

        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fornecedores.png"))); // NOI18N
        jMenu3.setText("Fornecedores");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fornecedor.png"))); // NOI18N
        jMenuItem3.setText("Controle de Fornecedores");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu6.setForeground(new java.awt.Color(255, 255, 255));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/produtos.png"))); // NOI18N
        jMenu6.setText("Produtos");
        jMenu6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/stock_2.png"))); // NOI18N
        jMenuItem4.setText("Controle de Estoque");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/new-product (1).png"))); // NOI18N
        jMenuItem5.setText("Consulta de Produtos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem5);
        jMenu6.add(jSeparator2);

        jMenuBar1.add(jMenu6);

        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/vendas.png"))); // NOI18N
        jMenu4.setText("Vendas");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/acquisition.png"))); // NOI18N
        jMenuItem6.setText("Abrir PDV");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        menu_posicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/enterMoney.png"))); // NOI18N
        menu_posicao.setText("Posição do dia");
        menu_posicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_posicaoActionPerformed(evt);
            }
        });
        jMenu4.add(menu_posicao);

        controle_vendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cashFlow.png"))); // NOI18N
        controle_vendas.setText("Controle de Vendas");
        controle_vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controle_vendasActionPerformed(evt);
            }
        });
        jMenu4.add(controle_vendas);
        jMenu4.add(jSeparator3);
        jMenu4.add(jSeparator4);

        jMenuBar1.add(jMenu4);

        jMenu5.setForeground(new java.awt.Color(255, 255, 255));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/configuracoes.png"))); // NOI18N
        jMenu5.setText("Configurações");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        trocaUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/newClient.png"))); // NOI18N
        trocaUser.setText("Trocar de Usuário");
        trocaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trocaUserActionPerformed(evt);
            }
        });
        jMenu5.add(trocaUser);

        jMenuBar1.add(jMenu5);

        jMenu7.setForeground(new java.awt.Color(255, 255, 255));
        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clipboard_3034673.png"))); // NOI18N
        jMenu7.setText("Relatórios");
        jMenu7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dinheiro.png"))); // NOI18N
        jMenuItem2.setText("Vendas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem2);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Clientes");
        jCheckBoxMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/allProviders.png"))); // NOI18N
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu7.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu7);

        jMenu8.setForeground(new java.awt.Color(255, 255, 255));
        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ico_sair.png"))); // NOI18N
        jMenu8.setText("Sair");
        jMenu8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_desktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void controle_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controle_funcionarioActionPerformed
        FrmFuncionario funcionario=new FrmFuncionario();
        funcionario.jTabbedPane1.setSelectedIndex(1);
        funcionario.setVisible(true);
    }//GEN-LAST:event_controle_funcionarioActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       this.setExtendedState(this.MAXIMIZED_BOTH);
       lbNome.setText(usuarioLogado);
       this.setVisible(true);
    }//GEN-LAST:event_formWindowActivated

    private void controle_vendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controle_vendasActionPerformed
        FrmHistorico historico=new FrmHistorico();
        historico.setVisible(true);
    }//GEN-LAST:event_controle_vendasActionPerformed

    private void trocaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trocaUserActionPerformed
        FrmLogin login=new FrmLogin();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_trocaUserActionPerformed

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
       
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        FrmProdutos tela=new FrmProdutos();
        tela.jTabbedPane1.setSelectedIndex(0);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmCliente cliente=new FrmCliente();
        cliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       FrmFornecedores fornecedor=new FrmFornecedores();
       fornecedor.jTabbedPane1.setSelectedIndex(1);
       fornecedor.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       FrmVendas vendas=new FrmVendas();
       vendas.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void menu_posicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_posicaoActionPerformed
       FrmTotalVendaPorDia porDia=new FrmTotalVendaPorDia();
       porDia.setVisible(true);
    }//GEN-LAST:event_menu_posicaoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       FrmControleEstoqueProduto controleEstoque=new FrmControleEstoqueProduto();
       controleEstoque.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        int option;
        option=JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?");
        if(option == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
       
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem controle_funcionario;
    public javax.swing.JMenuItem controle_vendas;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JLabel lbNome;
    public javax.swing.JMenuItem menu_posicao;
    private javax.swing.JDesktopPane panel_desktop;
    private javax.swing.JMenuItem trocaUser;
    // End of variables declaration//GEN-END:variables
}
