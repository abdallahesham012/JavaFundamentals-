import java.time.*;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {

        // How to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)
        LocalDate date=LocalDate.now();
        System.out.println(date);

        LocalTime time=LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime);

        //UTC
        Instant instant=Instant.now();
        System.out.println(instant);

        // The out of dateTime is >> 2025-11-25T00:14:08.166101200
        // so to Format it
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss"); // u can Replace day and month and so on u can replace anything ("Date" or "Time")
        String dateTimeFormat=dateTime.format(formatter);
        System.out.println(dateTimeFormat);

        /*
        To compare dates if u have "Date1 and Date 2"

        if (date1.isBefore(date2)) {
        System.out.println(date1 + " is earlier than " + date2);
        }
        else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is later than " + date2);
        }
        else if (date1.isEqual(date2)) {
            System.out.println(date1 + " is equal to " + date2);
        }

         */
    }
}