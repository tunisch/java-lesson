public class ArrayExamp_2 {
    public static void main(String[] args) {
        // 1. DÜZENSİZ (JAGGED) DİZİ OLUŞTURMA
        // 3 satırlı, ancak sütun uzunlukları henüz belirlenmemiş bir tamsayı dizisi tanımlanır.
        int[][] arr = new int[3][];

        // Satırların sütun uzunlukları belirlenir (düzensiz dizi).
        arr[0] = new int[1]; // 1. satır (index 0): 1 sütun
        arr[1] = new int[2]; // 2. satır (index 1): 2 sütun
        arr[2] = new int[3]; // 3. satır (index 2): 3 sütun

        int sum = 0; // Dizinin elemanlarını toplamak için sayaç tanımlanır.

        // 2. DİZİYE DEĞER ATAMA DÖNGÜSÜ
        // i: Satır indexini temsil eder. i=0'dan başlar ve 3'ten küçük olduğu sürece devam eder (0, 1, 2).
        for (int i = 0; i < 3; ++i) {

            // j: Sütun indexini temsil eder. j=0'dan başlar.
            // i+1: Her satırın kendi uzunluğuna (i+1) kadar döner (0 için 1 kez, 1 için 2 kez, 2 için 3 kez).
            for (int j = 0; j < i + 1; ++j) {
                // Dizinin [i][j] konumuna (j + 1) değeri atanır.
                // Örnek: arr[2][1] = 1 + 1 = 2 olur.
                arr[i][j] = j + 1;
            }
        }

        // 3. TOPLAMA DÖNGÜSÜ
        // Atanan tüm elemanları toplamak için aynı döngü yapısı kullanılır.
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < i + 1; ++j) {
                // Dizinin o anki elemanını sum değişkenine ekler.
                // Sonuç: 1 + (1+2) + (1+2+3) = 10
                sum += arr[i][j];
            }
        }

        // 4. SONUCU EKRANA YAZDIRMA
        // Toplam değeri (10) ekrana yazdırır.
        System.out.print(sum);
    }
}