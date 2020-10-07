/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import conectorSQL.ConectorSQL;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * Model implementation to get greeting to be shown.
 * 
 * @author Nerea Aranguren y Xabier Carnero
 */
public class ModelImplementation implements Model{
   
    /*
    * Implementacion con archivo de propiedades
    public String getGreeting(){
        
        ResourceBundle miDato = ResourceBundle.getBundle("data.propertiesFile");
        String aux = miDato.getString("auxiliar");
       
        return aux;
    }
    */
    
    public String getGreeting() throws SQLException { 
        
        ConectorSQL bd = new ConectorSQL();
        String greeting;
            
        greeting = bd.getGreeting();
        
        return greeting;
    }
}