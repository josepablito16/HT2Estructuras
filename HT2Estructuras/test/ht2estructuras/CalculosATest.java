/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht2estructuras;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mafer
 */
public class CalculosATest {
    
    public CalculosATest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of operar method, of class CalculosA.
     */
    @Test
    public void testOperar() {
        System.out.println("operar");
        String expresion = "1 2 + 4 * 3 +";
        CalculosA instance = new CalculosA();
        double expResult = 15;
        double result = instance.operar(expresion);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
