package Lesson5;

import java.util.Date;

public class App {

    public static void main(String[] args) {
        new InitializationBlock();
        User user = new User(1, "Dmitry", "Protsko","dmitr.prot@gmail.com",
                new Date());
        User user1 = new User(1, "Dmitry", "Protsko","dmitr.prot@gmail.com",
                new Date());

        System.out.println(user);
        //
        //  Object obj = user;
        //  String s = obj == null ? "null" : obj.toString();
        System.out.println(user1.toString());

        Message message1 = new Message(1, "Text", "Author");
        Message message2 = new Message(1, "Text", "Author");
        Message message3 = new Message(2, "Text", "Author");

        System.out.println(message1.equals(message2));
        System.out.println(message1.equals(message3));
        System.out.println(message1.equals(null));



    }
}
