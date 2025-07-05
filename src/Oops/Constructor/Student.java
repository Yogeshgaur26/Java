package Oops.Constructor;

public class Student {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // calling a constructor into a student class for passing an arguments
    Student(String a , int b , double c){

        this.name = a;
        this.age = b;
        this.gpa = c;
        this.isEnrolled = true;
        }

        void Study(){
            System.out.println(this.name + " is studying");

    }
}
