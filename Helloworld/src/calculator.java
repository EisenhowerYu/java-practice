public class calculator {
    // instance variables
    private double num;

    public calculator(double num) {
        this.num = num;
    }

    public void add(double i) {
        this.num = num + i;
    }

    public void subtract(double i) {
        this.num = num - i;
    }

    public void multiply(double i) {
        this.num = num * i;
    }

    public void divide(double i) {
        this.num = num / i;
    }

    public String toString() {
        return "Value: " + this.num;
    }
}
