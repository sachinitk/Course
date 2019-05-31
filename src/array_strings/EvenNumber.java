package array_strings;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = scanner.nextInt();
        if(n<=0){
            System.out.println("Invalid array size");
            return;
        }
        System.out.println("Enter the array elements:");
        int[] array = new int[n];
        for (int i = 0 ; i< n ; i++){
            array[i] = scanner.nextInt();

        }
        int flag = 0 ;
        int num =0;
        for(int  i = 0; i< n ; i++){
            if(array[i] < 10 && array[i]%2 ==0){
                flag =1;
                num = num*10 + array[i];
            }
        }
        if(flag == 0)
            System.out.println("Single digit even number is not found in the array");
        else
            System.out.println(num);
    }

}
