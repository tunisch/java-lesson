import java.util.Scanner;

/* We will power calculate using with recursive metod */
public class PowerCalc {

    static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else if (exp == 1) {
            return base;
        } else {
            return base * power(base, exp - 1); // recursive metod a * a^(n-1) = a * a( n kadar a yazilir a yanina demek )
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int base = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int exp = input.nextInt();

        System.out.println("Sonuç: " + power(base, exp));
    }

}