/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import view.*;
import model.*;

/**
 * The controller takes the greeting and sends it to the view 
 * 
 * @param view The view chosen
 * @param model The model chosen
 * @param opc The option chosen
 * @author Nerea Aranguren y Xabier Carnero
 */
public class Controler {
    
    public void run(View view, Model model, int opc){
        
        String saludo = null;
        
        saludo = model.getGreeting();
        view.showGreeting(saludo, opc);      
                
    }
    
}
