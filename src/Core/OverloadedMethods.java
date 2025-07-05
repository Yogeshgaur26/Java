package Core;

public class OverloadedMethods {
    public static void main(String[] args){

        //overloaded methods = methods that share the same name,
        //                     but different parameters
        //                     signature = name + parameters

        // first overloaded method
        System.out.println(add(1,2));

        //second overloaded method
        String pizza = bakePizza("flatBread" , "mozzarella");
        System.out.println(pizza);


    }
    static double add(double a , double b) {
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }


    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread , String cheese){
        return bread + " pizza with " + cheese;
    }


}
