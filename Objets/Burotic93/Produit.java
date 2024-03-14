package Objets.Burotic93;

public class Produit {
    private String reference;
    private String nom;
    private float prix;
    private int quantiteStock;
// constructeur avec 4 paramètres
    public Produit(String r, String n, float p, int q)
    {
        this.reference = r;
        this.nom = n;
        this.prix = p;
        this.quantiteStock = q;
    }
// Accesseurs pour reference
    public String getReference()
    { return reference; }
    public void setReference(String uneRef)
    { reference = uneRef; }
// Idem pour les autres attributs :
    public String getNom() { return nom; }
    public void setNom(String unNom) { nom = unNom; }
    public float getPrix() { return prix; }
    public void setPrix(float unPrix) { prix = unPrix; }
    public int getQuantiteStock() { return quantiteStock; }
    public void setQuantiteStock(int uneQuantite) { quantiteStock = uneQuantite; }
// retourne une description du produit sous forme de String
    public String toString()
    {
    return "produit : ref " + this.reference + ", " + this.nom + ", " + this.prix + " eur., qte stock : " + this.quantiteStock;
    }
}
