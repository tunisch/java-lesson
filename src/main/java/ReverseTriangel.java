import java.util.Scanner;

public class ReverseTriangel {
    public static void main(String[] args) {
        int n; // basamak sayisi

        Scanner inp = new Scanner(System.in);

        System.out.print("Basamak sayisini giriniz: ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int y = (2 * (n - i)) - 1; y >= 1; y--) {
                System.out.print("*");
            }
            for (int k = 0; k <= i; k++) { // i kadar olmasi bosluk sayisina gore olur zaten ters ucgen basta bir boslukla baslicak okey durumdur!
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
