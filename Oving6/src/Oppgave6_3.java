public class Oppgave6_3 {
    public static void main(String[] args) {

                int[][] a = {{1, 2, 3}, {3, 4, 3}, {7, 8, 9}};
                int[][] b = {{5, 6, 1}, {7, 8, 4}, {10, 11, 1}};

                Matrise m1 = new Matrise(a);
                Matrise m2 = new Matrise(b);

                Matrise addisjon = m1.add(m2);
                Matrise multiplisere = m1.multiply(m2);
                Matrise transponering = m1.transponering();

                System.out.println("Matrise 1:\n" + m1);
                System.out.println("Matrise 2:\n" + m2);
                System.out.println("M1 + M2 er lik:\n" + addisjon);

                System.out.println("M1 * M2 er lik\n" + multiplisere);

                System.out.println("M1 transponert er lik\n" + transponering);

            }
        }



