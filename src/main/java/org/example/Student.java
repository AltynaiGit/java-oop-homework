package org.example;

public class Student extends Person {
    public String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    @Override
    public void printInfo() {
        System.out.println("Name: " + name + ". Age: " + age + ". University: " + university + ".");
    }
}
