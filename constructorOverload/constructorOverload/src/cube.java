public class cube {
    private int edgeLength;

    public cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public double volume() {
        return Math.pow(edgeLength, 3);
    }
}
