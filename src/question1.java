import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basic = scanner.nextInt();
        int days = scanner.nextInt();
        if(basic >10000 || days > 31 || basic <  0 || days <= 0){
            System.out.println("Invalid Input");
            return;
        }
        double fs;
        double hrs;
        double sra;
        int d = 0;
        hrs  = 0.50*(basic) ;
        sra  = (0.75)*(basic) ;
        if(days == 31)
            d = 500;
        fs = (basic+hrs + d + sra);
        float final_salary = (float)fs;
        System.out.println(final_salary);
    }
}
