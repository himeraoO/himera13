import java.util.Scanner;

public class Dz2prchilsresheto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа поиска простых чисел");
        System.out.println("Используется решето Эратосфена");
        System.out.println("Ведите любое целое число, которое будет последним числом из диапазона, для поиска простых чисел");
        while (!in.hasNextInt()) {
            System.out.println("Error Введите целое число");
            in.next();
        }
        //Создаем массив
        int n = in.nextInt();
        int[]a = new int[n];
        //Заполним все ячейки числами по порядку: 0,1,2,3...
        for(int i = 0; i < n; i++){
            a[i] = i;
        }
        //Поскольку 1 не простое число, обнулим ячейку с этим числом
        a[1] = 0;
        for(int s = 2; s < n; s++){
            if(a[s]!= 0){
                for(int j = s * 2; j < n; j += s){ //Начиная с числа s*2 и шагом s обнуляем все ячейки массива
                    a[j] = 0; //Так обнулятся все числа, которые делятся на a[s]
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(a[i] != 0){
                System.out.print(a[i] + " "); //Выводим все числа из массива a[i] исключая все что являются нулями
            }
        }
    }
}
