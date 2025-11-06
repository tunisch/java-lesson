import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        int n1, n2;
        Scanner inp = new Scanner(System.in);
        int ebob = 1;

        boolean deger = true;
        /* ebob */
        while (deger) {
            System.out.print("1. sayiyi giriniz: ");
            n1 = inp.nextInt();

            System.out.print("2. sayiyi giriniz: ");
            n2 = inp.nextInt();

            if (n1 < n2) {
                // çünkü ortak bölen en fazla küçük sayıya (n1)  eşit olabilir
                for (int i = n1; i >= 1; i--) {
                    if (n1 % i == 0 && n2 % i == 0) { // en buyuk ortak bolen (yani her iki sayiya da i tam bolunmelidir)
                        System.out.println("EBOB: " + i);
//                        ebob = i;
                        break; //en büyük ortak bölen bulundu olmasi icin daha dusuk degerleri almasin diye bulundugunda donguyu bitircez!
                    }
                }
                /* ekok */
                // çünkü en küçük ortak kat en fazla bu çarpıma kadar olabilir n1 * n2

                for (int k = 1; k <= n1 * n2; k++) { // ekokta (en kucuk ortak katlari) arttirmak gerekir islem daha hizli
                    if (k % n1 == 0 && k % n2 == 0) { // k hem n1’e hem n2’ye tam bölünüyorsa ortak kattır

                        System.out.println("EKOK: " + k);
                        break; // ilkini bulunca çıkıyoruz, çünkü biz sadece en küçüğünü istiyoruz
                    }
                } // işlem dogru tamamlanırsa while i bitirmek icin deger false yapilir, döngü biter
                /* Matematiksel olarak kisa yol boylede olur */
//                System.out.println("EKOK: "+ (n1 * n2) / ebob);
                deger = false;
            } else {
                System.out.println("Lütfen küçük sayıyı önce giriniz!");
            }
        }
        inp.close();
    }
}
