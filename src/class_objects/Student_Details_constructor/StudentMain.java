package class_objects.Student_Details_constructor;


import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student's Id");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the Student's Name");
        String name = scanner.nextLine();
        System.out.println("Enter Student's address");
        String address = scanner.nextLine();
        System.out.println("Whether the student is from NIT(Yes/No):");
        String co = scanner.nextLine();
        String college;
        if(co.equals("No") || co.equals("NO")){
            System.out.println("Enter the college Name");
            college = scanner.nextLine();
        }
        else
            college = "NIT";

        Student student = new Student(id,name,address,college);
        System.out.println("Student id"+ student.getStudentId());
        System.out.println("Student Name"+ student.getStudentName());
        System.out.println("Address: " + student.getStudentAddress());
        System.out.println("College Name: " + student.getCollegeName());
    }
}
