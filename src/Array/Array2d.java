package Array;

public class Array2d {
    public static void main(String[] args){

        //2d array = An array where each element is an array
        //           useful for storing a matrix of data

        /*
        String[][] groceries = {{"apple" ,"orange" , "banana"},

                                {"potato" , "carrot" , "carrot"},
                                 {"chicken" , "pork" , "beef" ,"fish"}};

         groceries[0][0] = "pineapple"; // it refers to rows and columns

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.println(food + " ");
            }
            System.out.println();
        }
        */
        char[][] telephone = {{'1' ,'2' , '3'},
                                {'4' ,'5' , '6'},
                                {'7' ,'8' ,'9'},
                                {'*','0' ,'#'}};

        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
