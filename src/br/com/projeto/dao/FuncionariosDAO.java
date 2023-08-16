
package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Funcionario;
import br.com.projeto.view.FrmMenu;
import br.com.projeto.view.FrmVendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FuncionariosDAO {
     private Connection con;
    
    public FuncionariosDAO(){
        this.con=new ConnectionFactory().getConnection();
    }
    
    public void cadastrarFuncionario(Funcionario obj){
        try {
            String sql="INSERT INTO tb_funcionarios(nome,rg,cpf,email,senha,cargo,nivel_acesso,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setString(1, obj.getNome());
            statment.setString(2, obj.getRg());
            statment.setString(3, obj.getCpf());
            statment.setString(4,obj.getEmail());
            statment.setString(5,obj.getSenha());
            statment.setString(6,obj.getCargo());
            statment.setString(7,obj.getNivel_acesso());
            statment.setString(8, obj.getTelefone());
            statment.setString(9, obj.getCelular());
            statment.setString(10, obj.getCep());
            statment.setString(11, obj.getEndereco());
            statment.setInt(12, obj.getNumero());
            statment.setString(13, obj.getComplemento());
            statment.setString(14, obj.getBairro());
            statment.setString(15, obj.getCidade());
            statment.setString(16, obj.getEstado());
            
            statment.execute();
            statment.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
        }
    }
    
     public List<Funcionario> listarFuncionarios(){
        try {
            List<Funcionario>lista=new ArrayList<>();
            String sql="SELECT * FROM tb_funcionarios";
            PreparedStatement statment=con.prepareStatement(sql);
            ResultSet result=statment.executeQuery();
            
            while(result.next()){ //enquanto conseguir percorrer esses obj
                Funcionario obj=new Funcionario();
                obj.setId(result.getInt("id"));
                obj.setNome(result.getString("nome"));
                obj.setRg(result.getString("rg"));
                obj.setCpf(result.getString("cpf"));
                obj.setEmail(result.getString("email"));
                obj.setSenha(result.getString("senha"));
                obj.setCargo(result.getString("cargo"));
                obj.setNivel_acesso(result.getString("nivel_acesso"));
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
     
       public void alterarFuncionario(Funcionario obj){
        try {
            String sql="UPDATE tb_funcionarios SET nome=?,rg=?,cpf=?,email=?,senha=?,cargo=?,nivel_acesso=?,telefone=?,celular=?,cep=?,endereco=?,"
                    + "numero=?,complemento=?,bairro=?,cidade=?,estado=? WHERE id=?";
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setString(1, obj.getNome());
            statment.setString(2, obj.getRg());
            statment.setString(3, obj.getCpf());
            statment.setString(4,obj.getEmail());
            
            statment.setString(5,obj.getSenha());
            statment.setString(6,obj.getCargo());
            statment.setString(7,obj.getNivel_acesso());
            
            statment.setString(8, obj.getTelefone());
            statment.setString(9, obj.getCelular());
            statment.setString(10, obj.getCep());
            statment.setString(11, obj.getEndereco());
            
            statment.setInt(12, obj.getNumero());
            statment.setString(13, obj.getComplemento());
            statment.setString(14, obj.getBairro());
            statment.setString(15, obj.getCidade());
            statment.setString(16, obj.getEstado());
            statment.setInt(17, obj.getId());
            
            statment.execute();
            statment.close();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
        }
    }
    
    public void excluirFuncionario(Funcionario obj){
        try {
            String sql="DELETE FROM tb_funcionarios WHERE id=?";
             
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setInt(1, obj.getId());
            
            statment.execute();
            statment.close();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
        }
    }
    
    public Funcionario consultarFuncionarioPorNome(String nome){
        try {
            String sql="SELECT * FROM tb_funcionarios WHERE nome=?";
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setString(1, nome);
            ResultSet result=statment.executeQuery();
             Funcionario obj=new Funcionario();
             
             if(result.next()){ //enquanto conseguir percorrer esses obj
                obj.setId(result.getInt("id"));
                obj.setNome(result.getString("nome"));
                obj.setRg(result.getString("rg"));
                obj.setCpf(result.getString("cpf"));
                obj.setEmail(result.getString("email"));
                obj.setSenha(result.getString("senha"));
                obj.setCargo(result.getString("cargo"));
                obj.setNivel_acesso(result.getString("nivel_acesso"));
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
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado");
            System.out.println("Erro " + e);
            return null;
        }
    }
    
     public List<Funcionario> listarFuncionariosPorNome(String nome){
        try {
            List<Funcionario>lista=new ArrayList<>();
            String sql="SELECT * FROM tb_funcionarios WHERE nome LIKE ?";
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setString(1, nome);
            ResultSet result=statment.executeQuery();
            
            while(result.next()){ //enquanto conseguir percorrer esses obj
                Funcionario obj=new Funcionario();
                obj.setId(result.getInt("id"));
                obj.setNome(result.getString("nome"));
                obj.setRg(result.getString("rg"));
                obj.setCpf(result.getString("cpf"));
                obj.setEmail(result.getString("email"));
                obj.setSenha(result.getString("senha"));
                obj.setCargo(result.getString("cargo"));
                obj.setNivel_acesso(result.getString("nivel_acesso"));
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
     
     public void efetuaLogin(String email,String senha){
         try {
             String sql="SELECT * FROM tb_funcionarios WHERE email=? and senha=?";
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setString(1, email);
            statment.setString(2, senha);
            ResultSet result=statment.executeQuery();
            
            if(result.next()){
                
                if(result.getString("nivel_acesso").equals("Administrador")){
                 JOptionPane.showMessageDialog(null, "Seja bem vindo ao sistema!");
                 FrmMenu tela=new FrmMenu();
                 tela.usuarioLogado=result.getString("nome");
                 tela.setVisible(true);
                 tela.setLocationRelativeTo(null);
                 
                }else if(result.getString("nivel_acesso").equals("Usuário")){
                 JOptionPane.showMessageDialog(null, "Seja bem vindo ao sistema!");
                 FrmMenu tela=new FrmMenu();
                 FrmVendas telaVenda=new FrmVendas();
                 
                 tela.usuarioLogado=result.getString("nome");
                 
                 tela.menu_posicao.setEnabled(false);
                 tela.controle_vendas.setEnabled(false);
                 tela.controle_funcionario.setEnabled(false);
                 
                 
                 
                 tela.setVisible(true);
                 tela.setLocationRelativeTo(null);
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
                new FrmMenu().setVisible(true);
            }
         } catch (Exception e) {
             System.out.println("Erro " + e);
             e.printStackTrace();
         }
     }
}
