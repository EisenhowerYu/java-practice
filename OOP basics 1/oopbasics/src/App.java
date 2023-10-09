// payment card
/*
 * Simluates a debit card for a university
 * Allows transactions such as eating out and topping up
 * Usage: enter name and amount, press x to stop
 */

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<paymentCard> cardDB = new ArrayList<paymentCard>();

        Scanner input = new Scanner(System.in);

        // loads inputted names into an arraylist
        while(true) {
            System.out.println("Name: ");
            String nameString = input.nextLine();
            if (nameString.equals("x")) {break;}

            System.out.println("Amount: ");
            Double amtDouble = Double.valueOf(input.nextLine());

            cardDB.add(new paymentCard(nameString, amtDouble));
        }
        input.close();

        // creates products
        product s_meal = new product(10, 20);
        product m_meal = new product(15, 30);
        product l_meal = new product(20, 20);

        // creates payment terminal
        paymentTerminal pos = new paymentTerminal();

        // sample transactions
        transaction(cardDB.get(1), m_meal, pos, 1);
        transaction(cardDB.get(2), s_meal, pos, 2);
        transaction(cardDB.get(3), l_meal, pos, 3);
    }

    public static void transaction(paymentCard card, product product, paymentTerminal pos, int qty) {

        double total = product.getPrice() * qty;
        if (qty > product.getQty()) {
            System.out.println("Invalid transaction.");
            return;
        }

        card.spend(total);
        pos.sell(product.getId(), product.getPrice(), qty);
        product.setQty(product.getQty() - qty);

        System.out.println(card.getName() + " has purchased " + qty + " of " + product.getId());
        System.out.println("Total transaction: " + total + ". Remaining balance: " + card.getBalance());
        System.out.println("Total stock left: " + product.getQty());
        System.out.println("Total balance in payment terminal: " + pos.getBalance());
    }
}