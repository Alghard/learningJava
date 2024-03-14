package Objets.Burotic93;

public class Program {
    public static void main(String[] args) {

//Entrepot de Marseille
        Entrepot entrepot1 = new Entrepot("Marseille");

        Produit p1 = new Produit("PH01", "photocopieuse", 4500, 1);
        Produit p2 = new Produit("PO01", "portable", 1500, 20);
        Produit p3 = new Produit("EC10", "écran", 300, 25);
        
        entrepot1.ajouteProduit(p1);
        entrepot1.ajouteProduit(p2);
        entrepot1.ajouteProduit(p3);

//2 eme entrepot de Lyon
        Entrepot entrepot2 = new Entrepot("Lyon");

        Produit p4 = new Produit("PH01", "photocopieuse", 4500, 3);
        Produit p5 = new Produit("ENC1", "enceinte", 60, 0);

        entrepot2.ajouteProduit(p4);
        entrepot2.ajouteProduit(p5);

//Bobigny
        Entrepot entrepot3 = new Entrepot("Bobigny");

        Produit p6 = new Produit("PH01", "photocopieuse", 4500, 1);
        Produit p7 = new Produit("SCA1", "scanner", 60, 0);

        entrepot3.ajouteProduit(p6);
        entrepot3.ajouteProduit(p7);

//Instanciation de l'entreprise

        Entreprise entreprise = new Entreprise("Burotic93");

//On ajoute les entrepots a l'entreprise
        entreprise.ajouteEntrepot(entrepot1);
        entreprise.ajouteEntrepot(entrepot2);
        entreprise.ajouteEntrepot(entrepot3);

// Affichage des entrepots de l'entreprise

        System.out.println(entreprise.getLesEntrepots());
        System.out.println(entreprise.getQuantiteStockE());
        System.out.println(entreprise.getStockProduit("azd"));
        System.out.println(entreprise.getProduitsEnRupture());
        p4.setNom("Truc");
        System.out.println(p4.getNom());

    }
    
}
