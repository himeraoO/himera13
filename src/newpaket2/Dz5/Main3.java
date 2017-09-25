package newpaket2.Dz5;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        String login;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите логин: ");
        login = in.nextLine();

        String password;

        Scanner inn = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        password = inn.nextLine();

        User user = new User(login, password);
        UserStorage el = new UserStorage();

        if (!el.authenticate(user)) {
            System.out.println("Такого пользователя нет.\n" + "Доступ запрещен!\n");
            System.out.println("Если Вы уверены что введеные данные верны, обратитесь в поддержку или попробуйте авторизироваться позже.");
            return;
        } else
            System.out.println("Добро пожаловать пользователь: " + login + "!");
        System.out.println("1. Показать все мои посты\n" + "2. Написать сообщение пользователю\n" + "3. Оставить комментарий к посту\n" + "4. Выход\n");
        System.out.println("Выберите раздел меню введя соответствующую цифру.");
        Scanner tr = new Scanner(System.in);

        for (; ; ) {
            if (tr.hasNextInt()) {
                int m = tr.nextInt();
                if (m == 1) {
                    System.out.println("Показать все мои посты.\n" + "Раздел находится в разработке.");
                    continue;
                }
                if (m == 2) {
                    System.out.println("Написать сообщение пользователю.\n" + "Раздел находится в разработке.");
                    continue;
                }
                if (m == 3) {
                    System.out.println("Оставить комментарий к посту.\n" + "Раздел находится в разработке.");
                    continue;
                }
                if (m == 4) {
                    System.out.println("Вы выбрали завершение работы программы.");
                    System.out.println("Программа окончена. Спасибо за использование.");
                    return;
                }
                if (m <= 0) {
                    System.out.println("Ошибка ввода.");
                    System.out.println("Выберите раздел меню введя соответствующую цифру.");
                    System.out.println("1. Показать все мои посты\n" + "2. Написать сообщение пользователю\n" + "3. Оставить комментарий к посту\n" + "4. Выход\n");
                    continue;
                } else {
                    System.out.println("Ошибка ввода.");
                    System.out.println("Выберите раздел меню введя соответствующую цифру.");
                    System.out.println("1. Показать все мои посты\n" + "2. Написать сообщение пользователю\n" + "3. Оставить комментарий к посту\n" + "4. Выход\n");
                    continue;
                }
            }
            if (!tr.hasNextInt()) {
                System.out.println("Ошибка ввода.");
                System.out.println("Выберите раздел меню введя соответствующую цифру.");
                System.out.println("1. Показать все мои посты\n" + "2. Написать сообщение пользователю\n" + "3. Оставить комментарий к посту\n" + "4. Выход\n");
            }
            tr.next();
        }
    }
}