import java.util.Scanner;

public class Debug101 {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        int sum = a + b;

        System.out.println("Toplam: " + sum);

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayi gir: ");
        int x = sc.nextInt();

        int result = sum * x;
        System.out.println("Sonuc: " + result);
    }
}