
package br.unimontes.ccet.dcc.pg1.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


public class DBSingleton {
    private Connection conexao;
    private static DBSingleton instancia = null;
    
   private DBSingleton()throws SQLException{
        conexao = DriverManager.getConnection("jdbc:postgresql:Escola","postgres","22072003");
    }
    
    public static DBSingleton getInstancia()throws SQLException{
        if(instancia == null)
            instancia = new DBSingleton();
            return instancia;
        
    }
    public Connection getConexao(){
        return conexao;
    }
    public void close()throws SQLException{
        conexao.close();
    }
}
