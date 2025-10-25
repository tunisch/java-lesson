import java.util.Scanner;

public class FlightPrice {
    public static void main(String[] args) {
        double distance, constantPrice = 0.10, totalPrice, flightDiscount = 0;
        int age, flightType;

        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        distance = inp.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        age = inp.nextInt();

        System.out.print("Yolculuk Tipini giriniz: (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        flightType = inp.nextInt();

        totalPrice = distance * constantPrice;
        if (age >= 1 && distance > 0 && (flightType == 1 || flightType == 2)) {
            if (flightType == 1) {
                if (age < 12) {
                    totalPrice -= totalPrice * 0.50;
                }
                if (age <= 24) {
                    totalPrice -= totalPrice * 0.10;
                } else if (age >= 65) {
                    totalPrice -= totalPrice * 0.30;
                }
                System.out.println("Toplam Tutar: " + totalPrice);
            }
            if (flightType == 2) {
                if (age < 12) {
                    totalPrice -= totalPrice * 0.50;
                }
                if (age <= 24) {
                    totalPrice -= totalPrice * 0.10;
                } else if (age >= 65) {
                    totalPrice -= totalPrice * 0.30;
                }
                flightDiscount = totalPrice * 0.20;
                totalPrice = (totalPrice - flightDiscount) * 2;
                System.out.println("Toplam Tutar: " + totalPrice);
            }
        }else{
                System.out.println("Hatalı Veri Girdiniz!");
            }
        inp.close(); // scanner'ı kapatmak iyi bir alışkanlıktır.
    }
}
