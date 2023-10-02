import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // book book1 = new book("Ann", "Ann's Fables", 69);
        // System.out.println(book1.getAuthor());
        // System.out.println(book1.getName());
        // System.out.println(book1.getPages());

        // product pants = new product("0001", "Uniqlo Pants", 1900.00);

        // System.out.println(pants.getPrice());
        // pants.discountProduct(0.10);
        // System.out.println(pants.getPrice());

        // System.out.println(pants);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        Double num1 = Double.valueOf(input.nextLine());

        System.out.println("Enter a number: ");
        Double num2 = Double.valueOf(input.nextLine());

        calculator calc = new calculator(num1);

        System.out.println("Choose an operation: ");
        String operation = input.nextLine();

        if (operation.equals("Add")) {
            calc.add(num2);
        } else if (operation.equals("Subtract")) {
            calc.subtract(num2);
        } else if (operation.equals("Multiply")) {
            calc.multiply(num2);
        } else if (operation.equals("Divide")) {
            calc.divide(num2);
        } else {
            System.out.println("Invalid operation!");
        }

        System.out.println(calc);

        input.close();
    }
}
