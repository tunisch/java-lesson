public class HelperArray {


    /* Eger bir metodun basina static yazarsak main metodu icinde kullanabiliyorduk ve ayrica yeniden nesne olusturmadan kullanadabiliyoruz
          " HelperArray helper = new HelperArray(); " buna gerek kalmadan -> HelperArray.print(list); diyerek artik boyle cagirabiliriz !!!
     */

    static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }

//    static void print(double[] arr) { // static olarak kullandik double ile olan metodu helper nesnessine gerek kalmadan class adi ile printleyebiliriz!!
//        System.out.print("[");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.print("]");
//    }

//    static void fill(int[] arr, int value) {
//        System.out.print("[");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = value;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.print("]");
//    }

    static int[] fill(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        return arr;
    }

    static int search(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    static int[] copy(int[] arr, int limit) {
        int[] arrY = new int[limit];
        for (int i = 0; i < limit && i < arr.length; i++) { // i < limit → yeni dizinin dışına taşmanı engelliyor , i < arr.length → eski dizinin dışına taşmanı engelliyor
            arrY[i] = arr[i];
        }
        return arrY;
    }

    static int[] copyOfRangeBenim(int[] arr, int start, int end) {
        int[] arrT = new int[end - start];
        for (int i = start, j = 0; i < end; i++, j++) {
            arrT[j] = arr[i];
        }
        return arrT;
    }

    static boolean equals(int[] l1, int[] l2) {
        if (l1.length != l2.length) {
            return false;
        }
        for (int i = 0; i < l1.length; i++) {
            if (l1[i] != l2[i]) {
                return false;
            }
        }
        return true;
    }
}
