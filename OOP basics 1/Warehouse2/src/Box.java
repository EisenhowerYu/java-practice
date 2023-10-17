import java.util.ArrayList;

/*
 * Box contains packable objects
 * Since box also contains .weight() method, box can also be a Packable
 */
public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> arr;

    public Box(double capacity) {
        this.capacity = capacity;
        this.arr = new ArrayList<Packable>();
    }

    public double weight() {
        double weight = 0;
        for (Packable e:arr) {
            weight = weight + e.weight();
        }
        return weight;
    }

    public void add(Packable item) {
        if (this.weight() < capacity) {
            arr.add(item);
        }
    }

    public String toString() {
        return "Box: " + this.arr.size() + " items, total weight " + this.weight() + " kg";
    }
}
