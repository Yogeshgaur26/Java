package Project;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock" , "paper" , "scissors"};

        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        while(playAgain.equals("yes")) {
            System.out.print("enter your move (rock , paper , scissors) : ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("invalid choice");
                continue;
            }

            computerChoice = choices[random.nextInt(0, 3)];
            System.out.println("computer choice : " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("it's a tie");
            } else if (
                    (playerChoice.equals("rock") && (computerChoice.equals("scissors")))
                            || (playerChoice.equals("paper") && (computerChoice.equals("rocks")))
                            || (playerChoice.equals("scissors") && (computerChoice.equals("paper")))
            ) {
                System.out.println("you won!!");
            } else {
                System.out.println("computer wins!!");
            }
            System.out.print("do you want to play again : ");
            playAgain = scanner.nextLine();

            if(playAgain.equals("no")){
                break;
            }
            else if (playAgain.equals("yes")){
                continue;
            }
            else {
                System.out.println("invalid option!! Try Again");
            }
        }

    scanner.close();
    }
}
