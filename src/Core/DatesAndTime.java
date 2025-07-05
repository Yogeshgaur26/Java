package Core;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesAndTime {
    public static void main(String[] args){

        //how to work with Dates and times using java
        //(Local , Local time , Local Date time , UTC timeStamp)
/*
        LocalDate date = LocalDate.now( );

        LocalTime time = LocalTime.now();

        LocalDateTime dateTime =LocalDateTime.now();

        Instant instant = Instant.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(instant);
*/

        //custom format
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");

        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);



    }

}
