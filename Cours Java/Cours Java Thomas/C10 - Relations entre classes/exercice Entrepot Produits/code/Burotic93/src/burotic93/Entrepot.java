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
public class Entrepot
{
    // attribut nom
    private String nom;
    
    // attribut liste de produits
    private ArrayList<Produit> lesProduits = null;
    
    // constructeur
    public Entrepot(String n)
    {
        this.nom = n; 
        lesProduits = new ArrayList<Produit>();
    }
    
    // ajoute un produit à la liste
    public void ajouteProduit(Produit unProduit)
    {
        lesProduits.add(unProduit);
    }
    
    public int getNombreProduits()
    {
        return lesProduits.size();
    }
    
    public int getQuantiteStockTotale()
    {
        int total = 0;  
        for (Produit produit : lesProduits)
        {
            total = total + produit.getQuantiteStock();
        }
        
        return total;
    }
    
    public String toString()
    {
        String str = "Entrepôt " + nom + "\n";
        for (Produit produit : lesProduits)
        {
            str = str + produit.toString() + "\n";
        }
        
        return str;
    }        
    
public Produit rechercherProduit(String ref)
{
    Produit leProduit = null;

    int i = 0;
    boolean trouve = false;

    while (!trouve && i < lesProduits.size())
    {	    
        if (ref.equals(lesProduits.get(i).getReference()))
        {
            leProduit = lesProduits.get(i);
            trouve = true;
        }
        i++;
    }   
    return leProduit;  
}

    public ArrayList<Produit> getProduitsSansStock()
    {
	// instantication de la liste des produits sans stock
	ArrayList<Produit> listeProd = new ArrayList<Produit>();

	// parcours de la liste de tous les produits
	for (Produit unProduit : lesProduits)
	{
		// si un produit a une quantité en stock à 0, on l'ajoute à la liste
		if (unProduit.getQuantiteStock() == 0)
			listeProd.add(unProduit);
	}

	// on retourne la liste
	return listeProd;
    }
    
    public ArrayList<Produit> getProduitsEnStock(int quantiteMini)
    {
	ArrayList<Produit> listeProd = new ArrayList<Produit>();

	for (Produit unProduit : lesProduits)
	{
		if (unProduit.getQuantiteStock() >= quantiteMini)
			listeProd.add(unProduit);
	}

	return listeProd;
    }



}
