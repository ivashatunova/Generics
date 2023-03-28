import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AviaSoulsTest {
    Ticket ticket1 = new Ticket("DFG", "RTS", 10_000, 5, 7);
    Ticket ticket2 = new Ticket("DFG", "RTS", 16_000, 5, 7);
    Ticket ticket3 = new Ticket("GHK", "RTS", 100_000, 5, 7);
    Ticket ticket4 = new Ticket("DFG", "GHK", 253_070, 5, 7);
    Ticket ticket5 = new Ticket("DFG", "RTS", 7_700, 5, 7);
    Ticket ticket6 = new Ticket("DFG", "GHK", 10_054, 5, 7);

    private AviaSouls fillTickets() {
        AviaSouls tickets = new AviaSouls();
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
        tickets.add(ticket5);
        tickets.add(ticket6);
        return tickets;
    }


    @Test
    public void shouldComparable() {
        Ticket[] actual = {ticket1, ticket2, ticket3, ticket4, ticket5, ticket6};
        Ticket[] expected = {ticket5, ticket1, ticket6, ticket2, ticket3, ticket4};
        Arrays.sort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSortAfterSearch() {
        AviaSouls ticketsManager = fillTickets();
        Ticket[] expected = {ticket5, ticket1, ticket2};
        Ticket[] actual = ticketsManager.search("DFG", "RTS");
        Assertions.assertArrayEquals(expected, actual);


    }

}
