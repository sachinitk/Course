package array_strings;

import java.util.Scanner;

public class FindLength {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inmate's name:");


        String sentence = "";
        sentence += scanner.nextLine();

        for(int i = 0 ; i< sentence.length(); i++ ){
            if(Character.isAlphabetic(sentence.charAt(i)) || Character.isSpaceChar(sentence.charAt(i))){
                continue;
            }
            else {
                System.out.println("Invalid input");
                return;
            }
        }


        System.out.println("No of characters is:"+sentence.length());



    }
}

