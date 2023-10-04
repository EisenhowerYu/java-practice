public class pet {
    private String name;
    private int age;
    private double height;
    private double weight;

    // Constructor overloading
    public pet (String name) {
        this(name, 0, 0, 0);
    }

    public pet (String name, int age) {
        this(name, age, 0, 0);
    }

    public pet (String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return this.getName() + ", " + this.getAge() + " years old, " + this.getHeight() + " tall, " + this.getWeight() + " kgs.";
    }

    // Method overloading
    public void growOlder() {
        growOlder(1);
    }

    public void growOlder(int years) {
        this.age = this.getAge() + years;
    }
}
