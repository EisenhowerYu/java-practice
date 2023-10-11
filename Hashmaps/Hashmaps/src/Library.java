import java.util.HashMap;

public class Library {
    private HashMap<String, Book> directory = new HashMap<>();

    public Library() {
        this.directory = new HashMap<>();
    }

    public void addBook(Book book) {
        String name = cleanString(book.getTitle());
        if (this.directory.containsKey(name)) {
            System.out.println("Already added.");
        } else {
            this.directory.put(name, book);
        }
    }

    public void removeBook(Book book) {
        String name = cleanString(book.getTitle());
        if (this.directory.containsKey(name)) {
            this.directory.remove(name, book);
        } else {
            System.out.println("Book not found.");
        }
    }

    public Book getBook(String title) {
        String name = cleanString(title);
        return this.directory.get(name);
    }

    public String cleanString(String string) {
        if (string == null) {
            return "";
        }
        return string.toLowerCase().trim();
    }

    public void listBooks() {
        for (String key : directory.keySet()) {
            System.out.println(directory.get(key));
        }
    }
}
