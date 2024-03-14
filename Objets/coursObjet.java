package Objets;
public class coursObjet {
    public static void main(String[] args){
        Marque apple = new Marque("apple");
        Telephone iphone = new Telephone(34000, "iphone", apple);
        Auteur jrr = new Auteur("JRR Tolkien", 78, 3);
        Editeur urMom = new Editeur("Tamere");
        Livre lotr = new Livre("Le seigneur des Anneaux", jrr, 987, urMom);
        

        System.out.println(iphone.toString());

    }
    
}

class Telephone {
    int pixels;
    Marque marque;
    String nom;
    //Constructeur de la classe Telephone
    public Telephone(int pixels, String nom, Marque marque){
        //Initialise l'attribut pixels avec la valeur de l'argument pixels
        this.pixels = pixels;
        this.nom = nom;
        this.marque = marque;
    }
    //Accesseur pour nom
    public String getNom(){
        return nom;
    }
    public void setNom(String unNom){
        nom = unNom;
    }
    //Accesseur pour pixels
    public Integer getPixels(){
        return pixels;
    }
    public void setPixels(Integer unPixel){
        pixels = unPixel;
    }
    //Accesseur pour marque
    public Marque getMarque(){
        return marque;
    }
    public void setMarque(Marque uneMarque){
        marque = uneMarque;
    }
    //retourne une description du Telephone sous forme de String 
    public String toString(){
        return "Telephone : marque " + this.marque + ", " + this.nom + ", " + this.pixels;
    }
}

class Marque {
    String nom;

    public Marque(String nom){
        this.nom = nom;
    }
    //Accesseur du nom
    public String getNom(){
        return nom;
    }
    public void setNom(String unNom){
        nom = unNom;
    }


}

class Livre {
    String titre;
    Auteur auteur;
    int nbPages;
    Editeur editeur;

    public Livre(String titre, Auteur auteur, int nbPages, Editeur editeur){
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
        this.editeur = editeur;
    }
}

class Auteur {
    String nom;
    int age;
    int nbLivres;

    public Auteur(String nom, int age, int nbLivres){
        this.nom = nom;
        this.age = age;
        this.nbLivres = nbLivres;
    }
}

class Editeur {
    String nom;

    public Editeur(String nom){
        this.nom = nom;
    }
}