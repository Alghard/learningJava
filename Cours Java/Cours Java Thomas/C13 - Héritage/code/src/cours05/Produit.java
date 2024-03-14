/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours05;

/**
 *
 * @author Mat
 */
public class Produit
{
    private String libelle;
    private float prix;

    public Produit()
    {
    }

    public Produit(String unLibelle, float unPrix)
    {
        System.out.println("(1) Contructeur de produit");
	
	libelle = unLibelle;
        prix = unPrix;
	
	System.out.println("(2) Fin du contructeur de produit");
    }

    public String getLibelle()
    {
        return libelle;
    }

    public void setLibelle(String unLibelle)
    { 
        libelle = unLibelle; 
    }

    public float getPrix()
    {
        return prix;
    }

    public void setPrix(float unPrix)
    {
        prix = unPrix;
    }
    
    public String versChaine()
    {
        return "produit : " + libelle + " / " + prix + " eur.";
    }    
}
