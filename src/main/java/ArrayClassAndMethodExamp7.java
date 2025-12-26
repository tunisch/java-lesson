/* Pratik - Dizideki Tekrar Eden Sayıları Bulan Program */

public class ArrayClassAndMethodExamp7 {
    static boolean isDublicate(int[] arr, int value) {
        // for each ile
        // tip eleman : dizi
        for (int a : arr) {
            if (a == value) {
                return true;
            }
        }
        // for each olmadan
//        for (int a = 0; a < arr.length; a++) {
//            if (arr[a] == value) {
//                return true;
//            }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 4, 6, 4, 6};
        int[] dublicate = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            // for döngüsünde arttırma (j++),
            //sadece döngü gövdesi çalıştıktan sonra olur yani j< ------ durumu true ise j ++ calisir !!!
            //
            //Koşul en başta false ise:
            //
            //gövdeye girilmez
            //
            //arttırma da olmaz
            for (int j = 0; j < i; j++) {
                // cok tekrar eder tercih edilmez tekrar edenleri bir kere yazdircaz bu yuzden
                // + yardimci diziye ve methoda ihtiyacimizi var
///                if(arr[i] == arr[j]){
                    System.out.println("Tekrar edenler" + arr[i]);
///                }

                if (isDublicate(dublicate, arr[i])) {
                    if (arr[i] == arr[j]) {
                        System.out.println("Tekrar edenler : " + arr[i]);
                    }
                }
            }
        }
    }
}
