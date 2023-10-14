public class Item {
    public static int hash;
    private int hashCode;
    private String name;
    private int weight;

    public Item(String name) {
        this(name, 0);
    }

    public Item(String name, int weight) {
        hash++;
        this.name = name;
        this.weight = weight;
        this.hashCode = hash;
    }

    public String getName() {return this.name;}
    public int getWeight() {return this.weight;}

    public void setName(String name) {this.name = name;}
    public void setWeight(int weight) {this.weight = weight;}

    public String toString() {
        return this.hashCode + " " + this.name + " " + this.weight;
    }

}
