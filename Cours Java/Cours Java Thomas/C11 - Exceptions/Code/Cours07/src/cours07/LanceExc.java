/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours07;

/**
 *
 * @author Mat
 */
public class LanceExc
{
public static void main(String[] args)
{
    System.out.println("début du programme");
    // instanciation d'une exception
    RuntimeException exc = new RuntimeException("Erreur déclenchée par moi-même !");
    // lancement l'exception
    throw exc;    

    // Cette ligne ne sera jamais atteinte
}    
}
