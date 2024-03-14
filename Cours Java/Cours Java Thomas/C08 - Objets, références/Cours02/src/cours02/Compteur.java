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
public class Compteur
{
    private int valeur = 0;

    public void incremente()
    {
	valeur++;
    }

    public int getValeur()
    {
	return valeur;
    }
    
    public static void main(String[] args)
    {
	Compteur compteur1 = new Compteur();
	compteur1.incremente();
	compteur1.incremente();
	compteur1.incremente();
	System.out.println("le compteur 1 vaut : " + compteur1.getValeur());

	Compteur compteur2 = new Compteur();
	compteur2.incremente();
	System.out.println("le compteur 2 vaut : " + compteur2.getValeur());

    }    
}
