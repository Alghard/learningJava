using System;
using System.Collections.Generic;
using System.Text;

namespace Ergosum
{
class Jouet
{
    private int numero;
    private string libelle;
    private string categorie;
        
    /// <summary>
    /// Instancie un objet Jouet 
    /// </summary>
    public Jouet(int numero, string libelle, string categorie)
    {
        this.numero = numero;
        this.libelle = libelle;
        this.categorie = categorie;            
    }

    public int getNumero() { return this.numero; }
    public string getLibelle() { return this.libelle; }
    public string getCategorie() { return this.categorie; }
                        
    //public override string ToString()
    //{
    //    return libelle;
    //}

}
}
