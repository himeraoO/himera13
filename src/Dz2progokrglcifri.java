import java.math.BigDecimal;
import java.util.Scanner;

public class Dz2progokrglcifri {
    public static void main(String[] args) {

// Программа округления до целых чисел с использованием Math и Scanner

//        Math.ceil(n) — возвращает наименьшее целое число, которое больше или равно аргумента n.
//        Math.floor(n) — возвращает наибольшее целое число, которое меньше или равно аргументу n.
//        Math.round(n) — возвращает целое число, ближайшее к аргументу n (округляет n).
//
//        Пример с ceil:
//
//        int result = (int)Math.ceil(3.8);
//        System.out.println(result);            //4
//
//        int result = (int)Math.ceil(3.3);
//        System.out.println(result);            //4
//
//        Пример с floor:
//
//        int result = (int)Math.floor(3.8);
//        System.out.println(result);            //3
//
//        int result = (int)Math.floor(3.3);
//        System.out.println(result);            //3
//
//        Пример с round:
//
//        int result = (int)Math.round(3.8);
//        System.out.println(result);            //4
//
//        int result = (int)Math.round(3.3);
//        System.out.println(result);            //3

/*        System.out.println("Программа округления до целых чисел");
        double dr;

        Scanner in = new Scanner(System.in);
        System.out.println("Ведите любое дробное число формата x,xxxx");
        while (!in.hasNextDouble() || in.hasNextInt()) {
            System.out.println("Error Введите дробное число");
            in.next();
        }
        dr = in.nextDouble();

        int result = (int)Math.round(dr);
        System.out.println("Результат округления введеного числа " + dr + " = " + result);
*/
        System.out.println("Программа округления до целых чисел");
        double dr;
        int k;
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите любое дробное число формата x,xxxx");
        while (!in.hasNextDouble() || in.hasNextInt()) {
            System.out.println("Error Введите дробное число");
            in.next();
        }
        dr = in.nextDouble();
        System.out.println("Ведите целое число которое будет означать необходимое число знаков после запятой");
        while (!in.hasNextInt()) {
            System.out.println("Error Введите целое число");
            in.next();
        }
        k = in.nextInt();

//Чтобы задать количество цифр после запятой, используйте метод .setScale(scale).
// Тем не менее, хорошей практикой является одновременное указание вместе с масштабом режима округления с помощью .setScale(scale, roundingMode).
// Режим округления задаёт правило округления числа.

        BigDecimal x = new BigDecimal(dr);
        x = x.setScale(k, BigDecimal.ROUND_HALF_UP);
        System.out.println("Результат округления введеного числа " + dr + " = " + x.doubleValue());
    }
}