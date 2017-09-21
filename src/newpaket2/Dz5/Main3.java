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
            System.out.println("Заново запустите программу");
            return;
        } else
            System.out.println("Добро пожаловать");
        System.out.println("1. Показать все мои посты\n" + "2. Написать сообщение пользователю\n" + "3. Оставить комментарий к посту\n" + "4. Выход\n");

       ////////////////////////////////////////////////

        for(;;){
            Scanner tr = new Scanner(System.in);
            while(!tr.hasNextInt()){
                tr.next();
            }
            int m = tr.nextInt();
            if((m == 1) || (m == 2) || (m == 3)){
                System.out.println("Razdel nahoditsya v razrabotke");
                continue;
            }
            if(m == 4){
                System.out.println("Vi vibrali zavershenie raboti programmi.");
                System.out.println("Programma okonchena. Spasibo za ispolzovanie etoi programmi");
                return;
            }

                tr.next();

        }



        /////////////////////////////////////////////////

       /*
        int m;
        Scanner tr = new Scanner(System.in);
        m = tr.nextInt();
        while (tr.hasNextInt()) {

            if ((m != 1) && (m != 2) && (m != 3) && (m != 4)) {
                System.out.println("Error Введите число от 1 до 4");
                tr.next();
            }
            else {
                break;
            }
        }

        if (m == 1) {
            System.out.println("Раздел в разработке");
        return;
        } else if (m == 2) {
            System.out.println("Раздел в разработке");
        return;
        } else if (m == 3) {
            System.out.println("Раздел в разработке");
        return;
        } else if (m == 4) {
            System.out.println("Завершение программы");
        return;
        }
        System.out.println("Программа завершила работу");
*/
    }

}
