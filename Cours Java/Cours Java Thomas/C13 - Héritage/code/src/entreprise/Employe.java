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
public class Employe extends Personne
{
    private double salaire;
    
    /**
     * 
     * @param leNom
     * @param leSalaire 
     */
    public Employe(String leNom, double leSalaire)
    {
        super(leNom);
        
        System.out.println("Constructeur de Employe");
        this.salaire = leSalaire;
        System.out.println("Fin Constructeur de Employe");
    }    
    
    public String toString()
    {
        String debut = super.toString();
        return debut + " mon salaire est " + salaire;
    }
}
