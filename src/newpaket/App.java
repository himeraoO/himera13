package newpaket;
import java.util.Date;
public class App {
    public static void main(String[] args) {
        News news = new News("Dmitry Protsko", new Date(), "Photoshop 7");
        System.out.println(news.author+ " " + news.getSource());
        Publisher publisher = new Publisher("Dmitry", new Date());

        publisher.print();
        news.print();

        Publisher publisher1 = news;
        publisher1.print();

        publish(publisher);
        publish(publisher1);
        publish(new Article());
    }
    private static void publish (Publisher publisher){
        System.out.println("Publish...");
        publisher.print();
    }
}
