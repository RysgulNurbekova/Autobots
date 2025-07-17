package com.autobots.java.streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiLesson {
    public static void main(String[] args) {
        List<String> names = List.of("Anna", "Aleks","Bella");
        List<String> nameWithA = new ArrayList<>();
        for (String name : names){
            if (name.startsWith("A")){
                nameWithA.add(name.toUpperCase());
                Collections.sort(nameWithA);
            }
            System.out.println(nameWithA);
        }
//        List<String> result = names.stream()
//                .filter(name -> name.startsWith("A"))
//                .map(String::toUpperCase)
//                .sorted()
//                .collect(Collectors.toList());
//        System.out.println(result);
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
    }
}
