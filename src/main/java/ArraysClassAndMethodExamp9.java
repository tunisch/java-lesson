/* Ödev - Dizideki Elemanların Frekansı
 * Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız. */

import java.util.Arrays;

public class ArraysClassAndMethodExamp9 {

    static boolean isDuplicate(int[] arr, int index, int value) {
        for (int i = 0; i < index; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        int againIndex = 0;
        int[] againArr = new int[arr.length];
        boolean isAgain = false;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                isAgain = false;
                if (arr[i] == arr[j]) {
                    if (!isDuplicate(againArr, againIndex, arr[j])) {
                        againArr[againIndex] = arr[j];
                        againIndex++;
                        isAgain = true;
                        count++;
                    }
                }
            }
            if (isAgain) {
                System.out.println(arr[i] + " sayisindan " + count + " tekrar oldu ");
            }
        }
        for (int i = 0; i < againIndex; i++) {
            System.out.print(againArr[i] + " ");
        }
    }
}
