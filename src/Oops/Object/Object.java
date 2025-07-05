package Oops.Object;
//this class is connected to car class

import java.util.Random;
import java.util.Scanner;

public class Object {
    public static void main(String[] args){
        //object = an entity that holds data(attributes)
        //         and can perform actions (methods)
        //          it is a reference data type

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Car car = new Car();

/*
        System.out.println(car.make); // we can access the object by . and the attribute
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);
*/
        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);

        car.drive();
        car.brake();
    }
}
