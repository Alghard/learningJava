/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursifelse;

/**
 * Cours BOOLEENS
 * @author Mathieu
 */
public class CoursBooleens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        boolean flag = true;
        
        System.out.println(flag);
        System.out.println(! flag);
        
        boolean negation = ! flag;
        System.out.println("negation vaut : " + negation);
        
        if (flag == true)
            System.out.println("1 - flag vaut true");
        if (flag)
            System.out.println("2 - flag vaut true");
        if (negation == false)
            System.out.println("3 - negation vaut false");
        if (! negation == true)
            System.out.println("4 - NOT negation vaut true");
        if (! negation)
            System.out.println("5 - NOT negation vaut true");
        
        if (flag && flag)
            System.out.println("6 - les deux sont true");
        if (flag && negation)
            System.out.println("7 - l'un des deux est false");
        if (negation && negation)
            System.out.println("8 - l'un des deux est false");
        
        if (flag || flag)
            System.out.println("9 - l'un ou l'autre est true");
        if (flag || negation)
            System.out.println("10 - l'un ou l'autre est true");
        if (negation || negation)
            System.out.println("11 - les deux sont false");
        
    }
    
}
