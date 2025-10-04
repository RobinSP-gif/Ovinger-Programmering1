public class Oppgave6_2 {
    public static void main(String[] args) {

        TekstAnalyse setning = new TekstAnalyse("Hei, jeg heter Robin, og går på dataingenørlinjen på NTNU Trondheim.");
        char bokstav = 'E';

        System.out.println("Det er " + setning.finnForskjelligeBokstaver()+ " forskjellige bokstaver.");
        System.out.println("Det er " + setning.finnAntallBokstaver() + " bokstaver.");
        System.out.println("Det er " + setning.finnProsentIkkeBokstaver() + "% av tegnene som ikke er bokstaver.");
        System.out.println("Det er " + setning.finnAntallForekomsterAv(bokstav) + " forekomster av bokstaven " + bokstav + ".");
        System.out.println("Det er bokstaven '" + setning.finnBokstavenSomForekommerOftest() + "' som forekommer flest ganger.");
    }
}



/*
Inndata: En setning.

Utdata:
    Finn antall forskjellige bokstaver i teksten. (kun bokstaver)
    Finn totalt antall bokstaver i teksten.
    Finn andel av teksten i prosent som ikke er bokstaver.
    Finn antall forekomster av en gitt bokstav. (bokstaven er en parameter til metoden)
    Finn bokstaven(e) som forekommer oftest i treksten.

Teksten er et objekt av klassen String.
Bruk charAt() for å få tegnet ved en bestemt posisjon.
Lengden er gitt med metoden length()

Som objektvariabel i klassen tekstanalyse skal du ha en tabell av int
    Int antallTegnt = new int(30)


Plan klasse tekstanalyse:
    1. les inn ord fra bruker:


 */