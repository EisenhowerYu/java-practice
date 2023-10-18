public class Dog extends Animal implements NoiseCapable {

    public Dog(String name) {
        this(name, 0, 0, 0);
    }

    public Dog(String name, int x, int y, double wgt) {
        super(name, x, y, wgt);
    }

    public void makeNoise() {
        this.bark();
    }

    public void bark() {
        System.out.println(this.getName() + " barks bau bau");
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getWgt();
    }
}
