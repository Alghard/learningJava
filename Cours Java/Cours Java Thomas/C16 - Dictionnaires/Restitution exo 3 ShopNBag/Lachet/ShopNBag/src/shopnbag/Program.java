/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopnbag;

/**
 *
 * @author LACHET Quentin
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // instanciation des produits
	Produit p1 = new Produit("SACM", "sac à main", "sac", 80);
	Produit p2 = new Produit("CEIN", "ceinture", "accessoire", 25);
	Produit p3 = new Produit("ETIQ", "étiquette", "accessoire", 3);
	Produit p4 = new Produit("SACD", "sac à dos", "sac", 140);
	Produit p5 = new Produit("PORT", "portefeuille", "accessoire", 30);

	// instanciation de la commande
	Commande commande = new Commande(1, "30-03-2021");

	// ajout des produits à la commande
	commande.ajouterLigne(p1, 1);
	commande.ajouterLigne(p2, 2);
	commande.ajouterLigne(p3, 5);
	commande.ajouterLigne(p4, 1);
	commande.ajouterLigne(p5, 1);        

	System.out.println( commande.getLesLignes() );
        
        System.out.println(commande.toString());
        
        System.out.println("Le prix total de la commande est de : "+commande.getPrixCommande()+" €.");
        
        System.out.println(commande.getProduitsCommandes());
        
        System.out.println(commande.getStatsParCategorie());
    }
    
}
