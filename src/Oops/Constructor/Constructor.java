package Oops.Constructor;

//this class is connected to student class
public class Constructor {
    public static void main(String[] args){
        //constructor = a special method to initialize object
        //              you can pass arguments to a constructor
        //              and set up  initial values

        Student student1 = new Student("yogesh" , 22 , 7.00);
        Student student2 = new Student("gaur" , 23 , 7.2);
        Student student3 = new Student ("raj" , 24 , 8.00);
/*
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
*/
        student1.Study();
        student2.Study();
        student3.Study();

    }
}
