/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import view.*;
import model.*;

/**
 *  
 * @author xabig
 */
public class Controler {
    
    public void run(View view, Model model){
        
        String saludo = null;
        
        saludo = model.getGreeting();
        view.showGreeting(saludo);
                
                
    }
    
}
