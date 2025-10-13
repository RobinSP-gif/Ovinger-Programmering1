public class Oppgave_7_1 {
    public static void main(String[] args) {
        NyString tekst = new NyString("Hallo, dette er oppgave 7.1");

        System.out.println(tekst);
        System.out.println("\nHer er '" + tekst + "' forkortet til \n" + tekst.splittTekst());
        System.out.println("\nHer er bokstaven 'e' fjernet fra '" + tekst + "' \n" + tekst.fjernEnBokstav("E"));

    }
}



class NyString {
    //Objektvariabler
    private final String tekst;

    //Konstruktører
    public NyString(String tekst){
        this.tekst = tekst;
    }

    //Metoder
    public String splittTekst(){
        String[] nyTekst = tekst.split(" ");
        String forkortelse = "";
        for (String ord : nyTekst){
            forkortelse += ord.charAt(0);

        }
        return forkortelse;
    }

    public String fjernEnBokstav(String bokstav) {
        String litenTekst = tekst.toLowerCase();
        String litenBokstav = bokstav.toLowerCase();

        String resultat = "";
        int start = 0;
        int indeks = litenTekst.indexOf(litenBokstav, start);

        while (indeks != -1) {
            resultat += tekst.substring(start, indeks);
            start = indeks + 1;
            indeks = tekst.indexOf(litenBokstav, start);
        }

        resultat += tekst.substring(start);
        return resultat;
    }

    @Override
    public String toString() {
        return tekst;
    }

}