package org.example;

public class Main {
    static void main() {
        Employee employee = new Employee();
        Manager manager = new Manager("Altynai", 100000, 100000);

        manager.getTotalSalary();
    }
}
