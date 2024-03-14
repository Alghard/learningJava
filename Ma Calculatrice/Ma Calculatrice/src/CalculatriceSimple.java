import javax.swing.JPanel;

import javax.swing.*;
import java.awt.GridLayout;


public class CalculatriceSimple {
    public static void main(String[] args) {
        
        //creer un panneau
        JPanel contenuFenetre = new JPanel();

        //Affecte un gestionnaire de disposition à ce panneau
        GridLayout disposition = new GridLayout(4,2);
        contenuFenetre.setLayout(disposition);

        //Crée les controles en memoire
        JLabel label1 = new JLabel("Nombre 1 :");
        JTextField entree1 = new JTextField(10);
        JLabel label2 = new JLabel("Nombre 2 :");
        JTextField entree2 = new JTextField(10);
        JLabel label3 = new JLabel("Somme :");
        JTextField resultat = new JTextField(10);
        JButton lancer = new JButton("Ajouter");
        
        //ajoute les controles au panneau
        contenuFenetre.add(label1);
        contenuFenetre.add(entree1);
        contenuFenetre.add(label2);
        contenuFenetre.add(entree2);
        contenuFenetre.add(label3);
        contenuFenetre.add(resultat);
        contenuFenetre.add(lancer);

        //Crée le cadre et y ajoute le panneau
        JFrame cadre = new JFrame("Ma premiere calculatrice");

        cadre.setContentPane(contenuFenetre);

        //Positionnes les dimensions et rend la fenetre visible
        cadre.setSize(600,200);
        cadre.setVisible(true);

    }
    
}
