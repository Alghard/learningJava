package Objets;
import java.util.Scanner;

public class exoObjets {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez l'URL d'un fichier");

        //Saisie d'une URL d'un fichier. On suppose qu'elle est valide
        String url = sc.next();

        // exemple d'URL : https://docs.oracle.com/en/java/index.html

        String[] tab1 = url.split("://");
        String nomProtocole = tab1[0];
        System.out.println("Le nom du protocole est : " + nomProtocole);
        String urlLeft = tab1[1];
        
        //Découpe de l'url restante avec des / pour obtenir le nom de domaine
        String[] tab2 = urlLeft.split("/");
        String nomDomaine = tab2[0];
        System.out.println("Le nom de domaine est : " + nomDomaine);

        //Découpe du nom de domaine avec des . pour obtenir le tld
        String[] tab3 = nomDomaine.split("\\.");                // le point . étant un caractère spécial en regex, je dois l'échapper avec des \\
        int longueurTab3 = tab3.length;       
        String nomTLD = tab3[longueurTab3 - 1];
        System.out.println("Le TLD est : " + nomTLD);

        //Découpe de l'url restante pour obtenir le nom du fichier et de l'extension simultanement
        String[] tab4 = urlLeft.split("/");
        int longueurTab4 = tab4.length;       
        String lastPartUrl = tab4[longueurTab4 - 1];
        String[] tab5 = lastPartUrl.split("\\.");
        int longueurTab5 = tab5.length;
        String nomFichier = tab5[longueurTab5 - 2];
        String nomExtension = tab5[longueurTab5 - 1];
        System.out.println("Le nom du fichier est : " + nomFichier);
        System.out.println("Le nom de l'extension est : " + nomExtension);

        sc.close();
             
    }
           
}
