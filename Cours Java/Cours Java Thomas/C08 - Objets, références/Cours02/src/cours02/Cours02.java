/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours02;

/**
 *
 * @author Mat
 */
public class Cours02 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        IP adresse1 = null;
	IP adresse2 = null;


	// instanciation des objets
	adresse1 = new IP(192, 168, 1, 1) ;
	adresse2 = new IP(192, 168, 1, 20) ;

	// modification de l’octet 4 de adresse2
	adresse2.setOctet4(1) ;

	// test de l’égalité : vrai ou faux ?
	if (adresse1 == adresse2) { }

	// une 3ème référence, elle fait référence au // même objet que la 1ère 
	IP adresse3 = adresse1 ;

	// test de l’égalité : vrai ou faux ?
	if (adresse1 == adresse3) { }
	
	
	// 1.2
	IP monIP = new IP(192, 168, 1, 50);
	initIP(monIP);
	
	// conversion d'un string en entier
	String texte = "500";
	int nombre = Integer.parseInt(texte);
	System.out.println(nombre);
    }
    
    public static void initIP(IP adresse)
    {
	adresse.setOctet1(0);
	adresse.setOctet2(0);
	adresse.setOctet3(0);
	adresse.setOctet4(0);
    }

}
