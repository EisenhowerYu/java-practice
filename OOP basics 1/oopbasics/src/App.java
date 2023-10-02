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

        while(true) {
            System.out.println("Name: ");
            String nameString = input.nextLine();
            if (nameString.equals("x")) {
                break;
            }

            System.out.println("Amount: ");
            Double amtDouble = Double.valueOf(input.nextLine());

            cardDB.add(new paymentCard(nameString, amtDouble));
        }

        input.close();

        for (paymentCard element:cardDB) {
            System.out.println(element.getId());
        }
    }
}