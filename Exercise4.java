import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("Convert days into hours, minutes, and seconds");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of days: ");

        int hour = Integer.valueOf(input.nextLine()) * 24;
        int mins = hour * 60;
        int secs = mins * 60;

        System.out.println("Hours: " + hour);
        System.out.println("Minutes: " + mins);
        System.out.println("Seconds: " + secs);
        input.close();
    }
}
