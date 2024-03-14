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
public class TryCatch2
{
    public static void main(String[] args)
    {
	int fraction;
	try 
	{
	    int num = 10;
	    int den = 0;
	    fraction = num / den;

	    System.out.println("Cette ligne ne sera jamais atteinte");
	}
	// Ce contexte doit être suivi d'instructions qui indiquent au programme 
	// ce qu'il doit faire en cas d'erreur :
	catch (ArithmeticException exc)
	{
	    System.out.println("Une erreur est survenue :");
	    // on affiche le message encapsulé par l'exception
	    //System.out.println(exc.getMessage());
	    exc.printStackTrace();
	    fraction = 0;
	}
	//System.out.println("Suite du programme...");
    }    
}
