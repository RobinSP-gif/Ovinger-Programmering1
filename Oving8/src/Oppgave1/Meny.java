package Oppgave1;

import java.util.Scanner;

public class Meny {
    public static void main(String[] args) {
        AnsattDatabase db = new AnsattDatabase();

        Person P1 = new Person("Robin","Strand", "Prestmo", 1998);
        Person P2 = new Person("Hans", "Gruber", 1968);
        ArbTaker A1 = new ArbTaker(P1, 1,2020, 55000, 37.5);
        ArbTaker A2 = new ArbTaker(P2, 2, 2023, 43200, 36);

        db.leggTilAnsatt(A1);
        db.leggTilAnsatt(A2);

        boolean aktivtProgram = true;
        Scanner sc = new Scanner(System.in);

        while (aktivtProgram) {
            System.out.println("\nHva vil du gjøre?:" +
                    "\n1 Se alle ansatte" +
                    "\n2 Legge til ny ansatt" +
                    "\n3 Endre detaljer på ansatte" +
                    "\n0 Avslutte programmet");
            int valg = sc.nextInt();
            sc.nextLine();


            switch (valg){
                case 1: //Se ansatte
                    db.skrivUtAlle();
                    break;

                case 2: //Legg til ny ansatt


                        System.out.print("Fornavn: ");
                        String fornavn = sc.nextLine();
                        System.out.print("Etternavn: ");
                        String etternavn = sc.nextLine();
                        System.out.print("Mellomnavn (trykk enter hvis ingen): ");
                        String mellomnavn = sc.nextLine();
                        System.out.print("Fødselsår: ");
                        int fodselsaar = sc.nextInt();
                        sc.nextLine();

                        Person nyPerson;
                        if (mellomnavn.isEmpty()){
                            nyPerson = new Person(fornavn, etternavn, fodselsaar);
                        }
                        else {
                            nyPerson = new Person(fornavn, mellomnavn, etternavn, fodselsaar);
                        }

                        System.out.print("Ansattnr: ");
                        int ansattnr = sc.nextInt();
                        System.out.print("Ansattår: ");
                        int ansattAar = sc.nextInt();
                        System.out.print("Månedslønn: ");
                        double maanedslonn = sc.nextDouble();
                        System.out.print("Skattetrekk %: ");
                        double skattetrekk = sc.nextDouble();

                        ArbTaker nyAnsatt = new ArbTaker(nyPerson, ansattnr, ansattAar, maanedslonn, skattetrekk);
                        db.leggTilAnsatt(nyAnsatt);
                        break;


                case 3: //Endre lønn og skatt på ansatt

                    System.out.println("Velg en ansatt (1 til " + (db.antallAnsatte()) + "):");
                    int indeks = sc.nextInt() -1;
                    sc.nextLine();
                    ArbTaker valgt = db.hentAnsatt(indeks);
                    System.out.println(valgt);
                    System.out.println("\nHva vil du endre?" +
                            "\n1 Lønn" +
                            "\n2 Skatt" +
                            "\n3 Lønn og skatt" +
                            "\n4 Gå tilbake");
                    int valg2 = sc.nextInt();

                    if(valg2 == 1) {
                        System.out.print("Ny månedslønn: ");
                        double nyLonn = sc.nextDouble();
                        sc.nextLine();

                        valgt.setManedsLonn(nyLonn);
                    }

                    else if (valg2 == 2) {
                        System.out.print("Ny skattetrekk %: ");
                        double nySkatt = sc.nextDouble();
                        sc.nextLine();

                        valgt.setSkatteTrekkProsent(nySkatt);
                    }

                    else if (valg2 == 3) {
                        System.out.print("Ny månedslønn: ");
                        double nyLonn = sc.nextDouble();
                        System.out.print("Ny skattetrekk %: ");
                        double nySkatt = sc.nextDouble();
                        sc.nextLine();

                        valgt.setManedsLonn(nyLonn);
                        valgt.setSkatteTrekkProsent(nySkatt);

                    }
                    else break;


                    System.out.println("Oppdatert info for " + valgt.getPerson().getFornavn() + ":");
                    System.out.println(valgt);
                    break;


                default:
                    aktivtProgram = false;
                    break;

            }

        }

        sc.close();
    }
}


