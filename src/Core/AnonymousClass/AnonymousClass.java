package Core.AnonymousClass;

public class AnonymousClass {
    public static void main(String[] args){

        //Anonymous class = a class that doesn't have a name . cannot be resued
        //                  add custom behaviour without having to create a new class.
        //                  often used for one time uses (TimerTask , Runnable , callbacks)

        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override

            void speak(){
                System.out.println("scooby doo say ruh ruh");
            }
        };

        dog1.speak();
        dog2.speak();


    }
}
