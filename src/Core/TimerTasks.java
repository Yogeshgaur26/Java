package Core;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTasks {
    public static void main(String[] args){

        //Timer = Class that schedules tasks at specific times or periodically.
        //        useful for : sending notifications , scheduled updates , repetitive actions

        //Timer tasks = represents the tasks that will be executed by timer
        //              you will extend the TimerTasks class to define your task
        //              create a subclass of TimerTask and @override run()

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){

            int count = 3;

            @Override
            public void run(){
                System.out.println("Hello!!");
                count--;
                if(count <= 0){
                    System.out.println("task complete");
                    timer.cancel();
                }
            }
        };
        timer.schedule(task , 0,1000);


    }
}
