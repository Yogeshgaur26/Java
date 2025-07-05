package Core;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args){

        //.substring = a method used to extract a portion of a string
        //             .substring(start , end)
/*
        String email = "yogesh26@gmail.com";
      //  String username = email.substring( 0 , 8);  it will print the string between these index number
      //  String domain = email.substring(9);  it will print the rest of the string

        // it will print the string until @
        String username = email.substring(0,email.indexOf("@"));

        //it will print the string after the given character and +1
        String domain = email.substring(email.indexOf("@") + 1);

        System.out.println(username);
        System.out.println(domain);

 */

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your email : ");
        String email = scanner.nextLine();


        if(email.contains(" ") || !email.contains("@")){
            System.out.println("invalid email!!");
        }
        else {
            System.out.println("your email username is : " + email.substring(0, email.indexOf("@")));
            System.out.println("your email domain is : " + email.substring((email.indexOf("@") + 1)));
        }

        scanner.close();
    }
}
