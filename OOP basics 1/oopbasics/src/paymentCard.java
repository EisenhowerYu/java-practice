public class paymentCard {
    private int id;
    private String name;
    private double balance;
    private static int counter;

    public paymentCard(String name, double startingBalance) {
        counter++;
        this.id = counter;
        this.name = name;
        this.balance = startingBalance;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public String toString() {
        return "Card owner " + this.getName() + " has a balance of: " + this.getBalance();
    }

    public void eat(String menuItem) {

        double deduction = 0;
        if (menuItem.equals("Cheap")) {
            deduction = 2.00;
        } else if (menuItem.equals("Medium")) {
            deduction = 10.00;
        } else if (menuItem.equals("Expensive")) {
            deduction = 20.00;
        } else {
            throw new IllegalArgumentException("Invalid transaction");
        }

        if (this.getBalance() - deduction < 0) {
            System.out.println("Invalid transaction");
        } else {
            this.balance = this.getBalance() - deduction;
        }
    }

    public void topUp(double amt) {
        if (amt < 0) {
            System.out.println("Invalid top up amount.");
        } else {
            this.balance = this.getBalance() + amt;
        }
    }
}
