package array_strings;

import java.util.Scanner;

public class PanCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the PAN no");
        String pan = scanner.nextLine();

        if(pan.length() !=10){
            System.out.println("Invalid PAN no");
            return;
        }
        char c;
        for(int i = 0 ; i < 5 ; i++){
            if(!Character.isUpperCase(pan.charAt(i))){
                System.out.println("Invalid PAN no");
                return;
            }
        }
        for(int i =5 ; i< 9; i++){
            if(!Character.isDigit(pan.charAt(i))){
                System.out.println("Invalid PAN no");
                return;
            }
        }
        if(!Character.isUpperCase(pan.charAt(9))){
            System.out.println("Invalid PAN no");
            return;
        }
        System.out.println("Valid PAN no");

    }
}
