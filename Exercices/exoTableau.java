
import java.util.Scanner;

public class exoTableau {

    public static void main(String[] args) {

        
        //saisie d'un nom de produit
        System.out.println("Saisissez un nom de produit : ");
        Scanner sc = new Scanner(System.in);
        String nomProduit;
        nomProduit = sc.next();

        // tableau de String "noms" qui contient la liste des noms de produits :
        String[] noms = {"Crayon", "Gomme", "Stylo", "Equerre", "Règle"};

        // tableau de float "prix" qui contient la lsite des prix des produits : 
        float [] prix = { 1.5f, 1f, 2f, 1.5f, 1.8f };

        int longueurNoms = noms.length;

        for (int u = 0 ; u < longueurNoms ; u++)
            {
                System.out.println(noms[u]);
            }
        int longueurPrix = prix.length;
        
        for (int o = 0 ; o < longueurPrix ; o++)
            {
                System.out.println(prix[o]);
            }
        // le prix max
        float prixMax = prix[0];

        //parcours du tableau
        for (int i = 0 ; i < prix.length ; i++)
            {
                if ( prixMax < prix[i])
                {
                    //le prix [i] est plus grand que prixMax alors c'est lui le max
                    prixMax = prix[i];

                }
            }
            //affichage
            System.out.println("Le prix max est : " + prixMax);

        //Trouver le produit le moins cher et afficher son prix ET son nom
        
        // le prix min
        float prixMin = prix[0];
        //indice du produit le moins cher
        int iMin = 0 ;
        
        //parcours du tableau
        for (int i = 0 ; i < prix.length ; i++)
        {
            if ( prixMin > prix[i])
            {
                //le prix [i] est plus petit que prixMin alors c'est le lui plus petit
                prixMin = prix[i];
                iMin = i;
            }
                
        }
        System.out.println("Le produit le moins cher est : " + noms[iMin] + " (" + prixMin + ") ");

        // recherche du nom de produit et affichage du prix correspondant avec for
        int iProduit = -1;
        for (int i = 0 ; i < noms.length ; i++)
        {
            if (nomProduit.equals(noms[i]))
            {
                iProduit = i;                
                break;
            }
        }
        if (iProduit == -1)        
        {
            System.out.println("Erreur produit non trouvé ou inexistant");
        }
        else
        {
            System.out.println("Le produit " + noms[iProduit] + " vaut " + prix[iProduit]);
        }

        
        // recherche avec while 
        int iProduit1 = 0;

        while(iProduit1 < noms.length && !nomProduit.equals(noms[iProduit1]))
        {
            iProduit1++;
        }
        
        if(iProduit1 == noms.length)
            {
                System.out.println("erreur");
            }
        else
            {
                System.out.println(noms[iProduit1] + " " + prix[iProduit1]);
            }

        

    sc.close();
    }
    }
