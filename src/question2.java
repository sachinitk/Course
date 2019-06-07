import java.util.Scanner;

public class question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = ""; //space naho hai beech mai yeh dyan rakna sirf "" hai
        str += scanner.nextLine();
        str = str.toLowerCase(); //agar error aaye to c chota kar lena
        int length  = str.length();
        char[] abc = str.toCharArray();
        if(abc[0] == abc[length-1])
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}
