package Oops.Super;

public class Super {
    public static void main(String[] args){

        //super = refers to the parent class (subclass <- superclass)
        //        used in constructors and method overriding
        //        calls the parent constructor to initialize attributes

        Person person = new Person("yogesh" , "gaur");
        Student student = new Student("harry" , "potter" , 8);
        Employee employee = new Employee("yogesh" , "gaur" , 50000);

        person.showName();
        student.showName();
        employee.showName();

        student.showGpa();
        employee.showSalary();


    }
}
