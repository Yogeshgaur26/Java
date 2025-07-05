package Oops.OverloadedConstructor;

//this class is connected to user class
public class OverloadedConstructor {
    public static void main(String[] args){

        //overloaded constructors = allows a class to have multiple constructors
        //                          with different parameter lists.
        //                          enable object to be initialized in various ways

        User user1 = new User("yogesh");

        User user2 = new User("gaur" , "yogesh26@gmail.com" );

        User user3 = new User ("gaur" , "yogesh26@gmail.com" , 22);

        User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);

    }
}
