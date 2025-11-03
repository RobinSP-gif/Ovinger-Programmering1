package no.ntnu.Storage;

import no.ntnu.Models.Event;

import java.util.ArrayList;
import java.util.List;

public class EventRegister {
  private final List<Event> events = new ArrayList<>();

  public List<Event> getAll() {
    return events;
  }

  public void add(Event event) {
    events.add(event);
  }
}
