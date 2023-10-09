public class paymentTerminal {
    private double balance;

    public paymentTerminal() {this.balance = 1000.0;}

    public double getBalance() {return this.balance;}

    public void sell(String productId, double price, double qty) {
        this.balance = this.getBalance() + price * qty;
    }
}
