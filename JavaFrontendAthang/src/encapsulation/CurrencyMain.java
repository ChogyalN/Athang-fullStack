package encapsulation;

import java.util.Scanner;

public class CurrencyMain {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        Scanner sc = new Scanner(System.in);
        char exit = 'y';

        while(exit == 'y'){
            System.out.print("Enter the amount in USD to convert into Ngultrum: ");
            float USD = sc.nextFloat();
            converter.setAmountInUSD(USD);
            System.out.println("The converted rate of "+ USD +" USD in Nu is = Nu "+ converter.getAmountInNu());
            System.out.print("Do you want to continue conversion (y/n): ");
            exit = sc.next().charAt(0);
        }
    }
}
