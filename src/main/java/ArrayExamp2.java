/*
İstediğiniz boyutta matris oluşturarak
matris değerlerine 0-99 arası random sayılar üreterek matrise atama yapınız
iki basamklilar ayri tek basamaklilar ayri olcak sekilde ekran yazdirma
 */
// Random sayi uretme Math.random() * 100
import java.util.Scanner;

public class ArrayExamp2 {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);

        // 1. Matris boyutunu al
        System.out.print("Satır sayısını gir: ");
        int rows = inp.nextInt();
        System.out.print("Sütun sayısını gir: ");
        int cols = inp.nextInt();

        int[][] matrix = new int[rows][cols];

        // 2. Matrisin türünü belirle
        // İlk sayı üretilecek, tek mi iki mi ona bakacağız
        int firstNum = (int) (Math.random() * 100); // 0-99 arası radom sayi ureten func normalde double dir basina (int) getirisek tam sayi uretir!!!
        boolean isTwoDigit;

        if (firstNum >= 10) {
            isTwoDigit = true;  // iki basamaklı sayılar
        } else {
            isTwoDigit = false; // tek basamaklı sayılar
        }
        // 3. Matrisi doldur
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int num;
                do {
                    num = (int) (Math.random() * 100); // 0-99 arası random
                    // num iki basamakli ve > 10 dan buyuk olunca while durur ya da num tek basamakli ve <= 10 olursa durur!
                } while ((isTwoDigit && num < 10) || (!isTwoDigit && num >= 10));
                matrix[i][j] = num; // Ram e tek tek i degeri row arttikca sutunlar basilir
            }
        }
        // 4. Ramdeki Matrisleri ekrana yazdırma
        System.out.println("\nOluşturulan matris:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        inp.close();
    }
}
