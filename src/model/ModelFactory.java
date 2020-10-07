/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * Contains the necesary methods to implement the model
 * @author Nerea Aranguren y Xabier Carnero
 */
public class ModelFactory {
    
    public Model getModel(){
        
        return new ModelImplementation();
    }
    
}
