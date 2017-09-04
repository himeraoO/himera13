import java.util.Scanner;

public class Dz2loops {
    public static void main(String[] args) {
        System.out.println("Программа вывода сообщения \"Hello world\" циклами for, while и do...while");
        System.out.println("Количество вывода сообщений необходимо задать с клавиатуры");
        System.out.println(" ");
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите любое целое число, которое будет определять сколько раз необходимо вывести заданное сообщение");
        while (!in.hasNextInt()) {
            System.out.println("Error Введите целое число");
            in.next();
        }
        int n = in.nextInt();
        System.out.println(" ");
        //цикл for
        System.out.println("Результат выполнения цикла for");
        for(int x = 1; x <= n; x++) {
            System.out.println(x + " Hello world");
        }
        System.out.println(" ");
        //цикл while
        System.out.println("Результат выполнения цикла while");
        int z = 1;
        while(z < (n + 1)) {
            System.out.println(z + " Hello world");
            z++;
        }
        System.out.println(" ");
        //цикл do...while
        System.out.println("Результат выполнения цикла do...while");
        int y = 1;
        do{
            System.out.println(y + " Hello world");
            y++;
        } while(y < (n + 1));



    }
}
