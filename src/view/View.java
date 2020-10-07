/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 * Contain view methods for being used by a controller.
 * @author Nerea Aranguren y Xabier Carnero
 */
public interface View {
    /**
     * Shows a greeting in UI.
     * @param greeting A String containing the greeting to be shown.
     */
    public void showGreeting(String greeting, int opc);
    
}
