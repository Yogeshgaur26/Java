package Project;

import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Weight Converter Program!!");
        System.out.println("1.kgs to lbs\n2.lbs to kgs");
        System.out.print("choose a option : ");
        int option = scanner.nextInt();

        if(option == 1){
            System.out.print("enter the weight in kgs : ");
            double kgs = scanner.nextDouble();
            kgs *= 2.20462;
            System.out.printf("your converted weight in pound is : %.2f ", kgs);
        }
        else if(option == 2){
            System.out.print("enter the weight in pound : ");
            double pound = scanner.nextDouble();
            pound *= 0.453592;
            System.out.printf("your converted weight in kgs is : %.2f ", pound);
        }
        else{
            System.out.println("invalid option!!");
        }

        scanner.close();

    }
}
