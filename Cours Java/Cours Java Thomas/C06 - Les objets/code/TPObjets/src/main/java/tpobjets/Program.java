/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpobjets;

import java.util.Scanner;

/**
 *
 * @author Mathieu
 */
public class Program 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Saississez deux mots");
        String mot1 = sc.next();
        String mot2 = sc.next(); 
                
        // 1.b) Longueur d’une chaîne de caractères
        int longueur1;        
        longueur1 = mot1.length();                
        System.out.println("taille du 1er mot " + longueur1);
        
        int longueur2;        
        longueur2 = mot2.length();                
        System.out.println("taille du 2eme mot " + longueur2);
        
        // 1.d) Mot en majuscules
        String mot1Maj = mot1.toUpperCase();
        System.out.println("1er mot en majuscules : " + mot1Maj);
        System.out.println("2eme mot en majuscules : " + mot2.toUpperCase());
        
        // 1.e) Mot en minuscules
        String mot1Min = mot1.toLowerCase();
        System.out.println("1er mot en majuscules : " + mot1Min);
        System.out.println("2eme mot en majuscules : " + mot2.toLowerCase());
        
        // 1.f) Les caractères du mot
        char c;
        c = mot1.charAt(0);
        System.out.println("1er caractère " + c);
        c = mot1.charAt(1);
        System.out.println("2e caractère " + c);
        
        // 1.g) Afficher les mots verticalement
        for (int i = 0; i < longueur1 ; i++)
        {
            c = mot1.charAt(i);
            System.out.println(c);
        }
        
        for (int i = 0; i < longueur2 ; i++)
        {
            System.out.println( mot2.charAt(i) );
        }
        
        // 1.h) Ecrire les deux mots à l’envers
        for (int i = longueur1-1; i >= 0 ; i--)
        {
            c = mot1.charAt(i);
            System.out.print(c);
        }
        
        System.out.println("");  // saut de ligne
        
        for (int i = longueur2-1; i >= 0 ; i--)
        {
            c = mot2.charAt(i);
            System.out.print(c);
        }
        
        System.out.println("");  // saut de ligne
        
        // 1.i) Tester l’égalité des deux mots
        boolean egaux;
        egaux = mot1.equals(mot2);
        if (egaux == true)
        {
            // afficher qq chose
            System.out.println("ils sont égaux");
        }
        else 
        {
            System.out.println("ils ne sont pas égaux");
        }
                
//        if ( mot1.equals(mot2) )
//        {
//            // afficher qq chose
//        }
//        else {}
        
        // 1.j) Palindrome
        System.out.println("Saississez un 3ème mot");
        String mot3 = sc.next();
        String mot3Inverse = "";
        for (int i = mot3.length() - 1 ; i >= 0 ; i--)
        {
            c = mot3.charAt(i);
            mot3Inverse = mot3Inverse + c;
        }
        
        if ( mot3.equals(mot3Inverse) )
        {
            System.out.println("le mot " + mot3 + " est un palindrome");
        }
        else 
        {
            System.out.println("le mot " + mot3 + " n'est pas un palindrome");
        }
        
        // 1.k) Nombre d’occurrences d’un caractère dans un mot
        int nbOcc = 0;        
        char carCherche = 'o';
        for (int i = 0; i < longueur1 ; i++)
        {
            c = mot1.charAt(i);
            if (c == carCherche)
                nbOcc++;
        }
        System.out.println("nb d'occurences : " + nbOcc);
        
        // 1.l) Décomposer une adresse de courriel        
        mot1 = "sarah@gmail.com";
        int pos = mot1.indexOf('@');
        String destinataire = mot1.substring(0, pos);
        String nomDomaine = mot1.substring(pos, mot1.length());
        System.out.println("destinataire : " + destinataire);
        System.out.println("nomDomaine : " + nomDomaine);
    }    
}
