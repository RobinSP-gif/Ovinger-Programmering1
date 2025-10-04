
package Oving1;

import java.util.Scanner;

public class Oppgave3 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvor mange sekunder varer filmen? ");
        int sekunder = scanner.nextInt();

        int minutter = sekunder / 60;
        int sekunderIgjen = sekunder % 60;

        int timer = minutter / 60;
        int minutterIgjen = minutter % 60;

        System.out.println("Filmen varer i " + timer + " time(r), " + minutterIgjen + " minutt(er) og " + sekunderIgjen + " sekund(er)");
        
        scanner.close();

    }


}

/* 
    Datasett for testing:

    5000 sekunder   = 1time, 23minutter og 20 sekunder
    8888 sekunder   = 2 timer, 28 minutter og 8 sekunder
    13903 sekunder  = 3 timer, 51 minutter og 43 sekunder
    123 sekunder    = o timer, 2 minutter og 3 sekunder.

        Testet ok

            Programmet er ikke beskyttet mot negative tall, men siden filmer ikke har negativ tid, så bør ikke det være ett problem.

*/
