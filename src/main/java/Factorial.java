//Java ile faktöriyel hesaplayan program yazıyoruz.

//import java.util.Scanner;
//
//public class Factorial {
//    public static void main(String[] args) {
//        // n! = 1 * 2 * 3 * 4 * .... * n
//        int n, sum = 1;
//        Scanner inp = new Scanner(System.in);
//
//        System.out.print("Sayi giriniz: ");
//        n = inp.nextInt();
//
//        for (int i = 1; i <= n; i++){
//            System.out.print(i + ",\n");
//            sum *= i;
//        }
//        System.out.println("toplam: " + sum);
//    }
//}


//Ödev :
//N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
//
//Java ile kombinasyon hesaplayan program yazınız.
//
//Kombinasyon formülü
//C(n,r) = n! / (r! * (n-r)!)
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // n! = 1 * 2 * 3 * 4 * .... * n
        int n, r;
        int sum_n = 1;
        int sum_r = 1;
        int sum_n_minus_r = 1; // (n-r)! sonucunu tutacak değişken
        int combination;
        Scanner inp = new Scanner(System.in);

        System.out.print("n sayisini giriniz: ");
        n = inp.nextInt();
        System.out.print("r sayisini giriniz: ");
        r = inp.nextInt();

        // r, n'den büyük olamaz. Bu durumu kontrol edelim.
        if (r > n) { // zittini verip if blogu baslatti bazen boylede yapmak gerekir.
            System.out.println("Hata: r değeri n değerinden büyük olamaz!");
        } else {
            // 1. n! (n faktöriyel) hesaplanır
            for (int i = 1; i <= n; i++) {
                sum_n *= i;
            }
            // 2. r! (r faktöriyel) hesaplanır
            for (int i = 1; i <= r; i++) {
                sum_r *= i;
            }
            // 3. (n-r)! hesaplanır. Bu kısım eksikti.
            for (int i = 1; i <= (n - r); i++) {
                sum_n_minus_r *= i;
            }

            // Kombinasyon formülü: C(n,r) = n! / (r! * (n-r)!)
            combination = sum_n / (sum_r * sum_n_minus_r);
            System.out.println("C(" + n + "," + r + ") kombinasyonu: " + combination);
        }
    }
}
