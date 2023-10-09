public class product {
    private String id;
    private double price;
    private int qty;
    public static int counter;

    public product() {this(0, 0);}

    public product(double price, int qty) {
        counter++;
        this.id = "Item" + counter;
        this.price = price;
        this.qty = qty;
    }

    public String getId() {return this.id;} 
    public double getPrice() {return this.price;}
    public int getQty() {return this.qty;}

    public void setPrice(double amt) {this.price = amt;}
    public void setQty(int amt) {this.qty = amt;}

    public String toString() {
        return this.id + " " + this.price + " " + this.qty;
    }
}
