package Array.ObjectArray;

//this class is connected to cartoon class
public class ObjectArray {
    public static void main(String[] args){

//        Cartoon cartoon1 = new Cartoon("ben 10" , "CN");
// Cartoon cartoon2 = new Cartoon("bheem" , "pogo");
// Cartoon cartoon3 = new Cartoon("doremon" , "disney");


        Cartoon[] cartoons = {new Cartoon("ben 10" , "CN"),
                              new Cartoon("bheem" , "pogo"),
                              new Cartoon("doremon" , "disney")};

        // for(int i = 0 ; i < cartoons.length ; i++){
        //    cartoons[i].Watch();
        // }

        //b y this we can change all the channel to CN
        for(Cartoon cartoon : cartoons){
            cartoon.channel = "CN";
        }


       // enhanced for loop
        for(Cartoon cartoon : cartoons){
            cartoon.Watch();
        }

    }
}
