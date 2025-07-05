package Core;

public class NestedIfStatement {
    public static void main(String[] args){

        boolean isStudent = true;
        boolean isSenior = false;
        double price = 150;

        if(isStudent){
            if(isSenior){
                System.out.println("you got 30% discount!!");
                price *= 0.7;
            }
            else{
                System.out.println("you got 10% discount!!");
                price *= 0.9;
            }
        }
        else{
            if(isSenior){
                System.out.println("you got 20% discount!!");
                price *= 0.8;
            }
            else{
                price *= 1;
            }
        }

        System.out.println("the price of the ticket is : " + price);



    }
}
