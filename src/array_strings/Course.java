package array_strings;

import java.util.Scanner;

public class Course {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of courses");
        int nc = scanner.nextInt();
        if(nc <= 0){
            System.out.println("Invalid range");
        }
        String[] c = new  String[nc];
        System.out.println("Enter the courses");
        for(int i = 0 ; i < nc; i++){
            c[i] = scanner.nextLine();
        }
        System.out.println("Enter the course to be searched");
        String search = scanner.nextLine();
        for(int i = 0 ; i < nc ; i++){
            if(search.equals(c[i])){
                System.out.println(c[i]+"is the available courses");
                return;
            }
        }
        System.out.println("array_strings.Course is not available");

    }
}
