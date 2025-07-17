package com.autobots.java.streamAPI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAverSalary {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "Alice", 28, 3000, "IT"),
                new Employee(2, "Bob", 35, 4000, "HR"),
                new Employee(3, "Charlie", 40, 5000, "Finance"),
                new Employee(4, "David", 25, 3500, "IT"),
                new Employee(5, "Eva", 30, 4200, "Marketing"),
                new Employee(6, "Frank", 45, 6000, "Finance"),
                new Employee(7, "Grace", 29, 3400, "HR"),
                new Employee(8, "Henry", 34, 3900, "IT"),
                new Employee(9, "Isabel", 38, 4500, "Marketing"),
                new Employee(10, "Jack", 27, 3600, "IT")
        );
        Map<String, Double> totalSalaryByDep = new HashMap<>(); // сумма зарплат
        Map<String, Integer> countByDep = new HashMap<>();       // количество сотрудников

        for (Employee employee : employees) {
            String dep = employee.getDepartment();
            totalSalaryByDep.put(dep,
                    totalSalaryByDep.getOrDefault(dep, 0.0) + employee.getSalary());
            countByDep.put(dep,
                    countByDep.getOrDefault(dep, 0) + 1);
        }

        for (String dep : totalSalaryByDep.keySet()) {
            double avg = totalSalaryByDep.get(dep) / countByDep.get(dep);
            System.out.printf("%s -> $%.2f%n", dep, avg);
        }

    }
}
