package Objets.Animaux;

public class AnimalFamilier {

    int age;
    float poids;
    float taille;
    String couleur;

    public void dormir(){
        System.out.println("Je dors fdp");
    }

    public void manger(){                                       //Elle nous indique que cette méthode peut être appelée depuis n'importe quelle autre classe Java (public) et qu'elle ne retourne aucune donnée (void). Les parenthèses vides signifient que cette méthode ne prend pas d'argument, parce qu'elle n'a besoin d'aucune donnée du monde extérieur - elle affiche toujours le même texte.
        System.out.println("Je mange fdp");
    }

    public String dire(String unMot){                           //Cette méthode peut aussi être appelée depuis n'importe quelle autre classe Java, mais elle doit retourner un texte, ce qu'indique le mot-clé String devant le nom de la méthode. Par ailleurs, elle attend une donnée textuelle de l'extérieur, d'où l'argument String unMot.
        String reponseAnimal = "OK OK " + unMot;
        return reponseAnimal;                                   //Le mot clé "return" termine l'exécution d'une méthode et peut etre utilisé pour renvoyer une valeur a partir d'une méthode.
    }
  
}

