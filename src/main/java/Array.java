public class Array {


    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // nethod overloading yapimi : ayni davranisi aliyoruz parametresini degistiriyoruz!

    static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // reverse durumuu simdide array tersten yazdiralim yeni davranis yani method olusuturarak array icin olusturcaz
// int itipinde dizi dondereceksek veri tipinden sonra [] ekleriz.
    static int[] reverse(int[] list) {
        int[] reverse = new int[list.length];
        for (int i = 0, j = list.length - 1; i < list.length ; i++, j--){
            reverse[i] = list[j];
        }
        return reverse;
    }


    public static void main(String[] args) {
        // Array new ile olusturulur bouytunu vermemi gerekir
        int[] list = new int[10]; // 10 bouytlu bir dizi
        for (int i = 0; i < list.length; i++) {
            list[i] = (i + 1) * 10;
            System.out.print(list[i] + ",");
        }
        // boyle de olabilir yukarda for ile de degeri otoamtik vererekte yapabiliriz
        list[0] = 10;
        list[1] = 20;
        list[2] = 30;

        System.out.println(list[2]);

        int[] list2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        double[] list3 = {10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0, 100.0};
        System.out.println(list2[1]); // index numarasini basar
        // metod kullanimi
        System.out.println("-__-_------___--_--");

        printArray(list2);

        System.out.println("===================");

        printArray(list);

        System.out.println("....................");
        // required type int , provided type double bu yzuden olmaz
//        printArray(list3);
        // Ama method overloadin gyaaprsak olur !!

        printArray(list3);
        int[] newListe = reverse(list);
        printArray(newListe);

    }
}
