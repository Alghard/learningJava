/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopnbag;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Classe métier représentant une commande.
 * @author Mathieu
 */
public class Commande
{
    private int id;
    private String dateCreation;	
    private HashMap<Produit, Integer> lesLignes; 
    // lesLignes est un dictionnaire : clé = un produit, 
    //                              valeur associée = une quantité
		
    /**
     * Crée une instance de classe Commande
     * @param id l'id de commande
     * @param date la date de commande
     */
    public Commande(int id, String date)
    {
        // valorisation des attributs
	this.id = id;
        this.dateCreation = date;
	// instanciation du dictionnaire
	this.lesLignes = new HashMap<Produit, Integer>();		
    }
	

	/**
	 * Fournit la liste des lesLignes de la commande sous forme de dictionnaire
 en clé, l'instance de produit, en valeur, la quantité commandée
	 * @return	liste des lesLignes de commande 
	*/
	public HashMap<Produit, Integer> getLesLignes() 
        {
            return this.lesLignes;
	}

	/**
	 * Ajoute une ligne de commande à l'instance de commande courante
	 * Si le produit figure déjà dans une ligne de commande, la quantité demandée
	 * remplace la quantité actuelle.
	 * @param	unProd : instance de classe Produit
	 * @param	uneQte : nombre de produits commandés 
	*/
	public void ajouterLigne(Produit unProd, int uneQte)
	{
            this.lesLignes.put(unProd, uneQte);				
	}

	// METHODES A CODER
	
	/**
         * Supprime la ligne correspondant au produit passé en paramètre.
         * @param unProduit le produit à supprimer des lignes de la commande.
         */
        //public void supprimerLigne(Produit unProduit)
	/
	
	/**
         * Retourne la quantité du produit unProduit contenue dans les lignes de la commande.
         * @param unProduit le produit dont on veut obtenir la quantité.
         * @return la quantité du produit s'il est présent dans la commande, 0 sinon.
         */
        // public int getQuantite(Produit unProduit)
	
	
        /**
         * Retourne le nombre total d'articles contenus dans les lignes de 
         * la commande.
         * @return le nombre total d'articles de la commande.
         */
        // public int getNombreArticles()
        
        
        /**
         * Retourne une description complète de la commande.
         * @return la description de la commande
         */
        // public String toString()
        
        
        /**
         * Retourne le prix total de la commande, c'est à dire le prix de tous 
         * les articles commandés, en tenant compte des quantités.
         * @return le prix total de la commande
         */
        // public double getPrixCommande()
       
        
        /**
         * Retourne la liste des produits commandés.
         * @return la liste des produits commandés.
         */
        // public ArrayList<Produit> getProduitsCommandes()
       
        
        /**
         * Retourne des statistiques : le nombre de produits par catégorie de la commande.
         * @return un dictionnaire contenant en clé, la catégorie, et en valeur, le nombre.
         */
        // public HashMap<String, Integer> getStatsParCategorie()
    
                
}
