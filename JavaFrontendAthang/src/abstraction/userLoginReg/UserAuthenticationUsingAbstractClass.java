package abstraction.userLoginReg;

import java.util.Scanner;

public class UserAuthenticationUsingAbstractClass implements AuthenticationUsingInterface {
    User user;

    @Override
    public void doResigtration() {
        System.out.println("Welcome to our Registration System...");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = scanner.next();
        System.out.print("Enter Username: ");
        String userId = scanner.next();
        System.out.print("Enter Password: ");
        String password = scanner.next();
        System.out.print("Enter your Address: ");
        String address = scanner.next();
        System.out.print("Enter your PhoneNumber: ");
        String phoneNumber = scanner.next();
        System.out.print("Enter your EmailId: ");
        String emailId = scanner.next();
        user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setAddress(address);
        user.setUserId(userId);
        user.setPhoneNumber(phoneNumber);
        user.setEmailId(emailId);
        System.out.println("You have successfully registered. Please continue with login..");
        // user.save() -> this will be saving the information to databse
    }

    @Override
    public void doLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the username:");
        String userId = scanner.next();
        System.out.print("Enter the password:");
        String password = scanner.next();
        if (userId.equals(user.getUserId())
                && password.equals(user.getPassword())) {
            System.out.println("Congratulations!! you are successfully logged in..");
        } else {
            System.out.println("Oops,, Login failed :(");
        }
    }
}