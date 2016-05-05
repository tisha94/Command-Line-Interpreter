package Day22;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CommandLineInterpreter {

    static LocalDateTime now = LocalDateTime.now();

    public static void main(String[] args) {

        while (true) { // <<-- is for an Infinite Loop
            System.out.println("What would like to Display?? ");
            System.out.println("? ");
            System.out.println("time");
            System.out.println("date");
            System.out.println("datetime");
            System.out.println("day");
            System.out.println("exit");
            System.out.print(">");
            Scanner questionScanner = new Scanner(System.in); // scanner is int.
            String userCommand = questionScanner.nextLine();

            if (userCommand.equals("?")) {
                System.out.println("time: Displays current Time of day.");
                System.out.println("date: Displays current Date today.");
                System.out.println("datetime: Displays both Date & Time.");
                System.out.println("day:  Displays the Day. ");
                System.out.println("exit: Exit program. ");
                System.out.println("=============================================");
            } else if (userCommand.equals("time")) {
                System.out.println("Printing Time ~~~~~~~~~");
                DateTimeFormatter  tishaFormatter = DateTimeFormatter.ofPattern("hh:mm a");
                System.out.println("Current Time is: " + now.format(tishaFormatter));
                System.out.println("=============================================");
           } else if (userCommand.equals("date")) {
                System.out.println("Printing Date ~~~~~~~~~");
                DateTimeFormatter tishaFormatter = DateTimeFormatter.ofPattern("MMMM d yyyy");
                System.out.println("Today's Date is: " + now.format(tishaFormatter));
                System.out.println("=============================================");
          } else if (userCommand.equals("datetime")) {
                System.out.println("Printing Date & Time ~~~~~~~~~");
                DateTimeFormatter tishaFormatter = DateTimeFormatter.ofPattern("MMMM d yyyy hh:mm a");
                System.out.println("Today's Date & Time is: " + now.format(tishaFormatter));
                System.out.println("=============================================");
            } else if (userCommand.equals("day")) {
                System.out.println("Printing current day ~~~~~~~~~");
                DateTimeFormatter tishaFormatter  = DateTimeFormatter.ofPattern("EEEE");
                System.out.println("Current Day is: " + now.format(tishaFormatter)); // prints out day
                System.out.println("=============================================");
           } else if (userCommand.equals("exit")) {
               break;
           }
            }

        }
    }

