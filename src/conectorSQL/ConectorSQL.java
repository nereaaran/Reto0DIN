/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectorSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nerea Aranguren y Xabier Carnero
 * Esta clase es la que se conecta con la base de datos SQL
 */
public class ConectorSQL {
    
    private Connection con;
    private PreparedStatement stm;
    
    private String JDBC_DRIVER;
    private String DB_URL;
    private String DB_USER;
    private String DB_PASS;
    
    public ConectorSQL() throws SQLException {
        
        JDBC_DRIVER = "com.mysql.jdbc.Driver";
        DB_URL = "jdbc:mysql://localhost:3306/holamundomvc";
        DB_USER = "root";
        DB_PASS = "abcd*1234";
        
       //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nombrebd","root","abcd*1234");
        
    }
    
        public void conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                //Establecer la conexion con la BD
                con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            } catch (SQLException ex) {
                System.err.print("Error: ConectorBD.conectar()");
                System.err.print("Al intentar la conexion con la BD");
                System.err.print(ex.getMessage());

            }
        } catch (ClassNotFoundException cex) {
            System.err.print("Error: ConectorBD.conectar()");
            System.err.print("No se encontro el Driver de la Conexion con MySQL");
            System.err.print(cex.getMessage());
        }
    }

    public void desconectar() {
        //Desconectarse de la base de datos
        try {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }

        } catch (SQLException sqle) {
            System.err.print("Error: ConectorBD.desconectar");
            System.err.print(sqle.getMessage());

        }
    }
    
    public String getGreeting() throws SQLException{
        //Conseguir el saludo de la base de datos
          ResultSet rs=null;
          String g = null;
        
        this.conectar();
        
        String greeting="select * from hola_mundo";
        stm=con.prepareStatement(greeting);
        rs=stm.executeQuery(greeting);
        
        while (rs.next()) {
            g=rs.getString("HolaMundo");
        }
        
        rs.close();
        
        this.desconectar();
        
        return g;
    }
    
}
