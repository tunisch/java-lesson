import java.util.Scanner; // kullanicidan veri almaya yarayan kutuphanedir.
public class GradeCalculator {
    public static void main(String[] args) {
        // Degiskenleri olustur
        int mat,fiz,kim,turk,tarih,muzik;

        // Scanner sinifini tanimladik
        Scanner input = new Scanner(System.in); // Scanner sinifindan input adinda bir nesne olusturduk.

        // Kullanicidan deger al
        System.out.println("Matematik notunuzu giriniz : ");
        mat = input.nextInt();

        System.out.println("Fizik notunuzu giriniz : ");
        fiz = input.nextInt();

        System.out.println("Kimya notunuzu giriniz : ");
        kim = input.nextInt();

        System.out.println("Turkce notunuzu giriniz : ");
        turk = input.nextInt();

        System.out.println("Tarih notunuzu giriniz : ");
        tarih = input.nextInt();

        System.out.println("Muzik notunuzu giriniz : ");
        muzik = input.nextInt();

        // Ortalama hesapla
        double ortalama = (mat + fiz + kim + turk + tarih + muzik) / 6.0;

        System.out.println("Ortalamaniz : " + ortalama);
        String result = (ortalama > 60) ? "Sinifi gecti" : "sinifta kaldi";
        System.out.println(result);
    }
}
