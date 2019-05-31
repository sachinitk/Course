package array_strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class ArraySort {

    static void printOrder(int[] arr, int n)
    {


        // Sort the whole array
        Arrays.sort(arr, 0, n/2);
        Arrays.sort(arr, n/2, n);

        // Reverse the second half
        int low = n/2, high = n-1;
        while (low < high)
        {
            Integer temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++; high--;
        }
        for(int i = 0 ; i < n ; i++)
            System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = scanner.nextInt();
        if(n<=0){
            System.out.println("Array size should be greater than 0");
            return;
        }
        System.out.println("Enter the  elements:");
        int[] array = new int[n];
        for (int i = 0 ; i< n ; i++){
            array[i] = scanner.nextInt();

        }
        printOrder(array, array.length);
    }
}
