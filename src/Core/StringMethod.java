package Core;

public class StringMethod {
    public static void main(String[] args){

        String name = "Password";


       //  int length = name.length();  it will give the length of the string
       //  char letter = name.charAt(0);  it will give the char by index number
      //   int index = name.indexOf("o");  it will give the index number by the letter
      //   int lastIndex = name.lastIndexOf("g");  it will give the last position if the occurrence of the letter

     //    name = name.toUpperCase();  it will convert lowercase to uppercase
     //    name = name.toLowerCase();  it will convert uppercase to lowercase

     //    String Name = name.trim();  it will help in trimming the extra spaces before and after the string

     //    name = name.replace(" " , "");  it will replace the character

       //    System.out.println(name.isEmpty());  it will return boolean value whether the string is empty or not

       //   System.out.println(name.contains(" "));  it will check whether the string contains the give char or not

        //name.equals = it will check whether the string is equal to password or not
        //name.equalsIgnoreCase = it will ignore case just match the characters

        if(name.equalsIgnoreCase("password")){
            System.out.println("your name cant be passsord");

        }
        else{
            System.out.println("hello " + name);
        }

    }
}
