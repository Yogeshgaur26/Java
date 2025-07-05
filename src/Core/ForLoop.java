package Core;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){

        // for loop = execute some code a certain amount of times

        Scanner scanner = new Scanner(System.in);

/*        System.out.print("Enter how many times you want to loop : ");
        int max = scanner.nextInt();

        for(int i = 1 ; i <= max ; i++){
            System.out.println(i);
        }

 */
        System.out.print("how many seconds to countdown : ");
        int start = scanner.nextInt();

        for(int i = start;i >= 0 ; i--){
            System.out.println(i);
        }
        System.out.println("Happy new Year");

        scanner.close();
    }
}
