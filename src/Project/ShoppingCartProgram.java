package Project;

import java.util.Scanner;

public class ShoppingCartProgram {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Shopping cart");

        System.out.print("Enter the item you want to buy : ");
        String item = scanner.nextLine();

        System.out.print("Enter the price of the item : ");
        double price = scanner.nextDouble();

        System.out.print("Enter the Quantity of the item : ");
        double quantity = scanner.nextDouble();

        double total = price * quantity;

        System.out.println("your total price of the item is " + total);

    }
}
