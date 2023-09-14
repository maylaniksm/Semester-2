/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspresi;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class ekspresiIT {
    
    public ekspresiIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setNilai method, of class ekspresi.
     */
    @Test
    public void testSetNilai() {
        System.out.println("setNilai");
        double x = 0.0;
        ekspresi instance = new ekspresi();
        instance.setNilai(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNilai method, of class ekspresi.
     */
    @Test
    public void testGetNilai() {
        System.out.println("getNilai");
        ekspresi instance = new ekspresi();
        double expResult = 0.0;
        double result = instance.getNilai();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHasil method, of class ekspresi.
     */
    @Test
    public void testGetHasil() {
        System.out.println("getHasil");
        ekspresi instance = new ekspresi();
        double expResult = 0.0;
        double result = instance.getHasil();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
