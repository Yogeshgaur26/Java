package Files.project;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args){

        // how to play audio with java

        String filePath = "D:\\JAVA\\src\\Files\\project\\Barbaad.wav";
        File file = new File(filePath);

        try(Scanner scanner = new Scanner(System.in)){
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while (!response.equals("Q")){
                System.out.println(("P = Play"));
                System.out.println("S = Stop");
                System.out.println("R = reset");
                System.out.println("Q = quit");
                System.out.print("enter your choice :");

                response = scanner.next().toUpperCase();

                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }

        }
        catch (FileNotFoundException e){
            System.out.println("could not locate file");
        }
        catch (LineUnavailableException e){
            System.out.println("unable to access audio resources");
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Audio file is not Supported");
        }
        catch(IOException e){
            System.out.println("something went wrong");
        }
        finally {
            System.out.println("Bye!");
        }

    }
}
