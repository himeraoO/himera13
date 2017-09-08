package newpaket;
import java.util.Date;
public class Publisher {
    protected String author;
    Date date;
    public Publisher() {
    }
    public Publisher(String author, Date date) {
        this.author = author;
        this.date = date;
        System.out.println("Constructer of Publisher executed");
    }
    public void print() {
        System.out.println(author + " - " + date);
    }
}