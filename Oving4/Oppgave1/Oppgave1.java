package Oppgave1;

import java.util.Scanner;

public class Oppgave1 {
    public static void main(String[] args) {
        int aktivtProgram = 0;
        Scanner sc = new Scanner(System.in);
        Valuta v = new Valuta();

        while (aktivtProgram != 1 && aktivtProgram != 2){
        System.out.println("Ønsker du å regne om fra norske kroner til en annen valuta, trykk 1\nØnsker du å regne om til norske kroner fra en annen valuta, trykk 2");
        aktivtProgram = sc.nextInt();
            if (aktivtProgram != 1 && aktivtProgram != 2){
                System.out.println("Du valgte ikke et gyldig valg, prøv igjen.");
            }
        }
              

        while (aktivtProgram == 1) {
            System.out.println("Hei, velg hvilken valuta du ønsker å regne om til. \n1, Dollar\n2, Euro\n3, Svenske kroner\n4 for å avslutte programmet.");
            int valg = sc.nextInt();
            
            if (valg == 1){ //Dollar
                System.out.println("Skriv inn ditt beløp i norske kroner.");
                double belop = sc.nextDouble();
                System.out.println(belop + " norske kroner er "+ v.nokTilDollar(belop) + " Dollar\n");

            }

            else if (valg == 2){ //Euro
                System.out.println("Skriv inn ditt beløp i norske kroner.");
                double belop = sc.nextDouble();
                System.out.println(belop + " norske kroner er "+ v.nokTilEuro(belop) + " Euro\n");
            }

            else if (valg == 3){ //Svenske kroner
                System.out.println("Skriv inn ditt beløp i norske kroner.");
                double belop = sc.nextDouble();
                System.out.println(belop + " norske kroner er "+ v.nokTilSek(belop) + " Svenske kroner\n");
            }

            else { //Avslutt program
                System.out.println("Programmet avsluttes.");
                aktivtProgram = 0;
                return;
            }
        }


        while (aktivtProgram == 2) {
            System.out.println("Hei, velg hvilken valuta du ønsker å regne om ifra. \n1, Dollar\n2, Euro\n3, Svenske kroner\n4 for å avslutte programmet.");
            int valg = sc.nextInt();
            
            if (valg == 1){ //Dollar
                System.out.println("Skriv inn ditt beløp i dollar.");
                double belop = sc.nextDouble();
                System.out.println(belop + " dollar er "+ v.dollarTilNok(belop) + " norske kroner\n");

            }

            else if (valg == 2){ //Euro
                System.out.println("Skriv inn ditt beløp i norske kroner.");
                double belop = sc.nextDouble();
                System.out.println(belop + " euro er "+ v.euroTilNok(belop) + " norske kroner\n");
            }

            else if (valg == 3){ //Svenske kroner
                System.out.println("Skriv inn ditt beløp i norske kroner.");
                double belop = sc.nextDouble();
                System.out.println(belop + " svenske kroner er "+ v.sekTilNok(belop) + " norske kroner\n");
            }

            else { //Avslutt program
                System.out.println("Programmet avsluttes.");
                aktivtProgram = 0;
                
                return;
            }
            
        }        
        sc.close();    
    }
}