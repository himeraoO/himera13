import java.util.Scanner;

public class Puzirik {
//    public static void main(String[] args) {
//        int post[] = {25, 3, 17, 1, 5};
//
//        for(int i = 1; i < post.length; i++) {
//            for (int j = i; (j >= 1) && (post[j] < post[j - 1]); j--) {
//                int a = post[j];
//                post[j] = post[j - 1];
//                post[j - 1] = a;
//            }
//        }
//        for (int b: post)
//            System.out.println(b);
//
//    }
static int[] BubbleSort(int[] mas)
{
    int temp;
    for (int i = 0; i < mas.length; i++)
    {
        for (int j = i + 1; j < mas.length; j++)
        {
            if (mas[i] > mas[j]) // Можно менять “направление” сортировки, где меньший элемент будет в конце массива, а больший в начале.
            {                    // Для этого надо лишь поменять строку  if (mas[i] > mas[j]) на  if (mas[i] < mas[j]).
                temp = mas[i];
                mas[i] = mas[j];
                mas[j] = temp;
            }
        }
    }
    return mas;
}

    public static void main(String[] args) {
        System.out.println("Сколько чисел будем сортировать?");

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = in.nextInt();
        System.out.println("Введите числа для сортировки (каждое с новой строки):");
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++)
        {
            Scanner ing = new Scanner(System.in);
            mas[i] = ing.nextInt();
        }
        BubbleSort(mas);
        System.out.println("После сортировки:");
        for (int i = 0; i < mas.length; i++)
        {
            System.out.println(mas[i]);
        }
        System.out.println(" ");
    }
}

