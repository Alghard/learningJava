import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class distribCartes {

    public static void main(String[] args) {
        //Création d'un deck de 52 cartes

        String[] suite = new String[] {"Carreau", "Coeur", "Pique", "Trèfle"};                                          //Création tableau des suite du deck
        String[] rank = new String[] {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi"};      //Création tableau des rangs du deck
        List<String> deck = new ArrayList<String>();                                                                    //Création d'une liste des cartes du deck
            for (int i = 0; i < suite.length; i++)
                for (int j = 0; j < rank.length; j++)
                    deck.add(rank[j] + " de " + suite[i]);                                                              //Ajout d'une carte dans la liste

        System.out.println("Votre deck contient " + deck.size() + " cartes.");

        //Distribution de cartes
        Scanner sc = new Scanner(System.in);
        int i;
        int deckSize = deck.size();
            for (i = 0; i < deckSize; i++){
                System.out.println("Voulez vous piocher une carte ? o/n");
                String play;
                play = sc.next();
                if ( play.equals("n")){
                    System.out.println("Merci d'avoir jouer");
                    sc.close();
                    break;
                        
                }                

                if ( play.equals("o")){

                    //Mélanger le deck
                    Collections.shuffle(deck);       
                    String carteTire;

                    carteTire = deck.remove(0);
                    System.out.println("Vous piochez " +  carteTire + ".");
                    if (deck.size() != 0 && deck.size() != 1){
                    System.out.println("Il reste " + deck.size() + " cartes dans le deck.");
                    }
                    if (deck.size() == 1){
                        System.out.println("Il reste " +  deck.size() + " carte dans le deck.");
                    }
                    if ( deck.size() == 0 ){
                        System.out.println("Il n'y a plus de cartes dans le deck, merci d'avoir jouer.");                
                    }                       
                }
                else if ( play != "o" && play != "n"){
                    System.out.println("Erreur, veuillez répondre par o ou n");
            
                }                       
            }        
        
    }
}

