package Oops.Object;

public class Car {
    String make = "ford" ;
    String model = "mustang" ;
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false;

    void start(){
        System.out.println("you start the engine");
        isRunning = true;
    }

    void stop(){
        System.out.println("you stop the engine");
        isRunning = false;
    }

    void drive(){
        System.out.println("you drive the " + model);
    }

    void brake(){
        System.out.println("you brake the " + model);
    }

}
