/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopnbag;

//import java.util.Collection;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Set;

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
//        HashMap<String, Integer> panier = new HashMap<String, Integer>();
//        
//        panier.put("orange", 5);
//        panier.put("citron", 1);
//        panier.put("pomme", 6);
//        panier.put("poire", 3);
//
//        //System.out.println(panier.get("orange"));
//        
//        //panier.put("orange", 10);
//        
//        //System.out.println(panier.get("orange"));
//        
////        panier.replace("orange", 11);
////        System.out.println(panier.get("orange"));
////        panier.remove("orange");
////        System.out.println(panier);
//        
//        //panier.size();
//        
//        // cles
//        Collection<String> listeCles = panier.keySet();
//        for (String cle : listeCles)
//        {
//            System.out.println(cle);
//        }
//                
//        // values
//        Collection<Integer> valeurs = panier.values();
//        for (int valeur : valeurs)
//        {
//            System.out.println(valeur);
//        }
//        
        // affichage des cles et valeurs
//        for (String cle : panier.keySet())
//        {
//            System.out.println("cle : " + cle + " ; valeur : " + panier.get(cle));
//        }
//
//        
//        panier.clear();
//        System.out.println(panier);
//        
//        System.out.println("\n");
        
        
        // EXO 3
        
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

        System.out.println("*** Lignes de commande ***");
        System.out.println( commande.getLesLignes() );

        // suppression d'une ligne
        //commande.supprimerLigne(p2);
        //commande.ajouterLigne(p2, 2);
        
        System.out.println("*** toString ***");
        System.out.println( commande.toString() );     
        
        System.out.println("*** Quantité du produit p3 ***");
        System.out.println( commande.getQuantite(p3) );
        
        System.out.println("*** Nombre d'articles ***");
        System.out.println( commande.getNombreArticles() );
        
        System.out.println("*** Prix de la commande ***");
        System.out.println( commande.getPrixCommande() );
        
        System.out.println("*** Produits commandés ***");
        System.out.println( commande.getProduitsCommandes() );
        
        System.out.println("*** Statistiques par catégorie ***");
        System.out.println( commande.getStatsParCategorie());
                
    }    
}
