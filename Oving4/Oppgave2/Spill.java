package Oppgave2;

public class Spill {
    public static void main(String[] args) {
        
        Spiller s1 = new Spiller();
        Spiller s2 = new Spiller();
        int runde = 1;

        while ((s1.erFerdig() == false) && (s2.erFerdig() == false)) {
            System.out.println("Runde: " + runde);
            runde += 1;
            int kast1 = s1.kastTerningen(6);
            System.out.println("Spiller 1 kastet " + kast1 + " ny sum er: " + s1.getSumPoeng()); 

            int kast2 = s2.kastTerningen(6);
            System.out.println("Spiller 2 kastet " + kast2 + " ny sum er: " + s2.getSumPoeng());

        }
        
        if (s1.getSumPoeng() == s2.getSumPoeng()){
            System.out.println("Spill ferdig, det ble uavgjort, begge spillerne fikk  " + s1.getSumPoeng() + " poeng.");
        }
        else if (s1.getSumPoeng() > s2.getSumPoeng()){
            System.out.println("Spill ferdig, spiller 1 vant med  " + s1.getSumPoeng() + " poeng.");
            }
        else{
            System.out.println("Spill ferdig, spiller 2 vant med  " + s2.getSumPoeng() + " poeng."); 
            }  
        }
}
