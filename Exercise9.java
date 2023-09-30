// Methods
/*
 * Usage: Enter first, second, third coefficient
 *        Enter start and end number for summation
 * Constraints: Can only use basic ax^2 + bx + c form
 */

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the first coefficient of the equation? ");
        int a = input.nextInt();

        System.out.println("What is the second coefficient of the equation? ");
        int b = input.nextInt();

        System.out.println("What is the third coefficient of the equation? ");
        int c= input.nextInt();

        System.out.println("What is the start number of the summation? ");
        int start = input.nextInt();

        System.out.println("What is the end number of the summation ");
        int end = input.nextInt();


        // call the function
        System.out.println(summation(a, b, c, start, end));

        input.close();
    }

    // Input: accepts the start and end number for a given equation
    public static double summation(int a, int b, int c, int start, int end) {

        double sum = 0;
        for (int i = start; i <= end; i++) {
            // function
            sum = sum + plugIn(a, b, c, i);
        }

        return sum;
    }

    // Plugs in the values into the equation
    public static double plugIn(int a, int b, int c, int i) {
        return a * Math.pow(i, 2) + b * i + c;
    }
}