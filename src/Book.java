

public class Book {
    String title;
    String author;
    String numPages;
    String content;

    StringBuilder book = new StringBuilder();

    public void setBook (String title, String author, String numPages, String content) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        this.content = content;
    }

    public void getBook () {
        book.append(title).append(author).append(numPages).append(content);
        System.out.println(book);
    }

}
