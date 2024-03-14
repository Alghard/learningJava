/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopnbag;

/**
 * Classe représantant un produit.
 * @author LACHET Quentin
 */
public class Produit
{
    // attributs privés
    private String reference;
    private String designation;
    private String categorie;
    private double prixDeVente;

    // Constructeur vide
    
    public Produit()
    {
        
    }
    
    // constructeur
    
    public Produit(String ref, String des, String cat, double prix) 
    {   

    this.reference = ref;
    this.designation = des;
    this.categorie = cat;
    this.prixDeVente = prix;
    
    }
        
    // accesseurs
    
    public void setReference(String ref)
    {
        reference = ref;
    }
    
    public void setDesignation(String des)
    {
        designation = des;
    }
    
     public void setCategorie(String cat)
    {
        categorie = cat;
    }
     
      public void setPrixDeVente(double prix)
    {
        prixDeVente = prix;
    }
      
      //modificateurs
      
    public String getRef() 
    {
        return reference;
    }

    public String getDesignation() 
    {
        return designation;
    }

    public String getCategorie() 
    {
        return categorie;
    }

    public double getPrixDeVente() 
    {
        return prixDeVente;
    }
    
    // toString
    
    public String toString()
    {
        String produit;
        
        produit = "Ce produit a pour référence : "+getRef()+" avec la désignation : "+getDesignation()+" et la catégorie : "+getCategorie()+ " et son prix de vente est : "+getPrixDeVente();
        
        return produit;
    }

    
}


