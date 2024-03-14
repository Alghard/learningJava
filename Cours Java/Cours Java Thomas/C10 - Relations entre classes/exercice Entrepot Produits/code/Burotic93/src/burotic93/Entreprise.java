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
public class Entreprise 
{
    // nom de l'netreprise
    private String nom;
    
    // liste des entrepots
    private ArrayList<Entrepot> lesEntrepots = null;
    
    // constructeur
    public Entreprise(String n)
    {
        this.nom = n; 
        lesEntrepots = new ArrayList<Entrepot>();
    }
    
    // accesseur pour lesEntrepots
    public ArrayList<Entrepot> getLesEntrepots()
    {
        return lesEntrepots;
    }
    
    // ajoute un entrepôt à la liste
    public void ajouteEntrepot(Entrepot unEntrepot)
    {
        lesEntrepots.add(unEntrepot);
    }
    
    // retourne la quantité totale en stock de tous les produits 
    // de tous les entrepôts
    public int getQuantiteStockE()
    {
        int total = 0;
        
        for (Entrepot ent : lesEntrepots)
            total += ent.getQuantiteStockTotale();
        
        return total;   
    }
    
    // retourne le stock du produit dont la référence est passée en paramètre
    public int getStockProduit(String ref)
    {
        int total = 0;
        
        for (Entrepot ent : lesEntrepots)
        {
            Produit prod = ent.rechercherProduit(ref);
            if (prod != null)
                total += prod.getQuantiteStock();
        }
                    
        return total; 
    }
    
    // retourne la liste des produits en rupture de stock (dans un entrepôt)
    public ArrayList<Produit> getProduitsEnRupture()
    {
        // instantication de la liste des produits sans stock
	ArrayList<Produit> listeProd = new ArrayList<Produit>();

	// parcours de la liste de tous les produits
	for (Entrepot ent : lesEntrepots)
	{
            ArrayList<Produit> liste2 = ent.getProduitsSansStock();
            listeProd.addAll(liste2);
	}

	// on retourne la liste
	return listeProd;
    }
}
