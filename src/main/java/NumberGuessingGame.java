import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu"
    - kullanicinin 5 hakki olacak
    - girilen sayi sayimiza uzakligi (yani yakin ise buyuk mu kucuk mi ipucu verilecek)
*/
public class NumberGuessingGame {
    public static void main(String[] args) {

        // TYPE CASTING double -> int cevirme isine yarar
        /* double number = Math.random() * 100; */ //her zaman doubledir basina (int) getirirsek int olarak tam sayi uretir  * 100 0-100 arasinda olmasini saglar!!
        /* int number_1 = (int) (Math.random() * 100); */ // type casting sayesinde basina (int) getirerek cevirmis olduk double -> integer a
        // System.out.println("The number is : " + number_1);

        // Random sinifi vardir java da bu sinif ilede rastgele num uretebiliriz!
        Random rand = new Random();
        int number_2 = rand.nextInt(100); // Scanner da da nextInt vardi, int deger araligi girmemize saglar. 100 girdik 0-100 arasi rastgele num verecek!!

        Scanner inp = new Scanner(System.in);
        int hak = 5;
        int[] wrong = new int[hak]; // yanlislarin girildigi bir dizi olusturduk!
        boolean isWrongSit = true;

        for (int i = 0; i < hak; i++) {
            System.out.print("Bir tahmin sayisi giriniz : ");
            int tahmin = inp.nextInt();
            // once aralik da mi kontrolu yapalim
            if (0 > tahmin || tahmin > 99) {
                System.out.println("Lutfen 0-100 arasinda bir deger giriniz ! ");
                continue; // dongunun basina doner i artmamis olur boylelikle hak kaybi yasanmaz!
            }
            // eger araliktaysa tahmin istenilen sayiya esitse bitsin degilse devamke
            if (tahmin == number_2) {
                System.out.println("Tebrikler! Doğru tahmin 🎉");
                break;
            }
            System.out.println("Hatalı bir sayı girdiniz !"); // yanlis girince bu mesaj gelsin
            if (tahmin > number_2) {
                System.out.println("Daha küçük bir sayı giriniz.");
            } else {
                System.out.println("Daha buyuk bir sayi giriniz.");
            }
            // ayni sayiyi 2 kere yazdirmama durumu icin kontrol yapalim
            for (int k = 0; k < i; k++) { // wrong array icinde gezeriz degereleri okuruz , for ile.
                if (wrong[k] == tahmin) { // eger tahmin edilen sayi yanlislar dizisinde var ise
                    isWrongSit = false; // ayni sayiyi 2 kere yazdirmama durumu icin kontrol yapalim
                    break; // bu break en yakin donguyu kirar yani for k yi kirar sadece
                }
            }
            if (!isWrongSit) {
                System.out.println("Ayni sayiyi 2 kere yazdiniz !!");
                isWrongSit = true; // tekrar kontrol icin true yapariz
                continue; // dongunun basina doner i artmamis olur boylelikle hak kaybi yasanmaz!
            }
            wrong[i] = tahmin; // yanlis tahminleri diziye atiyoruz

            System.out.println("Kalan Hakkiniz : " + (hak - 1 - i));
            if (i == hak - 1) {
                System.out.println("Hakkiniz bitmistir !");
                break;
            }
        }
        System.out.println("Tahmin edilen Sayimiz : " + number_2 + "'di!");
        System.out.println("Tahminleriniz :" + Arrays.toString(wrong));
        inp.close();
    }
}


