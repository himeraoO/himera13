package Lesson5;
import java.text.SimpleDateFormat;
import java.util.Date;
public class User {

    private int userId;
    private String name;
    private String lastName;
    private String email;
    private Date registrationDate;

    private String[] strings;

    public User(int userId, String name, String lastName, String email, Date registrationDate) {
        this.userId = userId;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.registrationDate = registrationDate;
        this.strings = new String[] { "s1", "s2", "s3" };
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat
                = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        return "User: id = " + userId + ", name = " + name + ", " +
                "date = " + dateFormat.format(registrationDate) +
                ", strings = " + getArrayString(strings);
    }

    // News     -> Publication
    // News[]   -> Publication[]
    // User[]   x  Publication[]

    private String getArrayString(Object[] array) {
        String s = "";
        for (Object el: array) {
            s += el.toString() + " ";
        }
        return s;
    }

}
