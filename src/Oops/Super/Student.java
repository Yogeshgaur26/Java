package Oops.Super;

public class Student extends Person{
        //person is the parent class
    double gpa;

    Student(String fname , String lname , double gpa){
        super(fname , lname);
        this.gpa = gpa;
    }

    void showGpa(){
        System.out.println(this.fname + " gpa is " + this.gpa);
    }

}
