package Oppgave1;

public class Testklient {
  public static void main(String[] args) {
  Person P1 = new Person("Robin","Strand", "Prestmo", 1998);
  ArbTaker A1 = new ArbTaker(P1, 1,2020, 55000, 37.5);

    System.out.println(P1.getFornavn() + " betaler " +A1.skattPerMaaned() + "kr i skatt per måned.");
    System.out.println("Bruttoårslønnen til " + P1.getFornavn() + " er på " + A1.bruttoAarslonn() + "kr.");
    System.out.println(P1.getFornavn() + " betaler " + A1.skatteTrekkPrAar() + "kr i skatt i året");
    System.out.println(P1.getFornavn() + " har vært ansatt i " + A1.ansattIAntallAar() + " år.");
    System.out.println(A1.harArbeidtakerVaertAnsattXAntallAar(4));
    System.out.println("\n" + A1);

  }
}