/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopnbag;

/**
 * Classe métier représentant un produit commercialisé.
 * @author Mathieu
 */
public class Produit
{
    // atributs privés
    private String ref;
    private String designation;
    private String categorie;
    private double prixDeVente;
	
    /**
     * constructeur.
     * @param ref
     * @param des
     * @param qte
     * @param pri 
     */
    public Produit(String ref, String des, String categ, double pri)
    {
        this.ref = ref;
        this.designation = des;
        this.categorie = categ;
        this.prixDeVente = pri;
    }
	
    /**
     * accesseur
     * @return 
     */
    public String getRef()
    {
        return ref;
    }  
        
    /**
     * accesseur
     * @return 
     */
    public String getDesignation()
    {
        return designation;
    }
    
    /**
     * accesseur
     * @return 
     */
    public String getCategorie()
    {
        return categorie;
    }
    
    /**
     * accesseur
     * @return 
     */
    public double getPrixDeVente()
    {
        return prixDeVente;        
    }
    
    /**
     * toString
     * @return 
     */
    public String toString()
    {
        return this.ref + " " + designation + " " + categorie + " " + prixDeVente;
    }
}
