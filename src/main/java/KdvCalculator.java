import java.util.Scanner;

public class KdvCalculator {
    public static void main(String[] args) {
        double tutar, kdvTutar, kdvlitutar, kdvOrani = 0.18; //once kullanilacak olan butun seyleri tanimlayalim.

        Scanner input = new Scanner(System.in); //scanner icin yazilmasi gerekiyor.
        System.out.print("Tutari giriniz : ");// scanner icin girdi yazisi
        tutar = input.nextDouble(); //hesaplamaya basladik bir tutar alcaz girdi double deger olcak diyoruz.

        kdvTutar = tutar * kdvOrani;
        kdvlitutar = tutar + kdvTutar;

        System.out.println("KDV'siz fiyat : " + tutar);
        System.out.println("KDV'li fiyat : " + kdvlitutar);
        System.out.println("KDV tutari : " + kdvTutar);
        System.out.println("KDV oranı : " + kdvOrani);
    }
}