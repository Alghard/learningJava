package Objets.Vehicule;

public class ProprioVoiture {

    public static void main(String[] args) {

        Voiture ford = new Voiture();
        ford.demarrer();
        ford.rouler(3);

        VoitureBond bentley = new VoitureBond();
        bentley.demarrer();
        bentley.rouler(3);
    
    }
    
}
