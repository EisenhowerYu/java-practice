// Leap year calculator
/*
 * A leap year must be divisible by 4
 * If a year ends on a century, it must be divisible by 400
 * i.e. 2000 is a leap year, 1900 isn't
 */
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt(); // same as Integer.valueOf(input.nextLine())

        boolean isLeapYear = false;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            isLeapYear = true;
        }

        if (isLeapYear == true) {
            System.out.println("This is a leap year.");
        } else {
            System.out.println("This is not a leap year.");
        }

        input.close();
    }
}
