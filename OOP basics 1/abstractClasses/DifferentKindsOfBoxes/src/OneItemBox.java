import java.util.ArrayList;

public class OneItemBox extends Box {
    private boolean filled;
    private ArrayList<Item> arr;

    public OneItemBox() {
        this.filled = false;
        this.arr = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (!this.filled) {
            arr.add(item);
            this.filled = true;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item e:arr) {
            if (e.getName().equals(item.getName())) {return true;}
        }
        return false;
    }

    public String toString() {
        return "This box is filled? " + this.filled;
    }
}
