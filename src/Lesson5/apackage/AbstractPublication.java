package Lesson5.apackage;

public abstract class AbstractPublication {

    protected String author;

    public abstract void publish();

    public boolean isValid() {
        return author == null;
    }

}
