/* Ödev - Matris Transpozunu Bulma
 * Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.
 * Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir.
 * Örneğin 2x3’lik A matrisinin transpozu (devriği), 3x2’lük bir A^T matrisidir.
 */

public class MatrisTranspoze {
    public static void main(String[] args) {
        // Array da matris matrix gorunum sekli
        int[][] arr = {
                {1, 2, 3},   // matris[0] elemanı -> bir dizidir -> {1, 2, 3}
                {4, 5, 6},
        };

        for (int i = 0; i < arr.length; i++) {   // satırlar
            for (int j = 0; j < arr[i].length; j++) {  // o satırın sütunları
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        // multidimensional array lerde for-each kullanimi :
        // tip [] elemanlar_temsili : arrayAdi
        // tip coloumn_karsiligi : row degeri (elemanlar_temsili)
//        for (int[] i : arr) {
//             for (int j : i) {
//                    System.out.print(j + " ");
//                }
//                System.out.println();
//         }

// Transpoz : “Ben satır satır değil, sütun sütun gezeceğim.” der ama normalde satir satir bakariz yani dis taki for da

        System.out.println("----------------------------------");

        for (int j = 0; j < arr[0].length ; j++) { // sutun sutun gezmek icin arr[0].length deriz ve bir satirdaki sutun sayisini buluruz
            for (int i = 0; i < arr.length; i++) { // bize satir sayisini verir
                System.out.print(arr[i][j] + " "); // once i yazilir satirlar sonra sutunlari yazariz transpoz icin ikinci sutunlari getircek
            }
            System.out.println();
        }

    }
}
