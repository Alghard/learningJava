package Objets.Burotic93;

import java.util.ArrayList;

public class Entrepot {
    // le nom de l’entrepôt
    private String nom;
    // liste des produits stockés
    private ArrayList<Produit> lesProduits = null;
    // Constructeur
    public Entrepot(String unNom)
    {
    this.nom = unNom;
    // instancie la liste des produits :
    lesProduits = new ArrayList<Produit>();
    }
    // ajoute à la liste le produit passé en paramètre
    public void ajouteProduit(Produit unProduit)
    {
    lesProduits.add(unProduit);
    }
    // retourne le nombre de produits de la liste
    public int getNombreProduits()
    {
    return lesProduits.size();
    }
    // version avec boucle for pour retourner sous forme de String la description complete de l'entrepot avec nom et description complete de ses produits
    public String toString()
    {
        String str = "Entrepôt " + nom + "\n";
        for (Produit produit : lesProduits)
        {
            str = str + produit.toString() + "\n";
        }        

        return str;
    }
    // methode pour retourner la quantité totale de produits restants en stock
    public int getQuantiteStockTotale(){
        int stockTotal = 0;
        for (Produit produit : lesProduits){
            stockTotal = stockTotal + produit.getQuantiteStock();
        }     
        return stockTotal;
    }
    // methode recherche de produit dans la liste de l'entrepot a partir de sa reference
    public Produit rechercheProduit(String ref){
        Produit leProduit = null;
        int i = 0;
        boolean trouve = false;
        while (!trouve && i < lesProduits.size()){
            if (ref.equals(lesProduits.get(i).getReference())){
                leProduit = lesProduits.get(i);
                trouve = true;
            }
            i++;
        }
        return leProduit;
    }
    //methode qui retourne la liste de produits en rupture de stock de l'entrepot
    public ArrayList<Produit> getProduitSansStock(){
        //instanci la liste des produits sans stock
        ArrayList<Produit> listeProd = new ArrayList<Produit>();
        //Parcours de la liste de tous les produits
        for (Produit unProduit : lesProduits){
            if (unProduit.getQuantiteStock() == 0){
                listeProd.add(unProduit);
            }
        
        }
        return listeProd;
    }
    //methode qui retourne la liste des produits de l'entrepot qui ont une quantité en stock supérieure au parametre quantiteMini
    public ArrayList<Produit> getProduitEnStock (int quantiteMini){
        //Instanciation de la liste des produits avec quantité specifique
        ArrayList<Produit> listeProd = new ArrayList<Produit>();
        //Parcours de la liste de tous les produits
        for (Produit unProduit : lesProduits){
            if (unProduit.getQuantiteStock() >= quantiteMini){
            listeProd.add(unProduit);
            }
        }
        return listeProd;

    }
}
