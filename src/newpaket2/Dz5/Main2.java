package newpaket2.Dz5;
import java.util.Scanner;

public class Main2 {

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
            System.out.println("Заново запустите программу");
            return;
        } else
            System.out.println("Добро пожаловать");
        System.out.println("1. Показать все мои посты\n" + "2. Написать сообщение пользователю\n" + "3. Оставить комментарий к посту\n" + "4. Выход\n");
        int m;
        Scanner tr = new Scanner(System.in);
        m = tr.nextInt();
        if(m != 1 & m != 2 & m != 3 & m != 4){
            System.out.println("Error Введите число от 1 до 4");
            tr.next();

        } else {
            String menu;
            switch (m) {
                case 1:
                    menu = "в разработке";
                    break;
                case 2:
                    menu = "в разработке";
                    break;
                case 3:
                    menu = "в разработке";
                    break;
                case 4:
                    menu = "Завершение программы";
                    break;
                default:
                    menu = "Error";
                    break;
            }
            System.out.println(menu);

        }
        System.out.println("Программа завершила работу");
    }
}


