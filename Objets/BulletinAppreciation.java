package Objets;

public class BulletinAppreciation {

/**
* Cette méthode attend un argument entier - la note du devoir - 
* et retourne une mention, I, P, A, B, T ou E, en fonction de sa valeur. 
*/



    public char convertirNiveaux(int noteDevoir){

    char niveau;

    if (noteDevoir >= 18){
        niveau = 'E';
    }
    else if (noteDevoir >= 16 && noteDevoir < 18 ){
        niveau = 'T';
    }
    else if (noteDevoir >= 14 && noteDevoir < 16 ){
        niveau = 'B';
    }
    else if (noteDevoir >= 12 && noteDevoir < 14){
        niveau = 'A';
    }
    else if (noteDevoir >= 10 && noteDevoir < 12){
        niveau = 'P';
    }
    else {
        niveau = 'I';
    }
    return niveau;
}


public static void main(String[] args) {

    BulletinAppreciation convertisseur = new BulletinAppreciation();
    char tonNiveau = convertisseur.convertirNiveaux(17);
    System.out.println("Ton premier niveau est " + tonNiveau);
    tonNiveau = convertisseur.convertirNiveaux(20);
    System.out.println("Ton second niveau est " + tonNiveau);

    switch (tonNiveau) {                                                    // le switch Java a une limitation, l'expression à évaluer doit être de l'un de ces types : char - int - byte - short

        case 'E' : System.out.println("Excellent travail !");
        break;

        case 'T' : System.out.println("Très bon travail !");
        break;

        case 'B' : System.out.println("Bon travail !");
        break;

        case 'A' : System.out.println("Tu peux mieux faire.");
        break;

        case 'P' : System.out.println("Tu dois travailler plus.");
        break;

        case 'I' : System.out.println("C'est mort pour toi.");
        break;
    }
    
}
}