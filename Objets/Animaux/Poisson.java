package Objets.Animaux;

public class Poisson extends AnimalFamilier {

    int profondeurCourante;
    Poisson (int positionDepart){                           // je défini mon constructeur Poisson avec l'arguments positionDepart. Je ne peux plus creer classe Poisson sans renseigner sa positionDepart dans exemple : new newPoisson(int positionDepart)
        profondeurCourante = positionDepart;
    }

    public int plonger(int combienDePlus){
        profondeurCourante = profondeurCourante + combienDePlus;
        if (profondeurCourante > 100){
            System.out.println("Je suis un petit poisson je ne peux pas plonger plus profond que 100 mètres.");
            profondeurCourante = profondeurCourante - combienDePlus;
        }
        else {
        System.out.println("Plongée de " + combienDePlus + " mètres.");
        System.out.println("Je suis à " + profondeurCourante + " mètres sous le niveau de la mer.");
        }
        return profondeurCourante;
    }
    
    public String dire(String unMot) {
        return "Ne sais-tu pas que les poissons ne parlent pas ?";
    }
}
