package collectionFramework;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        LocalDate date1 = LocalDate.of(2023, 8, 5);  // Create a date
        date1.plusDays(5);         // Add 5 days to date1, but it will not change date1

        System.out.println("Original date: " + date1);  // Still 2023-08-05
        //System.out.println("New date: " + date2);
    }
}
