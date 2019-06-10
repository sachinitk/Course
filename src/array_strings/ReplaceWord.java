package array_strings;

import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        System.out.println("Enter the string:");
        str += scanner.nextLine();

        String[] sentence  = str.split(" ");

        System.out.println("Enter the word to be searched:");
        String wordc = scanner.nextLine();
        int flag =0;
        System.out.println("Enter the word to be replaced:");
        String wordr = scanner.nextLine();
        for(String word : sentence){
            if(word.equals(wordc))
                flag =1;
        }
        if(flag == 0) {
            System.out.println("The word " + wordc + " not found");
            return;
        }
        System.out.println(str.replaceAll(wordc,wordr));
    }
}
