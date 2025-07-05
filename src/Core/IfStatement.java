package Core;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args){

        // if Statement = performs a block of code if its condition is true

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter you name : ");
        String name = scanner.nextLine();

        System.out.print("enter the age :");
        int age = scanner.nextInt();

        System.out.print("Are you a Student?(true or false) :");
        boolean isStudent = scanner.nextBoolean();

        //Group 1
        if(name.isEmpty()){
            System.out.println("you didn't enter your name!");
        }
        else{
            System.out.println("Hello " + name + "!");
        }

        //Group 2
        if(age > 0 && age < 18) {
            System.out.println("you are underaged");
        }
        else if(age > 18 && age < 65){
            System.out.println("you are an adult!");
        }
        else if (age >= 65) {
            System.out.println("you are senior");
        }
        else{
            System.out.println("age cannot be negative or zero");
        }

        //Group 3
        if(isStudent){
            System.out.println("you are a student!");
        }
        else{
            System.out.println("you are Not a Student");
        }


        scanner.close();

    }
}
