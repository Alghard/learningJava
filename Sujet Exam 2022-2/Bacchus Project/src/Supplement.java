public class Supplement {

    private String code;
    private String intitule;
    private float montantJournee;

    public Supplement(String c, String i, float m){
        this.code = c;
        this.intitule = i;
        this.montantJournee = m;
    }

    public String getCode(){return code;}
    public void setCode(String unCode){unCode = code;}

    public String getInt(){return intitule;}
    public void setInt(String unInt){unInt = intitule;}

    public Float getMontant(){return montantJournee;}
    public void setMontant(float unMontant){unMontant = montantJournee;}
    
}
