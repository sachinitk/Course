package array_strings;

import java.util.Scanner;

public class Authority {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inmate's name:");
        String n1 = "";
        n1 += scanner.nextLine();
        System.out.print("Inmate's father's name:");
        String n2 = "";
        n2 += scanner.nextLine();

        String sentence = "";
        sentence = n1 + " " + n2;
        char[] str = sentence.toCharArray();
        for(int i = 0 ; i< sentence.length(); i++ ){
            if(Character.isAlphabetic(str[i]) || Character.isSpaceChar(sentence.charAt(i))){
                continue;
            }
            else {
                System.out.println("Invalid input");
                return;
            }
        }

        sentence = sentence.toUpperCase();
        System.out.println(sentence);



    }
}
