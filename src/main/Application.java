/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import control.*;
import java.sql.SQLException;
import view.*;
import model.*;

/**
 * This is the application class for the hello world MVC app.
 * @author Nerea Aranguren y Xabier Carnero
 */
public class Application {

    /*
     *     
     * The main method, when launching the application. Creates the controler.
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        ViewFactory vistaFactoria = new ViewFactory();
        ModelFactory modeloFactoria = new ModelFactory();
        
        Controler controlador = null;
        controlador = new Controler();
        
        int opc;
        
        opc = menu();

        
        controlador.run(vistaFactoria.getView(), modeloFactoria.getModel(), opc);
    }
    
    /*
    * The menu to choose the option you want to see
    *
    */

    private static int menu() {

        System.out.println("Dime como quieres ver el saludo?\n1- Texto\n2- Grafico");
        int opc = Utilidades.Utilidades.leerIntNum(1, 2);
        
        return opc;
    }
}
