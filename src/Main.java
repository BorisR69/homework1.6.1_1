public class  Main {

    public static void main(String[] args) {
        Book book1 = new Book("Сидней Рейли.", 478, "Биография",
                "Молодая гвардия");
        Book book2 = new Book("Чингисхан", 276, "Биография",
                "Молодая гвардия");
        Book book3 = new Book("Чингисхан", 276, "Биография",
                "Молодая гвардия");
        book1.printBook();
        book2.printBook();
        book3.printBook();
        System.out.println("Количество книг в библиотеке: " + Book.bookCount);
        System.out.println(book1.toString());

    }
}
