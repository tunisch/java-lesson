import java.util.Scanner;

public class MaxMinNumFind {
    public static void main(String[] args) {
        int n, max = 0, min = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kac tane Sayi gireceksiniz? : ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayiyi giriniz: ");
            int numbers = inp.nextInt(); // Kullanıcının girdiği sayıyı bir değişkende sakla, yoksa o sayı sadece anlık olarak okunur, hafızada tutulmaz.

            if (i == 1) {
                max = numbers;
                min = numbers;
            } else {
                if (numbers > max) max = numbers;
                if (numbers < min) min = numbers;
            }

        }
        //max ve min dışarıda tanımlandığı için for’un içinden erişilip değiştirilebilir,
        //ama içeride tanımlanan numbers sadece geçicidir, o tur bitince yok olur.

        // döngü bittikten sonra sonucu yazdır
        System.out.println("En buyuk sayi: " + max);
        System.out.println("En kucuk sayi: " + min);

        inp.close();
    }
}
