
package br.com.projeto.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return  DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdvendas?useSSL=false&serverTimezone=UTC",
                    "root",
                    "36320600");
        } catch (Exception error) {
            throw new RuntimeException(error);
        }
    };
}
