public class App {
    public static void main(String[] args) throws Exception {
        // Organism organism = new Organism(20, 30);
        // System.out.println(organism);
        // organism.move(-10, 5);
        // System.out.println(organism);
        // organism.move(50, 20);
        // System.out.println(organism);

        // Herd herd = new Herd();
        // herd.addToHerd(new Organism(57, 66));
        // herd.addToHerd(new Organism(73, 56));
        // herd.addToHerd(new Organism(46, 52));
        // herd.addToHerd(new Organism(19, 107));
        // System.out.println(herd);

        // NoiseCapable moco = new Dog("Mococo", 0, 0, 150);
        // NoiseCapable fuwa = new Dog("Fuwawa", 0, 0, 120);
        // moco.makeNoise();
        // fuwa.makeNoise();

        Organism moco2 = new Dog("Mococo", 0, 0, 150);
        Organism fuwa2 = new Dog("Fuwawa", 0, 0, 120);
        Organism koro2 = new Dog("Korone", 0, 0, 130);

        Herd dogHerd = new Herd();
        dogHerd.addToHerd(moco2);
        dogHerd.addToHerd(fuwa2);
        dogHerd.addToHerd(koro2);

        dogHerd.print();

    }
}
