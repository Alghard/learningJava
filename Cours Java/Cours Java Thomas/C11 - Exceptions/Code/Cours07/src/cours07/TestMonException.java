/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours07;

/**
 *
 * @author Mat
 */
public class TestMonException
{
    public static void main(String[] args)
    {
	try
	{
	    MonException exc = new MonException("Ma propre exception !");
            throw exc;            
	}
	catch (MonException exc)
	{
	    System.out.println(exc.getMessage());
	}
    }	
}
