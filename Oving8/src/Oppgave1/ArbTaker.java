package Oppgave1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ArbTaker {
      private final Person person;
      private final int arbeidstakerNr;
      private final int ansettelsesAar;
      private double manedsLonn;
      private double skatteTrekkProsent;

      public ArbTaker(Person person, int arbeidstakerNr, int ansettelsesAar, double manedsLonn, double skatteTrekkProsent) {
            this.person = person;
            this.arbeidstakerNr = arbeidstakerNr;
            this.ansettelsesAar = ansettelsesAar;
            this.manedsLonn = manedsLonn;
            this.skatteTrekkProsent = skatteTrekkProsent;

        }

      //Get metoder
      public Person getPerson(){
        return person;
      }
      public int getArbeidstakerNr(){
        return arbeidstakerNr;
      }
      public int getAnsettelsesAar(){
        return ansettelsesAar;
      }

      public double getbruttoLonnPrAar(){
        return manedsLonn;
      }

      public double getSkatteTrekkProsent(){
        return skatteTrekkProsent;
      }

      public String getNavn(){
        return (person.getEtternavn() + " " + person.getFornavn());
      }


      //Set metoder
      public void setManedsLonn(double lonn){
        this.manedsLonn = lonn;
      }

      public void setSkatteTrekkProsent(double skattetrekkprosent){
        this.skatteTrekkProsent = skattetrekkprosent;
      }



      //Andre metoder
      public int hentNaaVaerendeAar(){      //Henter året som er
          GregorianCalendar kalender = new GregorianCalendar();
          return kalender.get(Calendar.YEAR);
      }

      public double skattPerMaaned(){
        return (this.manedsLonn * this.skatteTrekkProsent / 100);
      }

      public double bruttoAarslonn(){
        return (manedsLonn * 12);
      }

      public double skatteTrekkPrAar(){
        double skattDesember = skattPerMaaned() / 2;
        double skattRestenAvAaret = skattPerMaaned() * 10;
        return (skattRestenAvAaret + skattDesember);
      }

      public String ansattIAntallAar(){
        int ansattIXAntallAar = hentNaaVaerendeAar() - getAnsettelsesAar();
        if (ansattIXAntallAar == 0){
          return ("Denne arbeidstakeren ble ansatt i år.");
        }
        else{
          return (Integer.toString(ansattIXAntallAar));
        }
      }

      public String harArbeidtakerVaertAnsattXAntallAar(int aar){
        if ((hentNaaVaerendeAar() - aar) > getAnsettelsesAar()) {
          return ("Arbeidstakeren har vært ansatt i mer enn " + aar + " år.");
        }
        else if ((hentNaaVaerendeAar() - aar) == getAnsettelsesAar()){
          return ("Arbeidstakeren har akkurat vært ansatt i " + aar + " år.");
        }
        else {
          return ("Arbeidstakeren har ikke vært ansatt i " + aar + " år.");
        }
      }

    @Override
    public String toString() {
        return "\nArbeidstaker nr: " + arbeidstakerNr + "\n" +
                "Navn: " + person.toString() + "\n" +
                "Ansatt siden: " + ansettelsesAar + " (" + ansattIAntallAar() + " år)" + "\n" +
                "Månedslønn: " + manedsLonn + " kr\n" +
                "Skattetrekk: " + skatteTrekkProsent + "%\n" +
                "Bruttolønn pr år: " + bruttoAarslonn() + " kr\n" +
                "Skatt pr år: " + skatteTrekkPrAar() + " kr";
    }
}
