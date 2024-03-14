/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpobjets;

import java.io.File;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author Mathieu
 */
public class Program2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // 2.b) Affichage de la date du jour
        Date dateJour = new Date();
        
        System.out.println(dateJour);
        
        // 2.c) Nombre aléatoire
        Random rd = new Random();
        System.out.println( rd.nextInt(10000) );
        
        // 2.d) Informations sur des fichiers
        String nomDossier = "C:\\Program Files (x86)";
        File dossier = new File(nomDossier);

        String nomFichier = "C:\\Program Files (x86)\\StarUML\\StarUML.exe";
        File fichier = new File(nomFichier);
        
        // pour le fichier :
        if (fichier.exists())
        {
            System.out.println( "il existe");
        }
        if (fichier.isDirectory())
        {
            System.out.println( "dossier");
        }
        else
        {
            System.out.println( "ce n'est pas un dossier");
        }
        System.out.println( fichier.toURI());
        System.out.println( fichier.toString());
        
        // faire la même chose pour le dossier

        
        
        System.out.println("\n");
File[] fichiers = dossier.listFiles();
for (int i = 0 ; i < fichiers.length ; i++)
{
    File unFichier = fichiers[i];
    System.out.println(unFichier);
}


       try
        {
            // instanciation de l'URL
            URL url = new URL("https://www.google.fr/search?q=java");
            // on récupère et on affiche le protocole de cette URL
            System.out.println( url.getProtocol() );
            // affiche : https
            
            System.out.println(url.getHost());
            System.out.println(url.getDefaultPort());
            System.out.println(url.getQuery());
            System.out.println(url.getFile());
        }
        catch(Exception exc)
        {
            exc.printStackTrace();
        }

       // https://www.btsinfo.fr/metiers-apres-bts-sio/
             try
        {
            URL url = new URL("https://www.btsinfo.fr/metiers-apres-bts-sio/");
            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getDefaultPort());
            System.out.println(url.getQuery());
            System.out.println(url.getFile());
        }
        catch(Exception exc)
        {
            exc.printStackTrace();
        }
             
             GregorianCalendar calendrier;
             Date aujourdhui = new Date();
             calendrier = new GregorianCalendar(2000, 0, 1);
             //calendrier = new GregorianCalendar();
             //calendrier.setTime(aujourdhui);
             
             System.out.println(calendrier);
             int jour = calendrier.get(Calendar.DAY_OF_MONTH);
             System.out.println( jour );
             System.out.println( calendrier.get(Calendar.MONTH) );
             System.out.println( calendrier.get(Calendar.YEAR) );
             
             
             Double d = 130.123456789;
             System.out.println( d.floatValue() ) ;
             System.out.println( d.intValue() ) ;             
             System.out.println( d.shortValue() ) ;
             System.out.println( d.byteValue() ) ;
             
    }
    
}
