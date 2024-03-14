import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        Qualification ingenieurAgronome = new Qualification("A", "Ingenieur Agronome", 200);
        Qualification technicienVignoble = new Qualification("B", "Technicien Vignoble", 150);
        Qualification chefEquipe = new Qualification("C", "Chef d'équipe", 130);
        Qualification agentTaille = new Qualification("D", "Agent de taille", 100);
        Qualification agentViticole = new Qualification("E", "Agent viticole", 80);
        Qualification tractoriste = new Qualification("F", "Tractoriste", 100);
        Qualification secretaireComptable = new Qualification("G", "Secrétaire comptable", 120);

        TypePrestation aa = new TypePrestation("AA", "Taille de vigne");
        TypePrestation bb = new TypePrestation("BB", "Tirage des bois");
        TypePrestation cc = new TypePrestation("CC", "Levage");
        TypePrestation dd = new TypePrestation("DD", "Travail du sol");
        TypePrestation ee = new TypePrestation("EE", "Vendanges");
        TypePrestation ff = new TypePrestation("FF", "Tonte d'espaces verts");
        TypePrestation gg = new TypePrestation("GG", "Secrétatiat - Comptabilité");

        Client n1 = new Client("JV1", "Varela Julien", "2383 route du plantaurel, 31860 Labarthe sur lèze", "06 27 40 06 67"," 1 358 487414 11235", "julien.varela@gmail.com", 36);

        Employe e1 = new Employe("Jean", "Gilles",LocalDate.of(2018, 01, 12), null, tractoriste);
        Employe e2 = new Employe("Dumas", "Paul", LocalDate.of(2003, 11, 03), LocalDate.of(2023, 02, 05), agentTaille);
        Employe e3 = new Employe("Carote", "Marie", LocalDate.of(2022, 04, 15), null, secretaireComptable);


        System.out.println(e1.coutEmployeJour(LocalDate.of(2023, 02, 06)));
        System.out.println(e2.coutEmployeJour(LocalDate.of(2023, 02, 06)));
        System.out.println(e3.coutEmployeJour(LocalDate.of(2023, 02, 06)));
        


    }
}
