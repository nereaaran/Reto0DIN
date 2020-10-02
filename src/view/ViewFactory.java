/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 * 
 * Contains the necesary methods to implement the view
 * @author Nerea Aranguren y Xabier Carnero
 */
public class ViewFactory {
    
    public View getView(){
        
        return new ViewImplementation();
    }
    
}
