package Core;

public class VarArgs {
    public static void main(String[] args) {

        /*
        varargs = allow a method to accept a varying # of arguments
                    makes method more flexible , no need for overloaded methods
                    java will pack the argument into an array
                    ... (ellipsis)
         */
        System.out.println(add(1, 2, 3, 4));
        System.out.println(average(1, 2, 3, 4));

    }

    static int add(int... numbers) {

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    // program to check the average of the numbers
    static double average(double... numbers){

        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        for(double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
}
