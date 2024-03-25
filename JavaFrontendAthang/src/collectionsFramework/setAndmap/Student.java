package collectionsFramework.setAndmap;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private Integer id;
    private String name;
    private String address;

    public Student(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public Integer getId(){
        return id; 
    }
    public void addStudent(Student student){
        Map<Integer, Student> studentDetails = new HashMap<>();
        studentDetails.put(student.getId(), student);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
