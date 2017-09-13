package Lesson5;

public class MessageStorage {

    private static Message[] messages;
    private static int length;

    private MessageStorage() {}

    static {
        messages = new Message[10];
    }

    public static void add(Message message) {
        messages[length++] = message;
    }

}
