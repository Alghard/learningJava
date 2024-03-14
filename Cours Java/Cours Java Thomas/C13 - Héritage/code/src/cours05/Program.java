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
public class Program
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
	Produit produit1 = new Produit("Biscuits", 1);
	
	System.out.println(produit1.versChaine());
	
	ProduitFrais produit2 = new ProduitFrais("beurre", 2, 15);
	
	System.out.println(produit2.versChaine());
	
	System.out.println("");
	ProduitFrais prod = new ProduitFrais("beurre", 2f, 15);
        System.out.println(prod.versChaine());

    }
    
    public static void AfficherProduit(Produit unProduit)
    {
        System.out.println(unProduit.versChaine());
    }
}
