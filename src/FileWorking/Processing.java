package FileWorking;

import java.util.*;

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
class Student extends Person {
    private String studentID;
    protected String gpa;
    public Student(String name, int age, String studentID) {
        super(name, age);
        this.studentID = studentID;
    }
    public String getStudentID() {
        return studentID;
    }
    public String getGpa() {
        return gpa;
    }
    @Override
    public String toString() {
        return "ID: " + studentID + " | Name: " + getName() + " | Age: " + getAge();
    }
}
