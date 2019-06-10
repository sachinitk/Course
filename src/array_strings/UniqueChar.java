package array_strings;


//ek error hai tere test cases mai aayegi to dekhenge
import java.util.Scanner;

public class UniqueChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String test = "";
        test += scanner.nextLine();
        String temp = "";
        for (int i = 0; i < test.length(); i++){
            char current = test.charAt(i);
            if (temp.indexOf(current) < 0){
                temp = temp + current;
            } else {
                temp = temp.replace(String.valueOf(current), "");
            }
        }

        int n = temp.length();
        char[] arr = temp.toCharArray();
        for(int i = 0 ; i < n ; i++){
            System.out.println(arr[i]);
        }
    }

}
