public class Book {
    static int bookCount = 0; // Счетик количества книг
    String title;
    Author author;
    int quantityPages;
    String content;
    String publicHouse;

    StringBuilder book = new StringBuilder();

    public Book (String title, int numPages, String content, String publicHouse) {
        this.title = title;
        this.quantityPages = numPages;
        this.content = content;
        this.publicHouse = publicHouse;
        bookCount ++;
    }

    public void printBook () {
        book.append(title).append(", ").append(author).append(", ").append(quantityPages).append(", ").append(content).
                append(", ").append(publicHouse);
        System.out.println(book);
    }

    public String toString () {
        return "Title: " + title + ", Author: " + author + "Quantity pages: " + quantityPages + "Content: " + content +
                "Public house: " + publicHouse;
    }

    }
}
