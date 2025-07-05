package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {
    public static void main(String[] args){

        //BufferedReader + FileReader : Best for reading text files line by line
        //FileInputStream : Best for binary files ( images , audio files)
        //RandomAccessFiles : Best for read/write specific portion of large file

        String filePath = "D:\\JAVA\\src\\Files\\test.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null ){
                System.out.println(line);

            }
        }
        catch (Exception e){
            System.out.println("could not locate file!! ");

        }


    }
}
