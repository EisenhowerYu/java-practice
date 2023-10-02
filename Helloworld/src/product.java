public class product {
    
    // Instance variables
    private String id;
    private String name;
    private double price;

    public product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // getter methods
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void discountProduct(double discount) {
        this.price = price * (1-discount);
    }

    public String toString() {
        return "Product: " + this.name;
    }
}
