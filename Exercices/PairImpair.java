
import java.util.Scanner;

public class PairImpair {

    public static void main(String[] args) {


        //Demander à l'utilisateur de rentrer un nombre
        System.out.println("Veuillez entrer un nombre : ");
        Scanner sc = new Scanner(System.in);

        int nb = sc.nextInt();
        
        //First on verifie si le nombre est égal à 0 car dans ce cas le test de parité n'est pas necessaire
        if (nb == 0 ) {

            System.out.println("Le nombre est zéro et il est pair.");
        }

        else {

            //s'il n'est pas nul voyons quel est son signe
            if (nb < 0){
                System.out.print("Le nombre est négatif");
            }

            else {
                System.out.print("Le nombre est positif");
            }
            
            int reste = nb % 2;
            if (reste == 0){
                System.out.print(" et pair.");
            }
            else {
                System.out.print(" et impair.");
            }

        }
        sc.close();        
    }    
}
