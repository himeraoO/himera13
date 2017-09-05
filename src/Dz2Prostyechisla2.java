 import java.util.Scanner;

public class Dz2Prostyechisla2 {
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        System.out.println("Ведите любое целое число, которое будет последним числом из диапазона, для поиска простых чисел");
//        while (!in.hasNextInt()) {
//            System.out.println("Error Введите целое число");
//            in.next();
//        }
//        int n = in.nextInt();

/*
        int n = 100;
        int i;
        int p;
        int[] pr = new int[0];
        int[] lp = new int[n+1];
        for (i = 0; i < lp.length; i++) {
            lp[i] = i ;
            System.out.print(lp[i] + " ");
        }
        if(lp[i] == 0){
            lp[i] := i;
            pr[p] += i;
        }
        lp[p*i] := p;
*/
//
//        Пусть pr - целочисленный массив, поначалу пустой;
//        lp - целочисленный массив, индексируемый от 2 до n, заполненный нулями
//
//        для i := 2, 3, 4, ..., до n:
//        если lp[i] = 0:
//        lp[i] := i
//        pr[] += {i}
//        для p из pr пока p ≤ lp[i] и p*i ≤ n:
//        lp[p*i] := p
//
//        Выход: все числа в массиве pr.



        int n = 100;
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







  /*      int n=20000,i,num;
        int mas[] = new int [n+1];
        for (i=1;i<=mas.length-1;i++)
            mas[i]=i;
        for (num=1;num<=mas.length-1;num++){
            for(i=2;i<=n-1;i++){
                if ((mas[num]!=i) & (mas[num]%i==0))
                    mas[num]=0;
            }
        }
        for (num=1;num<=mas.length-1;num++)
            if (mas[num]!=0)
                System.out.println("№i= "+num+" i= "+mas[num]);
*/

 }
}