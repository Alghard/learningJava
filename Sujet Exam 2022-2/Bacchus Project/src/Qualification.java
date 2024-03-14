public class Qualification {

    private String code;
    private String intitule;
    private double prixJournee;

    public Qualification(String c, String i, double p){
        this.code = c;
        this.intitule = i;
        this.prixJournee = p;
    }

    public String getCode(){return code;}
    public void setCode(String unCode){unCode = code;}

    public String getIntitule(){return intitule;}
    public void setIntitule(String unIntitule){unIntitule = intitule;}

    public double getPrixJournee(){return prixJournee;}
    public void setPrixJournee(double unPrixJournee){unPrixJournee = prixJournee;}
    
}
