package Oops.GettersSetters;

public class Car {

     private String model;
     private String color;
     private int price;

     //if we want not to change the values by these methods then we can apply private final keyword so it cannot change

     Car(String  model , String color , int price){
         this.model = model;
         this.color = color;
         this.price = price;

     }
     // get method
     String getModel(){
         return this.model;
     }

    String getColor(){
        return this.color;
    }

    String getPrice(){
        return "$" + this.price;
    }

    //set method

    void setModel(String model){
         this.model = model;
    }
    void setColor(String color){
         this.color = color;
    }

    void setPrice(int price){
         this.price = price;
    }
}
