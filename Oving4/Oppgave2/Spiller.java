package Oppgave2;

import java.util.Random;

public class Spiller {
    private int sumPoeng = 0;
    
    public int getSumPoeng(){
        return sumPoeng;
    }

    public int kastTerningen(int terning){
        Random rand = new Random();
        int kast = rand.nextInt(6) +1;
        sumPoeng += kast;
        if (kast == 1){
            sumPoeng = 0;
        }
        return kast;
    }

    public boolean erFerdig(){
        return sumPoeng > 100;
    }
}
