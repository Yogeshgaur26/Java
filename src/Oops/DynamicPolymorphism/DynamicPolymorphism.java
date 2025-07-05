package Oops.DynamicPolymorphism;

import java.util.Scanner;

public class DynamicPolymorphism {
    public static void main(String[] args){

        //runtime polymorphism = when the method that get executed is decided
        //                       at runtime based on the actual type of the object.

        Scanner scanner = new Scanner(System.in);
        System.out.print("which animal you want 1.dog and 2.cat : ");
        int choice = scanner.nextInt();

        Animal animal;


        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }

    }
}
