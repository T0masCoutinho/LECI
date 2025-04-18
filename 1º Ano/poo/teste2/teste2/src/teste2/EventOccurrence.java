package teste2;

import java.util.Date;
import java.util.Objects;

public class EventOccurrence {
    private Event event;
    private Place place;
    private Date date;
    private int availableTickets;

    public EventOccurrence(Event event, Place place, Date date, int availableTickets) {
        this.event = event;
        this.place = place;
        this.date = date;
        this.availableTickets = availableTickets;
    }

    public Event getEvent() {
        return event;
    }

    public Place getPlace() {
        return place;
    }

    public Date getDate() {
        return date;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public void setAvailableTickets(int availableTickets) {
        this.availableTickets = availableTickets;
    }
    

    @Override
    public String toString() {
        return "EventOccurrence{" + "event=" + event + ", place=" + place + ", date=" + date + ", availableTickets=" + availableTickets +'}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventOccurrence that = (EventOccurrence) o;
        return availableTickets == that.availableTickets && // compare availableTickets, compare event, compare place, compare date...
            Objects.equals(event, that.event) && 
            Objects.equals(place, that.place) && 
            Objects.equals(date, that.date);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(event, place, date, availableTickets);
    }
}
 