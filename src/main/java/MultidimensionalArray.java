public class MultidimensionalArray {
    public static void main(String[] args) {
        // matrisi tanimladiigimiz durumdur !
        int[][] matris = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

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
    }
}




