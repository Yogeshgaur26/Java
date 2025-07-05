package Array.ObjectArray;

public class Cartoon {

    String cartoon;
    String channel;

    Cartoon(String a , String b){
        this.cartoon = a;
        this.channel = b;
    }

    void Watch(){
        System.out.printf("you watch %s on %s \n" , this.cartoon ,this.channel);
    }

}
