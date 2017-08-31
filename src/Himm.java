import java.util.Scanner;

public class Himm {
    public static void main(String[] args) {
        System.out.println("Сейчас будет произведено решение линейного уравнения a * x + b = 0");
        System.out.println("Необходимо ввести значения a и b");
        double a , b , x ;
        Scanner in = new Scanner(System.in);
        System.out.println("ведите целое значение а");
        a = in.nextInt();
        System.out.println("ведите целое значение b");
        b = in.nextInt();
        x = -b / a;
        System.out.println("x =" + x);
}
}
