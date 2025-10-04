package Oving2;

import java.util.Scanner;

public class Oppgave2 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvor mye koster vare A?"); //35,90
        double prisVareA = scanner.nextDouble();

        System.out.println("Hva veier vare A i gram?"); //450
        double vektVareA = scanner.nextDouble();

        System.out.println("Hvor mye koster vare B?");  //39,50
        double prisVareB = scanner.nextDouble();

        System.out.println("Hva veier vare B i gram?"); //500
        double vektVareB = scanner.nextDouble();


        double vareAKiloPris = (prisVareA / vektVareA) * 1000;
        double vareBKiloPris = (prisVareB / vektVareB) * 1000;

        if (vareAKiloPris == vareBKiloPris) {
            System.out.println("Begge varene koster " + String.format("%.2f", vareBKiloPris) + "kr per kilo");
        }
        else if (vareAKiloPris > vareBKiloPris) {
            System.out.println("Vare B har billigst kilopris med " + String.format("%.2f", vareBKiloPris) + "kr per kilo, mens vare A har kilospris " + String.format("%.2f", vareAKiloPris) + "kr per kilo");
        }
        else {
            System.out.println("Vare A har billigst kilopris med " + String.format("%.2f", vareAKiloPris) + "kr per kilo, mens vare B har kilospris " + String.format("%.2f", vareBKiloPris));
        }

        scanner.close();
    }

}
