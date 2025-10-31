//public class For {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
//    }
//}
//public class For {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i += 2) { // 2 ser arttirir. basta i =1 calisir sonra 10 dan kucukse for a girer sonra ekrana basilir sonra i +2 arttirli sonra 10 dan kucuk mu bakilir ekrana yazdirilir boyle devam eder 10 olana kadar.
//            System.out.println(i);
//        }
//        // Ayni islemi yapar ama while sonunu bilmedigimiz durumlarda kullanilir.
//        System.out.println("-------------");
//        int k = 1;
//        while(k <= 10){
//            System.out.println(k);
//            k += 2;
//        }
//    }
//}

/* other examples with Logic operators */
//public class For {
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 0, j = 0; i < 5 || j < 5; ++i, j = i + 1) { // ya da sembolu ortada dikkat edelim!! i ya da j den biri saglansa yeter program bitmesi icin !!
//            sum += i; // i degerlerini topla demektir her birini bastan alarak toplar!!
//        }
//        System.out.println(sum);
//    }
//}

import java.util.Scanner;

/* For - while || do-while farki */
public class For {
    public static void main(String[] args) {

        int sayi;
        Scanner inp = new Scanner(System.in);

        /* for ile sonunu bilmedigimiz orneklerde de kullanilabiliriz */
//        for (boolean run = true; run; ) { // for un ici true olmali ki program dongusu calissinn
//            System.out.print("Bir sayi giriniz: ");
//            sayi = inp.nextInt();
//            if (sayi < 0){
//                run = false;
//            }
//        }
        /* ayni durumu do while ile yaparsak daha avantajli olur.*/
//        do {
//            System.out.print("Bir sayi giriniz: ");
//            sayi = inp.nextInt();
//        } while (sayi > 0); // sayi 0 dan buyuk oldugu surece sonsuz dongu olcak kucuk olunca while girilmeyecek.
//
        /* for un avantajli oldugu durum icin ornek */
        // 1 den  10 a kadar olan sayilari ekrana bastirma (sonunu biliyoruz ) for kullancaz daha performansli !!
        // Bir işi kaç kere yapacağını biliyorsan, yani başlangıç, bitiş ve artış miktarı belliyse → for döngüsü kullanılır.
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("-----------------");
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
        inp.close();
    }
}
