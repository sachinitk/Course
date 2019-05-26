package class_objects.Employee_Salary_Calculation;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        //scanner.nextLine();
        System.out.println("Enter salary:");
        double salary = scanner.nextDouble();
        //1System.out.println(salary);
        System.out.println("Enter PF percentage:");
        int pf = scanner.nextInt();
        Employee employee= new Employee();
        employee.setEmployeeId(id);
        employee.setEmployeeName(name);
        employee.setSalary(salary);
        employee.calculateNetSalary(pf);

        System.out.println("id:"+employee.getEmployeeId());
        System.out.println("Name:"+employee.getEmployeeName());
        System.out.println("Salary:" + employee.getSalary());
        System.out.println("Net Salary "+ employee.getNetSalary());

    }
}
