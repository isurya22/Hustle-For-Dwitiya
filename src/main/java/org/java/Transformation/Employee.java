package org.java.Transformation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name; }
        public double getSalary() {
            return salary; }

        @Override
        public String toString() {
            return name + " - " + salary;
        }
    }

    class Main {
        public static void main(String[] args) {
            List<Employee> employees = Arrays.asList(
                    new Employee("John", 50000),
                    new Employee("Alice", 70000),
                    new Employee("Bob", 70000),
                    new Employee("David", 40000)
            );

            // Count employees
            long count = employees.stream().count();
            System.out.println("Total Employees: " + count);

            // Sort by salary (desc), then name (asc)
            List<Employee> sortedList = employees.stream()
                    .sorted(
                            Comparator.comparing(Employee::getSalary).reversed()
                                    .thenComparing(Employee::getName)
                    )
                    .collect(Collectors.toList());

            // Print sorted employees
            sortedList.forEach(System.out::println);
        }

}
