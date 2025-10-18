package Oppgave1;
public class ArbTaker {
      private final Person person;
      private final int arbeidstakerNr;
      private final int ansettelsesAar;
      private double manedsLonn;
      private double skatteTrekkProsent;

      public ArbTaker(Person person, int arbeidstakerNr, int ansettelsesAar, double manedsLonn, double skatteTrekkProsent) { //Bør person her endres? slik at vi legger inn navn, og fødselsår her?
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

      public double skattPerMaaned(){
        return (this.manedsLonn * this.skatteTrekkProsent / 100);
      }

      public double bruttoLonn(){
        return (manedsLonn * 12);
      }

      public double skatteTrekkPrAar(){
        double skattDesember = skattPerMaaned() / 2;
        double skattRestenAvAaret = skattPerMaaned() * 10;
        return (skattRestenAvAaret + skattDesember);
      }

      public String ansattIAntallAar(){
        int ansattIXAntallAar = 2025 - getAnsettelsesAar();
        if (ansattIXAntallAar == 0){
          return ("Denne arbeidstakeren ble ansatt i år.");
        }
        else{
          return (Integer.toString(ansattIXAntallAar) + " år");
        }
      }

      public String harArbeidtakerVaertAnsattXAntallAar(int aar){
        if (aar > getAnsettelsesAar()) {
          return ("Arbeidstakeren har ikke vært ansatt i " + aar + " år.");
        }
        else if (aar == getAnsettelsesAar()){
          return ("Arbeidstakeren har akkurat vært ansatt i " + aar + " år.");
        }
        else {
          return ("Arbeidstakeren har vært ansatt i mer enn " + aar + " år.");  //TEST!!!!
        }
      }
}
