import java.util.Map;
import java.util.HashMap;

public class Cart {
    private Map<String, Item> map;

    public Cart() {
        this.map = new HashMap<>();
    }

    public void add(String product, int price) {
        if (map.containsKey(product)) {
            map.get(product).increaseQty();
        } else {
            map.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int price = 0;
        for (Item e: map.values()) {
            price += e.price();
        }
        return price;
    }

    public void print() {
        for (Item e: map.values()) {
            System.out.println(e);
        }
    }
}
