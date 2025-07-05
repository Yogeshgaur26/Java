package Array;

import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline

        String[] foods = new String[size];

        for(int i = 0; i < foods.length; i++ ){
            System.out.print("Enter food " + (i + 1) + ": ");
            foods[i] = scanner.nextLine();
        }

        // Optional: Print entered food items
        System.out.println("You entered:");
        for(String food : foods){
            System.out.println(food);
        }
        scanner.close();
    }
}
