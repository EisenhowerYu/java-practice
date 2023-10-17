import java.util.Scanner;

public class Store {
    private Warehouse warehouse;
    private Scanner scanner;

    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    public void shop(String customer) {
        Cart cart = new Cart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("Our selection:");

        for (String product: this.warehouse.products()) {
            System.out.println(product);
        }

        while (true) {
            System.out.print("What to put in the cart (press enter to end): ");
            String product = scanner.nextLine();

            if (product.isEmpty()) {break;}

            if (!warehouse.products().contains(product)) {
                System.out.println("Item not found, try again.");
            } else if (warehouse.stock(product) > 0) {
                warehouse.take(product);
                cart.add(product, warehouse.price(product));
            } else {
                System.out.println("No more stock for this item.");
            }
        }

        System.out.println("Your cart contents: ");
        cart.print();
        System.out.println("Total: " + cart.price());
    }
}
