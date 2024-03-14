using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Ergosum
{

class Catalogue
{
    private int annee;
    /// <summary>
    /// Contient pour chaque jouet du catalogue : 
    ///- en clé, l’objet de la classe lesJouet
    /// - en valeur, la quantité de ce jouet distribuée pour ce catalogue
    /// </summary>
    private Dictionary<Jouet, int> lesJouets;

    public Catalogue(int annee)
    {
        this.annee = annee;
        this.lesJouets = new Dictionary<Jouet, int>();
    }

    /// <summary>
    /// Accesseur en lecture pour lesJouets
    /// </summary>
    /// <returns></returns>
    public Dictionary<Jouet, int> GetLesJouets()
    {
        return lesJouets;
    }

    /// <summary>
    /// Ajoute au dictionnaire un jouet et sa quantité
    /// retourne vrai si l'objet n'était pas déjà présent, 
    /// faux dans le cas contraire
    /// </summary>
    public bool AjouterJouet(Jouet jouet, int quantite)
    {
        bool existeDeja = lesJouets.ContainsKey(jouet);
        if (!existeDeja) 
            lesJouets.Add(jouet, quantite);
        return existeDeja;
    }

    /// <summary>
    /// Affiche les libellés des jouets du catalogue.
    /// </summary>
    public void AfficherJouets()
    {
        foreach (Jouet jouet in lesJouets.Keys)
        {
            Console.WriteLine(jouet.getLibelle());
        }
    }

    /// <summary>
    ///  Retourne la quantité totale de jouets distribués pour ce catalogue.
    /// </summary>
    public int GetQuantiteDistribuee()
    {
        int total = 0;
        foreach (int quantite in lesJouets.Values)
        {
            total += quantite;
        }
        return total;
    }

    /// <summary>
    /// Retourne le nombre de jouets de la catégorie passée en paramètre.
    /// </summary>
    /// <param name="categorie"></param>
    /// <returns></returns>
    public int GetNbJouetsPourCategorie(string categorie)
    {
        int total = 0;

        foreach (Jouet jouet in lesJouets.Keys)
        {
            if (jouet.getCategorie() == categorie)
            {
                total += lesJouets[jouet];
            }
        }

        return total;
    }

    /// <summary>
    /// Retourne un dictionnaire contenant pour chaque catégorie de ce catalogue :
    /// - en clé, l’objet de la classe Catégorie
    /// - en valeur, la quantité de jouets distribués pour cette catégorie.
    /// </summary>
    //public Dictionary<string, int> statCategorie()
    //{
    //    Dictionary<string, int> stat = new Dictionary<string, int>();
    //    foreach (Jouet jouet in lesJouets.Keys)
    //    {
    //        string categorie = jouet.getCategorie();
    //        int quantite = lesJouets[jouet];
    //        if (stat.ContainsKey(categorie))
    //        {
    //            int quantiteExistante = stat[categorie];
    //            int nouvelleQuantite = quantiteExistante + quantite;
    //            stat[categorie] = nouvelleQuantite;
    //        }
    //        else
    //        {
    //            stat.Add(categorie, quantite);
    //        }

    //    }
    //    return stat;
    //}
}
}
