package Core;

public class BreakContinue {
    public static void main(String[] args){

        //break = break out of loop (stop)
        //continue = skip current iteration of a loop (skip)

        for (int i = 0 ; i < 10 ; i++){

            if(i == 5){
                continue;
            }
            else if(i ==7){
                break;
            }
            System.out.println(i + " ");
        }


    }
}
