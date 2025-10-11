import java.util.Scanner;
public class Taximeter {
    public static void main(String[] args) {
        double mesafe, tutar, perKm = 2.20;
        int minimumOdenecekTutar = 20;
        int taksimetreAcilisUcreti = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz : ");
        mesafe = input.nextDouble();

        tutar = mesafe * perKm + taksimetreAcilisUcreti;

        tutar = (tutar <  20) ? 20 : tutar; // 20 tl altindaki ucretlerde yine 20 tl alinmasi durumu olusur pic kazanc :d
        System.out.println("Ödenecek tutar : " + tutar);











    }
}
