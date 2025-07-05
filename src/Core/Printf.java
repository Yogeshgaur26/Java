package Core;

public class Printf {
    public static void main(String[] args){

        // printf = is a method used to format output
        // %[flags][width][.precision][specifier-character]
/*
        //specifier character
        String name = "yogesh gaur";
        char firstLetter = 'Y';
        int age = 23;
        double height = 170;
        boolean isEmployed = true;

        System.out.printf("my name is %s and i am %d years old " ,  name , age);
        System.out.printf("my name start with letter %c " , firstLetter);
        System.out.printf("also my height is %.2fcm and is i am employed? : %b " , height , isEmployed);
*/
/*
        //precision
        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%.1f\n" , price1); // it will round figure at the approximately value
        System.out.printf("%2f\n" , price2);  // it will give value up to 2 decimal point
        System.out.printf("%f" , price3);
*/
        /*
        //flags

        // + =  output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative , space if positive

        double price1 = 9.99;
        double price2 = 10000.15;
        double price3 = -54.01;
        double price4 = 12.03;

        System.out.printf("%+.2f\n" , price1); // + will apply the plus sign before the value
        System.out.printf("%,.2f\n" , price2);  // , will give add commas to the thousand value like
        System.out.printf("%(.2f\n" , price3); // negative number are enclosed in ()
        System.out.printf("% .2f" , price4); // space will display a minus if negative and space if positive
*/
        /*

        //width

        // 0 = zero padding
        // number = right justified padding
        // negative numbers = left justified padding

        int id1 = 1;
        int id2 = 11;
        int id3 = 111;
        int id4 = 1111;

        System.out.printf("%04d\n",id1); // it will give right padding up to 4 places and in front there will be zeroes.
        System.out.printf("%4d\n",id2); // it will just shift to the right without zeroes in the front
        System.out.printf("%-4d\n",id3); // it will just shift to the left side
        System.out.printf("%d",id4); // normal
*/

    }
}
