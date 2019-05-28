package Introduction_to_java;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int a ;
        int b;
        int flag = 0;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        if((a>=b) || (a <= 0) || (b <= 0 )){
            System.out.println("Provide valid Input");
            return;
        }
        int i = a;
        while(i <=b){
            for(int j  =2 ; j < i ; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;

                } else {
                    flag = 1;
                }
            }
            if(flag == 1)
                System.out.print(i + " ");

            i++;
        }

    }
}
