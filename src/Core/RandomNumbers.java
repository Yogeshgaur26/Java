package Core;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args){

        Random random = new Random();

        int number;

        number = random.nextInt(1 , 7); //origin is included and bound is not included

        System.out.println(number);

    }
}
