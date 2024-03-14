/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursinterfaces;

/**
 *
 * @author fretiere_m
 */
public class CoursInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //System.out.println(f1.getPrix());
        
        Payant p1 = new Service("dev site web", 5, 500);
        Payant p2 = new Service("admin db", 10, 600);
        Payant p3 = new Ordinateur(false, "HP ProDesk", 1000);
        Payant p4 = new Ordinateur(false, "Lenovo ThinkCentre", 500);
        
        Facture facture = new Facture();
        
        facture.ajouterPayant(p1);
        facture.ajouterPayant(p2);
        facture.ajouterPayant(p3);
        facture.ajouterPayant(p4);

        System.out.println(facture.getMontantFacture());
        
    }
    
}
