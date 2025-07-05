package Oops.Aggregation;

public class Aggregation {
    public static void main(String[] args){

        //Aggregation = represents a "has - a" relationship between objects
        //              one object contains another object as part of its structure,
        //              but the contained object/s can exist independently

        Book book1 = new Book("harry potter" , 400);
        Book book2 = new Book ("the fellowship of the ring" , 423);
        Book book3 = new Book ("the return of the king" , 416);

        Book[] books = { book1 , book2 , book3};

        Library library = new Library("NYC public library" , 1987  , books);

        library.displayInfo();



    }
}
