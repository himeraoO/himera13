package newpaket2.Dz5;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String login;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите логин: ");
        login = in.nextLine();


        String password;
        Scanner inn = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        password = inn.nextLine();

        User user = new User(login,password);
        UserStorage el = new UserStorage();
        if (el.authenticate(user)) {
            System.out.println("Добро пожаловать");
            int m;
            Scanner tr = new Scanner(System.in);
            System.out.println("1. Показать все мои посты\n" +
                    "2. Написать сообщение пользователю\n" +
                    "3. Оставить комментарий к посту\n" +
                    "4. Выход\n");

            while (!tr.hasNextInt()) {
                System.out.println("Error Введите число от 1 до 4");
                tr.next();
            }

            m = tr.nextInt();

            String menu;
            switch (m) {
                case 1:  menu = "в разработке";
                    break;
                case 2:  menu = "в разработке";
                    break;
                case 3:  menu = "в разработке";
                    break;
                case 4:  menu = "Заверншение программы";
                    break;

                default: menu = "Такого раздела меню нет";
                    break;
            }
            System.out.println(menu);
        }
        else
        System.out.println("Заново запустите программу");

//        System.out.println("Введеный логин " + login);
//        System.out.println("Введеный пароль " + password);



    }
}



