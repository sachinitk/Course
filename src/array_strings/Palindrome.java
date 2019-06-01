package array_strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word :");
        String sentence = "";
        sentence += scanner.nextLine();
        char[] str = sentence.toCharArray();
        for(int i = 0 ; i< sentence.length(); i++ ){
            if(Character.isAlphabetic(str[i])){
                continue;
            }
            else {
                System.out.println("Invalid input");
                return;
            }
        }
        sentence = sentence.toLowerCase(); // converting everything to lower case
        String rev = "";
        for(int i = sentence.length() -1; i >=0; i--){
            rev = rev+sentence.charAt(i);
        }
        if(sentence.equals(rev)){
            System.out.println(sentence + " is a Palindrome");
        }else
            System.out.println(sentence + " is not a Palindrome");


    }
}
