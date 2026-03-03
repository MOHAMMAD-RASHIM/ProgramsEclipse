package com.tap.methodOverloading;
class MathOperations {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class AdditionMethodOverload {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        // Calling different versions of the add method
        System.out.println("Sum of 2 ints: " + math.add(10, 20));
        System.out.println("Sum of 3 ints: " + math.add(10, 20, 30));
        System.out.println("Sum of 2 doubles: " + math.add(10.5, 20.5));
    }
}