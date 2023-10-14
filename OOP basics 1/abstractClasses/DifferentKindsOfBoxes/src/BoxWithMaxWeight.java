import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> arr;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.arr = new ArrayList<>();
    }

    public int getCapacity() {return this.capacity;}

    @Override
    public void add(Item item) {
        if (item.getWeight() <= capacity) {
            this.capacity = this.capacity - item.getWeight();
            arr.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item e:arr) {
            if (e.getName().equals(item.getName())) {
                return true;
            }
        }
        return false;
    }
}
