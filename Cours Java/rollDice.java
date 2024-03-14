public class rollDice {

    public static void main(String[] args) {

        

        double nbHasard = Math.random()*6;                  //Obtenir un nombre au hasard multiplié par 6

            double resultat = Math.floor(nbHasard);         //Arrondir ce nombre a l'entier inférieur
            resultat = resultat + 1;                        //Ajoute +1 à ce nombre
    
            System.out.println("Le résultat est : " + resultat);
       
}
}
