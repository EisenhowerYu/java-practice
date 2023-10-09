public class paymentCard {
    private int id;
    private String name;
    private double balance;
    private static int counter;

    public paymentCard(String name) {
        this(name, 0.0);
    }

    public paymentCard(String name, double startingBalance) {
        counter++;
        this.id = counter;
        this.name = name;
        this.balance = startingBalance;
    }

    public int getId() {return this.id;}
    public String getName() {return this.name;}
    public double getBalance() {return this.balance;}

    public String toString() {
        return "Card owner " + this.getName() + " has a balance of: " + this.getBalance();
    }

    public void topUp(double amt) {
        if (amt < 0) {
            System.out.println("Invalid transaction");
        } else {
            this.balance = this.getBalance() + amt;
        }
    }

    public void spend(double amt) {
        if (amt > this.balance) {
            System.out.println("Invalid transaction");
        } else {
            this.balance = this.getBalance() - amt;
        }
    }
}
