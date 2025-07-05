package Core;

public class VariableScope {

    static int x = 3 ; //Class

    public static void main(String[] args){

        System.out.println(x);

        doSomething();
    }

    static void doSomething() {

        int x = 2;//LOCAL

        System.out.println(x);

    }
}
