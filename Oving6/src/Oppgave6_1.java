
import java.util.Random;

public class Oppgave6_1 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] antall = new int[10];

        for (int i = 0; i < 1000; i++){
            int tall = random.nextInt(10);
            antall[tall]++;
        }

        for (int i = 0; i < antall.length; i++) {
            System.out.println(i + " ble trukket " + antall[i] + " ganger.");

            int antallI = antall[i];
            int delPaaTi = (int)Math.round(antallI / 10.0);

            String stjerner = "*".repeat(delPaaTi);

            System.out.println(i + " " + antall[i] + " " + stjerner);
            System.out.println(" ");
            }
        }
    }

