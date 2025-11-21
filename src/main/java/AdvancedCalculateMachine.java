import java.util.Scanner;

public class AdvancedCalculateMachine {

    static void menu() {
        System.out.println(
                "1- Toplama İşlemi\n" +
                        "2- Çıkarma İşlemi\n" +
                        "3- Çarpma İşlemi\n" +
                        "4- Bölme İşlemi\n" +
                        "5- Üslü Sayı Hesaplama\n" +
                        "6- Faktoriyel Hesaplama\n" +
                        "7- Mod Alma\n" +
                        "8- Dikdörtgen Çevre Hesabı\n" +
                        "9- Dikdörtgen Alan Hesabı\n" +
                        "10- Çıkış Yap");
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double divide(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return (double) a / b;
    }

    static int power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * power(a, b - 1); // recursive metod a * a^(b-1) = a * a( b kadar a yazilir a yanina demek )
    }

    static int factorial(int a) {
        if (a <= 1) { // (a == 0 || a == 1 ) aynı şeydir
            return 1;
        }
        return a * factorial(a - 1);
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void rectangleCalc(int a, int b) {
        System.out.println("Çevresi: " + 2 * (a + b));
        System.out.println("Alanı: " + a * b);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        while (true) {
            menu();
            System.out.print("Secim yapiniz: ");
            int n = inp.nextInt();

            if (n == 10) {
                System.out.println("Çıkış yapıldı.");
                break; // return değil, break daha doğru çünkü döngüyü sonlandırıyor
            }

            int a, b;

            if (n == 6) {  // faktöriyel sadece 1 sayı ister
                System.out.print("Sayı: ");
                a = inp.nextInt();
                System.out.println("Sonuç: " + factorial(a));
                return;
            }

            // diğer işlemler 2 sayı ister
            System.out.print("Birinci sayı: ");
            a = inp.nextInt();
            System.out.print("İkinci sayı: ");
            b = inp.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Sonuç: " + add(a, b));
                    break;
                case 2:
                    System.out.println("Sonuç: " + minus(a, b));
                    break;
                case 3:
                    System.out.println("Sonuç: " + multiply(a, b));
                    break;
                case 4:
                    if (divide(a, b) == 0) {
                        System.out.println("İkinci Sayı sıfırdan farklı bir değer girilmelidir!");
                    }
                    System.out.println("Sonuç: " + divide(a, b));
                    break;
                case 5:
                    System.out.println("Sonuç: " + power(a, b));
                    break;
                case 7:
                    System.out.println("Sonuç: " + mod(a, b));
                    break;
                case 8:
                    rectangleCalc(a, b);
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        }
    }
}
