/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entreprise;

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
//        Personne p1 = new Personne("Joe");
//        
//        System.out.println( p1.toString() );
//        
//        Employe e1 = new Employe("Sarah", 2000);
//        
//        System.out.println( e1.toString() );
        Personne p1 = new Personne("Joe");                
        Employe e1 = new Employe("Sarah", 2000);
        Employe e2 = new Employe("Sunny", 1800);
        
        afficherPersonne(p1);
        afficherPersonne(e1);
        afficherPersonne(e2);
        
    }
    
    
    public static void afficherPersonne(Personne unePersonne)
    {
        System.out.println(unePersonne.toString());
    }

}
