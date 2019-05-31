package array_strings;

import java.util.Scanner;
//2 condtion add karni hai
public class cummulative_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c;
        int count = 0;
        String s;
        System.out.println("Enter a word:");
        s = scanner.nextLine();
        System.out.println("Enter the character:");
        c = scanner.next().charAt(0);
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i)==c)
                count++;
        }
        System.out.println("charter present in string at " + count +"no of times");

    }

}
