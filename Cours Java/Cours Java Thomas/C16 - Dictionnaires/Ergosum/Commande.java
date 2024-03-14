/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours_dico;

import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author Mathieu
 */
public class Commande
{
    private int id;
    private Date dateCreation;	
    private HashMap lignes; 
    // lignes est un dictionnaire : clé = un produit, 
    //                              valeur associée = une quantité
		
    /**
     * Crée une instance de classe Commande
     * @param id l'id de commande
     * @param date la date de commande
     */
    public Commande(int id, Date date)
    {
        // valorisation des attributs
	this.id = id;
        this.dateCreation = date;
	// instanciation du dictionnaire
	this.lignes = new HashMap<Produit, Integer>();		
    }
	

	/**
	 * Fournit la liste des lignes de la commande sous forme de dictionnaire
	 * en clé, l'instance de produit, en valeur, la quantité commandée
	 * @return	liste des lignes de commande 
	*/
	public HashMap getLignes() 
        {
            return this.lignes;
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
            this.lignes.put(unProd, uneQte);				
	}

	/**
	 * Supprime la ligne correspondant au produit.
	*/
	public void supprimerLigne(Produit unProd)
	{
            this.lignes.remove(unProd); 
	}
	
	public int getQuantite(Produit unProd)
	{
            if (this.lignes.containsKey(unProd))
                return (int) this.lignes.get(unProd);
            else 
		return 0;
	}
	
        public int getQuantiteArticles()
        {
            int total = 0;
            for (Object qte : this.lignes.values())
            {
                int qteInt = (int)qte;
                total += qteInt;
            }
            return total;
        }
        
}
