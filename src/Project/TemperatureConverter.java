package Project;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the temperature converter!!");

        System.out.print("enter the temperature to convert : ");
        double temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F) : ");
        String unit = scanner.next().toUpperCase();

        if (unit.equals("C") || unit.equals("F")) {
            temp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;
            System.out.printf("Converted temperature: %.2f\n", temp);
        } else {
            System.out.println("Invalid input! Please enter 'C' or 'F'.");
        }

        scanner.close();

    }
}
