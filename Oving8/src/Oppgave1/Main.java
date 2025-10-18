package Oppgave1;

public class Main {
  public static void main(String[] args) {
  Person P1 = new Person("Robin", "Prestmo", 1998);
  Person P2 = new Person("Hans", "Gruber", 1968);
  ArbTaker A1 = new ArbTaker(P1, 0001,2020, 55000, 37.5);
  ArbTaker A2 = new ArbTaker(P2, 0002, 2023, 43200, 36);

    System.out.println(A1.harArbeidtakerVaertAnsattXAntallAar(3));

  }
}
