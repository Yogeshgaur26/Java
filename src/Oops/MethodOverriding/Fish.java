package Oops.MethodOverriding;

public class Fish extends Animal {

    // This method overrides the parent class method
    @Override
    void move() {
        System.out.println("This animal is swimming");
    }
}
