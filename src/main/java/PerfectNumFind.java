import java.util.Scanner;

public class PerfectNumFind {
    public static void main(String[] args) {
        int n;
        boolean durum = true;
        Scanner inp = new Scanner(System.in);


        while (durum) {

            System.out.print("Bir sayi giriniz: ");
            n = inp.nextInt();
            int sum = 0;
            for (int i = n - 1; i >= 1; i--) {
                if (n % i == 0) {
//                System.out.println(i); // ekrana tam bolunen degerleri basar!
                    sum += i;
                }
            }
//        System.out.println("toplam: " + sum); // bolunen degerleri yukarda toplayip ekrana basmayi burada yapariz!
            if (sum == n) {
                System.out.println(n + " mukkemmel sayidir. ");
                durum = false;
            } else {
                System.out.println(n + " mukemmel sayi degildir!");
            }
        }
        inp.close();
    }
}
/* Program şu şekilde davranır:

Kullanıcıdan sayı ister.
Eğer sayı mükemmel değilse, else kısmına girer, mesajı gösterir ve döngü devam eder.
Eğer sayı mükemmelse, if kısmına girer ve durum = false; diyerek döngüyü bitirir.*/

/* Bir düşün: programın “başı” dediğimiz yer neresi? Kullanıcıdan sayıyı aldığın satır.
Yani o satıra yeniden dönebilmek için, o kısmı bir döngünün içine koyman gerekiyor.
Ama dikkat et, her dönüşte önce sum sıfırlanmalı, yoksa eski değerler kalır. */