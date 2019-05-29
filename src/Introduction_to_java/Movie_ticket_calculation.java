package Introduction_to_java;

import java.util.Scanner;

public class Movie_ticket_calculation {
    public static void main(String[] args) {
        int no_ticket;
        char r,cc,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of ticket:");
        no_ticket = scanner.nextInt();
        if(no_ticket < 5 || no_ticket> 40){
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
        }
        System.out.print("Do you want refreshment:");
        r = scanner.next().charAt(0);
        System.out.println("Do you have coupon code:");
        cc = scanner.next().charAt(0);
        System.out.println("Enter the circle:");
        c =scanner.next().charAt(0);


    }
}
