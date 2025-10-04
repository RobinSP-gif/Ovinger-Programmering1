
package Oving1;

import java.util.Scanner; //Importerer scanner for å kunne lese input

public class Oppgave1 {     //Starter definisjonen av klassen

public static void main(String[] args) {           //Starter programmet
    
    double cmPerTomme = 2.54;                      //Lager en variabel som lagrer konverteringsfaktoren

    Scanner scanner = new Scanner(System.in);         //Lager en scanner for input

    System.out.println("Hvor mange tommer har du?");     //Skriver ut en melding til brukeren

    double antallTommer = scanner.nextDouble();         //Leser input fra brukeren og lagrer det i antallTommer

    System.out.print(antallTommer + " tommer er lik " + antallTommer * cmPerTomme + "cm");      //Regner ut resultatet og gir svaret i cm.

    scanner.close();        //Lukker scanneren. Anbefalt når den ikke skal brukes mer. Gir ryddigere ressursbruk.

}
    
}


/* 
    Datasett for testing:

    Antall tommer       =       Antall cm
    1                   =       2.54
    2.5                 =       6.35
    4.6                 =       11.684
    10.9                =       27.686
    17.23               =       43.7642
    25.48               =       64.7192

    Programmet er testet og fungerer etter plan

    Eventuelle endringer for at programmet skal bli bedre:
        - Sette inn absoluttverdi, slik at vi ikke får ett negativt tall
        - Sette inn maks to desimaler i svaret. Man trenger ikke flere desdimaler når man jobber med cm.
*/