package Core;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args){

        // && = AND (all conditions must be true to execute)
        // || = OR  (only one condition must be true to execute)
        //  ! = NOT (not means opposite of the condition)
/*
        double temp = 40;
        boolean isSunny = false;

        if(temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("the weather is good");
            System.out.println("it is sunny outside");
        }
        else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("the weather is good");
            System.out.println("it is cloudy outside");
        }
        else if(temp > 30 || temp < 0) {
            System.out.println("the weather is bad");
        }
*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter you username : ");
        String username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4 and 12 characters.");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain spaces or underscores.");
        } else {
            System.out.println("Your username is: " + username);
        }

        scanner.close();

    }
}
