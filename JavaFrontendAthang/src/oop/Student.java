package oop;

public class Student {
    String name;
    String grade;
    String schoolName;
    int dobYear;
    Address homeAddress;
    Address schoolAddress;

    public Student(String name, String grade, String schoolName, int dobYear) {
        this.name = name;
        this.grade = grade;
        this.schoolName = schoolName;
        this.dobYear = dobYear;
    }

    public Student(String name, String grade, String schoolName, int dobYear, Address homeAddress, Address schoolAddress) {
        this.name = name;
        this.grade = grade;
        this.schoolName = schoolName;
        this.dobYear = dobYear;
        this.homeAddress = homeAddress;
        this.schoolAddress = schoolAddress;
    }

    public Student() {
    }

    public int getAge(){
        return 2024-dobYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", dobYear=" + dobYear +
                ", homeAddress='" + homeAddress + '\'' +
                ", schoolAddress='" + schoolAddress + '\'' +
                '}';
    }
}
