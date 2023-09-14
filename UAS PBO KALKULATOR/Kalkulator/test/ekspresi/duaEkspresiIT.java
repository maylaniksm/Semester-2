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
public class duaEkspresiIT {
    
    public duaEkspresiIT() {
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
     * Test of getHasil method, of class duaEkspresi.
     */
    @Test
    public void testGetHasil() {
        System.out.println("getHasil");
        duaEkspresi instance = new duaEkspresiImpl();
        double expResult = 0.0;
        double result = instance.getHasil();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class duaEkspresiImpl implements duaEkspresi {

        public double getHasil() {
            return 0.0;
        }
    }
    
}
