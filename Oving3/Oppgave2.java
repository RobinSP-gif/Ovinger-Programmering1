package Oving3;

import java.util.Scanner;

public class Oppgave2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
    try {

        while (true) {
            
            System.out.println("Skriv inn ett tall som du vil sjekke er et primtall eller ikke:, eller skriv 0 for å avslutte programmet.");
            

            if (!sc.hasNextInt()) {
                    System.out.println("Ugyldig input! Vennligst skriv inn et heltall.");
                    sc.next(); // hopper over feil input
                    continue;  // starter loopen på nytt
                }

            int tall = sc.nextInt();

            if (tall == 0) {
                System.out.println("Programmet avsluttes, takk for nå :)");
                break;
            }
        
            boolean primtall = true;

            if (tall <= 1){
                primtall = false;
            }   else {
                for (int i = 2; i <= Math.sqrt(tall); i++)
                    if (tall % i == 0) {
                        primtall = false;
                        break;
                    }
            }
        

        if (primtall){
            System.out.println("Tallet " + tall + " er ett primtall");
        } else {
             System.out.println("Tallet " + tall + " er ikke ett primtall");

        }
     }
    } 
    finally {
        sc.close();
         }

    }
}

