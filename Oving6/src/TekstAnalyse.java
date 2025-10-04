import java.util.HashSet;
import java.util.Set;

public class TekstAnalyse {

    // Instansvariabler:
    private String setning;


    // Konstruktører:
    public TekstAnalyse(String n){
        setning = n.toLowerCase();

    }


    //Metoder:
    public int finnForskjelligeBokstaver(){
        Set<Character> bokstaver = new HashSet<>();

        for (char c : setning.toCharArray()){
            if(Character.isLetter(c)){
                bokstaver.add(c);
            }
        }
        return bokstaver.size();
    }

    public int finnAntallBokstaver(){
        int antall = 0;
        for (int i = 0; i < setning.length(); i++) {
            char c = setning.charAt(i);
            if (Character.isLetter(c)) {
                antall++;
            }
        }
        return antall;
    }

    public double finnProsentIkkeBokstaver(){
        int antallBokstaver = 0;
        int antallIkkeBokstaver = 0;
        for (int i = 0; i < setning.length(); i++) {
            char c = setning.charAt(i);
            if (Character.isLetter(c)) {
                antallBokstaver++;
            }
            else {
                antallIkkeBokstaver++;
            }
        }
        return (double) (antallIkkeBokstaver * 100) / (antallBokstaver + antallIkkeBokstaver);

    }
    public int finnAntallForekomsterAv(char bokstav){
        int antall = 0;
        char sok = Character.toLowerCase(bokstav);

        for (int i = 0; i < setning.length(); i++){
            if (setning.charAt(i) == sok){
                antall++;
            }
        }
        return antall;
    }

    public char finnBokstavenSomForekommerOftest() {
        int[] teller = new int[29];

        for (char c : setning.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';             // finner riktig plass i arrayet
                teller[index]++;
            }
        }

        int maxTeller = 0;
        int maxIndex = 0;

        for (int i = 0; i < teller.length; i++) {
            if (teller[i] > maxTeller) {
                maxTeller = teller[i];
                maxIndex = i;
            }
            char OftestBokstav = (char) ('a' + maxIndex);

        }
        return (char) ('a' + maxIndex);
    }


    public String toString() {      //For å få ut rett svar
        return setning;
    }
}