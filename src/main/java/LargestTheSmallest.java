import java.util.Scanner;

public class LargestTheSmallest {
    public static void main(String[] args) {

        double a, b, c;

        Scanner inp = new Scanner(System.in);

        System.out.print("a ,Birinci sayiyi giriniz : ");
        a = inp.nextDouble();

        System.out.print("b ,Ikinci sayiyi giriniz : ");
        b = inp.nextDouble();

        System.out.print("c ,Ucuncu sayiyi giriniz : ");
        c = inp.nextDouble();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b");
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("b > a > c");
            } else {
                System.out.println("b > c > a");
            }
        } else { // else daha dogru olur
            if (a > b) {
                System.out.println("c > a > b");
            } else {
                System.out.println("c > b > a");
            }
        }
        inp.close();// scanner'ı kapatmak iyi bir alışkanlıktır.
    }
}
