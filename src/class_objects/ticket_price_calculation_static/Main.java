package class_objects.ticket_price_calculation_static;
 /*

 Test CASES PE FAIL HO SAKTA HAI YEH ..LIKHNE LIH AUR RUN KAR KE DEKH LENGE

  */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter theno of booking ");
        int n = scanner.nextInt();
        System.out.println("Enter the available tickets");
        int available = scanner.nextInt();
        Ticket.setAvailableTickets(available);
        Ticket ticket = new Ticket();
        for(int i = 0 ; i < n ; i++){
            System.out.println("Enter ticketId");
           int ticketId = scanner.nextInt();
           ticket.setTicketid(ticketId);
            System.out.println("Enter price");
           int price = scanner.nextInt();
           ticket.setPrice(price);
            System.out.println("Enter the no of tickets");
            int ticketstobook = scanner.nextInt();
            System.out.println("Avalilable Tickets"+ Ticket.getAvailableTickets());
            System.out.println("Total amount"+ ticket.calculateTicketCost(ticketstobook));
            System.out.println("Available tickets after booking " + Ticket.getAvailableTickets() );
        }
    }
}
