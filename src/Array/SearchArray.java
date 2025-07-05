package Array;

import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
/*
//  program for searching a number in an array
        int[] number = {1, 2, 3, 4, 5, 7, 9};
        int target1 = 1;
        boolean isFound = false;

        for (int i = 0; i < number.length; i++) {
            if (target1 == number[i]) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element not present in array!!");
        }
 */
        //program for searching a String in an array
        String[] fruits = { "apple", "orange", "banana", "coconut" };
        String target2;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the fruit you want to find : ");
        target2 = scanner.nextLine();
        
        boolean isFound = false;

        for(int i = 0 ; i < fruits.length ; i++){
            if(fruits[i].equals(target2)){
                System.out.println("your element found at index " + i );
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("fruit not present in the array");
        }

    }
}
