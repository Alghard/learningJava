/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursobjets;

/**
 *
 * @author Mathieu
 */
public class Personne {
    
    String prenom;
    String nom;
    int age;
    
    public Personne()
    {
        this.nom = "";
        this.prenom = "";
        this.age = 0;
    }
    
    public Personne(String unPrenom, String unNom, int unAge)
    {
        this.nom = unNom;
        this.prenom = unPrenom;
        this.age = unAge;
    }
    
    
    public void sePresenter()
    {
        System.out.println("Bonjour je suis " + prenom + " " + nom);
    }
    
    public String getNom()
    {
        return nom;
    }    
    
    public String toString()
    {
        return prenom + " " + nom + " - " + age;
    }
}
