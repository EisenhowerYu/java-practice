import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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

        ArrayList<Integer> positive = inputs.stream()
            .map(s -> Integer.valueOf(s))
            .filter(s -> s > 0)
            .collect(Collectors.toCollection(ArrayList::new));
        positive.stream()
            .forEach(value -> System.out.println(value));

        double avg = inputs.stream()
            .mapToDouble(s -> Double.valueOf(s))
            .filter(s -> s > 0)
            .average() // returns an OptionalDouble-type object
            .getAsDouble(); // use .getAsDouble to select Double

        long count = inputs.stream()
            .mapToLong(s -> Long.valueOf(s))
            .filter(s -> s > 0)
            .count();
        
        System.out.println("Count: " + count);
        System.out.println("Average: " + avg);

        String linebreak = inputs.stream()
            .reduce("", (prev, word) -> prev + word + "\n");
        System.out.println(linebreak);
    }
}
