/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursifelse;

import java.util.Scanner;      

/**
 *
 * @author Mathieu
 */
public class CoursIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        String variable = "OK";
        System.out.println(variable);
        System.out.println();
        System.out.print(variable);
        
//        System.out.println("Saisissez votre âge");
//        // saisie d'un un entier
//        
//        int age = sc.nextInt();        
//
//        // condition : si age est plus petit que 18
//        if (age < 18)                  // à compléter
//        {
//            System.out.println("Vous êtes mineur(e)");
//        }
//        else
//        {
//            System.out.println("Vous êtes majeur(e)");
//        }
        // saisie des nombres
//        int nb1 = sc.nextInt();
//        int nb2 = sc.nextInt();
//        int nb3 = sc.nextInt();
//        
//        int max = 0;
//
//        // comparaison de nb1 et nb2 avec nb3
//        if (nb1 < nb3 && nb2 < nb3)
//        {
//                max = nb3  ;
//        }
//        else if (nb1 < nb2 && nb3 < nb2)
//        {
//                max = nb2  ;
//        }
//        else
//        {
//                max = nb1  ;
//        }
//
//        System.out.println("Le plus grand est " + max);

        // température
        // si temp est supérieure à 36 ET inférieure à 38
        System.out.println("Saisissez la température");
        double temp = sc.nextDouble();
        
        if (temp >= 36 && temp <= 38)
        {
            System.out.println("OK");
        }
        else
        {
            System.out.println("Allez voir un médecin");
        }

//        if (temp < 36 || temp > 38)
//        {
//            System.out.println("Allez voir un médecin");            
//        }
//        else
//        {
//            System.out.println("OK");
//        }




    }
    
}
