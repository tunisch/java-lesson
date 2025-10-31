import java.util.Scanner;

// Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program.
public class PowersOf2 {
    public static void main(String[] args) {
        int sayi;
        Scanner inp = new Scanner(System.in);
        System.out.print("Siniri belirlemek istediginiz sayiyi giriniz: ");
        sayi = inp.nextInt();

        // Hatalı Kullanım: for döngüsünün artırma bölümünde '&&' operatörü kullanılamaz.
        // İki farklı kuvvet serisini bulmak için iki ayrı döngü kurmak gerekir.

        System.out.println("-----------");
        System.out.println(sayi + " sayisina kadar olan 4'un kuvvetleri:");
        for (int i = 1; i <= sayi; i *= 4) { // 4 un kuvvetleri  i = i * 4 demektir.
            System.out.println(i);
        }

        System.out.println("-----------");
        System.out.println(sayi + " sayisina kadar olan 5'in kuvvetleri:");
        for (int i = 1; i <= sayi; i *= 5) {
            System.out.println(i);
        }

    }
}
