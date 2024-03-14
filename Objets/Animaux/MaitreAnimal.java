package Objets.Animaux;

public class MaitreAnimal {

    public static void main(String[] args) {

        String reactionAnimal;

        AnimalFamilier oiseau = new AnimalFamilier();                   //La classe MaîtreAnimal est la classe appelante ; elle commence par créer une instance de l'objet AnimalFamilier. Elle déclare une variable oiseau et utilise l'opérateur Java new

        oiseau.manger();
        reactionAnimal = oiseau.dire("Cui cui fdp");
        System.out.println(reactionAnimal);

        oiseau.dormir();

        Poisson monPoisson = new Poisson(20);
        monPoisson.dormir();
        monPoisson.plonger(5);
        monPoisson.plonger(54);

        String reactionPoisson;
        reactionPoisson = monPoisson.dire("Bonjour");
        System.out.println(reactionPoisson);

    }
    
}
