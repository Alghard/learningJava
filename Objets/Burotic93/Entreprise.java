package Objets.Burotic93;

import java.util.ArrayList;

public class Entreprise {

    private String nom;
    private ArrayList<Entrepot> lesEntrepots = null;

//Constructeurs avec 1 paramètre
    public Entreprise(String n){
        this.nom = n;
        lesEntrepots = new ArrayList<Entrepot>();       
    }

//Accesseurs 
    public String getNom(){
        return nom;
    }
    public void getNom(String unNom){
        unNom = nom;
    }
    public ArrayList<Entrepot> getLesEntrepots(){
        return lesEntrepots;
    }
//Méthode qui ajoute un entrepot à la liste lesEntrepots
    public void ajouteEntrepot(Entrepot unEntrepot){
        lesEntrepots.add(unEntrepot);
    }

//Méthode qui retourne la quantité en stock de tous les produits de tous les entrepots
    public int getQuantiteStockE(){
        int quantiteStock = 0;
        for (Entrepot entrepot : lesEntrepots){
            quantiteStock = quantiteStock + entrepot.getQuantiteStockTotale();
        }
        return quantiteStock;
    }

//Méthode qui retourne la quantité totale en stock dans tous les entrepots d'un produit dont la référence est passée en parametre
    public int getStockProduit(String ref){
        int total = 0;
        for (Entrepot ent : lesEntrepots){
            Produit prod = ent.rechercheProduit(ref);
            if (prod != null)
                total = total + prod.getQuantiteStock();
        }
        return total;
    }

//Méthode qui retourne la liste de tous les produits en rupture de stock (les produits qui ont un stock égal à 0, dans au moins un entrepot)
    public ArrayList<Produit> getProduitsEnRupture(){
        ArrayList<Produit> listeproduit = new ArrayList<Produit>();         //instanciation de la liste de produits dans stock
        for (Entrepot ent : lesEntrepots){                                  //parcours de la liste de tous les produits
            ArrayList<Produit> prod = ent.getProduitSansStock();
            listeproduit.addAll(prod);
        }
        return listeproduit;

    }    
}
