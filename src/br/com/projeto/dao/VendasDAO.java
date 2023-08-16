
package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Cliente;
import br.com.projeto.model.Vendas;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class VendasDAO {
     private Connection con;
    
    public VendasDAO(){
        this.con=new ConnectionFactory().getConnection();
    }
    
    public void cadastrarVenda(Vendas obj){
        try {
            String sql="INSERT INTO tb_vendas(cliente_id,data_venda,total_venda,observacoes) VALUES(?,?,?,?)";
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setInt(1, obj.getCliente().getId());
            statment.setString(2, obj.getData_venda());
            statment.setDouble(3,obj.getTotal_venda());
            statment.setString(4, obj.getObservacoes());
            
            statment.execute();
            statment.close();
            
            
        } catch (Exception e) {
            System.out.println("erro " + e);
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
    }
    
    public int retornaultimaVenda(){
        try {
            int idvenda=0;
            String sql="SELECT MAX(id) id FROM tb_vendas";
            PreparedStatement statment=con.prepareStatement(sql);
            
            ResultSet result=statment.executeQuery();
            if(result.next()){
                Vendas venda=new Vendas();
                venda.setId(result.getInt("id"));
                
                idvenda=venda.getId();
            }
            return idvenda;
            
        } catch (SQLException e) {
            throw  new RuntimeException();
        }
    }
    
       public List<Vendas> listarVendasPorData(LocalDate data_inicio,LocalDate data_fim){
        try {
            List<Vendas> lista=new ArrayList<>();
            
            String sql="SELECT v.id,date_format(v.data_venda,'%d/%m/%Y') as data_formatada,c.nome,v.total_venda,v.observacoes FROM tb_vendas AS v"
                    + " INNER JOIN tb_clientes AS c ON (v.cliente_id=c.id) WHERE v.data_venda BETWEEN ? AND ?";
           
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setString(1, data_inicio.toString());
            statment.setString(2, data_fim.toString());
            
            ResultSet result=statment.executeQuery();
            
            while(result.next()){
               Vendas obj=new Vendas();
               Cliente cliente=new Cliente();
                
               obj.setId(result.getInt("v.id"));
               obj.setData_venda(result.getString("data_formatada"));
               cliente.setNome(result.getString("c.nome"));
               obj.setTotal_venda(result.getDouble("v.total_venda"));
               obj.setObservacoes(result.getString("v.observacoes"));
              
               obj.setCliente(cliente);
               lista.add(obj);
            }
            return lista;
         
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro verifique");
            System.out.println("erro " + e);
        }
         return null;
    }
      
    public double retornaTotalVendanoDia(LocalDate data_venda){
        try {
            double totalvenda=0;
            
            String sql="SELECT SUM(total_venda) AS total FROM tb_vendas WHERE data_venda=?";
            PreparedStatement statment=con.prepareStatement(sql);
            statment.setString(1, data_venda.toString());
            
            ResultSet result=statment.executeQuery();
            
            if(result.next()){
                totalvenda=result.getDouble("total");
            }
            return totalvenda;
        } catch (SQLException e) {
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Erro!");
        }
         return 0;
    }
    
    
}
