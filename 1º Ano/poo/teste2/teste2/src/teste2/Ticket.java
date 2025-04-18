package teste2;

import java.util.Objects;

public class Ticket {
    private static int sequence = 0;
    private int reference;
    private EventOccurrence eventOccurrence;
    private int numberOfTickets;

    public Ticket(EventOccurrence eventOccurrence, int numberOfTickets) {
        this.reference = ++sequence;
        this.eventOccurrence = eventOccurrence;
        this.numberOfTickets = numberOfTickets;
    }

    public int getReference() {
        return reference;
    }

    public EventOccurrence getEventOccurrence() {
        return eventOccurrence;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    @Override
    public String toString() {
        return "Ticket{" + "reference=" + reference + ", eventOccurrence=" + eventOccurrence + ", numberOfTickets=" + numberOfTickets + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return reference == ticket.reference && //para comparar referência, compare eventOccurrence, compare numberOfTickets,etc
            numberOfTickets == ticket.numberOfTickets &&
            Objects.equals(eventOccurrence, ticket.eventOccurrence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reference, eventOccurrence, numberOfTickets);
    }
}