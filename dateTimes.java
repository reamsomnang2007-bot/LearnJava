import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dateTimes {
    public static void main(String[] args){
        // How to work with Dates & Times using java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        // date
        LocalDate date = LocalDate.now();

        // time
        LocalTime time = LocalTime.now();

        // date and time
        LocalDateTime dateTime = LocalDateTime.of(2007, 10, 1, 5, 30, 0);

        // UTC timestamp
        Instant instant = Instant.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd:MM:yyyy  hh:mm:ss");
        String newTime = dateTime.format(formatter);
        System.out.println(newTime);
        


    }
}
