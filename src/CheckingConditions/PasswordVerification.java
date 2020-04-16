package CheckingConditions;

import java.util.Scanner;
public class PasswordVerification {
    public static void main(String[] args) {
        Scanner pass = new Scanner(System.in);
        String password;
        System.out.print("Please, enter password: ");
        password = pass.nextLine();
        if (password.length()<8)
        {
            System.out.println("Password must have at least 8 characters long! Please try again!");
            return;
        }
        System.out.print("Please, repeat password: ");
        String password2;
        password2 = pass.nextLine();
                if (password2.equals (password)) {
                    System.out.println("Password Accepted");
                } else {
                    System.out.println("Password should be the same!");
                }
    }
}
