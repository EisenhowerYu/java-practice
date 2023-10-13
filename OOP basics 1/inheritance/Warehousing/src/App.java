public class App {
    public static void main(String[] args) throws Exception {
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice A", 1000, 100);

        // System.out.println(juice.getBalance());

        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(100.0);

        // System.out.println(juice.history());

        juice.printAnalysis();

        // ChangeHistory a = new ChangeHistory();

        // a.add(1000.0);
        // a.add(500.0);
        // a.add(750.0);
        // System.out.println(a);
        // System.out.println(a.maxValue());
        // System.out.println(a.minValue());
        // System.out.println(a.average());
        
    }
}
