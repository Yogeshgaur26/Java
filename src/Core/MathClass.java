package Core;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args){
/*
        System.out.println(Math.PI); // give the value of the pi
        System.out.println(Math.E); // give the value of the exponential

        double result =  Math.pow(2 , 4);
        result = Math.abs(-5); // it will give positive value if the value is negative
        result = Math.sqrt(9); // it will give the square root value.
        result = Math.round(3.74); // it will give round figure value
        result = Math.ceil(3.14); // it will always round up like it will give result 4
        result = Math.floor(3.99); // it will give round down and result will be 3
        result = Math.max(10,20); //it will give the max value between these two
        result = Math.min(10,20); //it will give the min value between these two

        System.out.println(result);
*/
        //Hypotenuse c = Math.sqrt (a^2 + b^2)

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the value of the height : ");
        double height = scanner.nextDouble();

        System.out.print("enter the value of the base : ");
        double base = scanner.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(height , 2) + Math.pow(base , 2));
        System.out.print("the value of the hypotenuse is : " + hypotenuse);

        scanner.close();

    }
}
