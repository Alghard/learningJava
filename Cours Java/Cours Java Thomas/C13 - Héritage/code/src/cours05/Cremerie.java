/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours05;

/**
 *
 * @author Mat
 */
public class Cremerie extends ProduitFrais
{
    private float qteMatiereGrasse;

//    public Cremerie(String unLibelle, float unPrix, int uneDureeValidite, float uneQte)
//    {
//        setLibelle(unLibelle);
//        setPrix(unPrix);
//        dureeValidite = uneDureeValidite;
//        qteMatiereGrasse = uneQte;
//    }    
    
    public Cremerie(String unLibelle, float unPrix, int uneDureeValidite, float uneQte)
    {
        super(unLibelle, unPrix, uneDureeValidite);
        qteMatiereGrasse = uneQte;
    }   
    
//    public Cremerie(String unLibelle, float unPrix, int uneDureeValidite, float uneQte)
//    {
//        libelle = unLibelle;
//        prix = unPrix;
//        dureeValidite = uneDureeValidite;
//        qteMatiereGrasse = uneQte;
//    }  
}
