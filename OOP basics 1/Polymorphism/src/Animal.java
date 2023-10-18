public class Animal extends Organism {
    private String name;

    // spawn at origin
    public Animal(String name) {
        this(name, 0, 0, 0);
    }

    public Animal(String name, int x, int y, double wgt) {
        super(x, y, wgt);
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name + " eats");
    }

    public void sleep() {
        System.out.println(this.name + " sleeps");
    }

    public String getName() {return this.name;}
}
