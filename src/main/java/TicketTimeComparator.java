import java.util.Comparator;

public class TicketTimeComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket t1, Ticket t2) {
        int flightTimet1 = t1.getTimeTo() - t1.getTimeFrom();
        int flightTimet2 = t2.getTimeTo() - t2.getTimeFrom();

        if (flightTimet1 > flightTimet2) {
            return 1;
        } else if (flightTimet1 < flightTimet2) {
            return -1;
        } else {
            return 0;
        }
    }
}

