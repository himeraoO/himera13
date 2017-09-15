package newpaket2.Dz5;

import java.util.Date;

public abstract class Message {
    protected User author;
    protected Date date;

    public abstract void send();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        return (author != null ? author.equals(message.author) : message.author == null) && (date != null ? date.equals(message.date) : message.date == null);
    }

    @Override
    public int hashCode() {
        int result = author != null ? author.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
