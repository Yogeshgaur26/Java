package Oops.GettersSetters;

public class GettersSetters {
    public static void main(String[] args){

        //they help protect object data and add rules for accessing or modifying them.
        //GETTERS = Methods that make a field READABLE
        //SETTERS = Methods that make a field WRITEABLE

        Car car = new Car("charger" , "black" , 10000);


        car.setModel("ferrari");
        car.setColor("blue");
        car.setPrice(20000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());



    }
}
