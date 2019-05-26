package class_objects.ticket_price_calculation_static;

public class Ticket {
    private int ticketid,price;
    private static int availableTickets;

    public int getTicketid() {
        return ticketid;
    }

    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getAvailableTickets() {
        return availableTickets;
    }

    public static void setAvailableTickets(int availableTickets) {
        Ticket.availableTickets = availableTickets;

    }
    public int calculateTicketCost(int nooftickets){
        int totalprice = 0;
        if(Ticket.getAvailableTickets()<nooftickets)
            return -1;
        Ticket.setAvailableTickets(Ticket.getAvailableTickets()-nooftickets);

        return nooftickets*getPrice();
    }
}
