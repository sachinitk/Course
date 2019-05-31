package array_strings;


//ek error hai tere test cases mai aayegi to dekhenge
import java.util.Scanner;

public class UniqueChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String sen = "";
        sen += scanner.nextLine();
        scanner.close();
        for(int i = 0 ; i < sen.length(); i++) {
            if (!Character.isAlphabetic(sen.charAt(i)) && sen.charAt(i) != ' ') {
                System.out.println(sen.charAt(i));
                System.out.println("Invalid Sentence");
                return;
            }
        }
        char[] str = sen.toCharArray();
        int[] freq  = new int[sen.length()];
        for(int i = 0 ; i < sen.length(); i++){
            freq[i] =1 ;
            for(int j = i+1; j< sen.length();j++){
                if(str[i]==str[j]){
                    freq[i]++;
                }
                str[j] = '0';
            }
        }
        System.out.println("Unique characters:");
        for(int i = 0  ; i < freq.length;i++){
             if(str[i] != ' ' &&  str[i] != '0'  && freq[i] ==1){
                 System.out.println(str[i]);
             }
        }
    }
}
