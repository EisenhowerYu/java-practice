import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        Book annsFables = new Book("Ann's Fables", "Ann", 1945);
        Book bobsFables = new Book("Bob's Fables", "Bob", 1968);
        Book carlFables = new Book("Carl Fables", "Carl", 2001);

        Library lib = new Library();

        System.out.println("Adding books");
        lib.addBook(annsFables);
        lib.addBook(annsFables);
        lib.addBook(bobsFables);
        lib.addBook(carlFables);

        lib.listBooks();

        System.out.println("Removing books");
        lib.removeBook(carlFables);
        lib.removeBook(carlFables);

        lib.listBooks();

        System.out.println(lib.getBook("Ann's Fables"));
        System.out.println(lib.getBook("Ann's Fables  "));
        System.out.println(lib.getBook("ann's FABLES"));
    }
}
