package Project;

import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args){

        //mad libs game

        Scanner scanner = new Scanner(System.in);

        String adjective1 = " ";
        String noun1 = " ";
        String adjective2 = " ";
        String verb1 = " ";
        String adjective3 =  " ";


        System.out.print("Today i went to " + adjective1 + "________ zoo. : ");
        adjective1 = scanner.nextLine();

        System.out.print("In an  exhibit , I saw a " + noun1 + "________. : ");
        noun1 = scanner.nextLine();

        System.out.print(noun1 + " was " + adjective2 + "________ and " + verb1 + "________! : ");
        adjective2 = scanner.next();
        verb1 = scanner.nextLine();


        System.out.print("i was " + adjective3 + "________. : ");
        adjective3 = scanner.nextLine();

        System.out.printf("Today i went to %s zoo.\n" , adjective1);
        System.out.printf("In an  exhibit , I saw a %s\n" ,noun1);
        System.out.printf("%s  was %s and %s !\n",noun1 ,adjective2 , verb1);
        System.out.printf("i was %s \n" , adjective3);



    }
}
