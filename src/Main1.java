import java.util.Scanner;

public class Main1 {


        static final int SIZE = 26;


        static void printCharWithFreq(String str)
        {

            int n = str.length();


            int[] freq = new int[SIZE];


            for (int i = 0; i < n; i++)
                freq[str.charAt(i) - 'a']++;

            int min  = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {


                if (freq[str.charAt(i) - 'a'] != 0) {

                    if(min >= freq[str.charAt(i) - 'a'])
                        min = freq[str.charAt(i) - 'a'];


                }

            }
            for(int i = 0 ; i < n ; i++){
                if(freq[str.charAt(i) - 'a'] == min)
                    System.out.println(str.charAt(i));
            }

        }

        
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);

            String str = "";
            str += sc.nextLine();
            printCharWithFreq(str);
        }

}
