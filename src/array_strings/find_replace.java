package array_strings;

import java.util.Scanner;

public class find_replace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String sen = "";
        sen += scanner.nextLine();
        System.out.println("Enter the charcter to be searched:");
        char cs = scanner.next().charAt(0);
        System.out.println("Enter the charcter to be replace:");
        char cr = scanner.next().charAt(0);
        char[] str = sen.toCharArray();
        int flag  = 0 ;
        for(int i = 0 ; i <sen.length();i++){
            if(str[i]==cs){
                str[i] = cr;
                flag =1;
                break;
            }
        }
        if(flag == 0)
            System.out.println("character not found");
        else{

            for(int i = 0; i < sen.length(); i++){
                System.out.print(str[i]);
            }
        }

    }
}
