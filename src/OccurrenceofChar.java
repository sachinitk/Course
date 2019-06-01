import java.util.Scanner;

public class OccurrenceofChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word :");
        String sentence = "";
        sentence += scanner.nextLine();
        sentence = sentence.toLowerCase(); // converting everything to lower case
        char[] str = sentence.toCharArray();

        System.out.println("Enter the character:");

        for(int i = 0 ; i< sentence.length(); i++ ){
            if(Character.isAlphabetic(str[i])){
                continue;
            }
            else {
                System.out.println("Not a valid string");
                return;
            }
        }
        char c = scanner.next().charAt(0);
        if(Character.isAlphabetic(c)) {
            System.out.println("Given character is not an alphabet");
        }
            int count  =0;
        for(int i = 0 ; i < sentence.length();  i++){
            if(str[i] == c)
                count++;

        }
        if(count == 0)
            System.out.println("The given character '"+c+"' not present in the given word.");
        else
            System.out.println("No of '"+c+"' present in the given word is " + count);
    }
}
