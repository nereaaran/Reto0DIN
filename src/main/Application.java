/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import control.*;
import view.*;
import model.*;

/**
 * This is the application class for the hello world MVC app.
 * @author Nerea Aranguren
 */
public class Application {

    /** 
     *     
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ViewFactory vistaFactoria = new ViewFactory();
        ModelFactory modeloFactoria = new ModelFactory();
        
        Controler controlador = null;
        controlador = new Controler();

        
        controlador.run(vistaFactoria.getView(), modeloFactoria.getModel());
    }
    
}
