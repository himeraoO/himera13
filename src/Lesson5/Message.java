package Lesson5;
import java.util.Date;
public class Message {
    private int messageId;
    private String text;
    private String author;

    public Message(int messageId, String text, String author) {
        this.messageId = messageId;
        this.text = text;
        this.author = author;
    }

    public int getMessageId() {
        return messageId;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Message)) return false;

        Message other = (Message)obj;

        return messageId == other.messageId &&
                text.equals(other.text);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + messageId;
        result = 31 * result + text.hashCode();

        return result;
    }
}
