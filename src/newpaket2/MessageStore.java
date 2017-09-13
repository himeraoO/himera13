package newpaket2;

public class MessageStore {
    private static Message[] messages;
    private static int length;

    private MessageStore() {}

    public static Message[] getMessages() {
        return messages;
    }

    public static void setMessages(Message[] messages) {
        MessageStore.messages = messages;
    }

    public static int getLength() {
        return length;
    }

    public static void setLength(int length) {
        MessageStore.length = length;
    }

    static {

        messages = new Message[10];
    }

    public static void add(Message message) {
        messages[length++] = message;
    }
}