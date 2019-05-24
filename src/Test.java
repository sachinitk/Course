import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total no. of employees:");
        int n = scanner.nextInt();
        if(n<2){
            System.out.println("Please enter a valid employee count");
            return;
        }
        System.out.println("Enter age....");
        int[] array = new int[n];
        for(int i = 0 ; i < n ; i++){
            array[i] = scanner.nextInt();
            if((array[i]<28) && (array[i] > 40)){
                System.out.println("Invalid range");

            }


        }
    }
}
