package Oops.Super;

public class Person {

    //  person will the parent or super class

    String fname;
    String lname;

    Person(String a , String b){
        this.fname = a;
        this.lname = b;
    }

    void showName(){
        System.out.println(this.fname + " "  + this.lname);

    }

}
