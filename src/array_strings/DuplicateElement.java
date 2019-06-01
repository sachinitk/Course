package array_strings;

import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = scanner.nextInt();
        if(n <= 0) {
            System.out.println("Invalid array size");
            return;
        }
        int elem;


        System.out.println("Enter the elements:");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)

            arr[i] = scanner.nextInt();

        System.out.println("Enter the position of the element to be replicated:");
        elem = scanner.nextInt();
        if(elem>n)
            System.out.println("Position is greater than the size of an array");
        int[] arr2 = new int[n+1];
        arr2[n] = arr[elem];
        for(int i = 0 ; i <n ; i++)
            arr2[i]= arr[i];
        for(int i = 0 ; i <=n ; i++)
            System.out.println(arr2[i]);
    }

}
