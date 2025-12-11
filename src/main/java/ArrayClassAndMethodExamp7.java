/* Pratik - Dizideki Tekrar Eden Sayıları Bulan Program */

public class ArrayClassAndMethodExamp7 {

    static boolean isFind(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) { // dizi icinde value degeri var mi yok mu kontrolu
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 32, 3, 34, 33, 32, 10, 10, 11, 23, 32, 11};
        int[] dublicate = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) { //

                if (arr[i] == arr[j]) {

                    // Daha önce duplicate'e eklenmiş mi?
                    if (!isFind(dublicate, arr[i])) {
                        dublicate[i] = arr[i];
                    }
                }
            }
        }

        for (int i = 0; i < dublicate.length; i++) {
            if (dublicate[i] != 0) {
                System.out.print(dublicate[i] + " ");
            }
        }
    }

}