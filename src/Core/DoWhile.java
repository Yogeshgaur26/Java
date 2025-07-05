package Core;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){

        // do while loop = conditions is done firstly than condition is checked

        Scanner scanner = new Scanner(System.in);

        // Example 1st
        int age = 0;
        do{
            System.out.println("your age can't be negative");
            System.out.print("Enter you age : ");
            age = scanner.nextInt();
        }while(age < 0);

        System.out.println("you are " + age + " years old");

        //Example 2nd
        int number = 0;

        do{
            System.out.print("enter a number between 1 - 10 : ");
            number = scanner.nextInt();
        }while(number < 1 || number > 10);

        System.out.println("you picked a number between 1 - 10");
        number = scanner.nextInt();

        scanner.close();
    }
}
