/* Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir. */

import java.util.Scanner;

public class FibonacciNum {
    public static void main(String[] args) {
        int i = 0, k = 1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Eleman Sayisini giriniz: ");
        int n = inp.nextInt();
        int sum;

        for (int y = 1; y < n; y++) {
            sum = i + k;
            System.out.println(i + "+" + k + " = " + sum);

            i = k;
            k = sum;
        }
    }
}



