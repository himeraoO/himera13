package newpaket2;

public class MessageStore2 {
    private int n;
    private Message[] messages;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Message[] getMessages() {
        return messages;
    }

    public void setMessages(Message[] messages) {
        this.messages = messages;
    }

    public MessageStore2() {
    }

    public MessageStore2(int n, Message[] messages) {
        this.n = n;
        this.messages = messages;
    }

    public void add(Message value) {
        messages[n++] = value;
    }
}