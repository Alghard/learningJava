package Objets;
public class exoObjetGilles {

    public static void main(String[] args) {
        Voiture ford = new Voiture();
        ford.start();
        Moto honda = new Moto();
        honda.start();
        Velo noName = new Velo();
        noName.start();
        Homme gilles = new Homme();
        gilles.uriner();
        gilles.chier();
        Femme camille = new Femme();
        camille.uriner();
        camille.chier();
    }
    
}

class Machine {
    void start(){
        System.out.println("Je tourne la clé pour démarrer.");                  //Heritage
    }

}

class Voiture extends Machine {

}

class Velo extends Machine {
    @Override
    void start(){                                                                 //Polymorphisme
        System.out.println("Je commence à pédaler.");                           
    }


}

class Moto extends Machine {


}

class Humain {
    void uriner(){
        System.out.println("Je pisse debout.");
    }
    void chier(){
        System.out.println("Je fais un bon gros paté");
    }
}

class Homme extends Humain {

}

class Femme extends Humain {
    @Override
    void uriner(){
        System.out.println("Je pisse assise.");
    }
    @Override
    void chier(){
        System.out.println("Je fais des paillettes");
    }
}