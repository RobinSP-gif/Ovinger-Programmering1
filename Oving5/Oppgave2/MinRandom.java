package Oving5.Oppgave2;

import java.util.Random;

public class MinRandom {

    private Random tilfeldig;

    public MinRandom(){
        tilfeldig = new Random();
    }

    public int nesteHeltall(int nedre, int ovre){ 
        if (ovre <= nedre) {
            throw new IllegalArgumentException("Øvre må være større enn nedre");
        }
        return nedre + tilfeldig.nextInt(ovre-nedre);
    }

    public double nesteDesimaltall(double nedre, double ovre) {
        if (ovre <= nedre) {
            throw new IllegalArgumentException("Øvre må være større enn nedre");
        }
        return nedre + tilfeldig.nextDouble() * (ovre - nedre);
    }
}