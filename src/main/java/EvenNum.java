import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
        int sayi;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sayi giriniz: ");
        sayi = inp.nextInt();

//        System.out.println("Cift sayilar: ");
        // // 1'den kullanıcının girdiği sayıya kadar döngü kur
//        for (int i = 1; i <= sayi; i++) {
//         // // Döngü içindeki sayının 2'ye bölümünden kalan 0 mı diye kontrol et
//            if (i % 2 == 0) {
//             // // Eğer koşul sağlanıyorsa (yani sayı çiftse) ekrana yazdır
//                System.out.println(i);
//            }
//        }
        /* ya da boylede yazilir */
//        int i = 1;
//        while (i <= sayi){
//            if (i % 2 == 0){
//                System.out.println(i);
//            }
//            i++;
//        }
        int sum = 0 , count = 0;
        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                sum += i;
                count++;
            }
        }
        System.out.println("Toplam: " + sum);
        int average = sum / count;
        System.out.println("Ortalama: " + average);
    }
}
