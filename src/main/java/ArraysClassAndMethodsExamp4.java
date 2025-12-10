/* Pratik - Çok Boyutlu Dizilerde yildizlar ile A Harfi Yazdıran Program */


public class ArraysClassAndMethodsExamp4 {
    public static void main(String[] args) {
        // A harfi 6 satir 4 sutundan olusacak olsun

        String[][] arr = new String[6][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || i == 2) {
                    arr[i][j] = " * ";
                } else if (j == 0 || j == 3) { // ayri ayri oldugu durumlar icin  || veya isareti kullanilir !
                    arr[i][j] = " * ";
                } else {
                    arr[i][j] = "   ";
                }
            }
        }
        // multidimensional array lerde for-each kullanimi :
        for (String[] row : arr) { // row : dizi_adi
            for (String value : row) { // her rowdaki elemanlari seciyoruz
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
