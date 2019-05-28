import java.util.Scanner;

public class IncrementCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salary ;
        double increment;
        System.out.println("Enter the Salary");
        salary = scanner.nextInt();
        System.out.println("Enter the ....");
        increment  = scanner.nextDouble();
        if(salary <=0 || increment< 1 || increment >5){
            System.out.println("Invalid Input");
            return;
        }
        double final_salary = 0;
        if(increment >=1 && increment <=3)
            final_salary = salary + salary*.10;

    if(increment >=3.1 && increment <=4)
    final_salary = salary + salary*.25;
        if(increment >=4.1 && increment <=5)
            final_salary = salary + salary*.30;

        int fsalary  = (int)final_salary;

        System.out.println(fsalary);

}
}
