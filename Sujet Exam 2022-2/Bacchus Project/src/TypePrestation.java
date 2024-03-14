public class TypePrestation {

    private String code;
    private String intitule;

    public TypePrestation(String c, String i){
        this.code = c;
        this.intitule = i;
    }
    
    public String getCode(){return code;}
    public void setCode(String unCode){unCode = code;}

    public String getInt(){return intitule;}
    public void setInt(String unInt){unInt = intitule;}
}
