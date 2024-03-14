package Collection;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        
        
            // Instanciation de la liste de comptes
            ArrayList<Compte> lesComptes = new ArrayList<Compte>();
    
            // Premier compte de M.Dupont
            Compte c1 = new Compte(12345, "Dupont", 1000, -500);
            Compte c2 = new Compte(65432, "Sakho", 2000, -200);
    
            lesComptes.add(c1);
            lesComptes.add(c2);
    
            for (Compte unCompte : lesComptes) {
                System.out.println(unCompte.toString());
            }
    
            for (int i = 0 ; i < lesComptes.size(); i++) {
                Compte element = lesComptes.get(i);
                System.out.println(element);
            }
            
        }
    }
    
