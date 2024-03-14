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
public class TryCatch
{
public static void main(String[] args)
{
    try 
    {
	int[] t = { 1, 2, 3, 4, 5 };
	int n = t[6];
	System.out.println("Cette ligne ne sera jamais atteinte");
    }
    // Ce contexte doit être suivi d'instructions qui indiquent au programme 
    // ce qu'il doit faire en cas d'erreur :
    catch (ArrayIndexOutOfBoundsException exc)
    {
	System.out.println("L'exception a été attrapée");
    }
    System.out.println("Suite du programme...");
}    
}
