import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Double avg;
        
        System.out.println("Enter numbers. Enter x to stop.");
        Double num = Double.valueOf(scanner.nextLine());

        System.out.println("Average: " + num);

        scanner.close();
    }
}
