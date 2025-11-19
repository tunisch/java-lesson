import java.util.Scanner;
// 1 ve kendisinden baska boleni olmayan sayilara asal sayilar denir!
public class PrimeNumCalc {
    static int prime(int n, int i) {
        if (i == n) {
            return 1; // asal
        }

        if (n % i == 0) {
            return 0; // asal değil
        }

        return prime(n, i + 1);
    }
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Sayi giriniz: ");
        int n = inp.nextInt();

        int result = prime(n, 2);

        if (result == 1) {
            System.out.println(n + " sayısı ASALDIR !");
        } else {
            System.out.println(n + " sayısı ASAL değildir !");
        }
    }
}