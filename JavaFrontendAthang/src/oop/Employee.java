package oop;

import java.util.Date;

public class Employee {
    public String name;
    public int joining_year;
    public int salary;
    public String address;
    public int total_earned;

    public Employee(String name, int joining_year, int salary, String address) {
        this.name = name;
        this.joining_year = joining_year;
        this.salary = salary;
        this.address = address;

        calculateTotal(salary, joining_year);
    }

    public void setTotal(int salary){
        this.total_earned = salary;
    }
    public int getTotal(){
        return total_earned;
    }

    public void calculateTotal(int salary, int date_year){
        int getMonth = (2023 - date_year) * 12 + 2;
        setTotal(getMonth * salary);
    }
}
