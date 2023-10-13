/*
 * CHangeHistory class used as an external class object
 * Warehouse and ProductWarehouse used as superclass
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        this.history.add(initBalance);
        this.setBalance(initBalance);
    }

    public String history() {
        return this.history.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(this.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        super.takeFromWarehouse(amount);
        this.history.add(this.getBalance());
        return amount;
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println(history);
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }
}
