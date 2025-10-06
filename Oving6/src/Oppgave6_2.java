import java.util.Scanner;

public class Oppgave6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aktivProgram = 1;

        while (aktivProgram == 1) {
            System.out.println("Skriv inn teksten du vil analysere:");
            String tekst = sc.nextLine();
            TekstAnalyse analyse = new TekstAnalyse(tekst);

            System.out.println("Det er " + analyse.finnForskjelligeBokstaver() + " forskjellige bokstaver.");
            System.out.println("Det er " + analyse.finnAntallBokstaver() + " bokstaver.");
            System.out.printf("Det er %.2f%% av tegnene som ikke er bokstaver.%n", analyse.finnProsentIkkeBokstaver());
            System.out.println("Bokstaven(e) som forekommer flest ganger: " + analyse.finnBokstavenSomForekommerOftest());

            System.out.println("\nVelg hvilken bokstav du ønsker å sjekke antall forekomster av:");
            String input = sc.nextLine();
            char bokstav = input.toLowerCase().charAt(0);
            System.out.println("Det er " + analyse.finnAntallForekomsterAv(bokstav) + " forekomster av bokstaven '" + bokstav + "'.");

            System.out.println("\nVil du gjøre en ny analyse? Trykk 1 for JA, 2 for NEI:");
            aktivProgram = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Takk for nå, programmet avsluttes.");
        sc.close();
    }
}
