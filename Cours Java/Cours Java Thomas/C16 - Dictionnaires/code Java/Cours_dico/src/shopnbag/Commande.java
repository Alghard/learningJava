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
    // lesLignes est un dictionnaire : clé = produit, 
    //                              valeur associée = quantité
		
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

	
	/**
         * Supprime la ligne correspondant au produit passé en paramètre.
         * @param unProduit le produit à supprimer des lignes de la commande.
         */
        public void supprimerLigne(Produit unProduit)
	{
            this.lesLignes.remove(unProduit); 
	}
	
	/**
         * Retourne la quantité du produit unProduit contenue dans les lignes de la commande.
         * @param unProduit le produit dont on veut obtenir la quantité.
         * @return la quantité du produit s'il est présent dans la commande, 0 sinon.
         */
        public int getQuantite(Produit unProduit)
	{
            // si le produit est contenu dans le dictionnaire : retourne la quantité
            if (this.lesLignes.containsKey(unProduit))
                return this.lesLignes.get(unProduit);
            // sinon : retourne 0
            else 
		return 0;
	}
	
        /**
         * Retourne le nombre total d'articles contenus dans les lignes de 
         * la commande.
         * @return le nombre total d'articles de la commande.
         */
        public int getNombreArticles()
        {
            int total = 0;
            // boucle qui parcourt la collection de toutes les valeurs 
            for (int qte : this.lesLignes.values())
            {
                // accumulation dans total
                total += qte;
            }
            return total;
        }
        
        /**
         * Retourne une description complète de la commande.
         * @return la description de la commande
         */
        public String toString()
        {
            String str = "Commande " + id + " " + dateCreation + "\n";
            
            // boucle qui parcourt la collection des clés (= produits)
            for (Produit unProd : lesLignes.keySet())
            {
                // récupère la désignation de chaque produit et sa quantité
                str = str + unProd.getDesignation() + " : " + lesLignes.get(unProd) + "\n";
            }
            
            return str;
        }
        
        /**
         * Retourne le prix total de la commande, c'est à dire le prix de tous 
         * les articles commandés, en tenant compte des quantités.
         * @return le prix total de la commande
         */
        public double getPrixCommande()
        {
            double total = 0;
            
            // boucle qui parcourt la collection des clés (= produits)
            for (Produit unProd : lesLignes.keySet())
            {
                // calcule le prix de cette ligne de commande
                // = prix de vente du produit * sa quantité
                double valeur = unProd.getPrixDeVente() * lesLignes.get(unProd);
                // accumulation dans total
                total += valeur;
            }
            
            return total;
        }
        
        /**
         * Retourne la liste des produits commandés.
         * @return la liste des produits commandés.
         */
        public ArrayList<Produit> getProduitsCommandes()
        {            
            // déclaration et instanciation de la liste des produits
            ArrayList<Produit> liste = new ArrayList<Produit>();
            // parcourt la boucle des clés (= produits)
            for (Produit unProd : lesLignes.keySet())
            {
                // ajoute le produit à la liste
                liste.add(unProd);
            }
            
            return liste;            
        }
        
        /**
         * Retourne des statistiques : le nombre de produits par catégorie de la commande.
         * @return un dictionnaire contenant en clé, la catégorie, et en valeur, le nombre.
         */
        public HashMap<String, Integer> getStatsParCategorie()
        {
            // déclaration et instanciation du dictionnaire
            // clé = catégorie (de type String)
            // valeur = nombre (de type Integer)
            HashMap<String, Integer> stats = new HashMap<String, Integer>(); 
            
            // parcours des clés (= produits)
            for (Produit unProd : lesLignes.keySet())
            {
                // on récupère la catégorie du produit
                String categorie = unProd.getCategorie();
                
                // est-ce qu'elle est déjà présente dans le dictionnaire stats ?
                if (stats.containsKey(categorie))
                {
                    // on récupère le nombre déjà présent dans stats
                    int nbr = stats.get(categorie);
                    // on ajoute +1 au nombre de catégories
                    nbr++;
                    // on remet ce nombre dans stats
                    stats.put(categorie, nbr);
                }
                else
                {
                    // sinon : la catégorie n'est pas présente dans stats
                    // on l'ajoute, avec la valeur 1
                    stats.put(categorie, 1);
                }
            }
            
            return stats;
        }                
}
