/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrie;

/**
 *
 * @author fretiere_m
 */
public class Rectangle extends Figure
{
    private double longueur;
    private double largeur;
    
    public double getPerimetre()
    {
        return (longueur + largeur) * 2;
    }
    
    public double getAire()
    {
        return longueur * largeur;
    }
    
    
}
