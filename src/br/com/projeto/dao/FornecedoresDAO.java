
package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Cliente;
import java.sql.Connection;
import br.com.projeto.model.Fornecedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FornecedoresDAO {
     private Connection con;
    
    public FornecedoresDAO(){
        this.con=new ConnectionFactory().getConnection();
    }
    
    public void cadastrarFornecedores(Fornecedor obj){
        try{
            String sql="INSERT INTO tb_fornecedores(nome,cnpj,email,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
           PreparedStatement statment=con.prepareStatement(sql);
            statment.setString(1, obj.getNome());
            statment.setString(2, obj.getCnpj());
            statment.setString(3,obj.getEmail());
            statment.setString(4, obj.getTelefone());
            statment.setString(5, obj.getCelular());
            statment.setString(6, obj.getCep());
            statment.setString(7, obj.getEndereco());
            statment.setInt(8, obj.getNumero());
            statment.setString(9, obj.getComplemento());
            statment.setString(10, obj.getBairro());
            statment.setString(11, obj.getCidade());
            statment.setString(12, obj.getEstado());
            
            statment.execute();
            statment.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
        }catch(SQLException e){
            JOptionPane.showConfirmDialog(null, "Erro verifique a classe corretamente");
            System.out.println("erro" + e);
        }
    }
    
     public void alterarFornecedor(Fornecedor obj){
        try {
            String sql="UPDATE tb_fornecedores SET nome=?,cnpj=?,email=?,telefone=?,celular=?,cep=?,endereco=?,"
                    + "numero=?,complemento=?,bairro=?,cidade=?,estado=? WHERE id=?";
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setString(1, obj.getNome());
            statment.setString(2, obj.getCnpj());
            statment.setString(3,obj.getEmail());
            statment.setString(4, obj.getTelefone());
            statment.setString(5, obj.getCelular());
            statment.setString(6, obj.getCep());
            statment.setString(7, obj.getEndereco());
            statment.setInt(8, obj.getNumero());
            statment.setString(9, obj.getComplemento());
            statment.setString(10, obj.getBairro());
            statment.setString(11, obj.getCidade());
            statment.setString(12, obj.getEstado());
            statment.setString(13, String.valueOf(obj.getId()));
            
            statment.execute();
            statment.close();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");
        } catch (SQLException erro) {
            System.out.println("erro " + erro);
            JOptionPane.showMessageDialog(null, "Erro" + erro);
        }
    }
    
    public void excluirFornecedor(Fornecedor obj){
        try {
            String sql="DELETE FROM tb_fornecedores WHERE id=?";
             
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setInt(1, obj.getId());
            
            statment.execute();
            statment.close();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
        }
    }
    
    public List<Fornecedor> listarFornecedores(){
        try {
            List<Fornecedor>lista=new ArrayList<>();
            String sql="SELECT * FROM tb_fornecedores";
            PreparedStatement statment=con.prepareStatement(sql);
            ResultSet result=statment.executeQuery();
            
            while(result.next()){ //enquanto conseguir percorrer esses obj
               Fornecedor obj=new Fornecedor();
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
                obj.setEstado(result.getString("estado"));
                
                lista.add(obj);
            }
            return lista;
            
        } catch (Exception erro) {
           JOptionPane.showMessageDialog(null, "Erro" + erro);
           return null;
        }
    }
    
    public Fornecedor consultarPorNome(String nome){
        try {
            String sql="SELECT * FROM tb_fornecedores WHERE nome=?";
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setString(1, nome);
            ResultSet result=statment.executeQuery();
             Fornecedor obj=new Fornecedor();
             
             if(result.next()){ //enquanto conseguir percorrer esses obj
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
                obj.setEstado(result.getString("estado"));
               
            }
             return obj;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fornecedor não encontrado");
            return null;
        }
    }
    
     public List<Fornecedor> listarFornecedoresPorNome(String nome){
        try {
            List<Fornecedor>lista=new ArrayList<>();
            String sql="SELECT * FROM tb_fornecedores WHERE nome LIKE ?";
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setString(1, nome);
            ResultSet result=statment.executeQuery();
            
            while(result.next()){ //enquanto conseguir percorrer esses obj
                Fornecedor obj=new Fornecedor();
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
                obj.setEstado(result.getString("estado"));
                
                lista.add(obj);
            }
            return lista;
            
        } catch (Exception erro) {
           JOptionPane.showMessageDialog(null, "Erro" + erro);
           return null;
        }
    }
     
}
