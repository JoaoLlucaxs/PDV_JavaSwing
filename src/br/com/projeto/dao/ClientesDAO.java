
package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Cliente;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClientesDAO {
    
    private Connection con;
    
    public ClientesDAO(){
        this.con=new ConnectionFactory().getConnection();
    }
    
    public void cadastrarCliente(Cliente obj){
        try {
            String sql="INSERT INTO tb_clientes(nome,rg,cpf,email,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setString(1, obj.getNome());
            statment.setString(2, obj.getRg());
            statment.setString(3, obj.getCpf());
            statment.setString(4,obj.getEmail());
            statment.setString(5, obj.getTelefone());
            statment.setString(6, obj.getCelular());
            statment.setString(7, obj.getCep());
            statment.setString(8, obj.getEndereco());
            statment.setInt(9, obj.getNumero());
            statment.setString(10, obj.getComplemento());
            statment.setString(11, obj.getBairro());
            statment.setString(12, obj.getCidade());
            statment.setString(13, obj.getEstado());
            
            statment.execute();
            statment.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
        }
    }
    
    public void alterarCliente(Cliente obj){
        try {
            String sql="UPDATE tb_clientes SET nome=?,rg=?,cpf=?,email=?,telefone=?,celular=?,cep=?,endereco=?,"
                    + "numero=?,complemento=?,bairro=?,cidade=?,estado=? WHERE id=?";
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setString(1, obj.getNome());
            statment.setString(2, obj.getRg());
            statment.setString(3, obj.getCpf());
            statment.setString(4,obj.getEmail());
            statment.setString(5, obj.getTelefone());
            statment.setString(6, obj.getCelular());
            statment.setString(7, obj.getCep());
            statment.setString(8, obj.getEndereco());
            statment.setInt(9, obj.getNumero());
            statment.setString(10, obj.getComplemento());
            statment.setString(11, obj.getBairro());
            statment.setString(12, obj.getCidade());
            statment.setString(13, obj.getEstado());
            statment.setString(14, String.valueOf(obj.getId()));
            
            statment.execute();
            statment.close();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
        }
    }
    
    public void excluirCliente(Cliente obj){
        try {
            String sql="DELETE FROM tb_clientes WHERE id=?";
             
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setInt(1, obj.getId());
            
            statment.execute();
            statment.close();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
        }
    }
    
    public List<Cliente> listarClientes(){
        try {
            List<Cliente>lista=new ArrayList<>();
            String sql="SELECT * FROM tb_clientes";
            PreparedStatement statment=con.prepareStatement(sql);
            ResultSet result=statment.executeQuery();
            
            while(result.next()){ //enquanto conseguir percorrer esses obj
                Cliente cliente=new Cliente();
                cliente.setId(result.getInt("id"));
                cliente.setNome(result.getString("nome"));
                cliente.setRg(result.getString("rg"));
                cliente.setCpf(result.getString("cpf"));
                cliente.setEmail(result.getString("email"));
                cliente.setTelefone(result.getString("telefone"));
                cliente.setCelular(result.getString("celular"));
                cliente.setCep(result.getString("cep"));
                cliente.setEndereco(result.getString("endereco"));
                cliente.setNumero(result.getInt("numero"));
                cliente.setComplemento(result.getString("complemento"));
                cliente.setBairro(result.getString("bairro"));
                cliente.setCidade(result.getString("cidade"));
                cliente.setEstado(result.getString("estado"));
                
                lista.add(cliente);
            }
            return lista;
            
        } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "Erro" + erro);
           return null;
        }
    }
    
    public Cliente consultarPorNome(String nome){
        try {
            String sql="SELECT * FROM tb_clientes WHERE nome=?";
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setString(1, nome);
            ResultSet result=statment.executeQuery();
             Cliente cliente=new Cliente();
             
             if(result.next()){ //enquanto conseguir percorrer esses obj
                cliente.setId(result.getInt("id"));
                cliente.setNome(result.getString("nome"));
                cliente.setRg(result.getString("rg"));
                cliente.setCpf(result.getString("cpf"));
                cliente.setEmail(result.getString("email"));
                cliente.setTelefone(result.getString("telefone"));
                cliente.setCelular(result.getString("celular"));
                cliente.setCep(result.getString("cep"));
                cliente.setEndereco(result.getString("endereco"));
                cliente.setNumero(result.getInt("numero"));
                cliente.setComplemento(result.getString("complemento"));
                cliente.setBairro(result.getString("bairro"));
                cliente.setCidade(result.getString("cidade"));
                cliente.setEstado(result.getString("estado"));
               
            }
             return cliente;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado");
            return null;
        }
    }
    
     public Cliente consultarPorCPFCaixa(String cpf){
        try {
            String sql="SELECT * FROM tb_clientes WHERE cpf=?";
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setString(1, cpf);
            ResultSet result=statment.executeQuery();
             Cliente cliente=new Cliente();
             
             if(result.next()){ //enquanto conseguir percorrer esses obj
                cliente.setId(result.getInt("id"));
                cliente.setNome(result.getString("nome"));
                cliente.setRg(result.getString("rg"));
                cliente.setCpf(result.getString("cpf"));
                cliente.setEmail(result.getString("email"));
                cliente.setTelefone(result.getString("telefone"));
                cliente.setCelular(result.getString("celular"));
                cliente.setCep(result.getString("cep"));
                cliente.setEndereco(result.getString("endereco"));
                cliente.setNumero(result.getInt("numero"));
                cliente.setComplemento(result.getString("complemento"));
                cliente.setBairro(result.getString("bairro"));
                cliente.setCidade(result.getString("cidade"));
                cliente.setEstado(result.getString("estado"));
            }else{
                 
             }
             return cliente;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado");
            return null;
        }
    }
    
     public List<Cliente> listarClientesPorNome(String nome){
        try {
            List<Cliente>lista=new ArrayList<>();
            String sql="SELECT * FROM tb_clientes WHERE nome LIKE ?";
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setString(1, nome);
            ResultSet result=statment.executeQuery();
            
            while(result.next()){ //enquanto conseguir percorrer esses obj
                Cliente cliente=new Cliente();
                cliente.setId(result.getInt("id"));
                cliente.setNome(result.getString("nome"));
                cliente.setRg(result.getString("rg"));
                cliente.setCpf(result.getString("cpf"));
                cliente.setEmail(result.getString("email"));
                cliente.setTelefone(result.getString("telefone"));
                cliente.setCelular(result.getString("celular"));
                cliente.setCep(result.getString("cep"));
                cliente.setEndereco(result.getString("endereco"));
                cliente.setNumero(result.getInt("numero"));
                cliente.setComplemento(result.getString("complemento"));
                cliente.setBairro(result.getString("bairro"));
                cliente.setCidade(result.getString("cidade"));
                cliente.setEstado(result.getString("estado"));
                
                lista.add(cliente);
            }
            return lista;
            
        } catch (Exception erro) {
           JOptionPane.showMessageDialog(null, "Erro" + erro);
           return null;
        }
    }
     
     
   
}
