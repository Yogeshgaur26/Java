package Oops.Abstraction;

public class Abstraction {
    public static void main(String[] args){

        //abstract = used to define abstract classes and methods
        //           Abstraction is the process of hiding implementation details
        //           and showing only the essential features ;
        //           Abstract classes Can't be instantiated directly
        //           can contain 'abstract' methods (Which must be implemented)
        //           can contain 'concrete' methods (which are inherited)

        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(5,5);
        Rectangle rectangle = new Rectangle(3,4);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());

    }
}
