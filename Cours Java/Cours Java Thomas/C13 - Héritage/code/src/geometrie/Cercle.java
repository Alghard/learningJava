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
public class Cercle extends Figure
{
    private double rayon;
    
    public Cercle(double unRayon)
    {
        this.rayon = unRayon;
    }
    
    public  double getPerimetre() 
    {
        return 2 * Math.PI * rayon;
    }
    
    public double getAire() 
    {
        return Math.PI * rayon * rayon;
        // return Math.PI * Math.pow(rayon, 2);
    }
            
}
