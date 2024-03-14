import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;

public class Detenu {
   

    public static void main(String[] args) {
        
        String nom;
        String prenom;
        String dateNaissance;
        String adresse;
        String debutPeine;
        String finPeine;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez les informations sur le détenu");
        System.out.println("Nom : ");
        nom = sc.nextLine();
        System.out.println("Prenom : ");
        prenom = sc.nextLine();
        System.out.println("Date de naissance : (JJ/MM/AAAA) : ");
        dateNaissance = sc.nextLine();
        LocalDate dateBirth = LocalDate.parse(dateNaissance, formatter);
        System.out.println("Adresse : ");
        adresse = sc.nextLine();
        System.out.println("Date de debut de peine : (JJ/MM/AAAA) : ");
        debutPeine = sc.nextLine();
        LocalDate dateDebutPeine = LocalDate.parse(debutPeine, formatter);
        System.out.println("Date de fin de peine (JJ/MM/AAAA) : ");
        finPeine = sc.nextLine();
        LocalDate dateFinPeine = LocalDate.parse(finPeine, formatter);

        System.out.println("Création de la fiche detenu réussie : ");



        System.out.println(nom + "\n" + prenom + "\n"  + dateBirth + "\n" + adresse + "\n" + dateDebutPeine + "\n" + dateFinPeine);

    }

    public Detenu(String nom, String prenom, LocalDate dateBirth, String adresse, LocalDate dateDebutPeine,
    LocalDate dateFinPeine) {
}
}
