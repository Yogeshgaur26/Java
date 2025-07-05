package Oops.Interface;

public class Fish implements Prey ,Predator{

    @Override
    public void flee(){
        System.out.println("* the fish is swimming away *");
    }

    public void hunt(){
        System.out.println("* the fish is hunting*");
    }
}
