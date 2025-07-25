package com.autobots.java.lambda;

import java.util.function.Predicate;

public class LambdaLesson {
    public static void main(String[] args) {
        MathOperations addition = (a, b) -> a+b;
        MathOperations multi = (a, b) -> a * b;
        System.out.println("5+3 = "+addition.operation(5,3));
        System.out.println("5 * 3 = "+multi.operation(5,3));

        Predicate<String> isNotEmpty = s -> !s.isEmpty();
        System.out.println(isNotEmpty.test(""));
        System.out.println(isNotEmpty.test("java"));
    }
}
