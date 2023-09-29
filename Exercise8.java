// FizzBuzz Pt 2
/*
 * A game that asks for user input following the rules of FizzBuzz
 * Rules: For every multiple of 3, say Fizz
 *        For every multiple of 5, say Buzz
 *        For every multiple of 3 and 5, say FizzBuzz
 *        Else, say the integer number
 *        If wrong, say Game Over! and reset
 *        Press x to exit
 *        Answer in lowercase
 * Usage: Next: <ans>
 */

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {

        int checksum = 1; // keeps track of fizzbuzz count
        String correct; // keeps the right answer

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1.");
        while (true) {
            String ans = input.nextLine(); // reads input

            if (ans.equals("x")) {
                break;
            } else {
                // check for fizzbuzz
                if (checksum % 3 == 0 && checksum % 5 == 0) {
                    correct = "fizzbuzz";
                } else if (checksum % 3 == 0) {
                    correct = "fizz";
                } else if (checksum % 5 == 0) {
                    correct = "buzz";
                } else {
                    correct = String.valueOf(checksum);
                }

                if (!ans.equals(correct)) {
                    checksum = 0;
                    System.out.println("Wrong, the answer is " + correct);
                    System.out.println("Press 1 to restart.");
                }

                checksum++;
            }
        }

        input.close();

    }

}
