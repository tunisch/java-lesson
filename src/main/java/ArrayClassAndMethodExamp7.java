/* Pratik - Dizideki Tekrar Eden Sayıları Bulan Program */

import java.util.Arrays;

public class ArrayClassAndMethodExamp7 {
    public static void main(String[] args) {

        int[] arr = {2, 5, 6, 4, 3, 5, 1, 12, 12, 5, 45, 12, 18, 2, 1, 14, 13};

        int againIndex = 0; // againIndex = tekrar eden eleman sayısı
        int[] againList = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                boolean isDuplicate = false;
                if (arr[i] == arr[j]) {
                    // kontrol edilme yeri tekrar edilen listedeki degerler gelen (yani ana listedeki tekrar eden rakam ile ayni mi diye tekrar edilir k da tekrar eden rakamlarin icerigi kadar calsiir
                    for (int k = 0; k < againIndex; k++) {
                        if (againList[k] == arr[j]) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    // eklenmemişse ekle
                    if (!isDuplicate) {
                        againList[againIndex] = arr[j];
                        againIndex++;
                    }
                    break; // aynı i için başka j bakma
                }
            }
        }
        // sıfırsız, temiz çıktı
        for (int i = 0; i < againIndex; i++) {
            System.out.print(againList[i] + " ");
        }
    }
}
