
package Oving1;

import java.util.Scanner;

public class Oppgave2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvor mange hele timer varer filmen?");
        double timer = scanner.nextDouble();
        
        System.out.println("Hvor mange hele minutter varer filmen?");
        double minutter = scanner.nextDouble();

        System.out.println("Hvor mange sekunder varer filmen");
        double sekunder = scanner.nextDouble();

        double timerTilSekunder = timer * 60 * 60; 
        double minutterTilSekunder = minutter * 60;

        System.out.println("Hele filmen varer i " + (timerTilSekunder + minutterTilSekunder + sekunder) + " sekunder");

        scanner.close();

    }

}

/*  Datasett for testing:

    1time, 45minutter, 23sekunder       = 6323 sekunder
    0timer, 59minutter, 40sekunder      = 3580 sekunder
    4timer, 43minutter, 0sekunder       = 16980 sekunder 

    Testet ok

    Programmet er ikke beskyttet mot negative tall, men siden filmer ikke har negativ tid, så bør ikke det være ett problem.
   
 */

