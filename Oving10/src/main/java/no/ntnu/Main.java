package no.ntnu;

import no.ntnu.Models.Event;
import no.ntnu.Storage.EventRegister;
import no.ntnu.Service.EventService;
import no.ntnu.UserInterface.Menu;

public class Main {
  public static void main(String[] args) {
    EventRegister register = new EventRegister();
    EventService service = new EventService(register);

    Event party = new Event("Party", "Mela", "Robin", "Fest", 202510241800L);
    Event fotballKamp = new Event("Verdal - Vuku", "Verdal Stadion", "Verdal IL", "Fotball kamp", 202512121200L);
    Event fotballKamp2 = new Event("Vinne - Levanger", "Verdal Stadion", "Verdal IL", "Fotball kamp", 202601011200L);
    Event fotballKamp3 = new Event("Skogn - Steinkjer", "Verdal Stadion", "Verdal IL", "Fotball kamp", 202602141400L);
    Event kino = new Event("Kino, James Bond", "Verdal kino", "Verdal kino", "Kino", 202512022000L);
    Event leirSkole = new Event("Leirskole", "Ulvilla", "Øra Speider forening", "Leirskole", 202606041200L);

    register.add(party);
    register.add(fotballKamp);
    register.add(fotballKamp2);
    register.add(fotballKamp3);
    register.add(kino);
    register.add(leirSkole);

    new Menu(service).start();

  }
}