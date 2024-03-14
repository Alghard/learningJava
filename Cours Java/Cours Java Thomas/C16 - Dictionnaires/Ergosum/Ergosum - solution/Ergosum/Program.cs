using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Ergosum
{

class Program
{
    static void Main(string[] args)
    {
        Catalogue cat = new Catalogue(2015);
        cat.AjouterJouet(new Jouet(1, "Monopoly", "Jeu de société"), 10);
        cat.AjouterJouet(new Jouet(2, "Playstation", "Console"), 20);
        cat.AjouterJouet(new Jouet(3, "Risk", "Jeu de société"), 15);

        cat.AfficherJouets();

        Console.WriteLine(cat.GetQuantiteDistribuee());
        Console.WriteLine(cat.GetNbJouetsPourCategorie("Console"));
        Console.WriteLine(cat.GetNbJouetsPourCategorie("Jeu de société")); // affiche 25
    }
}

}
