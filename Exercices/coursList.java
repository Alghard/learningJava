import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

/**
 * coursList
 */
public class coursList {

    
public static void main(String[] args) {

    List<Integer> myList = new ArrayList<Integer>();            //création d'une liste avec pour paramètres <Integer> de type limite d'objet dans la liste, dans ce cas seulement des nombres entiers.
    myList.add(7);
    myList.add(5);      // -> ajoute 7 et 5 dans la liste : [7,5]
    myList.add(88979);
    myList.add(1, 325);         // ici 325 va s'ajouter entre le 7 et le 5
    myList.set(0, 12);          // je remplace le 7 par 12 sur l'index lui correspondant ici 0
    myList.remove(2);                   // je supprime un élément existant sur l'index spécifié, ici le 2 donc le chiffre 5
    System.out.println(myList);

    System.out.println("La liste contient " + myList.size() + " éléments.");         // permet d'afficher le nombre d'éléments dans ma liste


    Set<String> ingredients = new HashSet<String>();            // création d'une collection non ordonnée - ensembles avec la commande "Set"

    ingredients.add("salt");
    ingredients.add("pepper");
    ingredients.remove("salt");

    System.out.println("Il y a " + ingredients.size() + " ingrédient(s) dans votre recette.");


    // declarer un dictionnaire ou map
    Map<String, Integer> map = new HashMap<String, Integer>();

    // Definir des clés en tant que constantes dans ma classe
    final String KJEAN = "Jean";
    final String KAMANDINE = "Amandine";

    // utiliser des constantes en tant que keys
    map.put(KJEAN, 34);  // ajoute des valeurs au dictionnaire "map"
    map.put(KAMANDINE, 36);
    map.put(KJEAN, 85);

    for(Map.Entry<String, Integer> entry : map.entrySet()) {
        printEntry(entry);
    }

}

static void printEntry(Map.Entry entry){
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}


}
