package Concurrency.MultiThreading;

public class MultiThreading {
    public static void main(String[] args){

        //MultiThreading = Enables a program to run multiple threads concurrently
        //                 (Thread = A set of instruction that run independently
        //                  Useful for background tasks or time-consuming operations

        // MyRunnable myRunnable = new MyRunnable();//we can also use this simple method
        Thread thread1 = new Thread(new MyRunnable("Ping"));
        Thread thread2 = new Thread(new MyRunnable("pong"));

        System.out.println("Game Start");

        thread1.start();
        thread2.start();

        try{
            thread1.join(); //to run program between the
            thread2.join();
        }
        catch (Exception e){
            System.out.println("Main thread was interrupted");
        }

        System.out.println("Game Over");
    }
}
