package exceptions;

import java.util.Scanner;

public class ExceptionMainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number between 0-9: ");
        int num = 0;
        try {
            num = sc.nextInt();
            if (num > 9 || num < 0) {
                throw new Exception("The number should be between 0 - 9");
            }
            System.out.println("The entered number is " + num);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Please enter a valid number!");
            num = sc.nextInt();
        }
    }
}
