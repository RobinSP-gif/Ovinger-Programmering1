public class Oppgave_7_2 {
    public static void main(String[] args) {
    Tekstbehandling tb = new Tekstbehandling(
            "\nDette er en setning for testing av denne koden. \n" +
            "Vi skriver en lengre tekst for å teste mere. \n" +
            "Dette er viktig å kunne telle ord i java! \n" +
            "Er dette lett eller vanskelig? \n" +
            "Svaret er: \n" +
            "Det er litt vanskelig, men morsomt.\n");

        System.out.println(tb.hentTekst());
        System.out.println("Det er " +tb.finnAntallOrd() + " antall ord i denne teksten.");
        System.out.println("Det er ca " + tb.finnGjennomsnitlingOrdlengde() + " bokstaver igjennomsnitt per ord.");
        System.out.println("Det er ca " + tb.finnGjennomsnitligAntallOrdPerPeriode() + " ord per setning.");
        System.out.println("\nHer har vi byttet ut ordet 'er' med ordet 'KULT': \n" + tb.byttUtEtOrd(" er ", " KULT "));
        System.out.println(tb.hentTekstMedStoreBokstaver());

    }
}

class Tekstbehandling{

    //Objekt variabler
    private final String tekst;

    //Konstruktører
    public Tekstbehandling(String tekst){
        this.tekst = tekst;
    }

    //Metoder
    public int finnAntallOrd(){
        int antallOrd = 0;
        String[] ord = tekst.split(" ");
        for (String ordene : ord){
            antallOrd ++;
        }
        return antallOrd;
    }

    public int finnGjennomsnitlingOrdlengde(){
        int antallBokstaver = 0;
        double antallOrd = finnAntallOrd();
        String[] ord = tekst.split(" ");
        for (String o : ord){
            antallBokstaver += o.length();
        }

        return (int) Math.round(antallBokstaver / antallOrd);
    }

    public int finnGjennomsnitligAntallOrdPerPeriode(){
        int antallOrdPerPeriode = 0;
        int antallPerioder = 0;
        String[] periode = tekst.split("[\\.\\?\\!\\:]\\s*");
        for (String periodene : periode) {
            antallPerioder++;
            int antallOrd = 0;
            String[] ord = periodene.split(" ");
            for (String ordene : ord) {
                antallOrd++;
            }
            antallOrdPerPeriode += antallOrd;
        }

        return Math.round((float)antallOrdPerPeriode / antallPerioder);
    }

    public String byttUtEtOrd (String gammeltOrd, String nyttOrd){
        return (tekst.replace(gammeltOrd, nyttOrd));
    }

    public String hentTekst(){
        return tekst;
    }

    public String hentTekstMedStoreBokstaver(){
        return tekst.toUpperCase();
    }
}