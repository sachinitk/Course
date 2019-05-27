package class_objects.Travel_details;

import java.util.Scanner;

public class TestMain {
    public static BusTicket getTicketDetails(){
        BusTicket busTicket = new BusTicket();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  the name");
        String name = scanner.nextLine();
        Person person = new Person();
        person.setName(name);
        System.out.println("Enter the gender");
        char c = scanner.next().charAt(0);
        System.out.println("Enter the age:");
        int age = scanner.nextInt();
        person.setAge(age);
        System.out.println("Enter the ticket no");
        int ticketNo = scanner.nextInt();
        busTicket.setTickeNo(ticketNo);
        System.out.println("Enter the ticket price");
        float ticketPrice = scanner.nextFloat();
        busTicket.setTicketPrice(ticketPrice);
        busTicket.calculateTotal();
        busTicket.setPerson(person);
        System.out.println("TicketNo"+busTicket.getTickeNo());
        System.out.println("Passenger Name"+person.getName());
        System.out.println("Price of ticket"+busTicket.getTicketPrice());
        System.out.println("Total Amount"+busTicket.getTotalAmount());


        return busTicket;
    }
    public static void main(String[] args){
      getTicketDetails();
    }
}
