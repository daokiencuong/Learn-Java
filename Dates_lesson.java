import java.time.*;
import java.time.format.DateTimeFormatter;

public class Dates_lesson {
    public static void main(String[] args){
        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);

        LocalTime myObj1 = LocalTime.now();
        System.out.println(myObj1);

        LocalDateTime myObj2 = LocalDateTime.now();
        System.out.println(myObj2);

        DateTimeFormatter myObj3 =  DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatDate = myObj2.format(myObj3);
        System.out.println(formatDate);
    }
}
