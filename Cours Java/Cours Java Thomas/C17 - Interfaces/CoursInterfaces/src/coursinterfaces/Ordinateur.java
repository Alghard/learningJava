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
public class Ordinateur implements Payant, Appareil
{
    private boolean etatAllume;
    private String modele;
    private double prix;
    
    public Ordinateur(boolean unEtat, String unModele, double unPrix)
    {
        etatAllume = unEtat;
        modele = unModele;
        prix = unPrix;
    }
    
    @Override
    public double getPrix() 
    {
        return prix; 
    }

    @Override
    public void allumer() 
    {
        etatAllume = true;
    }

    @Override
    public void eteindre() 
    {
        etatAllume = false;
    }
    
}
