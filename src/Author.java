public class Author {
    static int authorCount = 0; // Счетчик количества авторов
    String firstName;
    String lastName;
    int yearBirth;

    public Author (String firstName, String lastName, int yearBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearBirth = yearBirth;
        authorCount++;
    }

    public String toString (){
        return "Имя автора: " + firstName + " " + lastName + " " + "Год рождения: " + yearBirth;
    }
}
