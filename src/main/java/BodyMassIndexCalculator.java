import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        double boy, kilo, bmi, idealKilo, idealBmi = 23;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen Boyunuzu (metre cinsinden) giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lutfen Kilonuzu giriniz : ");
        kilo = input.nextDouble();

        bmi = kilo / (boy * boy);
        System.out.println("Vucut Kitle indeksiniz : " + bmi);

        String hesap = (bmi <= 18.5) ? "Zayifsin" :
                (18.5 <= bmi && bmi <= 24.9) ? "Normal" :
                (bmi < 29.9) ? "fazla kilolu" :
                (bmi<= 34.9) ? "1.derece obezite " :
                (bmi <= 39.9) ? "2.derece obezite" :
                (40.0 <= bmi) ? "3.derece obezite" : "Allah Sifa versin";
        System.out.println("Saglik Durumunuz : " + hesap);


        idealKilo = idealBmi * (boy * boy);
        System.out.println("Ideal kilonuz : " + idealKilo);

    }
}
