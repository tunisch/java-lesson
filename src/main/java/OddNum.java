import java.util.Scanner;

public class OddNum {
    public static void main(String[] args) {

        int n;
        int sum = 0;
        Scanner inp = new Scanner(System.in);

//        do {
//            System.out.print("Sayi giriniz: ");
//            n = inp.nextInt();
//            if (n % 2 == 1) {
//                sum += n;
//            }
//        } while (n > 0); // while (n > 0); kısmı, do bloğunun tekrar edip etmeyeceğini belirleyen koşuldur.
//        // Eğer n > 0 false ise → döngü sona erer ve artık aşağıdaki satıra geçer:
//        System.out.println("Toplam: " + sum);
        do {
            System.out.print("Sayi giriniz: ");
            n = inp.nextInt();
            if (n % 2 == 0) {
                sum += n;
            }
        } while (n % 2 == 0); // Sayı çift olduğu sürece döngüye devam et
        System.out.println("Tek sayi girdiniz! "+ n); // donguden sonra yazilirsa bir kere ekrana basilir.
        System.out.println("Girilen cift sayilarin toplami: " + sum);
    }
}
