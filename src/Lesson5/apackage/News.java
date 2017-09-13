package Lesson5.apackage;

public class News extends AbstractPublication {

    public News(String author) {
        super.author = author;
    }

    @Override
    public void publish() {
        System.out.println("Publish author = " + author);
    }

}
