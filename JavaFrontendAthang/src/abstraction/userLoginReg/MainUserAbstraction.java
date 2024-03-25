package abstraction.userLoginReg;

import java.util.Scanner;

public class MainUserAbstraction {
    public static void main(String[] args) {
        MainUserAbstraction maa = new MainUserAbstraction();
        maa.execute();
    }

    private void execute() {
        System.out.println("********* WELCOME TO OUR SUPER COOL SYSTEM ***********");
        AuthenticationUsingInterface authenticationUsingAbstractClass = new UserAuthenticationUsingAbstractClass();
        authenticationUsingAbstractClass.doResigtration();
        authenticationUsingAbstractClass.doLogin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 to continue and other numbers to exit:");
        if (scanner.nextInt() == 1) {
            execute();
        }
    }
}
