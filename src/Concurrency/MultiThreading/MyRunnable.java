package Concurrency.MultiThreading;

public class MyRunnable implements Runnable{

    private final String text;

    MyRunnable(String text){
        this.text = text;
    }

    @Override
    public void run(){
        for(int i = 1 ; i <= 5 ; i++ ){
            try{
                Thread.sleep(1000);
               // System.out.println(Thread.currentThread().getName() + " " + i);
                System.out.println(text);
            }
            catch (Exception e){
                System.out.println("thread was interrupted");
            }

        }
    }

}
