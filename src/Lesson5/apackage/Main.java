package Lesson5.apackage;

public class Main {

    public static void main(String[] args) {

        News news = new News("Dmitry");
        news.publish();

        AbstractPublication publication = new News("Dmitry Protsko");
        publication.publish();

    }

}
