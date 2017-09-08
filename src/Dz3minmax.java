import java.util.Scanner;

public class Dz3minmax {
    public static void main(String[] args) {
        int n, array[];
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        n = in.nextInt();
        System.out.println(" ");
        System.out.println("Случайный массив с размером " + n);
        array = new int[n];
        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * n);
        for (int i : array)
            System.out.print(i + " ");
        System.out.println(" ");
        System.out.println(" ");
        Dz3ArrayUtils a = new Dz3ArrayUtils(array);
        System.out.println("Минимальное значение в массиве = " + a.Min());
        System.out.println("Максимальное значение в массиве = " + a.Max());
        System.out.println("Среднее арифметическое значение всех элементов массива = " + a.Average());
    }
}