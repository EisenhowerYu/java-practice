public class App {
    public static void main(String[] args) throws Exception {
        cube cube = new cube(3);

        System.out.println(cube.volume());

        pet bob = new pet("Bob");

        System.out.println(bob);
    }
}
