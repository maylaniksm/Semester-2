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
public class evaluasiEkspresiIT {
    
    public evaluasiEkspresiIT() {
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
     * Test of cekValid method, of class evaluasiEkspresi.
     */
    @Test
    public void testCekValid() {
        System.out.println("cekValid");
        evaluasiEkspresi instance = new evaluasiEkspresi();
        instance.cekValid();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ubahEkspresi method, of class evaluasiEkspresi.
     */
    @Test
    public void testUbahEkspresi_0args() {
        System.out.println("ubahEkspresi");
        evaluasiEkspresi instance = new evaluasiEkspresi();
        String expResult = "";
        String result = instance.ubahEkspresi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ubahEkspresi method, of class evaluasiEkspresi.
     */
    @Test
    public void testUbahEkspresi_String() {
        System.out.println("ubahEkspresi");
        String str = "";
        evaluasiEkspresi instance = new evaluasiEkspresi();
        String expResult = "";
        String result = instance.ubahEkspresi(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasilEvaluasi method, of class evaluasiEkspresi.
     */
    @Test
    public void testHasilEvaluasi() {
        System.out.println("hasilEvaluasi");
        evaluasiEkspresi instance = new evaluasiEkspresi();
        ekspresi expResult = null;
        ekspresi result = instance.hasilEvaluasi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
