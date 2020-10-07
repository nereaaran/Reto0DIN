/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;

/**
 * Contain model methods for being used by a controller.
 * @author Nerea Aranguren y Xabier Carnero
 */
public interface Model {
    /**
     * Gets a greeting from de model.
     * @return The greeting containing variable.
     */
    public String getGreeting() throws SQLException;
    
}
