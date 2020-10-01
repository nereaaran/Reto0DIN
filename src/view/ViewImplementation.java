/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * View implementation to show greeting in a text type UI.
 * @author Nerea Aranguren
 */
public class ViewImplementation implements View{
     /**
     * Shows a greeting in UI.
     * 
     * @param greeting A String containing the greeting to be shown.
     */
    @Override
    public void showGreeting(String greeting){
        String[] args = null;
        System.out.println(greeting);
        
        JFrame grafico = new JFrame("Hola Mundo!");
        JLabel texto = new JLabel(greeting, JLabel.CENTER);
        
        grafico.setSize(400, 300);
        grafico.setVisible(true);
        grafico.setLocationRelativeTo(null);
        grafico.add(texto);
  
        
        //launch(args);
        
    }
    /*public void start (Stage primaryStage){
        Button boton = new Button();
        boton.setText("Hola Mund00oo!!");
        
        StackPane pane = new StackPane();
        pane.getChildren().add(boton);
        
        Scene ventana = new Scene(pane, 680, 400);
        
        primaryStage.setScene(ventana);
        primaryStage.show();
        
        System.out.println("Entro!");
    }
    
     public static void main(String[] args) {
        launch(args);
    }*/
    
}
