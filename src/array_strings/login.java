package array_strings;

import java.util.Scanner;

public class login {
    private  String userName, password;

    public login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }



    public String getPassword() {
        return password;
    }
    public boolean validate(){
        return (this.userName.equals("john") && this.password.equals("123abc"));
    }

    public static void main(){
        Scanner scanner = new Scanner(System.in);

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the username");
        String userName,password;
        userName = scanner.nextLine();
        System.out.println("Enter password");
        password = scanner.nextLine();
        login login = new login(userName,password);
        if(login.validate()){
            System.out.println("Valid user");
        }
        else {
            System.out.println("Invalid user");
        }

    }
}
