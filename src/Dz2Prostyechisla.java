import java.util.Scanner;

public class Dz2Prostyechisla {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите любое целое число, которое будет последним числом из диапазона, для поиска простых чисел");
        while (!in.hasNextInt()) {
            System.out.println("Error Введите целое число");
            in.next();
        }
        int n = in.nextInt();
        int a, b;
        for (a = 0; a <= n; a++) {
            b = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0)
                    b++;
            }
            if (b <= 2){
                if(a != 0) {
                    if (a != 1) {

                        System.out.print(a + " ");
                    }
                }
            }
        }
 }
}