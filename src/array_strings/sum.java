package array_strings;

import java.util.Scanner;

public class sum {
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
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            max = Integer.max(max,arr[i]);
            min = Integer.min(min,arr[i]);

        }
        System.out.println(max+min);
    }
}
