import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        System.out.println("Enter numbers. Enter x to stop.");
        Double avg = 0.0;
        int denom = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("x")) {
                break;
            } else {
                Double num = Double.valueOf(input);
                avg = avg + num;
                denom++;
            }
        }

        avg = avg / denom;
        System.out.println("Average: " + avg);

        scanner.close();
    }
}
