package Files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    public static void main(String[] args){

        //how to write a file using Java (4 popular options)

        // fileWrite = good for small or medium-sized text files
        // bufferedWriter = better performance for large amounts of text
        // PrintWriter = Best for structured data , like reports or logs
        // FileOutputStream = Best for binary files (eg -  images , audio files)


        // we can set location path where to store the file

        String filePath = "D:\\JAVA\\src\\Files\\test.txt";
        String textContent = "I like pizza!!\nit's really good";

        try(FileWriter writer =  new FileWriter(filePath);){
            writer.write(textContent);
            System.out.println("file has been written!!");

        }
        catch (FileNotFoundException e){
            System.out.println("could not locate file location");
        }

        catch (IOException e) {
            System.out.println("could not write files!!");
        }

    }
}
