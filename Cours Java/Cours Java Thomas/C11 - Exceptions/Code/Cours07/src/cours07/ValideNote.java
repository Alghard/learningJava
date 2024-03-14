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
public class ValideNote
{
public static void main(String[] args)
{
    try
    {
	System.out.println("appel de ValideNote");
    
	valideNote(25);
    
	System.out.println("fin du programme");
    }
    catch (Exception exc)
    {
	System.out.println(exc.getMessage());
    }
}	
   
    /**
     * Valide une note en vérifiant qu'elle est comprise entre 0 et 20 (inclus).
     * @param note la note à valider
     * @throws Exception l'exception levée si la note est invalide
     */
    public static void valideNote(int note) throws Exception
    {
        if (note < 0)
                throw new Exception("Note invalide (négative) : " + note);
	if (note > 20)
		throw new Exception("Note invalide (trop grande) : " + note);
    }
       
    
            

}
