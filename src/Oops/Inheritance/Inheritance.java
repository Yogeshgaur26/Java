package Oops.Inheritance;

public class Inheritance {
    public static void main(String[] args){

        //Inheritance = one class inherits the attributes and methods
        //              from another class.
        //              child <- Parent <- grandparents

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(dog.isAlive);
        System.out.println(plant.isAlive);

        dog.eat();
        cat.eat();
        plant.photosynthesis();

        System.out.println(dog.lives);
        System.out.println(cat.lives);
        System.out.println(plant.isAlive);

        dog.speak();
        cat.speak();




        
        
    }
}
