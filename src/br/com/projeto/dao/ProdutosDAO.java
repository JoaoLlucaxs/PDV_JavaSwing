
package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Fornecedor;
import br.com.projeto.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutosDAO {
     private Connection con;
     
    public ProdutosDAO(){
        this.con=new ConnectionFactory().getConnection();
    }
    
    public void cadastrarProdutos(Produto obj){
        try {
             String sql="INSERT INTO tb_produtos(descricao,preco,qtd_estoque,for_id) values(?,?,?,?)";
             PreparedStatement statment=con.prepareStatement(sql);
             statment.setString(1, obj.getDescricao());
             statment.setDouble(2, obj.getPreco());
             statment.setInt(3, obj.getQtd_estoque());
             statment.setInt(4, obj.getFornecedor().getId());
             
             statment.execute();
             statment.close();
             
             JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error "+e);
        }
    }
        
    
    
    public void alterarProduto(Produto obj){
        try {
            String sql="UPDATE tb_produtos SET descricao=?,preco=?,qtd_estoque=?,for_id=? WHERE id=?";
             PreparedStatement statment=con.prepareStatement(sql);
             statment.setString(1, obj.getDescricao());
             statment.setDouble(2, obj.getPreco());
             statment.setInt(3, obj.getQtd_estoque());
             statment.setInt(4, obj.getFornecedor().getId());
             
             statment.setInt(5, obj.getId());
             
             statment.execute();
             statment.close();
             
             JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
            System.out.println("erro " + e);
        }
    }
    
    public void excluir(Produto obj){
        try {
            String sql="DELETE FROM tb_produtos WHERE id=?";
            PreparedStatement statment=con.prepareStatement(sql);
            
            statment.setInt(1, obj.getId());
            
            statment.execute();
            statment.close();
            
            JOptionPane.showMessageDialog(null, "Produto excluido com sucesso!");
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir");
            System.out.println("erro " + e);
        }
    }
    
    /*public Fornecedor consultarFornecedorPorNome(String nome){
        try {
            String sql="SELECT * FROM tb_fornecedores WHERE nome=?";
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setString(1, nome);
            
            ResultSet result=statment.executeQuery();
            Fornecedor obj=new Fornecedor();
            
            while(result.next()){
                obj.setId(result.getInt("id"));
                obj.setNome(result.getString("nome"));
                obj.setCnpj(result.getString("cnpj"));
                obj.setEmail(result.getString("email"));
                obj.setTelefone(result.getString("telefone"));
                obj.setCelular(result.getString("celular"));
                obj.setCep(result.getString("cep"));
                obj.setEndereco(result.getString("endereco"));
                obj.setNumero(result.getInt("numero"));
                obj.setComplemento(result.getString("complemento"));
                obj.setBairro(result.getString("bairro"));
                obj.setCidade(result.getString("cidade"));
               
            }
            return obj;
        } catch (Exception e) {
            System.out.println("erro " + e);
            JOptionPane.showMessageDialog(null, "Fornecedor não encontrado");
        }
         return null;
    }*/
    
   
   
      public List<Produto> listarProdutosNaTabela(){
        try {
            List<Produto> produto=new ArrayList<>();
            
            String sql="SELECT p.id,p.descricao,p.preco,p.qtd_estoque, f.nome FROM tb_produtos AS p "
                    + "INNER JOIN tb_fornecedores AS f ON (for_id=f.id)";
           
            PreparedStatement statment=con.prepareStatement(sql);
            ResultSet result=statment.executeQuery();
            
            while(result.next()){
                Produto obj=new Produto();
                Fornecedor f=new Fornecedor();
                
               obj.setId(result.getInt("p.id"));
               obj.setDescricao(result.getString("p.descricao"));
               obj.setPreco(result.getDouble("p.preco"));
               obj.setQtd_estoque(result.getInt("p.qtd_estoque"));
               
               f.setNome(result.getString("f.nome"));
               
               obj.setFornecedor(f);
               produto.add(obj);
            }
            return produto;
         
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro verifique");
            System.out.println("erro " + e);
        }
         return null;
    }
      
       /*  public Produto consultarPorNome(String nome){
        try {
            String sql="SELECT * FROM tb_produtos WHERE nome=?";
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setString(1, nome);
            ResultSet result=statment.executeQuery();
            
            Produto obj=new Produto();
             
             if(result.next()){ //enquanto conseguir percorrer esses obj
                obj.setId(result.getInt("id"));
                obj.setDescricao(result.getString("descricao"));
                obj.setPreco(result.getDouble("preco"));
                obj.setQtd_estoque(result.getInt("qtd_estoque"));
                
                Fornecedor ff=new Fornecedor();
               obj.setFornecedor(ff);
               
            }
             return obj;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado");
            return null;
        }
    }*/
         
          public List<Produto> listarProdutosPesquisa(String nome){
        try {
            List<Produto> produto=new ArrayList<>();
            
            String sql="SELECT p.id,p.descricao,p.preco,p.qtd_estoque, f.nome FROM tb_produtos AS p "
                    + "INNER JOIN tb_fornecedores AS f ON (for_id=f.id) WHERE p.descricao LIKE ?";
           
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setString(1, nome);
            ResultSet result=statment.executeQuery();
            
            while(result.next()){
                Produto obj=new Produto();
                Fornecedor f=new Fornecedor();
                
               obj.setId(result.getInt("p.id"));
               obj.setDescricao(result.getString("p.descricao"));
               obj.setPreco(result.getDouble("p.preco"));
               obj.setQtd_estoque(result.getInt("p.qtd_estoque"));
               
               f.setNome(result.getString("f.nome"));
               
               obj.setFornecedor(f);
               produto.add(obj);
            }
            return produto;
         
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro verifique");
            System.out.println("erro " + e);
        }
         return null;
    }
          
       public Produto buscaProdutoPorDescricao(String nome){
             try {
               
                  String sql="SELECT p.id,p.descricao,p.preco,p.qtd_estoque, f.nome FROM tb_produtos AS p "
                  + "INNER JOIN tb_fornecedores AS f ON (for_id=f.id) WHERE p.descricao= ?";
           
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setString(1, nome);
            ResultSet result=statment.executeQuery();
            Produto obj=new Produto();
            Fornecedor f=new Fornecedor();
            if(result.next()){
               obj.setId(result.getInt("p.id"));
               obj.setDescricao(result.getString("p.descricao"));
               obj.setPreco(result.getDouble("p.preco"));
               obj.setQtd_estoque(result.getInt("p.qtd_estoque"));
               
               f.setNome(result.getString("f.nome"));
               
               obj.setFornecedor(f);
            }
                return obj;
                
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado");
            System.out.println("erro " + e);
            return null;
        }
    }
       
       public Produto buscaProdutoPorCodigoCaixa(int id){
             try {
                  String sql="SELECT * FROM tb_produtos WHERE id=?";
                  
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setInt(1, id);
            ResultSet result=statment.executeQuery();
            Produto obj=new Produto();
            
            if(result.next()){
               obj.setId(result.getInt("id"));
               obj.setDescricao(result.getString("descricao"));
               obj.setPreco(result.getDouble("preco"));
               
            }
                return obj;
                
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado");
            System.out.println("erro " + e);
            return null;
        }
    }
       
    public void darBaixaNoEstoque(int id,int qtd_nova){
        try {
            String sql="UPDATE tb_produtos SET qtd_estoque=? WHERE id=?";
            PreparedStatement statment=con.prepareStatement(sql);
            
            statment.setInt(1, qtd_nova);
            statment.setInt(2, id);
            statment.execute();
            statment.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    public int retornandoEstoqueAtual(int id){
        try {
            int qtd_estoque=0;
            String sql="SELECT qtd_estoque FROM tb_produtos WHERE id=?";
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setInt(1, id);
            
              ResultSet result=statment.executeQuery();
              
              if(result.next()){
                  Produto produto=new Produto();
                 
                  qtd_estoque=(result.getInt("qtd_estoque"));
              } 
            return qtd_estoque;
            
        } catch (SQLException e) {
           throw new RuntimeException(e);
        }
    }
    
    public void adicionarQuantidadeNoEstoque(int id, int qtd_nova){
        try {
            String sql="UPDATE tb_produtos SET qtd_estoque=? WHERE id=?";
            PreparedStatement statment=con.prepareStatement(sql);
            
            statment.setInt(1, qtd_nova);
            statment.setInt(2, id);
            
            statment.execute();
            statment.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro " + e);
        }
    }
}
