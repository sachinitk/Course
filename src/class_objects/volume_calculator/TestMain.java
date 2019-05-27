package class_objects.volume_calculator;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("Enter the choice"+"" +
                "\n1.Find Volume For Cylinder" +
                "\n2. Find Volume For Cuboid");
        int cl,cb,ch;
        int choice;
        double r,h;
        VolumeCalculator volumeCalculator =new VolumeCalculator();
        Scanner scanner = new Scanner(System.in);
        choice =scanner.nextInt();
        if(choice == 1){
            System.out.println("Enter the radius");
            r = scanner.nextDouble();
            System.out.println("Enter the height");
            h = scanner.nextDouble();
            System.out.println("Output");

            System.out.println("Volume of the Cylinder is "+
                    volumeCalculator.calculateVolume(r,h));
        }
        if(choice == 2){
            System.out.println("Enter the length");
            cl = scanner.nextInt();
            System.out.println("Enter the breadth");
            cb  = scanner.nextInt();
            System.out.println("Enter the height");
            ch = scanner.nextInt();
            System.out.println("Output");

            System.out.println("Volume of the Cylinder is "+
                    volumeCalculator.calculateVolume(cl,cb,ch));
        }

    }
}
