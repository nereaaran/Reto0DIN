/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Se realiza la prueba del metodo getGreeting perteneciente a la clase modelImplementation
 * @author Nerea Aranguren y Xabier Carnero
 */
public class ModelImplementationTest {
    
    /**
     * Prueba del metodo getGreeting accediendo a la base de datos
     */
    @Test
    public void testGetGreeting() throws Exception {
        System.out.println("getGreeting");
        ModelImplementation instance = new ModelImplementation();
        String expResult = "Holaa Mudooo";
        String result = instance.getGreeting();
        System.out.println(result);
        assertEquals("Los saludos no coinciden", expResult, result);
    }
    
    /*
    * Prueba del metodo getGreeting accediendo al archivo de configuracion
   @Test
    public void testGetGreeting() {
        ModelImplementation modelo = new ModelImplementation();
        String expResult = "Holaaa Mundooooo!";
        String result = modelo.getGreeting();
        assertEquals("Los saludos no coinciden", expResult, result);
    }*/
}
