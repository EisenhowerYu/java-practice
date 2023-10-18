import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        while (true) {
            System.out.println("Enter a number: ");
            String row = scanner.nextLine();
            if (row.equals("")) {break;}
            inputs.add(row);
        }
        scanner.close();

        double avg = inputs.stream()
            .mapToDouble(s -> Double.valueOf(s))
            .average() // returns an OptionalDouble-type object
            .getAsDouble(); // use .getAsDouble to select Double

        System.out.println("Average: " + avg);
    }
}
