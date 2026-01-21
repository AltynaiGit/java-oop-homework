package org.example;

public class Manager extends Employee{
    public int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void getTotalSalary(){
        System.out.printf("Name is: " + name + ". Salary: " + salary + ". Bonus: " + bonus + ".");
    }
}
