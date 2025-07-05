package Project;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args){

        // Number Guessing Game

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min,max + 1);

        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1 - 100");

        do{
            System.out.print("enter a guess : ");
            guess = scanner.nextInt();
            attempts++;

            if(guess > randomNumber){
                System.out.println("you guess is high");
            }
            else if(guess < randomNumber) {
                System.out.println("your guess is low");
            }
            else{
                System.out.println("you have won");
                System.out.printf("you take %d number of attempts" , attempts);
            }

        }while(guess != randomNumber);

        scanner.close();

    }
}
