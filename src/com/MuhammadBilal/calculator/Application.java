package com.MuhammadBilal.calculator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        String operation = "";
        Scanner scanner = new Scanner(System.in);

        if (args.length > 0) {
            // Process CLI arguments
            operation = args[0];
        } else {
            // No CLI arguments, ask for user input
            System.out.println("Enter operation (e.g., add, subtract, multiply, divide):");
            operation = scanner.nextLine();
        }

        double num1, num2, number;
        switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Enter the first operand:");
                num1 = scanner.nextDouble();
                System.out.println("Enter the second operand:");
                num2 = scanner.nextDouble();
                System.out.println("Result: " + add(num1, num2));
                break;
            case "factorial":
                System.out.println("Enter a number:");
                number = scanner.nextDouble();
                System.out.println("Result: " + factorial(number));
                break;
            case "subtract":
                System.out.println("Enter the first operand:");
                num1 = scanner.nextDouble();
                System.out.println("Enter the second operand:");
                num2 = scanner.nextDouble();
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case "multiply":
                System.out.println("Enter the first operand:");
                num1 = scanner.nextDouble();
                System.out.println("Enter the second operand:");
                num2 = scanner.nextDouble();
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case "divide":
                System.out.println("Enter the first operand:");
                num1 = scanner.nextDouble();
                System.out.println("Enter the second operand:");
                num2 = scanner.nextDouble();
                System.out.println("Result: " + divide(num1, num2));
                break;
            default:
                System.out.println("Unsupported operation.");
                break;
        }
        scanner.close();
    }


    public static double add(double a, double b) {
        return a + b;
    }

    public static double factorial(double n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}

