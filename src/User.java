public class User {
    static int totalOnline = 0; // Счетчик количества пользователей
    String firstName;
    String lastName;
    int yearOfBirth;
    String eMail;

    public User (String firstName, String lastName, int yearOfBirth, String eMail){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.eMail = eMail;
        totalOnline++;
    }
    public User (String firstName, String lastName, int yearOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        totalOnline++;
    }
    public String toString (){
        return "Имя пользователя: " + firstName + " " + lastName + " Год рождения: " + yearOfBirth +" eMail: " + eMail;
    }
}
