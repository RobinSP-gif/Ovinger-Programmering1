package Oppgave1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ArbTaker {
      private final Person person;
      private final int ansattNr;
      private final int ansettelsesAar;
      private double manedsLonn;
      private double skatteTrekkProsent;

      public ArbTaker(Person person, int ansattNr, int ansettelsesAar, double manedsLonn, double skatteTrekkProsent) {
            this.person = person;
            this.ansattNr = ansattNr;
            this.ansettelsesAar = ansettelsesAar;
            this.manedsLonn = manedsLonn;
            this.skatteTrekkProsent = skatteTrekkProsent;

        }

      //Get metoder
      public Person getPerson(){
        return person;
      }
      public int getAnsattNr(){
        return ansattNr;
      }
      public int getAnsettelsesAar(){
        return ansettelsesAar;
      }

      public double getbruttoLonnPrAar(){
        return (manedsLonn * 12);
      }

      public double getSkatteTrekkProsent(){
        return skatteTrekkProsent;
      }

      public String getNavn(){
          if (person.getMellomnavn().isEmpty()) {
              return (person.getEtternavn() + ", " + person.getFornavn());
          } else {
              return (person.getEtternavn() + ", " + person.getFornavn() + " " + person.getMellomnavn());
        }
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

      public double skattPerMaaned(){   //Beregner skatt per måned
        return (this.manedsLonn * this.skatteTrekkProsent / 100);
      }

      public double bruttoAarslonn(){   //Beregner brutto årslønn
        return (manedsLonn * 12);
      }

      public int alder(){   //Beregner alder
          return (hentNaaVaerendeAar() - person.getFodselsaar());
      }

      public double skatteTrekkPrAar(){ //Beregner skatt per år (minus juni og halv desember)
        double skattDesember = skattPerMaaned() / 2;
        double skattRestenAvAaret = skattPerMaaned() * 10;
        return (skattRestenAvAaret + skattDesember);
      }

      public String ansattIAntallAar(){     //Beregner hvor lenge arbeidstaker har vært ansatt
        int ansattIXAntallAar = hentNaaVaerendeAar() - getAnsettelsesAar();
        if (ansattIXAntallAar == 0){
          return ("Denne arbeidstakeren ble ansatt i år");
        }
        else{
          return (Integer.toString(ansattIXAntallAar) + " år");
        }
      }

      public String harArbeidtakerVaertAnsattXAntallAar(int aar){   //Finner ut om arbeidstaker har vært ansatt mer, mindre eller akkurat ett gitt antall år
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
        return "\nAnsatt nr: " + ansattNr + "\n" +
                "Navn: " + person.toString() + "\n" +
                "Alder: " + alder() + " år\n" +
                "Ansatt siden: " + ansettelsesAar + " (" + ansattIAntallAar() + ")" + "\n" +
                "Månedslønn: " + manedsLonn + " kr\n" +
                "Skattetrekk: " + skatteTrekkProsent + "%\n" +
                "Bruttolønn pr år: " + bruttoAarslonn() + " kr\n" +
                "Skatt pr år: " + skatteTrekkPrAar() + " kr";
    }
}
