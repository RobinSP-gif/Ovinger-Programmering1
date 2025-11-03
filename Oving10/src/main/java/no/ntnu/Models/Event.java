package no.ntnu.Models;

public class Event{
    private static int nextId = 1;  // Global id teller
    private final int id;
    private String nameOfEvent;
    private String location;
    private String host;
    private String typeOfEvent;
    private long time;

    public Event(String nameOfEvent, String location, String host, String typeOfEvent, long time) {
      this.id = nextId++;
      this.nameOfEvent = nameOfEvent;
      this.location = location;
      this.host = host;
      this.typeOfEvent = typeOfEvent;
      this.time = time;
    }

    // Getters
    public int getId() {
      return id;
    }

    public String getNameOfEvent() {
      return nameOfEvent;
    }

    public String getLocation(){
      return location;
    }

    public String getHost() {
      return host;
    }

    public String getTypeOfEvent() {
      return typeOfEvent;
    }

    public long getTime() {
      return time;
    }

    // Setters
    public void setNameOfEvent(String nameOfEvent) {
      this.nameOfEvent = nameOfEvent;
    }

    public void setLocation(String location) {
      this.location = location;
    }

    public void setHost(String host) {
      this.host = host;
    }

    public void setTypeOfEvent(String typeOfEvent) {
      this.typeOfEvent = typeOfEvent;
    }

    public void setTime(long time) {
      this.time = time;
    }

    // ToString
      @Override
        public String toString() {
        return ("\nEvent: " + nameOfEvent + "\n" +
                "Location: " + location + "\n" +
                "Host: " + host + "\n" +
                "Event type: " + typeOfEvent + "\n" +
                "Date and time: " + time + "\n" +
                "id for event: " + id + "\n");
      }
}

