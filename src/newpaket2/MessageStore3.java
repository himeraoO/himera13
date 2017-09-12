package newpaket2;

public class MessageStore3 {
        private Message[] messages= new Message[10];
        private int top;

    public Message[] getMessages() {
        return messages;
    }

    public void setMessages(Message[] messages) {
        this.messages = messages;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    MessageStore3() {
            top = -1;
        }
    public void add(Message mes) {
                if(top == 9) {
                    System.out.println("Message Store заполнен.");
                }
                else
                    messages[++top] = mes;
                }
}