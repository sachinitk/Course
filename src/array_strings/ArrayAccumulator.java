package array_strings;

import java.util.Scanner;

public class ArrayAccumulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter the size of first array:");
        n1 = scanner.nextInt();
        if(n1 <= 0) {
            System.out.println("Invalid array size");
            return;
        }
        int[] arr1 = new  int[n1];
        System.out.println("Enter elements for first array:");

        for(int i = 0 ; i < n1; i++)
            arr1[i] = scanner.nextInt();


        System.out.println("Enter the size of second array:");
        n2 = scanner.nextInt();
        if(n2 <= 0) {
            System.out.println("Invalid array size");
            return;
        }
        int[] arr2 = new  int[n2];
        System.out.println("Enter elements for second array:");
        for(int i = 0 ; i < n2; i++)
            arr2[i] = scanner.nextInt();
        int n = Integer.min(n1,n2);
        int nmax = Integer.max(n1,n2);
        int[] arr3 = new int[nmax];
        for(int i = 0 ; i < n ; i++)
            arr3[i] = arr1[i]+arr2[i];
        if(n1 > n2){
            for (int i = n ; i < nmax ; i++)
                arr3[i] = arr1[i];

        }
        if(n1 < n2){
            for (int i = n ; i < nmax ; i++)
                arr3[i] = arr2[i];

        }

       for(int i =0 ; i < nmax ; i++){
           System.out.println(arr3[i]);
       }



    }

}
