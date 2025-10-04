package Oving3;

import java.util.Scanner;


public class Oppgave1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    

    try{
        int[] tabell = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println("Skriv inn heltallene du vil lage gangetabeller for (separer med ett mellomrom):");
        String linje = sc.nextLine();

        String[] deler = linje.split(" ");

        int[] gangeNr = new int[deler.length];

        for (int i = 0; i < deler.length; i++) {
            try{ 
                gangeNr[i] = Integer.parseInt(deler[i]);
            } catch (NumberFormatException e) {
                System.out.println("Ugyldig input: '" + deler[i] + "' er ikke et heltall.");
                return;
            }
        } 

        for (int g : gangeNr) {
            System.out.println("Gangetabellen til " + g + ":");

            for (int t : tabell) {
                int resultat = g * t;
                System.out.println(g + " * " + t + " = " + resultat);
            }
            System.out.println();
        }
    }
        finally { 
            sc.close();

        }
    }
    
}
