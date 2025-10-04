package Oving2;

import java.util.Scanner;

public class Oppgave1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vil du skrive inn eget år så svarer du: 1 ellers så kan du bruke forhåndlaget liste ved å svare: 2 ?");
        int svar = scanner.nextInt();
        
        int[] testListe = { 1999, 2000, 2001, 2002, 2003, 2004, 2005, 1900, 2000, 2100, 2200, 2300, 2400};
        
        if (svar == 1) {
            System.out.println("Hvilket år er det?");
            int aar = scanner.nextInt();
            sjekkSkuddAar(aar);
        }

        else if (svar == 2) {
            for (int aar : testListe) {
            sjekkSkuddAar(aar);
            }
        }
        
    scanner.close();

        

        }
        
    public static void sjekkSkuddAar(int aar) {
        if (aar % 400 == 0) {   //Dette sjekker om et århundre er ett skuddår
            System.out.println("Året " + aar + " er ett skuddår");
        }
        else if (aar % 100 == 0){   //Dette bekrefter at eventuelle andre århundre ikke er ett skuddår
            System.out.println("Året " + aar + " er ikke ett skuddår");
        }
        else if (aar % 4 == 0) {    //Dette sjekker om andre år er skuddår
            System.out.println("Året " + aar + " er ett skuddår");
        }
        else {  //Denne sier til slutt at året ikke er skuddår
            System.out.println("Året " + aar + " er ikke ett skuddår");
        }

            
   

        
    }
}

