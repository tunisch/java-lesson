/* Matris boyutunu sizin belirlediğiniz
matris değerlerini ise kullanıcının girdiği bir algoritma yazınız.
 */
// kullanicidan array degeri alma example
import java.util.Scanner;

public class ArrayExamp {
    public static void main(String[] args) {
        int[][] matrix = new int[3][5];

        Scanner inp = new Scanner(System.in);

        // normal ınt da boyle alıyoryuz -> x = inp.nextInt();
        // Arraylarda Matrıxlerde kullanıcan deger alma bıcımı ıle
        for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < matrix[0].length; columnIndex++) {
                System.out.print("matrix[" + rowIndex + "][" + columnIndex + "] = ");
                matrix[rowIndex][columnIndex] = inp.nextInt();
            }
        }
        // matrixi ekrana  yazdirma

        for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < matrix[0].length; columnIndex++) {
                System.out.print(matrix[rowIndex][columnIndex] + " ");
            }
            System.out.println();
        }
    }
}

