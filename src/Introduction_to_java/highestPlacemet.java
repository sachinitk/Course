package Introduction_to_java;

import java.util.Scanner;

public class highestPlacemet {
    public static void main(String[] args) {
        String[] sub = {"CSE","ECE","MECH"};
        Scanner scanner = new Scanner(System.in);
        int cse,ece,mech;
        int highest = -1;
        System.out.println("Enter the no of students placed in CSE:");
        cse = scanner.nextInt();
        if(highest <= cse)
            highest = cse;
        System.out.println("Enter the no of students placed in ECE:");
        ece = scanner.nextInt();
        if(highest <=ece)
            highest = ece;
        System.out.println("Enter the no of students placed in MECH:");
        mech = scanner.nextInt();
        if(highest<mech)
            highest = mech;
        if(cse < 0 ||ece <0 || mech < 0){
            System.out.println("Input is Invalid");
            return;
        }
        else if(cse == ece && ece == mech ){
            System.out.println("None of the department has got the highest placement");
            return;
        }
        else {
            System.out.println("Highest placement");
            if (highest == cse) System.out.println("CSE");
              if (ece == highest)
                System.out.println("ECE");
           if (mech == highest)
                System.out.println("MECH");
        }
    }
}
