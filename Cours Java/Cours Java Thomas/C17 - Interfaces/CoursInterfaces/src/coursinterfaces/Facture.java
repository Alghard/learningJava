/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursinterfaces;

import java.util.ArrayList;

/**
 *
 * @author fretiere_m
 */
public class Facture 
{
    private ArrayList<Payant> lesPayants;
    
    public Facture()
    {
        lesPayants = new ArrayList<Payant>();
    }
    
    public void ajouterPayant(Payant unPayant)
    {
        lesPayants.add(unPayant);
    }
    
    public double getMontantFacture()
    {
        double montant = 0;
        for (Payant unPayant : lesPayants)
        {
            montant += unPayant.getPrix();
        }
        return montant;
    }
}
