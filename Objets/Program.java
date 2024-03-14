package Objets;

public class Program {

    public static void main(String[] args) {

        //déclaration de l'objet
        Personne unePersonne;

        //instanciation de l'objet
        unePersonne = new Personne();

        //On valorise les attributs
        unePersonne.nom = "Tarantino";
        unePersonne.prenom = "Quentin";
        unePersonne.age = 58;

        unePersonne.sePresenter();

        String sonNom = unePersonne.getNom();
        System.out.println(sonNom);
        
    }
    
}
