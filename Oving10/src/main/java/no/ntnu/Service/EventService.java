package no.ntnu.Service;

import no.ntnu.Models.Event;
import no.ntnu.Storage.EventRegister;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EventService {
  private final EventRegister register;

  public EventService(EventRegister register) {
    this.register = register;
  }

  public void registerEvent(Event event) {
    register.add(event);
  }

  public List<Event> getAllEvents(){
    return register.getAll();
  }

  // Finn alle arrangementer på en lokasjon.
  public List<Event> findEventsByLocation(String location) {
    List<Event> result = new ArrayList<>();
    for(Event e : register.getAll()){
      if(e.getLocation().equalsIgnoreCase(location))
        result.add(e);
    }
    return result;
  }

  // Finn alle arrangementer på en dato.
  public List<Event> findEventsByDate(long yyyymmdd) {
    List<Event> result = new ArrayList<>();
    for (Event e : register.getAll()) {
      long datePart = e.getTime() / 10000L; // stripper HHmm
      if (datePart == yyyymmdd) {
        result.add(e);
      }
    }
    return result;
  }


  // Finn innen ett gitt tidsintervall
  public List<Event> findEventsBetweenDates(long date1, long date2) {
    List<Event> result = new ArrayList<>();
    for (Event e : register.getAll()) {
      if (e.getTime() >= date1 && e.getTime() <= date2)
        result.add(e);
    }
    result.sort(Comparator.comparingLong(Event::getTime));
    return result;
  }

  // Velg hvordan listen skal sorteres
  public List<Event> sortEventsByLocation(){
    List<Event> sortedList = new ArrayList<>(register.getAll());
    sortedList.sort(Comparator.comparing(Event::getLocation, String.CASE_INSENSITIVE_ORDER)); // String.CASE_INSENSITIVE_ORDER behandler ord som har store og små bokstaver likt.
    return sortedList;
  }

  public List<Event> sortEventsByTypeEvent(){
    List<Event> sortedList = new ArrayList<>(register.getAll());
    sortedList.sort(Comparator.comparing(Event::getTypeOfEvent, String.CASE_INSENSITIVE_ORDER));
    return sortedList;
  }

  public List<Event> sortEventsByTime(){
    List<Event> sortedList = new ArrayList<>(register.getAll());
    sortedList.sort(Comparator.comparing(Event::getTime));
    return sortedList;
  }
}