package inheritance;

import java.util.Locale;

public class InheritanceMain {
    public static void main(String[] args) {
        InheritanceMain inMain = new InheritanceMain();
        inMain.createCustomer();
        System.out.println();
        inMain.createEmp();
    }

    private void createEmp() {
        Employee emp = new Employee();
        emp.address = "Changzamtog";
        emp.name = "Chogyal";
        emp.dob = "02/09/1996";
        emp.email = "chogyel@gmail.com";
        emp.department = "Accounts section";
        emp.extension = "no extension";
        emp.employeeType = "Regular";
        emp.workingBranch = "local branch";
        System.out.println("@@@ Employee context @@@ " + emp.getPesonalInfo());
    }

    private void createCustomer() {
        Customer cus = new Customer();
        cus.name = "Wangmo";
        cus.address = "Bebena";
        cus.email = "customer@gmail.com";
        cus.dob = "09-01-2003";
        cus.accNo = "22903829";
        cus.accountBranch = "BOB";
        cus.availableBal = "10930";
        System.out.println("@@@ Customer context @@@ " + cus.getPesonalInfo());
    }
}
