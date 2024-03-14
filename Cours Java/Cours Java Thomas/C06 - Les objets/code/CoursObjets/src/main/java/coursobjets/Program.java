/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursobjets;

import java.util.Date;

/**
 *
 * @author Mathieu
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // déclaration de l'objet
        Personne unePersonne;

        // INSTANCIATION = Création de l'objet
        unePersonne = new Personne();
        
        // on VALORISE les attributs
        unePersonne.prenom = "Quentin";
        unePersonne.nom = "Tarantino";
        unePersonne.age = 58;
        
        // affichage
        System.out.println( unePersonne.prenom );
        System.out.println( unePersonne.nom );
        System.out.println( unePersonne.age );
        
            
        // INSTANCIATION d'un autre objet
        Personne actrice;
        actrice = new Personne("Uma", "Thurman", 51);
        
        // affichage
        System.out.println( actrice.prenom );
        System.out.println( actrice.nom );
        System.out.println( actrice.age );
        
        // 2 - méthodes
        unePersonne = new Personne("Quentin", "Tarantino", 58);
        unePersonne.sePresenter();
        
        String leNom;
        leNom = unePersonne.getNom();
        System.out.println(leNom);
        
        String description;
        description = unePersonne.toString();
        System.out.println(description);
        
        // classe String
        String mot = "hello";
        int longueur = mot.length();
        
        System.out.println(longueur);
        
        char c = mot.charAt(0);
        System.out.println(c);
        
        c = mot.charAt(1);
        System.out.println(c);
        
        String motMaj = mot.toUpperCase();
        System.out.println(motMaj);
        
        // exo
        mot = "GOODBYE";
        longueur = mot.length();
        
        System.out.println(longueur);
        
        motMaj = mot.toLowerCase();
        System.out.println(motMaj);
        
        // classe Date
        Date uneDate = new Date();
        
        System.out.println("****");
        String phrase = "BTS SIO";
        int i = phrase.indexOf('S');    // i vaut 2
        System.out.println(i);
        i = phrase.indexOf('O');    // i vaut 6
        System.out.println(i);
        i = phrase.indexOf('Z');    // i vaut -1
        System.out.println(i);
                       
    }
    
}
