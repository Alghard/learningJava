package Objets.sncf;

public class Program {

    //Méthode main : programme principal
    public static void main(String[] args) {
        //ici le programme principal
        Train unTrain = new Train();

        unTrain.enMarche = true;
        unTrain.demarrer();
        unTrain.vitesse = 15;
        System.out.println("Le train accelere a une vitesse de " + unTrain.vitesse + " km/h");
        unTrain.vitesse = 30;
        System.out.println("Le train accelere a une vitesse de " + unTrain.vitesse + " km/h");
        unTrain.vitesse = 0;
        System.out.println("Le train ralentis pour s'arreter");
        unTrain.stopper();
        unTrain.enMarche = false;
    }
    
}
