import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private Map<String, Integer> mapPrice;

    public Warehouse() {
        this.mapPrice = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        mapPrice.put(product, price);
    }

    public int price(String product) {
        if (mapPrice.get(product) == null) {
            return -99;
        } else {
            return mapPrice.get(product);
        }
    }
}
