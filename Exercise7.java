// Quadratic calculator
/*
 * Calculates the discriminant
 * Calculates the quadratic formula
 * Does not deal with imaginary numbers
 * 
 * Usage: Enter first coefficient
 *        Enter second coefficient
 *        Enter third coefficient
 */

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        // Calculates number of roots using discriminant
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first coefficient: ");
        double a = input.nextDouble();

        System.out.println("Enter the second coefficient: ");
        double b = input.nextDouble();

        System.out.println("Enter the third coefficient: ");
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0) {
            System.out.println("There are 2 real solutions.");
            System.out.println(("The first root is " + (-b + Math.sqrt(discriminant))/(2*a)));
            System.out.println(("The second root is " + (-b - Math.sqrt(discriminant))/(2*a)));

        } else if (discriminant == 0) {
            System.out.println("There is 1 real solution.");
            System.out.println("The answer is " + Math.sqrt(c));
        } else {
            System.out.println("There are no real solutions.");
        }

        input.close();
    }
}
