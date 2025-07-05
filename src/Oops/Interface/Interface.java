package Oops.Interface;

public class Interface {
    public static void main(String[] args){

        //Interface = a blueprint of a class that specifies a set of abstract methods
        //            that implementing classes Must define
        //            Supports multiple inheritance - like behaviour

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();

        fish.flee();
        fish.hunt();
    }
}
