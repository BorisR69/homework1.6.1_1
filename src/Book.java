public class Book {
    static int bookCount = 0; // Счетик количества книг
    String title;
    Author author;
    int quantityPages;
    String content;
    String publicHouse;

    public Book (String title, int numPages, String content, String publicHouse, Author author) {
        this.title = title;
        this.quantityPages = numPages;
        this.content = content;
        this.publicHouse = publicHouse;
        this.author = author;
        bookCount ++;
    }

    public String toString () {
              return "Title: " + title + ", Author: " + author.lastName + " " + author.firstName + ", Quantity pages: "
                      + quantityPages + ", Content: " + content + ", Public house: " + publicHouse;
    }

    public void cardOfBook (){ // Печать карточки книги
        System.out.println("\n*----Карточка книги----*");
        System.out.println("Название: " + title + "\nАвтор: " + author.firstName + " " + author.lastName +
                "\nКоличество страниц: " + quantityPages + "\nЖанр: " + content + "\nИздательство: " + publicHouse);
        System.out.println("*---------------------*");
        }
}
