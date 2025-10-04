package Oving5.Oppgave2;

public class Test {
    public static void main(String[] args) {

    MinRandom rnd = new MinRandom();
        
    System.out.println("Heltall i intervallet [5, 10):");
        for (int i = 0; i < 10; i++) {
            System.out.print(rnd.nesteHeltall(5, 10) + " ");
        }

    System.out.println("\n\nDesimaltall i intervallet [0.2, 1.0):");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f ", rnd.nesteDesimaltall(0.2, 1.0));
        }  

    }
}
