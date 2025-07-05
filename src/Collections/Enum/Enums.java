package Collections.Enum;

import java.util.Scanner;

public class Enums {
    public static void main(String[] args){

        //Enums = (Enumeration) A special kind of class that
        //        represent a fixed set of constant.
        //        they improve code readability
        //        More efficient with switches when comparing Strings.

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the day of the week : ");
        String response = scanner.nextLine().toUpperCase();

        // Day day = Day.SUNDAY;
        // System.out.println(day);
        // System.out.println(day.getDayNumber());

        try {
            Day day = Day.valueOf(response);

            switch(day){
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("it is a weekday");
                case SATURDAY, SUNDAY -> System.out.println("it is a weekend");
                default -> System.out.println("it is a default");
            }
        } catch (Exception e) {
            System.out.println("please enter a valid day");
        }
        scanner.close();
    }
}
