package inhertance_poly.contact_details_of_hosteller;

import java.util.Scanner;

public class Main {
    public static Hosteller getHostellerDetails(){
        Hosteller hosteller  =new Hosteller();
        System.out.println("Enter the Details:");
        System.out.println("Student Id");
        Scanner scanner  = new Scanner(System.in);
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Student Name");
        String name  = scanner.nextLine();
        System.out.println("Department Id");
        int deptId = scanner.nextInt();
        System.out.println("Gender");
        scanner.nextLine();
        String gender = scanner.nextLine();
        System.out.println("Phone Number");
        String phone = scanner.nextLine();
        System.out.println("Hostel Name");
        String hostel_name  = scanner.nextLine();
        System.out.println("Room Number");
        int room_number = scanner.nextInt();
        hosteller.setStudentId(id);
        hosteller.setName(name);
        hosteller.setDepartmentId(deptId);
        hosteller.setGender(gender);
        hosteller.setPhone(phone);
        hosteller.setHostelName(hostel_name);
        hosteller.setRoomNumber(room_number);

        System.out.println("Modify Room Number(Y/N)");
        char r = scanner.next().charAt(0);
        if(r == 'Y'){
            System.out.println("New Room Number");
            int nrn = scanner.nextInt();
            hosteller.setRoomNumber(nrn);
        }
        System.out.println("Modify Phone Number(Y/N)");

        char  p = scanner.next().charAt(0);
        if(p  == 'Y'){
            System.out.println("New Phone Number");
            scanner.nextLine();
            String new_ph  = scanner.nextLine();
            hosteller.setPhone(new_ph);
        }
        System.out.println("Student Details:");
        System.out.println(hosteller.getStudentId()+" "+hosteller.getName()+" "
        +hosteller.getDepartmentId()+" "+ hosteller.gender+" "+hosteller.getPhone()+" "+
                hosteller.getHostelName()+" "+ hosteller.getRoomNumber());



    return hosteller;
    }
    public static void main(String[] args) {
            getHostellerDetails();
    }
}
