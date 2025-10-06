import java.util.ArrayList;
import java.util.List;

public class TekstAnalyse {

    private int[] antallTegn = new int[30]; // 0-28: a-å, 29: andre tegn

    // Konstruktør som tar inn teksten og fyller antallTegn
    public TekstAnalyse(String tekst) {
        tekst = tekst.toLowerCase();
        for (int i = 0; i < tekst.length(); i++) {
            char c = tekst.charAt(i);

            if (c >= 'a' && c <= 'z') {  // a–z
                antallTegn[c - 'a']++;
            } else if (c >= 'æ' && c <= 'å') { // æ, ø, å
                antallTegn[26 + (c - 'æ')]++;
            } else {
                antallTegn[29]++;
            }
        }
    }

    public int finnForskjelligeBokstaver() {
        int antall = 0;
        for (int i = 0; i < 29; i++) {
            if (antallTegn[i] > 0) antall++;
        }
        return antall;
    }

    public int finnAntallBokstaver() {
        int sum = 0;
        for (int i = 0; i < 29; i++) {
            sum += antallTegn[i];
        }
        return sum;
    }

    public double finnProsentIkkeBokstaver() {
        int antallIkke = antallTegn[29];
        int totalt = finnAntallBokstaver() + antallIkke;
        return (double) antallIkke * 100 / totalt;
    }

    public int finnAntallForekomsterAv(char bokstav) {
        bokstav = Character.toLowerCase(bokstav);
        if (bokstav >= 'a' && bokstav <= 'z') {
            return antallTegn[bokstav - 'a'];
        } else if (bokstav >= 'æ' && bokstav <= 'å') {
            return antallTegn[26 + (bokstav - 'æ')];
        } else {
            return antallTegn[29];
        }
    }

    public String finnBokstavenSomForekommerOftest() {
        int max = 0;
        List<Character> bokstaver = new ArrayList<>();

        for (int i = 0; i < 29; i++) {
            if (antallTegn[i] > max) {
                max = antallTegn[i];
                bokstaver.clear();
                bokstaver.add(indeksTilBokstav(i));
            } else if (antallTegn[i] == max && max > 0) {
                bokstaver.add(indeksTilBokstav(i));
            }
        }

        return bokstaver.toString();
    }

    private char indeksTilBokstav(int i) {
        if (i >= 0 && i <= 25) return (char) ('a' + i);
        else if (i == 26) return 'æ';
        else if (i == 27) return 'ø';
        else return 'å';
    }
}
