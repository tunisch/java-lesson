import java.util.Scanner;
import java.lang.Math; // matematik
public class TriangleAreaCalculator {
    public static void main (String[] args){
        double hipotenus, dikKenar_1, dikKenar_2, cevre, alan;

        Scanner input = new Scanner(System.in);

        System.out.print("1.Dik kenar uzunlugunu giriniz :");
        dikKenar_1 = input.nextDouble();
        System.out.print("2.Dik kenar uzunlugunu giriniz :");
        dikKenar_2 = input.nextDouble();

        hipotenus = Math.sqrt(Math.pow(dikKenar_1, 2) + Math.pow(dikKenar_2, 2));
        cevre = dikKenar_1 + dikKenar_2 + hipotenus;
        alan = (dikKenar_1 * dikKenar_2) / 2;

        System.out.println("Hipotenus : " + hipotenus);
        System.out.println("Cevre : " + cevre);
        System.out.println("Alan : " + alan);
    }
}
