package Project;

import java.util.Scanner;
import java.util.Random;

public class DiceRollerProgram {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int NumOfDice;
        int total = 0;

        System.out.print("enter the number of dice to be rolled :");
        NumOfDice = scanner.nextInt();

        if(NumOfDice > 0){
            for(int i = 1 ; i <= NumOfDice ; i++){
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.printf("your dice number is :%d\n",roll);
                total += roll;
            }
            System.out.println("Total " + total);
        }
        else{
            System.out.println("number of dice should be greater than zero");
        }
        scanner.close();
    }
    // display the Ascii for the dice rolled
    static void printDie(int roll){
        // multi line string between """ """
        String dice1 = """
                    -------
                   |       |
                   |   ●   | 
                   |       |
                    -------  """;

        String dice2 = """
                    -------
                   | ●     |
                   |       | 
                   |     ● |
                    -------  """;
        String dice3 = """
                    -------
                   | ●     |
                   |   ●   | 
                   |     ● |
                    -------  """;

        String dice4 = """
                    -------
                   | ●   ● |
                   |       | 
                   | ●   ● |
                    -------  """;

        String dice5 = """
                    -------
                   | ●   ● |
                   |   ●   | 
                   | ●   ● |
                    -------  """;

        String dice6 = """
                    -------
                   | ●   ● |
                   | ●   ● | 
                   | ●   ● |
                    -------  """;

        switch(roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);

        }

    }
}
