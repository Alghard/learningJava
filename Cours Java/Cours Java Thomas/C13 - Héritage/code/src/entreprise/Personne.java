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
public class Personne 
{
    private String nom;
    
    public Personne(String leNom)
    {
        System.out.println("Constructeur de Personne");
        this.nom = leNom;
        System.out.println("Fin Constructeur de Personne");
    }
    
    public String toString()
    {
        return "je m'appelle " + nom;
    }
}
