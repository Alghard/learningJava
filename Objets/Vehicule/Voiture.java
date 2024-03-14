package Objets.Vehicule;

public class Voiture {

    public void demarrer(){
        System.out.println("La voiture démarre.");
    }
    
    public void arreter(){
        System.out.println("La voiture s'arrete.");
    }

    public int rouler(int duree){
        int distance = duree * 60;                                                                  //methode calcul de distance
        System.out.println("J'ai parcouru " + distance + " kms en " + duree + " heures.");
        return distance;
    }
}


class VoitureBond extends Voiture{

    public int rouler(int duree){                                                                   //methode calcul distance redefini dans VoitureBond
        int distance = duree * 180;
        System.out.println("Je roule tellement vite, j'ai parcouru " + distance + " kms en " + duree + " heures.");
        return distance;
    }
}