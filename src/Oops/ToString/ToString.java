package Oops.ToString;

public class ToString {
    public static void main(String[] args){

        //.toString =  Method inherited from the Object
        //             Used to return a String representation of an Object.
        //             by Default , it returns a hash code as a unique identifier.
        //              it can be overridden to provide meaningful details.

        Car car1 = new Car("ford" , "mustang" , 2025 , "red");
        Car car2 = new Car("chevrolet" , "corvette" , 2026 , "blue");

        System.out.println(car1);
        System.out.println(car2);


    }
}
