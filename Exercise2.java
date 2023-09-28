import java.util.Scanner;

// Reading user input and printing strings
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will tell a story. What is your name? ");
        String name = scanner.nextLine();

        System.out.println("What is your job?");
        String job = scanner.nextLine();
        
        // .nextLine() method gets user input as string
        // so we convert it using [type].valueOf method
        System.out.println("How old are you?");
        int age = Integer.valueOf(scanner.nextLine());

        System.out.println("How much money do you have on hand?");
        double money = Double.valueOf(scanner.nextLine());

        System.out.println("You are single, correct?");
        boolean bool = Boolean.valueOf(scanner.nextLine());

        System.out.println("Once upon a time, there is a " + job);
        System.out.println("Called " + name + " at " + age + " years of age");
        System.out.println("With " + money + " cash to their name");

        if (bool) {
            System.out.println("...and is a lonely person");
        }

        // Close scanner to begin java garbage collection
        scanner.close();
    }
}
