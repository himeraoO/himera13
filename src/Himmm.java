import java.util.Scanner;

public class Himmm {
    public static void main(String[] args) {
        System.out.println("Сейчас будет произведено решение вадратного уравнения a * x * x + b * x + c = 0");
        System.out.println("Необходимо ввести значения a, b и c");
        double a , b , c , D , x , x1 , x2 ;
        Scanner in = new Scanner(System.in);
        System.out.println("ведите целое значение а");
        a = in.nextInt();
        System.out.println("ведите целое значение b");
        b = in.nextInt();
        System.out.println("ведите целое значение c");
        c = in.nextInt();
        D = b * b - 4 * a * c;
        if (D > 0) {
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Решение: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            x = -b / (2 * a);
            System.out.println("Решение: x = " + x);
        }
        else if (D < 0) {
            System.out.println("Уравнение не имеет решения!!!");
        }
    }
}
