package Project;

import java.util.Scanner;

public class BankingProgram {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option;
        double balance = 0;
        double deposit;
        double withdraw;
        int exit;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("welcome to bank!!");
            System.out.println("1. Balance Check");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("please enter option to choose : ");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Option!!");
            }
        }
    }
    static void showBalance(double balance){
        System.out.printf("%.2f\n",balance);
    }

    static double deposit() {
        double amount;
        System.out.print("enter the amount to be deposited : ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("amount cannot be negative");
            return 0;
        }
        else{
            return amount;
        }

    }

    static double withdraw(double balance){
        System.out.print("enter the amount to be withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > balance){
            System.out.println("insufficient funds");
            return 0;

        }
        else if( amount < 0){
            System.out.println("amount cannot be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
}

