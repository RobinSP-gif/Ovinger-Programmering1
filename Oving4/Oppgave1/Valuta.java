package Oppgave1;

public class Valuta {
    private double kursNokTilDollar = 0.1014;
    private double kursDollarTilNok = 9.86;
    private double kursNokTilEuro = 0.086;
    private double kursEuroTilNok = 11.57;
    private double kursNokTilSek = 0.95;
    private double kursSekTilNok = 1.06;
    
    public double nokTilDollar(double belop){
        return (belop*kursNokTilDollar);
    }
    public double dollarTilNok(double belop){
        return (belop*kursDollarTilNok);
    }
    public double nokTilEuro(double belop){
        return (belop*kursNokTilEuro);
    }
    public double euroTilNok(double belop){
        return (belop*kursEuroTilNok);
    }
    public double nokTilSek(double belop){
        return (belop*kursNokTilSek);
    }
    public double sekTilNok(double belop){
        return (belop*kursSekTilNok);
    }
}
