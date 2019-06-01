package array_strings;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String sentence = "";
        sentence += scanner.nextLine();
        char[] str = sentence.toCharArray();
        for(int i = 0 ; i< sentence.length(); i++ ){
            if(str[i] == ' '  || Character.isAlphabetic(str[i])){
                continue;
            }
            else {
                System.out.println("Invalid input");
                return;
            }
        }
        int count  = 0;
        for(int i = 0 ; i < sentence.length(); i++){
            if(str[i] != ' ')
                count++;
        }
        System.out.println(sentence+ " has " + count + " characters");
    }
}
