/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02;

// import de la classe Scanner
import java.util.Scanner;

/**
 *
 * @author Mat
 */
public class IP 
{
        private int octet1;
        private int octet2;
        private int octet3;
        private int octet4;

        public IP(int octet1, int octet2, int octet3, int octet4)
        {
            this.octet1 = octet1;
            this.octet2 = octet2;
            this.octet3 = octet3;
            this.octet4 = octet4;
        }

        public IP()
        {
        }

        public String versChaine()
        {
            return this.octet1 + "." + this.octet2 + "." +
                this.octet3 + "." + this.octet4;
        }

        public char getClasse()
        {
            char c = 'x';
            if (this.octet1 <= 126)
                c = 'A';
            if (this.octet1 >= 128 && this.octet1 <= 191)
                c = 'B';
            if (this.octet1 >= 192 && this.octet1 <= 223)
                c = 'C';
            return c;
        }

        public IP getAdresseReseau()
        {
            int octet1 = this.octet1, octet2 = 0, octet3 = 0, octet4 = 0;
            if (this.getClasse() == 'B')
                octet2 = this.octet2;
            if (this.getClasse() == 'C')
            {
                octet2 = this.octet2;
                octet3 = this.octet3;
            }
            return new IP(octet1, octet2, octet3, octet4);
        }

        public boolean estMemeReseau(IP ip)
        {
            return ((this.getAdresseReseau().octet1 == ip.getAdresseReseau().octet1) &&
                    (this.getAdresseReseau().octet2 == ip.getAdresseReseau().octet2) &&
                    (this.getAdresseReseau().octet3 == ip.getAdresseReseau().octet3));
        }
        
    public static IP saisir()
    {
        int octet1, octet2, octet3, octet4;
        Scanner sc = new Scanner(System.in);

        System.out.print("octet1 : ");
        octet1 = sc.nextInt();
        while (!(octet1 >= 0 && octet1 <= 255))
        {
            System.out.print("Recommencez : ");
            octet1 = sc.nextInt();;
        }
        System.out.print("octet2 : ");
        octet2 = sc.nextInt();;
        while (!(octet2 >= 0 && octet2 <= 255))
        {
            System.out.print("Recommencez : ");
            octet2 = sc.nextInt();;
        }
        System.out.print("octet3 : ");
        octet3 = sc.nextInt();;
        while (!(octet3 >= 0 && octet3 <= 255))
        {
            System.out.print("Recommencez : ");
            octet3 = sc.nextInt();;
        }
        System.out.print("octet4 : ");
        octet4 = sc.nextInt();;
        while (!(octet4 >= 0 && octet4 <= 255))
        {
            System.out.print("Recommencez : ");
            octet4 = sc.nextInt();
        }
        return new IP(octet1, octet2, octet3, octet4);
    }
    
    // A ajouter dans class IP
    public boolean equals(Object obj)
    {
        IP ip = (IP)obj;
        if (octet1 == ip.octet1 
                && octet2 == ip.octet2
                && octet3 == ip.octet3 
                && octet4 == ip.octet4)
            return true;
        else return false;
                    
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
            IP ip = new IP(193, 168, 9, 35);
            System.out.println(ip.versChaine());
            System.out.println(ip.getClasse());

            ip = new IP(127, 0, 0,1);
            System.out.println(ip.getClasse());

            ip = new IP(175, 168, 9, 35);
            System.out.println(ip.getAdresseReseau().versChaine());

            ip = new IP(175, 168, 9, 35);
            IP ip1 = new IP(175, 168, 6, 39);
            if (ip.estMemeReseau(ip1))
                System.out.println("même réseau");
            else
                System.out.println("pas le même réseau");            
            
            IP ip2 = saisir();
            System.out.println(ip2.versChaine());

    }
    
}
