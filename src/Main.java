public class  Main {

    public static void main(String[] args) {
        Book book1 = new Book("Матонин Е.В.", "Сидней Рейли", 478, "Биография",
                "Молодая гвардия");
        Book book2 = new Book("Хоанг М.", "Чингисхан", 276, "Биография",
                "Молодая гвардия");
        book1.printBook();
        book2.printBook();
        System.out.println("Количество книг в библиотеке: " + book2.bookCount);

    }
}
