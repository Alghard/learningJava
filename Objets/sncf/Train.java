package Objets.sncf;                            //le paquetage de la classe

public class Train {

    //Attributs
    int vitesse = 0;
    boolean enMarche = false;

    //méthodes (ou fonctions)
    void demarrer() {
        System.out.println("Démarrage");
    }

    void stopper() {
        System.out.println("Arrêt");
    }
    
}
