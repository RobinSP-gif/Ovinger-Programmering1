package Oving5.Oppgave1;

public class Brok {

    private int teller;
    private int nevner;

    Brok(int teller, int nevner){
        if (nevner == 0){
            throw new IllegalArgumentException("Kan ikke dele på 0!");
        }
        this.teller = teller;
        this.nevner = nevner;
    }
    
    public Brok(int teller){
        nevner = 1;
        this.teller = teller;
    }

    int getTeller(){            //Trengs dette?
        return teller;
    }
    
    int getNevner(){            //Trengs dette?
        return nevner;
    }

    public void addisjon (Brok annen){

        int nyTeller = this.teller * annen.nevner + annen.teller * this.nevner;
        int nyNevner = this.nevner  * annen.nevner;
        this.teller = nyTeller;
        this.nevner = nyNevner;

        forkortBrok();
    }

    public void subtraksjon(Brok annen) {

        int nyTeller = this.teller * annen.nevner - annen.teller * this.nevner;
        int nyNevner = this.nevner  * annen.nevner;
        this.teller = nyTeller;
        this.nevner = nyNevner;

        forkortBrok();
    }

    public void multiplikasjon (Brok annen) {

        int nyTeller = this.teller * annen.teller;
        int nyNevner = this.nevner * annen.nevner;
        this.teller = nyTeller;
        this.nevner = nyNevner;

        forkortBrok();
    }

    public void divisjon (Brok annen) {
        if (annen.teller == 0){
            throw new IllegalArgumentException("Kan ikke dele på 0!");
        }
        
        int nyTeller = this.teller * annen.nevner;
        int nyNevner = this.nevner * annen.teller;
        this.teller = nyTeller;
        this.nevner = nyNevner;

        forkortBrok();
    }

    public static int gcd(int a, int b) {   //Euklids algoritme
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void forkortBrok(){
        int gcd = gcd(this.teller, this.nevner);
        this.teller /= gcd;
        this.nevner /= gcd;
    }

    public String toString() {      //For å få ut rett svar
        if (nevner == 1){
            return Integer.toString(teller);
        }
        else {
            return teller + "/" + nevner;
        }
    }
}
