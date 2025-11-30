import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        // matrisi tanimladiigimiz durumdur !
        /*
        Bu aslında 4 adet tek boyutlu diziden (satırdan) oluşan bir dizidir.
        Yani, her bir elemanı bir dizi olan bir dizidir
         */
        int[][] matris = {
                {1, 2, 3},   // matris[0] elemanı -> bir dizidir -> {1, 2, 3}
                {4, 5, 6},   // matris[1]
                {7, 8, 9},   // matris[2]
                {10, 11, 12} // matris[3]
        };

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) { // matris[0] = matris [i] row u temsil eder 0 ilk rowdur !
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===============================");
        // matrix tanimlamadan for ile yazdirma !
        int[][] matrix = new int[3][4];
        int number = 1; // main icinde tanimlaniyor for scope i disinda main bitene kadar hafizada (ram de) deger tutar ve for bitene kadar da number her for da ki number degerini alarak degisir!
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) { // matris[0] = matris [i] row u temsil eder 0 ilk rowdur !
                matrix[i][j] = number++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // diziyi terse cevirme
        System.out.println("--------------");
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        // DERLEME HATASI VERIR
        int[][] numbers;
        numbers = new int[3][];
        // numbers[0] = {1,2}; BU YANLIS !
        // 1. SATIRA (numbers[0]) 2 elemanlı bir DİZİ atıyoruz
        numbers[0] = new int[2];

        // 2. Dizi elemanlarına tek tek değer atıyoruz
        numbers[0][0] = 10;
        numbers[0][1] = 20;
        System.out.println(numbers[0][1]);
        // Matristeki  satiri yazdirmaya yarar Arrays.toString() methodu
        System.out.println(Arrays.toString(numbers[0]));
    }
}




