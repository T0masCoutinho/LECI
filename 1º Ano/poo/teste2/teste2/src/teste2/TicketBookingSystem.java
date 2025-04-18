package teste2;

import java.util.*;
import java.text.SimpleDateFormat;


public class TicketBookingSystem implements ITicketBookingSystem {
    private Map<Integer, EventOccurrence> eventOccurrences;
    private Map<Integer, Ticket> tickets;

    public TicketBookingSystem() {
        this.eventOccurrences = new HashMap<>();
        this.tickets = new HashMap<>();
    }

    @Override
    public boolean addEventOccurrence(Event event, Place place, String schedule) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:ss");
            Date date = dateFormat.parse(schedule);
            for (EventOccurrence occurrence : eventOccurrences.values()) {
                if (occurrence.getPlace().equals(place) && occurrence.getDate().equals(date)) {
                    return false;
                }
            }
            eventOccurrences.put(eventOccurrences.size() + 1, new EventOccurrence(event, place, date, 100)); // assuming 100 available tickets
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public int bookTickets(int eventId, int numTickets) {
        EventOccurrence occurrence = eventOccurrences.get(eventId);
        if (occurrence != null && occurrence.getAvailableTickets() >= numTickets) {
            occurrence.setAvailableTickets(occurrence.getAvailableTickets() - numTickets);
            Ticket ticket = new Ticket(occurrence, numTickets);
            tickets.put(ticket.getReference(), ticket);
            return ticket.getReference();
        }
        return -1;
    }

    @Override
    public boolean cancelTickets(int ticketReference) {
        Ticket ticket = tickets.remove(ticketReference);
        if (ticket != null) {
            EventOccurrence occurrence = ticket.getEventOccurrence();
            if (occurrence != null) {
                occurrence.setAvailableTickets(occurrence.getAvailableTickets() + ticket.getNumberOfTickets());
                return true;
            }
        }
        return false;
    }

    @Override
    public Collection<EventOccurrence> getEventOccurrences() {
        return eventOccurrences.values();
    }
}
