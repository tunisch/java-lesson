/* Ödev - Dizideki Elemanların Frekansı
 * Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız. */

import java.util.Arrays;

public class ArraysClassAndMethodExamp9 {

    static boolean isDone(int[] arr, int index, int value) {
        for (int k = 0; k < index; k++) {
            if (arr[k] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (!isDone(arr, i, arr[i])) {
                System.out.println(arr[i] + " sayisi " + count + " kere tekrar edildi.");

            }
        }
    }
}

