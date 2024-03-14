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
public class Service implements Payant
{
    private String libelle;
    private int nombreJours;
    private double prixJournee;
    
    public Service(String lib, int nb, double prix)
    {
        libelle = lib;
        nombreJours = nb;
        prixJournee = prix;
    }
    
    // Implémentation de getPrix
    public double getPrix() 
    {
        return nombreJours * prixJournee;
    }
    
}
