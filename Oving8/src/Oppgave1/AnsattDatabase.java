package Oppgave1;

import java.util.ArrayList;

public class AnsattDatabase {
    private ArrayList<ArbTaker> ansatte = new ArrayList<>();

    public void leggTilAnsatt(ArbTaker nyAnsatt) {
        ansatte.add(nyAnsatt);
    }

    public void skrivUtAnsatt(int indeks) {
        if(indeks >= 0 && indeks < ansatte.size()) {
            ArbTaker a = ansatte.get(indeks);
            System.out.println(a);
        } else {
            System.out.println("Ugyldig valg!");
        }
    }

    public void skrivUtAlle() {
        for(ArbTaker a : ansatte) {
            System.out.println(a);
        }
    }

    public int antallAnsatte() {
        return ansatte.size();
    }

    public ArbTaker hentAnsatt(int indeks) {
        if(indeks >= 0 && indeks < ansatte.size()) {
            return ansatte.get(indeks);
        }
        return null;
    }
}
