package array_strings.average_Grade;
//this is paackage class
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id;
        System.out.println("Enter the id:");
        id = scanner.nextInt();
        System.out.println("Enter the name:");
        scanner.nextLine();
        String name;
        name = scanner.nextLine();
        System.out.println("Enter the no of subjects:");
        int no_of_subject;
        no_of_subject = scanner.nextInt();
        int[] sub = new int[no_of_subject];
        for(int i = 0 ; i <no_of_subject;i++){
            System.out.println("Enter mark for subject "+(i+1)+":");
            sub[i] = scanner.nextInt();

        }
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setMarks(sub);
        student.calculateAvg();
        student.findGrade();
        System.out.println("id:"+student.getId());
        System.out.println("Name:"+student.getName());
        System.out.println("Average:"+student.getAverage());
        System.out.println("Grade"+student.getGrade());

    }
}
