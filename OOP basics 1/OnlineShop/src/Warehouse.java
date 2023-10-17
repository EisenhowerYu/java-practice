import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> mapPrice;
    private Map<String, Integer> mapStock;

    public Warehouse() {
        this.mapPrice = new HashMap<>();
        this.mapStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        mapPrice.put(product, price);
        mapStock.put(product, stock);
    }

    public boolean take(String product) {
        if (mapStock.get(product) == null || mapStock.get(product) < 1) {return false;}
        mapStock.put(product, mapStock.get(product) - 1);
        return true;
    }

    public int price(String product) {
        if (mapPrice.get(product) == null) {return -99;}
        return mapPrice.get(product);
    }

    public int stock(String product) {
        if (mapStock.get(product) == null) {
            return 0;
        } else {
            return mapStock.get(product);
        }
    }

    public Set<String> products() {
        return mapStock.keySet();
    }
}
