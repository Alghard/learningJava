/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.louise.coursbasesjava;

import java.util.Scanner;

/**
 *
 * @author Mathieu
 */
public class Program {
    
    public static void main(String[] args)
    {    
        //int nb1 = 5.4;
        double nb1 = 5.4;

        float nb2 = 10;
        float nb3 = 3;

        //int res = nb2 / nb3;

        float res = nb2 / nb3;

//        final int age = 12;
//        age = 18; 
        
        
        System.out.println(res);
        
        // concaténation
        String villeFavorite1 = "New York";
        String villeFavorite2 = "Buenos Aires";
        
        String favorites = villeFavorite1 + villeFavorite2;         
        System.out.println(favorites); 
        // 1) qu'est-ce qui s'affiche ?

        String favorites2 = "Mes villes favorites sont " +villeFavorite1+ " et "+villeFavorite2; 
        System.out.println(favorites2);
        // 2) qu'est-ce qui s'affiche ?
        
        Scanner sc = new Scanner(System.in);

        String nom = sc.next();
        System.out.println(nom);
        
        int nombre;
        nombre = sc.nextInt();
        System.out.println(nombre);

        double prix;
        prix = sc.nextDouble();
        System.out.println(prix);


    }
    
    
    
}
