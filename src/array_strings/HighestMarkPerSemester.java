package array_strings;

import java.util.Scanner;

public class HighestMarkPerSemester {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter no of semester:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i< n ; i++){
            System.out.println("Enter no of subjects in "+(i+1)+" semester:");
            arr[i] = scanner.nextInt();
        }
        int[] hig = new int[n];
        for(int i = 0 ; i  < n; i++){
            System.out.println("Marks obtained in semester "+(i+1)+":");
            int high = 0;
            for(int j = 0 ; j < arr[i]; j++ ){

                int mark = scanner.nextInt();
                if(mark<0){
                    System.out.println("You have entered invalid mark.");
                    return;
                }

                if(mark >= high)
                    high = mark;
            }
            hig[i] = high;
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print("Maximum mark in "+(i+1)+" semester:");
            System.out.println(hig[i]);
        }

    }
}
