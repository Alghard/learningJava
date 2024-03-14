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
public class PlusieursCatch
{
public static void main(String[] args)
{
    int[] t = { 1, 2, 3, 4, 5 };
    int num = 10;
    int den = 0;
    int fraction;
    // on suppose que num, den, t ont été définis et initialisés avant
    try 
    {
	fraction = num / den;
	int n = t[6];
	// autre lignes de code
	// ...
    }
    // Ce contexte doit être suivi d'instructions qui indiquent au programme 
    // ce qu'il doit faire en cas d'erreur :
    catch (ArrayIndexOutOfBoundsException exc)
    {
	// on traite les exceptions de type ArrayIndexOutOfBoundsException
    }
    catch (ArithmeticException exc)
    {
	// on traite les exceptions de type ArithmeticException
    }
    catch(Exception exc)
    {
	// on traite n'importe quelle exception de manière générale
    }
    
    System.out.println("Suite du programme...");	
}        
}
