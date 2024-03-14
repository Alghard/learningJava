import java.time.LocalDate;
import java.time.Period;

public class Employe {
    private String nom;
    private String prenom;
    private LocalDate dateEmbauche;
    private LocalDate dateDepart = null;
    private Qualification qualification;

    //Constructeur avec 5 parametres
    public Employe(String n, String p, LocalDate i, LocalDate d, Qualification q){
        this.nom = n;
        this.prenom = p;
        this.dateEmbauche = i;
        this.dateDepart = d;
        this.qualification = q;
    }

    //accesseurs
    public String getNom(){return nom;}
    public void setNom(String unNom){nom = unNom;}

    public String getPrenom(){return prenom;}
    public void setPrenom(String unPrenom){prenom = unPrenom;}

    public LocalDate getDateEmbauche(){return dateEmbauche;}
    public void setDateEmbauche(LocalDate uneLocalDate){dateEmbauche = uneLocalDate;}

    public LocalDate getDateDepart(){return dateDepart;}
    public void setDateDepart(LocalDate uneLocalDate){dateDepart = uneLocalDate;}

    //Description sous forme de string les infos de l'employé
    public String toString(){
        return "Nom : " + this.nom + ", Prenom : " + this.prenom + ", Date d'arrivée : " + this.dateEmbauche + ", Date de départ : " + this.dateDepart;
    }
    //Methode pour obtenir la qualification de l'employé
    public Qualification getQualification(){return qualification;}

    // Methode qui calcule et retourne le cout journalier a une date donnée d'un employé effectuant une prestation pour le compte d'un client
    public Double coutEmployeJour(LocalDate date){
        double coutJournaEmploye = 0;
        Period period;
        period = Period.between(dateEmbauche, date);
        int anciennete = period.getYears();
        
        if (anciennete > 2 && anciennete < 10 ){
            coutJournaEmploye = qualification.getPrixJournee()*1.2;
        }
        else if (anciennete >= 10){
            coutJournaEmploye = qualification.getPrixJournee()*1.4;
        }
        else 
            coutJournaEmploye = qualification.getPrixJournee();

        return coutJournaEmploye;
         

    }

}
