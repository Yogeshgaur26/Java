package Oops.ToString;

public class Car {

    String make;
    String model;
    int year;
    String color;

    Car(String a , String b ,int c , String d){
        this.make = a;
        this.model = b;
        this.year = c;
        this.color = d;
    }

    @Override
    public String toString(){
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
}
