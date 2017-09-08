package newpaket;
import java.util.Date;
public class News extends Publisher {
    private String source;
    public String getSource() {
        return source;
    }
    public News(String author, Date date, String source){
        super(author, date);
        this.source = source;
        System.out.println("Constucter of News executed");
    }
    @Override
    public void print() {
        System.out.println(author + ": " + source + " - " + date);
    }
}
