package Oops.Static;
// this class is connected to friend class

public class Static {
    public static void main(String[] args){

        //static = Makes a variable or method belong to the class
        //         rather than to any specific object
        //         commonly used for utility methods or shared resources

        Friend friend1 = new Friend("kumar");
        Friend friend2= new Friend("sharma");
        Friend friend3= new Friend("gupta");

        // to display we can use class name
        System.out.println(Friend.numOFFriend);

        Friend.showFriend();

        // math class

       // Math.round(3.99);


    }
}
