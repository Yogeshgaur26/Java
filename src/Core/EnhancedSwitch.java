package Core;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {

        //Enhanced Switch = A replacement to many else if statements
        //                  (java 14 feature)

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the day : ");
        String day = scanner.nextLine();

        //Enhanced Switch
        switch (day.toLowerCase()) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" ->
                    System.out.println("It is a weekday");
            case "saturday", "sunday" ->
                    System.out.println("It is a weekend");
            default ->
                    System.out.println("Invalid day");
        }
/*
        //normal switch
        switch (day.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("It is a weekday");
                break;
            case "saturday":
            case "sunday":
                System.out.println("It is a weekend");
                break;
            default:
                System.out.println("Invalid day");
                break;
*/
        scanner.close();

    }
}
