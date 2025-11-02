import java.util.Scanner;

public class HarmonicNum {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);

        System.out.print("sayi giriniz: ");
        n = inp.nextInt();
        double sum = 0;
// integer inetger a bolunurse integer degr cikar ama double integera bolunurse double deger cikar!!
        // integer double bolunrusede double sonuc cikar !!
        for (double i = 1; i <= n; i++) { // i yi double yaptik ki sonuc doubel ciksin
            sum += (1/i);
        }
        // 1.dongu : i = 1,  sum = 1
        // 2.dongu i = 2, sum = 1 + 1/2 = 1.5
        System.out.println(sum);
    }
}
