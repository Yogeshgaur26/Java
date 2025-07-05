package Oops.Super;

public class Employee extends Person{

    int salary;

    Employee(String fname , String lname , int salary){
        super(fname , lname);
        this.salary = salary;
    }

    void showSalary(){
        System.out.println(this.fname + " salary is " + this.salary );
    }
}
