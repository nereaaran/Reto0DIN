/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.Model;
import model.ModelFactory;

/**
 *  Implements the methods that are necessary to open a window in JavaFX
 * @author Nerea Aranguren y Xabier Carnero
 */
public class JavaFX extends Application {
    
    public void start(Stage primaryStage) throws SQLException {
       ModelFactory modeloFactoria = new ModelFactory();
       Model model = modeloFactoria.getModel();
        
        
        Button btn = new Button();
        String greeting = null;
        
        greeting = model.getGreeting();
        
        btn.setText(greeting);
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String greeting) {
        launch(greeting);
    }
    
}
