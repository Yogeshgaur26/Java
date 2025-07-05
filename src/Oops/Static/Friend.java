package Oops.Static;

public class Friend {

    static int numOFFriend;
    String name;

    Friend (String a){
        this.name = a;
        numOFFriend++;
    }

    static void showFriend(){
        System.out.println("you have " + numOFFriend + " total friend");

    }
}
