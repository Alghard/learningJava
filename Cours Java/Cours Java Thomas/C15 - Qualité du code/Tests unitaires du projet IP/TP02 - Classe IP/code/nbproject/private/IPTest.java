/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fretiere_m
 */
public class IPTest {
    
    public IPTest() {
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
     * Test of versChaine method, of class IP.
     */
    @Test
    public void testVersChaine() {
        System.out.println("versChaine");
        IP instance = new IP(5,6,7,1);
        String expResult = "5.6.7.1";
        String result = instance.versChaine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getClasse method, of class IP.
     */
    @Test
    public void testGetClasse() {
        System.out.println("getClasse");
        IP ip1 = new  IP(20, 17, 4, 0);                 // instance de test
        char expResult = 'A';                           // valeur attendue
        char result = ip1.getClasse();
        assertEquals(expResult, result);
        
        IP ip2 = new IP(127, 0, 0, 1);
        expResult = 'x';
        result = ip2.getClasse();
        assertEquals(expResult, result);
        
        IP ip3 = new IP(191, 5, 10, 1);
        expResult = 'B';
        result = ip3.getClasse();
        assertEquals(expResult, result);

    }

    /**
     * Test of getAdresseReseau method, of class IP.
     */
    @Test
    public void testGetAdresseReseau() {
        System.out.println("getAdresseReseau");
        IP instance = new IP(172,16,1,1);
        IP expResult = new IP(172,16,0,0);
        IP result = instance.getAdresseReseau();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of estMemeReseau method, of class IP.
     */
    @Test
    public void testEstMemeReseau() {
        System.out.println("estMemeReseau");
        IP ip = new IP(193,168,1,5);
        IP instance = new IP(193,168,1,100);
        boolean expResult = true;
        boolean result = instance.estMemeReseau(ip);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of saisir method, of class IP.
     */
    @Test
    public void testSaisir() {
        System.out.println("saisir");
        IP expResult = null;
        IP result = null;  // IP.saisir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class IP.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        //IP.main(args);
        assertEquals(true, true);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
