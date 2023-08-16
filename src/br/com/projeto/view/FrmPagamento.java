
package br.com.projeto.view;

import br.com.projeto.dao.ItemVendaDAO;
import br.com.projeto.dao.ProdutosDAO;
import br.com.projeto.dao.VendasDAO;
import br.com.projeto.model.Cliente;
import br.com.projeto.model.ItemVenda;
import br.com.projeto.model.Produto;
import br.com.projeto.model.Vendas;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmPagamento extends javax.swing.JFrame {
    
    Cliente client=new Cliente();
    DefaultTableModel carrinho;
    
    public FrmPagamento() {
        initComponents();
        txtCartao.setText("0.0");
        txtCheque.setText("0.0");
        txtTroco.setText("0.0");
    }
 
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDinheiro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCartao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCheque = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTroco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnFinalizar = new br.com.projeto.util.jButtonOutline();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        txtDesconto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTaxa = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        recibo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Pagamentos");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pagamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DINHEIRO");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CARTÃO");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CHEQUE");

        txtCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChequeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TROCO");

        txtTroco.setEditable(false);
        txtTroco.setBackground(new java.awt.Color(153, 153, 153));
        txtTroco.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTroco.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TOTAL");

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(153, 153, 153));
        txtTotal.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 255, 255));

        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("FINALIZAR");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("OBS.:");

        txtObs.setBackground(new java.awt.Color(204, 204, 204));
        txtObs.setColumns(20);
        txtObs.setRows(5);
        jScrollPane1.setViewportView(txtObs);

        txtDesconto.setEditable(false);
        txtDesconto.setBackground(new java.awt.Color(153, 153, 153));
        txtDesconto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtDesconto.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Desconto");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Taxa");

        txtTaxa.setEditable(false);
        txtTaxa.setBackground(new java.awt.Color(153, 153, 153));
        txtTaxa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTaxa.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtTotal))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTaxa, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel8)))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(txtTaxa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(160, 160, 160))
        );

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORMAS DE PAGAMENTO ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(303, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(188, 188, 188))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        recibo.setBackground(new java.awt.Color(255, 255, 255));
        recibo.setColumns(20);
        recibo.setForeground(new java.awt.Color(51, 51, 51));
        recibo.setRows(5);
        jScrollPane2.setViewportView(recibo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // TODO add your handling code here:
        double cartao,cheque,dinheiro,totalPago,totalVenda,troco;
        
        cartao=Double.parseDouble(txtCartao.getText());
        cheque=Double.parseDouble(txtCheque.getText());
        dinheiro=Double.parseDouble(txtDinheiro.getText());
        
        totalVenda=Double.parseDouble(txtTotal.getText());
        totalPago=cartao + cheque + dinheiro;
        
        troco=totalPago - totalVenda;
        txtTroco.setText(String.valueOf(troco));
        
        Vendas vend=new Vendas();
        vend.setCliente(client);
        
        Date date=new Date();
        SimpleDateFormat sdfEUA=new SimpleDateFormat("yyyy-MM-dd");
        String dataFormt=sdfEUA.format(date);
        vend.setData_venda(dataFormt);
        
        vend.setTotal_venda(totalVenda);
        
        vend.setObservacoes(txtObs.getText());
        
        VendasDAO dao_v=new VendasDAO();
        dao_v.cadastrarVenda(vend);
        
        vend.setId(dao_v.retornaultimaVenda());
        //System.out.println("Ultima venda " + vend.getId());
        
       
        for(int i=0;i<carrinho.getRowCount();i++){
            int qtd_estoqueAtual,qtd_comprado,qtd_estoqueAtualizado;
                    
                    
            Produto objp=new Produto();
            ProdutosDAO dao_produto=new ProdutosDAO();
            
            
            ItemVenda item=new ItemVenda();
            item.setVenda(vend);
            
            objp.setId(Integer.parseInt(carrinho.getValueAt(i, 0).toString()));
            item.setProduto(objp);
            
            item.setQuantidade(Integer.parseInt(carrinho.getValueAt(i, 2).toString()));
            
            item.setSubTotal(Double.parseDouble(carrinho.getValueAt(i, 4).toString()));
            
            
            qtd_estoqueAtual=dao_produto.retornandoEstoqueAtual(objp.getId());
            qtd_comprado=Integer.parseInt(carrinho.getValueAt(i, 2).toString());
            qtd_estoqueAtualizado=qtd_estoqueAtual - qtd_comprado;
            
            if(qtd_estoqueAtual < qtd_comprado){
                  JOptionPane.showMessageDialog(null, "Estoque ultrapassado!");
            }else{
                dao_produto.darBaixaNoEstoque(objp.getId(), qtd_estoqueAtualizado);
                  ItemVendaDAO daoItem=new ItemVendaDAO();
                daoItem.cadastraItemVenda(item);
                JOptionPane.showMessageDialog(null, "Venda realizada com sucesso!");
            }
        } 
      
    }//GEN-LAST:event_btnFinalizarActionPerformed

      public void reciboDaCompra(){
        recibo.setText("      SISTEMA CAIXA\n");
        recibo.setText(recibo.getText()+ "   Rua C, 89,\n");
        recibo.setText(recibo.getText()+ "  Santo Antônio de Jesus, BA\n");
        recibo.setText(recibo.getText()+ "   (75)988764532\n");
        recibo.setText(recibo.getText()+ "--------------------------------------------------\n");
        recibo.setText(recibo.getText()+ "Item \t Qtd \t Preço \n");
        recibo.setText(recibo.getText()+ "---------------------------------------------------\n");
        
        /*DefaultTableModel dtableModel=(DefaultTableModel).getModel();
        for(int i=0; i < tabCaixa.getRowCount(); i++){
            String itemNome=dtableModel.getValueAt(i, 1).toString();
            String qtdItem=dtableModel.getValueAt(i, 2).toString();
            String precoItem=dtableModel.getValueAt(i, 4).toString();
            recibo.setText(recibo.getText()+ itemNome + "\t" + qtdItem + "\t" + precoItem + "\n");
        }*/
        
          recibo.setText(recibo.getText()+ "---------------------------------------------------\n");
          //recibo.setText(recibo.getText()+ "Subtotal:\t" + subtTotal.getText() + "\n");
          recibo.setText(recibo.getText()+ "Taxa:\t" + txtTaxa.getText() + "\n");
          recibo.setText(recibo.getText()+ "Desconto:\t" + txtDesconto.getText() + "\n");
          recibo.setText(recibo.getText()+ "-------------------------------------------------------\n");
          recibo.setText(recibo.getText()+ "Total:\t" + txtTotal.getText() + "\n");
          recibo.setText(recibo.getText()+ "Valor Recebido:\t" + txtDinheiro.getText() + "\n");
          recibo.setText(recibo.getText()+ "Troco:\t" + txtTroco.getText() + "\n");
          recibo.setText(recibo.getText()+ "-----------------------------------------------------------\n");
          
          Date dataAtualDaCompra=new Date();
          SimpleDateFormat data=new SimpleDateFormat("MM/dd/yyyy");
          SimpleDateFormat timer=new SimpleDateFormat("hh:mm:ss");
          
          String dataFormat=data.format(dataAtualDaCompra);
          String timeFormat=timer.format(dataAtualDaCompra);
          
          recibo.setText(recibo.getText()+ "Data:" + dataFormat + " \tHorário: " + timeFormat + "\n");
          recibo.setText(recibo.getText()+ "*************************************\n");
          recibo.setText(recibo.getText()+ "PDV Sistema AGRADECE PELA PREFERÊNCIA!\n");
          recibo.setText(recibo.getText()+ "**************************************\n");
           recibo.setText(recibo.getText()+ "Software Back-end Java - João Queiroz");
    }
    
    
    private void txtChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChequeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChequeActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.projeto.util.jButtonOutline btnFinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea recibo;
    private javax.swing.JTextField txtCartao;
    private javax.swing.JTextField txtCheque;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtDinheiro;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JTextField txtTaxa;
    public javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTroco;
    // End of variables declaration//GEN-END:variables
}
