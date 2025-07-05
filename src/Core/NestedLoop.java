package Core;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns : ");
        int columns = scanner.nextInt();

        scanner.nextLine(); // consume the leftover newline

        //Here we are using 2d array concept

        String[][] matrix = new String[rows][columns];

        System.out.println("Enter the elements of the matrix:");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextLine();
            }
        }

        System.out.println("\nMatrix is:");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
