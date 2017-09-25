package lesson8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Application {
    public static void main(String[] args) {
        Stack<String> stack = new ListStack<>();
        stack.push("s1");
        stack.push("s2");
        stack.push("s3");
        stack.push("s4");
        stack.push("s5");
        stack.push("s6");
        stack.push("s7");
        stack.push("s8");
        stack.push("s9");

        for (String s : stack) {
            System.out.println(s);
        }

        Collection<Integer> list = new ArrayList<>();
        int count = 0;
        list.add(count++);
        list.add(count++);
        list.add(count++);
        list.add(count++);
        list.add(count++);
        list.add(count++);
        list.add(count); //???????
        list.forEach(System.out::println);

        //посмотреть по видео...

        list.stream()
                .filter(integer -> integer > 3)
                .forEach(System.out::println);


        User user = User.createBuilder().setName("j").setLastName("h").setAge(84).setLogin("g").build();
        System.out.println(user.toString());

    }
}

