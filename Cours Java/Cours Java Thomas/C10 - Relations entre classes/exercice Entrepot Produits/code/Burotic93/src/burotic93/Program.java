/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burotic93;

import java.util.ArrayList;

/**
 *
 * @author Mathieu
 */
public class Program
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Entrepôt de Marseille
        Entrepot unEntrepot = new Entrepot("Marseille");
        
        Produit p1 = new Produit("PHO1", "photocopieuse", 4500, 1);
        Produit p2 = new Produit("PO01", "portable", 1500, 20);
        Produit p3 = new Produit("EC10", "écran", 300, 25);
        
        unEntrepot.ajouteProduit(p1);
        unEntrepot.ajouteProduit(p2);
        unEntrepot.ajouteProduit(p3);
        
        // System.out.println(unEntrepot.getNombreProduits());   
        
        // Lyon
        Entrepot entrepot2 = new Entrepot("Lyon");
        
        Produit p4 = new Produit("PHO1", "photocopieuse", 4500, 3);
        Produit p5 = new Produit("ENC1", "enceinte", 60, 0);        
        
        entrepot2.ajouteProduit(p4);
        entrepot2.ajouteProduit(p5);
             
        // Bobigny
        Entrepot entrepot3 = new Entrepot("Bobigny");
        
        Produit p6 = new Produit("PHO1", "photocopieuse", 4500, 1);
        Produit p7 = new Produit("SCA1", "scanner", 60, 0);        
        
        entrepot3.ajouteProduit(p6);
        entrepot3.ajouteProduit(p7);
        
        // instanciation de l'Entreprise
        Entreprise entreprise = new Entreprise("Burotic93");
        
        // on ajoute les entrepôt à l'entreprise :        
        entreprise.ajouteEntrepot(unEntrepot);
        entreprise.ajouteEntrepot(entrepot2);
        entreprise.ajouteEntrepot(entrepot3);
        
        // affichage des entrepôts :
        System.out.println( entreprise.getLesEntrepots() ); 
        
        System.out.println(entreprise.getQuantiteStockE());
        
        System.out.println(entreprise.getStockProduit("ZZZ"));
        System.out.println(entreprise.getStockProduit("PHO1"));
        
        System.out.println(entreprise.getProduitsEnRupture());
    }
    
}
