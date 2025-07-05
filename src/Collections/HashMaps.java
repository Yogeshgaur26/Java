package Collections;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args){

        //HashMap = A data Structure that stores key-Value pairs
        //          keys are unique , but Values can be duplicated
        //          Does not maintain any order , but is memory efficient
        //          Hash<Key ,Value>

        HashMap<String , Double > map = new HashMap<>();
        map.put("apple" , 40.2);
        map.put("orange" , 30.2);
        map.put("coconut" , 20.2);

        map.put("orange" , 100.0);//it will remove the previous value and add new value

        map.remove("orange" , 100.0);// it will remove the value

        System.out.println(map);
        System.out.println(map.get("apple"));//it will give the value of other key
        System.out.println(map.containsKey("apple")); //check whether the apple is there in the hashmap
        System.out.println(map.containsValue(20.2));//check whether the map contains value or not.
        System.out.println(map.size());//check the size of the maps

        if(map.containsKey("apple")){
            System.out.println("give me apple");
        }
        else{
            System.out.println("key not found!!");
        }

    }
}
