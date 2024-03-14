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
public class Produit 
{    
    // attribut statique (à portée classe)
    private static int nbProduits = 0;                
    
    String libelle;
    
    public Produit(String libelle)   //constructeur sans paramètre ou constructeur par défaut
    {        
        this.libelle = libelle;
    }

    // méthode statique
    public static void ajouterAuStock(int quantite)
    {
        Produit.nbProduits = Produit.nbProduits + quantite;
    }
    
    // méthode statique
    public static int getNbProduit()                  // méthode à portée classe
    {
        return Produit.nbProduits;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Produit p = new Produit2();
        //Produit p = new Produit("marteau");
        
        ajouterAuStock(20);
        ajouterAuStock(80);
        System.out.println( Produit.getNbProduit() );
        
    }
    
}
