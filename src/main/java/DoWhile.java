/* do-while examp */

//public class DoWhile {
//    public static void main(String[] args) {
//        int year = 2021;
//
//        do {
//            System.out.println(year); // ilk ekrana 2021 basar
//            year++; // sonra 2021 +1 arttirilir 2022 olur while degeri kontrol edilir.
//        } while (year < 2021); // while kontrol edildiginde year basta 2021 tanimlandi ve 1 arttirldi 2022 oldu ve esit degil while calismaz !!
//            System.out.println(year); // ekrana 2022 basilir son deger 2022 yapildi diye.!!
//    }
//} // OUTPUT : 2021 yani dongu yanlis olsa bile do icindeki print calisir year = 2021 !!

/* Ayni ornek ama while ile . */

//public class DoWhile {
//    public static void main(String[] args) {
//        int year = 2021;
//
//        while (year < 2021) {
//            System.out.println(year);
//            year++;
//        }
//    }
//} // OUTPUT :  bos gozukur while dan dolayi !!

/* do-while password example */

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        int password;
        boolean isPasswordSuccess = true;

        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Sifrenizi giriniz: "); // ekranda yazmasi gereken text inp den once yazilir.!
            password = inp.nextInt(); // ekrana yazdirmayi yarar !!
            if (password == 123) {
                System.out.println("Dogru");
                isPasswordSuccess= false; // bu if statement dogru olursa askPassword false degeri atanir sonra code blogu direkt while gecer
                // while ici false olacagi icin while calismaz program sonlanir!! while i calistirmamak icin yaptik!!
                System.out.println("Program bitti");
            } else {
                System.out.println("Yanlis");
            }
        } while (isPasswordSuccess);
    }
}
/* DoWhile - While Farki ?
* while döngüsü: koşul doğruysa çalışır
* do-while döngüsü: koşul yanlış olsa bile en az 1 kez çalışır
 */