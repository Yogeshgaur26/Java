package Core;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){

        // While loop = repeat some code forever
        //              while some condition remains true

        Scanner scanner = new Scanner(System.in);

        //Example 1st
        String name = "";
        while(name.isEmpty()){
            System.out.print("Enter your name : ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);


        // Example 2nd
        String response = "";

        while(!response.equals("Q")){
            System.out.println("you are playing a game!!");
            System.out.print("press Q to quit : ");
            response = scanner.next().toUpperCase();
        }
        System.out.println("you have quit the game!!");


        scanner.close();

    }
}
