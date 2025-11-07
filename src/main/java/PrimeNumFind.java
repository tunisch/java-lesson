/*  1 ve sadece kendisine tam bölünebilen sayılara asal sayı denir. */

/*
dış döngü → aday sayı (n)
iç döngü → bölen adayı (i)
if (n % i == 0) → “n, i’ye tam bölünüyorsa bu sayı asal değildir.”
*/

public class PrimeNumFind {
    public static void main(String[] args) {

        for (int n = 2; n <= 100; n++) {
            int count = 0; //  n sayısını bölenlerin sayısı

            for (int i = 1; i <= n; i++) { // n’in kendisine kadar gitmemelisin, çünkü her sayı zaten kendisine tam bölünür.
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) { // sadece 1 ve kendisine bolunuyorsa
                System.out.print(n + " ");
            }
        }
    }
}


