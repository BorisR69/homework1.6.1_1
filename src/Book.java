public class Book {
    public int bookCount;
    String title;
    String author;
    int quantityPages;
    String content;
    String publicHouse;

    StringBuilder book = new StringBuilder();

    public Book (String title, String author, int numPages, String content, String publicHouse) {
        this.title = title;
        this.author = author;
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

}
