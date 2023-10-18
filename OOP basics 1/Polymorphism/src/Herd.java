import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> arr;

    public Herd() {
        this.arr = new ArrayList<>();
    }

    public String toString() {
        String res = "";
        for (Movable e: arr) {
            res = res + e.toString() + "\n";
        }
        return res;
    }

    // can use instanceof, but no need since method
    // only acepts Movable type as input
    public void addToHerd(Movable movable) {
        arr.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable e: arr) {
            e.move(dx, dy);
        }
    }
}
