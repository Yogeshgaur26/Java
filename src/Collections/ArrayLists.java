package Collections;

import java.util.ArrayList;
import java.util.Scanner;

//here main refer to array list
public class ArrayLists {
    public static void main(String[] args){

        //ArrayList = A resizeable array that stores objects (autoboxing).
        //            Arrays are fixed in size , but ArrayLists can change.
/*
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("pineapple");

        //we can also remove elements from the list
        fruits.remove(0);

        //set method it helps in replacing the elements
        fruits.set(0 , "coconut");

        // by get method we can also print the specific elements
        // fruits.get(0); this will print specific elements

        // it will reorder the list in the ascending order
        Collections.sort(fruits);

        for (String fruit : fruits){
            System.out.println(fruit);
        }

        System.out.println(fruits);

 */
        Scanner scanner =  new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();
        System.out.print("enter the number of food you like : ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1 ; i <= numOfFood ; i++){
            System.out.print("enter food no. " + i + " :");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();
    }
}
