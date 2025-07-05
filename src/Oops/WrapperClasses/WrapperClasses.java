package Oops.WrapperClasses;

public class WrapperClasses {
    public static void main(String[] args){

        //wrapper classes = Allow primitive values (int , char , double , boolean )
        //                  to be used as object. "wrap them in an object"
        //                  generally , don't wrap primitive unless you need an object
        //                  allows use of collections framework and static utility Methods.

        //autoboxing
 /*       Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;
        String e = "pizza";

        //unboxing
        int x = a;

        // tostring method
        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('a');
        String d = Boolean.toString(false);

        String x = a + b + c + d;

        System.out.println(x);
*/
        char letter = '$';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));

    }
}
