package array_strings;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = scanner.nextInt();
        if(n <= 0) {
            System.out.println("Invalid array size");
            return;
        }
        System.out.println("Enter the elements:");

        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)

            arr[i] = scanner.nextInt();

       int  sum  = 0 ;
       int flag = 0;
       for(int i = 0 ; i < n ; i++){
           int fact  = 1;
           if(arr[i] < 10 && arr[i] > 0){
               flag =1;
               for(int j = 1 ; j <= arr[i]; j++)
                   fact*=j;

                           sum+= fact;
           }
       }
       if(flag == 0)
           System.out.println("No positive and single digit numbers found in an array");
       else
           System.out.println(sum);

    }

}
