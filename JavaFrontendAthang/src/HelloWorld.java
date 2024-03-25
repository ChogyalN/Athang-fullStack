import oop.Address;
import oop.Employee;
import oop.Student;

import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {
//        new NameAndAddress().nameAndAddress();
//        new FirstClass().printName();
//        HelloWorld hello = new HelloWorld();
//        hello.objectConstructionWithParametrizedConstructor();
        Employee emp1 = new Employee("Tshering", 2017, 20000, "Changzamtok");
        Employee emp2 = new Employee("Tashi", 2019, 30000, "Bhutan");
        Employee emp3 = new Employee("Sunil", 2020, 25000, "Kathmandu");

        System.out.println("Name         year_joining        Address         MonthlySalary          TotalEarned");
        System.out.println(emp1.name+ "     "+emp1.joining_year+ "                "+emp1.address+"     "+emp1.salary+"                  "+emp1.total_earned);
        System.out.println(emp2.name+ "        "+emp2.joining_year+ "                "+emp2.address+"          "+emp2.salary+"                  "+emp2.total_earned);
        System.out.println(emp3.name+ "        "+emp3.joining_year+ "                "+emp3.address+"       "+emp3.salary+"                  "+emp3.total_earned);


    }

    private void objectConstructionWithParametrizedConstructor() {
        System.out.println("Object with Parametrized Constructor...");
        Address homeAddress = new Address("Changzamtog","Thimphu","Bhutan","Thimphu");
        Address schoolAddress = new Address("Yangkhor","Changangkha","Bhutan","Thimphu");
        Student chogyal = new Student("Chogyal","XII","Motithang",2004, homeAddress, schoolAddress);

        System.out.println(chogyal);
        System.out.println("Feature of Student Class, i.e. Age of Sonam: " + chogyal.getAge());
    }
}