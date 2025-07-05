package Array;

public class Array {
    public static void main(String[] args) {

        // Array: a collection of values of the same data type
        // Think of it as a variable that can store multiple values

        String[] fruits = { "apple", "orange", "banana", "coconut" };

        // Change the first element
        fruits[0] = "pineapple";

        // Get the number of elements in the array
        int numOfFruits = fruits.length;
        System.out.println("Number of fruits: " + numOfFruits);

        // Uncomment to sort the array
        // Arrays.sort(fruits);

        // Uncomment to fill the array with "kiwi"
        // Arrays.fill(fruits, "kiwi");

        // Enhanced for loop to print elements
        System.out.println("Fruits in the array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
