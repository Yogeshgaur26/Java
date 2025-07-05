package Project;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args){

        //question array
        String[] questions = {"what is the main function of the router?",
                             "which part of the computer is considered the brain?",
                            "what year was the facebook launched?",
                            "who is known as the father of computer?",
                            "what was the first programming language"};

        String[][] options = {{"1.Storing files", "2.Encrypting data", "3.directing internet traffic", "4.Managing password"},
                                {"1.CPU", "2.Hard Drive", "3.RAM", "4.GPU"},
                                {"1.2000", "2.2004", "3.2006", "4.2008"},
                                {"1.steve jobs", "2.bill gates", "3.alan turing", "4.charles Babbage"},
                                {"1.cobalt", "2.C", "3.fortran", "4.Assembly"}};

        int[] answers = {3 , 1 , 2 , 4 , 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);
        System.out.println("**********************");
        System.out.println("welcome to the Quiz!!!");
        System.out.println("**********************");

        for(int i = 0 ; i < questions.length ; i++){
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("enter your guess : ");
            guess = scanner.nextInt();

            if(guess < 1 || guess > 5){
                System.out.println("invalid option!!");
            }
            else if(guess != answers[i]){
                System.out.println("no you are wrong");
            }
            else{
                System.out.println("your guess is correct!!");
                score++;
            }
        }
        System.out.println("your score is : " + score);

            scanner.close();

    }
}
