/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burotic93;

/**
 *
 * @author Mat
 */
public class Produit
{
    private String reference;
    private String nom;
    private float prix;
    private int quantiteStock;


    // constructeur sans paramètre
//    public Produit()
//    {    
//    }

    // constructeur avec 4 paramètres
    public Produit(String ref, String nom, float pri, int q)
    {
	    this.reference = ref;
	    this.nom = nom;
	    this.prix = pri;
	    this.quantiteStock = q;
    }
    
    // constructeur sans paramètres
        public Produit()
        {
            this.reference = "inconnue";
            this.nom = "inconnu";
            this.prix = 0f;
            this.quantiteStock = 0;
        }


    // Accesseurs pour reference
    public String getReference()
    {
	    return reference;
    }

    public void setReference(String uneRef)
    {
	    reference = uneRef;
    }

    // Idem pour les autres attributs : 
    // GetLibelle, SetLibelle, GetPrix, SetPrix, GetQteStock, SetQteStock

    // Accesseurs pour nom
    public String getNom()
    {
	    return nom;
    }

    public void setNom(String unNom)
    {
	    nom = unNom;
    }

    public float getPrix()
    {
	    return prix;
    }

    public void setPrix(float unPrix)
    {
	    prix = unPrix;
    }

    public int getQuantiteStock()
    {
	    return quantiteStock;
    }

    public void setQuantiteStock(int q)
    {
	    quantiteStock = q;
    }

  
    // retourne une description du produit sous forme de String
    public String toString()
    {
        return "produit : ref " + this.reference + ", " + this.nom + ", " + this.prix + " eur., qte stock : "
			    + this.quantiteStock;
    }    
}
