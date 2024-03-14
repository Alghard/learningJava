import java.time.LocalDate;
import java.time.Period;

public class Prestation {

    private String code;
    private String intitule;
    private boolean supplement;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Client client;

    public Prestation(String c, String i, boolean s, LocalDate d, LocalDate f){
        this.code = c;
        this.intitule = i;
        this.supplement = s;
        this.dateDebut = d;
        this.dateFin = f;
    }

    public String getCode(){return code;}
    public void setCode(String unCode){unCode = code;}

    public String getIntitule(){return intitule;}
    public void setIntitule(String unIntitule){unIntitule = intitule;}

    public Boolean getSupplement(){return supplement;}
    public void setSupplement(boolean unSup){unSup = supplement;}

    public LocalDate getDateDebut(){return dateDebut;}
    public void setDateDebut(LocalDate uneDate){uneDate = dateDebut;}

    public LocalDate getDateFin(){return dateFin;}
    public void setDateFin(LocalDate uneDate){uneDate = dateFin;}

    public Client getClient(){return client;}

    //methode coutTotalPrestation 

    public Double coutTotalPrestation(){
        double coutTotal = 0;
        Period dureePresta = Period.between(dateFin, dateDebut);
        int jourPresta = dureePresta.getDays();
        double coutDistance = 0;
        Prestation unePresta; 
        Client unClient = unePresta.getClient();

        if (unClient.getDistance() <= 15)
            coutDistance = 0;
        
    }
    
}
