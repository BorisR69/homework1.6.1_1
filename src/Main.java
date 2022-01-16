public class  Main {

    public static void main(String[] args) {
        Author author1 = new Author("Евгений", "Матонин", 1964);
        Book book1 = new Book("Сидней Рейли", 478, "Биография",
                "Молодая гвардия", author1);
        Author author2 = new Author("Мишель", "Хоанг", 1948);
        Book book2 = new Book("Чингисхан", 276, "Биография",
                "Молодая гвардия", author2);
        Author author3 = new Author("Вальтер", "Шуман", 1888);
        Book book3 = new Book("Мир камня. Драгоценные и поделочные камни", 263, "Научно-популярное",
                "Мир", author3);
        User user1 = new User("Дмитрий", "Песков", 1967, "peskov@mail.ru");
        User user2 = new User("Алексей", "Венедиктов", 1955);
        User user3 = new User("Александр", "Ширвиндт", 1934);
//        book1.printBook();
//        book2.printBook();
//        book3.printBook();
        System.out.println("***********************");
        System.out.println("Количество книг в библиотеке: " + Book.bookCount);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println("***********************");
        System.out.println("Количество авторов: " + Author.authorCount);
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);
        System.out.println("***********************");
        System.out.println("Количество пользователей: " + User.totalOnline);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

    }
}
