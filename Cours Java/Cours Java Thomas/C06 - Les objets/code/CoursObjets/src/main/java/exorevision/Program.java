/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exorevision;

import java.util.Scanner;

/**
 *
 * @author Mathieu
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String mot = "abc:def:xyz";
        String[] tableau = mot.split(":");
        System.out.println(tableau[0]);
		
	Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez l'URL d’un fichier");
        // saisie du chemin du fichier. On suppose qu’il est valide.
        
        // URL
        String url = "http://www.java.fr/index.html"; 
        //sc.next();
        String[] tab = url.split("://");
        System.out.println(tab[0]);
        //System.out.println(tab[1]);
        
        String[] tab2 = tab[1].split("/");
        System.out.println(tab2[0]);
        System.out.println(tab2[tab2.length-1]);
        
        
        //String[] tab2 = url.split("");
    }
    
}
