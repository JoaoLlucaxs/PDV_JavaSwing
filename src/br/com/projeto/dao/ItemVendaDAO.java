
package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.ItemVenda;
import br.com.projeto.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ItemVendaDAO {
     private Connection con;
    
    public ItemVendaDAO(){
        this.con=new ConnectionFactory().getConnection();
    }
    
    public void cadastraItemVenda(ItemVenda obj){
        try {
            String sql="INSERT INTO tb_itensvendas(venda_id,produto_id,qtd,subtotal) VALUES(?,?,?,?)";
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setInt(1, obj.getVenda().getId());
            statment.setInt(2, obj.getProduto().getId());
            statment.setInt(3,obj.getQuantidade());
            statment.setDouble(4, obj.getSubTotal());
            
            statment.execute();
            statment.close();
            
        } catch (Exception e) {
            System.out.println("Error " + e);
            JOptionPane.showMessageDialog(null, "Error " + e);
        } 
    }
    
    public List<ItemVenda>listandoTabelaDetalhes(int venda_id){
          List<ItemVenda>lista=new ArrayList<>();
         try {
            String sql="SELECT p.descricao,i.qtd,p.preco,i.subtotal FROM tb_itensvendas AS i"
                    + " INNER JOIN tb_produtos AS p ON(i.produto_id = p.id) WHERE i.venda_id =? ";
            
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setInt(1, venda_id);
            
            ResultSet result=statment.executeQuery();
            
            while(result.next()){ //enquanto conseguir percorrer esses obj
                ItemVenda item=new ItemVenda();
                Produto prod=new Produto();
                
                prod.setDescricao(result.getString("p.descricao"));
                item.setQuantidade(result.getInt("i.qtd"));
                prod.setPreco(result.getDouble("p.preco"));
                item.setSubTotal(result.getDouble("i.subtotal"));
                
                item.setProduto(prod);
            }
            return lista;
            
        }catch(Exception e){
             System.out.println("Erro " + e);
        }
       return lista;
    }
}
