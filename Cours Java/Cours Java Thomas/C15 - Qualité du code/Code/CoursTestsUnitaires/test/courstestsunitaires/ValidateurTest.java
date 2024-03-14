/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courstestsunitaires;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mathieu
 */
public class ValidateurTest
{
    
    public ValidateurTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of calculeLongueur method, of class Validateur.
     */
    @Test
    public void testCalculeLongueur()
    {
        System.out.println("Test unitaire de calculeLongueur");
        String motDePasse = "secret@1";
        Validateur instance = new Validateur();
        int expResult = 7;
        int result = instance.calculeLongueur(motDePasse);
        assertEquals(expResult, result);        
    }


    
}
