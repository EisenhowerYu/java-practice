public class Organism implements Movable, Comparable<Organism> {
    private int x;
    private int y;
    private double wgt;

    public Organism(int x, int y) {
        this(x, y, 0);
    }

    public Organism(int x, int y, double wgt) {
        this.x = x;
        this.y = y;
        this.wgt = wgt;
    }

    public String toString() {
        return "x: " + this.x + "; y: " + this.y;
    }

    public double getWgt() {return this.wgt;}

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public int compareTo(Organism organism) {
        if (this.wgt > organism.wgt) {
            return 1;
        } else if (this.wgt < organism.wgt) {
            return -1;
        } else {
            return 0;
        }
    }
}
