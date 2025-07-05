package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        //Exception = An event that interrupts the normal flow of a program
        //            (Dividing by zero , files not found , mismatch input type)
        //             surround and dangerous code with a try{} block
        //             try{} , catch {} , finally {}

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("enter a number : ");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("that is not a number!!");
        } finally {
            System.out.println("this always execute!!");
        }
    }
}

