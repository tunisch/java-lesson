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
        boolean isWrongSit = false;

        for (int i = 0; i < hak; i++) {
            System.out.print("Bir tahmin sayisi giriniz : ");
            int tahmin = inp.nextInt();
            System.out.println("Kalan Hakkiniz : " + (hak - 1 - i));
            if (i == 4){
                System.out.println("Hakkiniz bitmistir !");
                break;
            }
            System.out.println("Hatalı bir sayı girdiniz !");
            if (tahmin > number_2) {
                System.out.println("Daha küçük bir sayı giriniz.");

            } else {
                System.out.println("Daha buyuk bir sayi giriniz.");
            }
            if (!isWrongSit) {
                if (0 > tahmin || tahmin > 99) {
                    System.out.println("Lutfen 0-100 arasinda bir deger giriniz ! ");
                    System.out.println("Kalan Hakkiniz : " + (hak + 1 - i));
                }
                for (int k = 0; k < hak; k++) {
                    if (wrong[k] == tahmin) {
                        System.out.println("Ayni sayiyi 2 kere yazdiniz !!");
                        System.out.println("Kalan Hakkiniz : " + (hak + 1 - i));
                    }
                }
                if (tahmin == number_2) {
                    System.out.println("Tebrikler! Doğru tahmin 🎉");
                    break;
                }
            }
            wrong[i] = tahmin;
        }
        System.out.println("Tahmin edilen Sayimiz : " + number_2 + "'di!");
        System.out.println("Tahminleriniz :" + Arrays.toString(wrong));
        inp.close();
    }
}


