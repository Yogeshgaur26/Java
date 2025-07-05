package Concurrency.Threading;

import java.util.Scanner;

public class Threading {
    public static void main(String[] args){

        //Threading = Allows a program to run multiple tasks simultaneously
        //            Helps improve performance with time-consuming operation
        //            (File I/O ,network communications ,or any background task)

        //  How to create a Thread
        // Option 1. Extend the Thread class (simpler)
        // Option 2. Implement the Runnable interface (better)

        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("you have 10 seconds to enter your name");

/*        for(int i = 1 ; i <= 5 ; i++){

            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println("Thread was interrupted");
            }
            if( i == 5){
                System.out.println("time's up!");
            }
        }

 */
        System.out.print("enter your name : ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        scanner.close();

    }
}
