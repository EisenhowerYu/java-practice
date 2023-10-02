public class book {

    // Instance variables
    private String author;
    private String name;
    private int pages;

    // constructor
    public book(String author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }

    // methods
    // - getter methods
    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public int getPages() {
        return this.pages;
    }


}
