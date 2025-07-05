package Core;

public class Method {
    public static void main(String[] args){

        //method = a block of reusable code that is executed when called ()

        double result = square(3);

        System.out.println(result);


    }

    static void happyBirthday(String name , int age ) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s\n" , name);
        System.out.printf("you are %d years old!\n" , age);

    }

    static double square(double number){
        return number * number;
        

    }
    
}
