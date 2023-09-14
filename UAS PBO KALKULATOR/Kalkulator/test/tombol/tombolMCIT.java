/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombol;

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
public class tombolMCIT {
    
    public tombolMCIT() {
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
     * Test of Push method, of class tombolMC.
     */
    @Test
    public void testPush() {
        System.out.println("Push");
        double x = 0.0;
        tombolMC.Push(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Pop method, of class tombolMC.
     */
    @Test
    public void testPop() {
        System.out.println("Pop");
        double expResult = 0.0;
        double result = tombolMC.Pop();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Clear method, of class tombolMC.
     */
    @Test
    public void testClear() {
        System.out.println("Clear");
        tombolMC.Clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
