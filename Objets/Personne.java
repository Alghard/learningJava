package Objets;

public class Personne {

    String prenom;
    String nom;
    int age;

    //CONSTRUCTEUR
    public Personne() {
        this.nom = "";
        this.prenom = "";
        this.age = 0;
    }

    public void sePresenter() {
        System.out.println("Bonjour je suis " + prenom + " " + nom);
    }

    public String getNom() {
        return nom;
    }
    
}
