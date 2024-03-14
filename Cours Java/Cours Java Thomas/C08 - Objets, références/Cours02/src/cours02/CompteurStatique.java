/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours02;

/**
 *
 * @author Mat
 */
public class CompteurStatique
{
    public static int compteur = 0;
    
    public static void main(String[] args)
    {
	CompteurStatique.compteur++;
	CompteurStatique.compteur++;
	CompteurStatique.compteur++;
	CompteurStatique.compteur++;
	CompteurStatique.compteur++;
        
	System.out.println("le compteur vaut : " + CompteurStatique.compteur);
        
        CompteurStatique c = new CompteurStatique();
        System.out.println("le compteur vaut : " + c.compteur);
    }
}
