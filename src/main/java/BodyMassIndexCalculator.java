import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
     double boy, kilo, bmi;

     Scanner input = new Scanner(System.in);

     System.out.print("Lutfen Boyunuzu (metre cinsinden) giriniz : ");
     boy = input.nextDouble();

     System.out.print("Lutfen Kilonuzu giriniz : ");
     kilo = input.nextDouble();

     bmi = kilo / (boy * boy);
     System.out.println("Vucut Kitle indeksiniz : " + bmi);


    }
}
