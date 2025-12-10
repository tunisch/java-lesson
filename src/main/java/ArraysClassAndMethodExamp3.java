/*   Ödev - Dizideki Elemanları Sıralama      */

/* Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız. */

import java.util.Arrays;
import java.util.Scanner;

public class ArraysClassAndMethodExamp3 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");

        int x = inp.nextInt();
        int[] arr = new int[x];

        for (int i = 1; i < x + 1; i++) {
            System.out.print(i + ".nci elemani giriniz: ");
            arr[i - 1] = inp.nextInt();
        }
        //ya Arrays kullanmadan boyle yazdircaz !
        for (int i = 0; i < x; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        // ya da Arrays methodu kullanarak boyle yazdiririz!
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
