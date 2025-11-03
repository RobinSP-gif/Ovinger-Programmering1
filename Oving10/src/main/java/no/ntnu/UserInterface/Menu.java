package no.ntnu.UserInterface;

import no.ntnu.Models.Event;
import no.ntnu.Service.EventService;
import java.util.Scanner;

public class Menu{
  private final EventService service;
  private final Scanner sc = new Scanner(System.in);

  public Menu (EventService service) {
    this.service = service;

  }

  public void start() {
    boolean running = true;
    while (running) {

      userMenu();
      int choise = sc.nextInt();
      sc.nextLine();

      switch (choise){  // Ikke beskyttet for tomme felt
        case 1:
          System.out.println("Navn på arrangement: ");
          String nameOfEvent = sc.nextLine();

          System.out.println("Hvor er arrangementet? ");
          String location = sc.nextLine();

          System.out.println("Hvem er ansvarlig for arrangementet? ");
          String host = sc.nextLine();

          System.out.println("Hva slags type arrangement er det? ");
          String typeOfEvent = sc.nextLine();

          System.out.println("Når er det? Skriv inn i dette formatet med 12 siffer: YYYYMMDDHHmm");
          long time = sc.nextLong();
          sc.nextLine();

          Event event = new Event(nameOfEvent, location, host, typeOfEvent, time);
          service.registerEvent(event);
          break;

        case 2:
          var all = service.getAllEvents();
          if (all.isEmpty()) System.out.println("Ingen arrangementer.");
          else all.forEach(System.out::println);
          break;


        case 3:
          System.out.println("Velg stedet du vil filtrere på: ");
          String location1 = sc.nextLine();
          var results = service.findEventsByLocation(location1);

          if (results.isEmpty()){
            System.out.println("Det er ingen arrangementer på dette stedet, sjekk at du har skrevet riktig.");
          } else {
            results.forEach(System.out::println);
          }
          break;

        case 4:
          System.out.println("Velg ett tidspunkt du ønsker å søke etter: \nHusk å skrive tidspunktet slik; YYYYMMDDHHmm");
          long dateAndTime = sc.nextLong();
          sc.nextLine();
          var results2 = service.findEventsByDate(dateAndTime);

          if (results2.isEmpty()) {
            System.out.println("Det er ingen arrangementer på dette tidspunktet");
          } else {
            results2.forEach(System.out::println);
          }
          break;

        case 5:
          System.out.println("Velg tidspunktet du vil filtrere fra: \nHusk  å skrive tidspunkt slik YYYYMMDDHHmm");
          long dateAndTime1 = sc.nextLong();
          sc.nextLine();

          System.out.println("Velg tidspunktet du vil filtrere til: \nHusk  å skrive tidspunkt slik YYYYMMDDHHmm");
          long dateAndTime2 = sc.nextLong();
          sc.nextLine();
          var results1 = service.findEventsBetweenDates(dateAndTime1,dateAndTime2);

          if (results1.isEmpty()) {
            System.out.println("Det er ingen arrangementer på dette tidspunktet");
          } else {
            results1.forEach(System.out::println);
          }
          break;

        case 6:
          System.out.println("""
            Hvordan vil du sortere listen?
            1. Lokasjon
            2. Type arrangement
            3. Tidspunkt
            0. Gå tilbake til meny""");

          int sortChoise = sc.nextInt();
          sc.nextLine();

          switch (sortChoise){
            case 1:
              System.out.println(service.sortEventsByLocation());
              break;

            case 2:
              System.out.println(service.sortEventsByTypeEvent());
              break;

            case 3:
              System.out.println(service.sortEventsByTime());
              break;

            case 0:
              continue;

            default:
              System.out.println("Ugyldig valg, velg et tall mellom 0-3");
          }
          break;

        case 0:
          running = false;
          System.out.println("Programmet avsluttes.");
          continue;

        default:
          System.out.println("Ugyldig valg, prøv igjen.\n");


      }
    }

  }

private void userMenu() {
  System.out.println("""
    
    Velkommen, hva vil du gjøre?
    1. Registrere nytt arangement.
    2. Se alle arrangementer.
    3. Finne alle arangementer på et gitt sted.
    4. Finne alle arangementer på en dato og tidpunkt.
    5. Finne alle arangementer i et gitt tidsintervall.
    6. Sorter og se arrangementene.
    0. Avslutt programmet"""
  );
  }
}