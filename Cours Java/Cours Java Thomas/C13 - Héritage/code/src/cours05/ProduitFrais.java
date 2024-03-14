/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours05;

/**
 *
 * @author Mat
 */
public class ProduitFrais extends Produit
{
    protected int dureeValidite;

    public ProduitFrais() 
    { 
    }

    // on pourra aussi écrire
    public ProduitFrais(String unLibelle, float unPrix, int uneDureeValidite) 
    {                
	// on fait appel au constructeur de la classe mère
	super(unLibelle, unPrix);
	
	System.out.println("(A) Contructeur de ProduitFrais");
	dureeValidite = uneDureeValidite;
	System.out.println("(B) Fin du contructeur de ProduitFrais");
    }
    
    
    
    
    
    
    
    
    
//    public String versChaine()
//    {
//        return "produit frais : " + getLibelle() + " / " + getPrix() + " eur." + " / " + dureeValidite;
//    }

}
