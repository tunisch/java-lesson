import java.util.Scanner;
/*
Şimdi akışı izleyelim:

1️⃣İlk tur:
i = 1
İçteki m döngüsü başlatılıyor: int m = 1
Şart: m <= (2*1) - 1 → 1 <= 1 ✅ evet
* basılır
m++ → m = 2
Şart tekrar kontrol edilir: 2 <= 1 ❌ hayır
Döngü biter.

Ve burada önemli nokta: Döngü bittiği an, m değişkeni yok olur.
Yani “m artık yok.” Hafızadan silinir.

2️⃣Yeni turda:

i = 2
Yeni m başlar: m = 1

Her i turunda m baştan tanımlanır ve sıfırdan başlar.
Bir önceki değeri tutmaz çünkü m o döngünün yerel değişkenidir.
 */

/* For ile yildizlar ile ucgen yapimi */
//public class StarsTriangle {
//    public static void main(String[] args) {
//        int n;
//        Scanner inp = new Scanner(System.in);
//
//        System.out.print("Yildiz assagi basamak sayisini giriniz: ");
//        n = inp.nextInt();
//
//        // basamak sayisini bulur assagiya kadar
//        for (int i = 1; i <= n; i++) {
//            //bosluklari tanimliyoruz yildizdan once en basta kac bosluk olmali n = 6 aldik
//            for (int k = 1; k <= (n - i); k++) { // yanyan 5 bosluk basim fordan cikacak assagi incek
//                System.out.print(" "); //yanyana bosluk basiypr cunku print "ln" degil!!
//            }
//            for (int m = 1; m <= (2 * i) - 1; m++) { // i = 1 di m =1 oldu bir yildiz basti bosluktan sonra
//                System.out.print("*"); // yanyana yildiz basiyor
//            } // i = 1 diye basta m +1 arttiirlnca 2 oldu fordan cikti
//            System.out.println(); // burada bosluk birak ve bir alt satira in dedik "ln" den dolayi alt satira iniyor. geri en bastaki for a cikip i yi +1 arttiriyoruz
//        }
//    }
//}

/* while ile yildizlar ile ucgen yapimi */

//public class StarsTriangle {
//    public static void main(String[] args) {
//
//        int n;
//
//        Scanner inp = new Scanner(System.in);
//        System.out.print("Yildis basamak sayisi giriniz: ");
//        n = inp.nextInt();
//        int i = 1;
//        while (i <= n) {
//            int k = 1;
//            while (k <= n - i) {
//                System.out.print(" ");
//                k++;
//            }
//            int m = 1;
//            while (m <= (2 * i) - 1) {
//                System.out.print("*");
//                m++;
//            }
//            i++;
//            System.out.println();
//        }
//    }
//}

public class StarsTriangle {
    public static void main(String[] args) {

        int n;

        Scanner inp = new Scanner(System.in);
        System.out.print("Yildiz basamak sayisi giriniz: ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= (2 * i) - 1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int t = n - 1; t >= 1; t--) {
            // once bosluklar
            for (int p = 1; p <= n - t; p++) {
                System.out.print(" ");
            } // sonra yildiz bascaz
            for (int y = 1; y <= (2 * t) - 1; y++) {
                System.out.print("*");
            }
            System.out.println(); // bir alt satira gececegiz sonra yukari cikip satir azalttcaz en alt ucgene kadar
        }
    }
}




