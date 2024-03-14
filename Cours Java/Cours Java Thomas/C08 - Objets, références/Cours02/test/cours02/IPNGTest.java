/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours02;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Mathieu
 */
public class IPNGTest {
    
    public IPNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of setOctet1 method, of class IP.
     */
    @Test
    public void testSetOctet1() {
        System.out.println("setOctet1");
        int o1 = 0;
        IP instance = new IP();
        instance.setOctet1(o1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOctet2 method, of class IP.
     */
    @Test
    public void testSetOctet2() {
        System.out.println("setOctet2");
        int o2 = 0;
        IP instance = new IP();
        instance.setOctet2(o2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOctet3 method, of class IP.
     */
    @Test
    public void testSetOctet3() {
        System.out.println("setOctet3");
        int o3 = 0;
        IP instance = new IP();
        instance.setOctet3(o3);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOctet4 method, of class IP.
     */
    @Test
    public void testSetOctet4() {
        System.out.println("setOctet4");
        int o4 = 0;
        IP instance = new IP();
        instance.setOctet4(o4);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of versChaine method, of class IP.
     */
    @Test
    public void testVersChaine() {
        System.out.println("versChaine");
        IP instance = new IP();
        String expResult = "";
        String result = instance.versChaine();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getClasse method, of class IP.
     */
    @Test
    public void testGetClasse() {
        System.out.println("getClasse");
        IP instance = new IP(192,168,1,1);
        char expResult = 'C';
        char result = instance.getClasse();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAdresseReseau method, of class IP.
     */
    @Test
    public void testGetAdresseReseau() {
        System.out.println("getAdresseReseau");
        IP instance = new IP();
        IP expResult = null;
        IP result = instance.getAdresseReseau();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of estMemeReseau method, of class IP.
     */
    @Test
    public void testEstMemeReseau() {
        System.out.println("estMemeReseau");
        IP ip = null;
        IP instance = new IP();
        boolean expResult = false;
        boolean result = instance.estMemeReseau(ip);
        assertEquals(result, expResult);
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
        IP result = null; //IP.saisir();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class IP.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        //IP.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
