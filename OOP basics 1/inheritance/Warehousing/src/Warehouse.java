/*
 * Warehouse class
 * Handles the functions related to the amount of a product
 * Balance =  total amount in warehouse
 * Capacity = total available (static)
 */

public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        if (capacity < 0) {capacity = 0;}
        this.capacity = capacity;
    }

    public double getBalance() {return this.balance;}
    public double getCapacity() {return this.capacity;}

    public void setBalance(double balance) {this.balance = balance;}

    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }

    public void addToWarehouse(double amount) {
        if (amount < 0) {amount = 0;}

        if (amount > this.howMuchSpaceLeft()) {
            amount = this.howMuchSpaceLeft();
        }

        this.balance = this.balance + amount;
    }

    public double takeFromWarehouse(double amount) {
        if (amount < 0) {amount = 0;}

        if (amount > this.balance) {
            amount = this.balance;
        }

        this.balance = this.balance - amount;

        return amount;
    }

    public String toString() {
        return "balance = " + this.getBalance() + ", space left " + this.howMuchSpaceLeft();
    }
}
