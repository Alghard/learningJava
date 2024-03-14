public class Client {

    private String code;
    private String nom;
    private String adresse;
    private String telephone;
    private String siret;
    private String couriel;
    private int distance;

    public Client(String c, String n, String a, String t, String s, String co, int d){
        this.code = c;
        this.nom = n;
        this.adresse = a;
        this.telephone = t;
        this.siret = s;
        this.couriel = co;
        this.distance = d;
    }

    public String getCode(){return code;}
    public void setCode(String unCode){unCode = code;}

    public String getNom(){return nom;}
    public void setNom(String unNom){unNom = nom;}

    public String getAdr(){return adresse;}
    public void setAdr(String uneAdr){uneAdr = adresse;}

    public String getTel(){return telephone;}
    public void setTel(String unTel){unTel = telephone;}

    public String getSiret(){return siret;}
    public void setSiret(String unSiret){unSiret = siret;}

    public String getCouriel(){return couriel;}
    public void setCouriel(String unCouriel){unCouriel = couriel;}

    public Integer getDistance(){return distance;}
    public void setDistance(int uneDist){uneDist = distance;}
    
}
