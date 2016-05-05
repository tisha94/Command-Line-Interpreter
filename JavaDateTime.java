package Day22;  //Display the day of the week that you were born.

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

//Used the Java Date/Time API to display the day of the week that I was born.

public class JavaDateTime {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter LocalDateTime = DateTimeFormatter.ofPattern("EEEE hh:mm a");
        System.out.println("Now is: " + now.format(LocalDateTime));
        System.out.println(now.toString());

//         LocalDateTime then = LocalDateTime.of(1994, Month.JANUARY, 7, 3, 45);



        //used a DateTimeFormatter class to define my format that only returns the day of the week = (""EEEE");
        // you use 4 E's because
        // Exactly 4 //hh:mm a = prints out the time a=AM.
        // pattern letters will use the full form.
        // String dayOfTheWeek = then.format(LocalDateTime); // LocalDateTime String is being stored in a variable
        // called dayOfTheWeek.
        //System.out.println("I was born on  " + dayOfTheWeek); // prints out: "I was born on  Friday".

    }


}
