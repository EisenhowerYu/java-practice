import java.util.ArrayList;

public class MisplacingBox extends Box {
    private ArrayList<Item> arr;

    public MisplacingBox() {
        this.arr = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        arr.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
