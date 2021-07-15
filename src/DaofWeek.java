import java.util.Scanner;

public class DaofWeek {
    public static void main(String[] args) {

        int day = 0;
        String dayName = "";

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        dayName = myScanner.nextLine();
        day = Integer.parseInt(dayName);

        if ( day == 1 ) {
            dayName = "Monday";
        } else if ( day == 2 ) {
            dayName = "Tuesday";
        } else if ( day == 3 ) {
            dayName = "Wednesday";
        } else if ( day == 4 ) {
            dayName = "Thusday";
        } else if ( day == 5 ) {
            dayName = "Friday";
        } else if ( day == 6 ) {
            dayName = "Saturday";
        } else if ( day == 7 ) {
            dayName = "Sunday";
        } else {
            dayName = "OOOOPPSSS OUT OF RULES! ";
        }
        System.out.println("The day is " + dayName);
    }
}
