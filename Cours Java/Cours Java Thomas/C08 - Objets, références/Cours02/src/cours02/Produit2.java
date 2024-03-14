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
public class Produit2 
{
    
    private static int nbProduits = 0;                // champ à portée classe
    
    private String libelle;
    private int prix;
    private int qtStock = 0;

    public Produit2(String l, int p, int q)
    {
        this.libelle = l;
        this.prix = p;
        this.qtStock = q;
    }

    public Produit2()   //constructeur sans paramètre ou constructeur par défaut
    {
        this.libelle = "";
        this.prix = 0;
        this.qtStock = 0;
    }

    
    public String getLibelle()
    {
        return this.libelle;
    }
    public int getPrix()
    {
        return this.prix;
    }
    public int getStock()
    {
        return this.qtStock;
    }
    
    public void setStock(int s)
    {
    this.qtStock = s; 
    }
    public void setPrix(int a)
    {
    this.prix = a ;
    }
    
    public int valeurStock()
    {
    return this.prix * this.qtStock; 
    }

    public void destocker(int sortie)
    {
    this.qtStock -= sortie;
    }

    public static int getNbProduit()                  // méthode à portée classe
    {
    return Produit2.nbProduits;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Produit p = new Produit2();
        Produit2 p = new Produit2("marteau", 12, 100);
        
        String lib = p.getLibelle();
        System.out.println(lib);
        System.out.println(p.getStock());
        
        p.setStock ( 100 );
        
        //Produit unProduit = new Produit2();
        //Produit unAutreProduit = unProduit;
        
    }
    
}
