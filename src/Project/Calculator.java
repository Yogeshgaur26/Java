package Project;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Calculator!");

        System.out.print("Enter the first number: ");
        double x = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        double y = scanner.nextDouble();

        switch (operator) {
            case '+' -> System.out.printf("Result: %.2f\n", x + y);
            case '-' -> System.out.printf("Result: %.2f\n", x - y);
            case '*' -> System.out.printf("Result: %.2f\n", x * y);
            case '/' -> {
                if (y == 0) {
                    System.out.println("Error: Division by zero!");
                } else {
                    System.out.printf("Result: %.2f\n", x / y);
                }
            }
            case '^' -> System.out.printf("Result: %.2f\n", Math.pow(x, y));
            default -> System.out.println("Invalid operator!");
        }

        scanner.close();
    }
}
