import java.util.Scanner;
import java.util.Random;

public class Dz2massiveminimax {
    public static void main(String[] args) {
        System.out.println("Программа для создания случайного массива и поиска в нем максимального и минимального значений");
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите любое целое число для задания длинны случайного массива");
        while (!in.hasNextInt()) {
            System.out.println("Error Введите целое число");
            in.next();
        }
        int n = in.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            Random s = new Random();
            int h = s.nextInt(n) + 1;
            mas[i] = h;
            System.out.print(mas[i] + " ");
        }
        int maxIndex = mas[0];
        int minIndex = mas[0];
        for (int x = 0; x < mas.length; x++) {
            if(mas[x] < minIndex) {
                minIndex = mas[x];
            }
        }
        for (int y = 0; y < mas.length; y++) {
            if(mas[y] > maxIndex) {
                maxIndex = mas[y];
            }
        }
        System.out.println(" ");
        System.out.println("Максимальное значение массива " + maxIndex);
        System.out.println("Минимальное значение массива " + minIndex);
    }
}
//
//import java.util.Scanner;
//
//public class Dz2massiveminimax {
//    public static void main(String[] args) {
//        System.out.println("Программа для создания случайного массива и поиска в нем максимального и минимального значений");
//        Scanner in = new Scanner(System.in);
//        System.out.println("Ведите любое целое число для задания длинны случайного массива");
//        while (!in.hasNextInt()) {
//            System.out.println("Error Введите целое число");
//            in.next();
//        }
//        int n = in.nextInt();
//        int[] mas = new int[n];
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = (int) Math.round((Math.random() * n) );
//            System.out.print(mas[i] + " ");
//        }
//        int maxIndex = mas[0];
//        int minIndex = mas[0];
//        for(int x = 0; x < mas.length; x++) {
//            if(mas[x] < minIndex)
//                minIndex = mas[x];
//        }
//        for(int y = 0; y < mas.length; y++) {
//            if(mas[y] > maxIndex)
//                maxIndex = mas[y];
//        }
//        System.out.println(" ");
//        System.out.println("Максимальное значение массива " + maxIndex);
//        System.out.println("Минимальное значение массива " + minIndex);
//    }
//}
//
//
//
//
//import java.util.Scanner;
//
//public class Dz2massiveminimax {
//    public static void main(String[] args) {
//        System.out.println("Программа для создания случайного массива и поиска в нем максимального и минимального значений");
//        Scanner in = new Scanner(System.in);
//        System.out.println("Ведите любое целое число для задания длинны случайного массива");
//        while (!in.hasNextInt()) {
//            System.out.println("Error Введите целое число");
//            in.next();
//        }
//        int n = in.nextInt();
//        int[] mas = new int[n];
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = (int) Math.round((Math.random() * n) );
//            System.out.print(mas[i] + " ");
//        }
//        int maxIndex = mas[0];
//        int minIndex = mas[0];
//        for(int x: mas) {
//            if(x < minIndex)
//                minIndex = x;
//        }
//        for(int y: mas) {
//            if(y > maxIndex)
//                maxIndex = y;
//        }
//        System.out.println(" ");
//        System.out.println("Максимальное значение массива " + maxIndex);
//        System.out.println("Минимальное значение массива " + minIndex);
//    }
//}
//