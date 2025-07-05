package Project;

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double principal;
        double interest_rate;
        int time_compounded;
        double time;

        System.out.print("enter the principal amount : ");
        principal = scanner.nextDouble();

        System.out.print("enter the interest rate in percentage : ");
        interest_rate = scanner.nextDouble()/100;

        System.out.print("enter how many time the interest compounded per year : ");
        time_compounded = scanner.nextInt();

        System.out.print("enter the time (in years) : ");
        time = scanner.nextDouble();

        double Final_amount;

        Final_amount = principal*(Math.pow(1 + interest_rate/time_compounded , time_compounded*time));

        System.out.printf("your total final amount is : %.2f", Final_amount);

        scanner.close();


    }
}
