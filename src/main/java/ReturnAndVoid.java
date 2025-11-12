/* Return metodu */

/* geri dondurmeye yarar ya da metottan donguduyu bitirmeye yarar! */

//public class ReturnAndVoid {
//    static int sum(int a, int b) {
//        int result = a + b;
//        System.out.println(result);
//        return a + b; // ✅ Sonucu geri gönder;
//    }
//
//    public static void main(String[] args) {
//        int result = sum(5, 2) + sum(3, 1);
//        System.out.println(result);
//    }
//}

/* Void metodu */

public class ReturnAndVoid {

    static void show() {
        System.out.println("Show metodu..");
        return; //return; → ✅ Geçerli (sadece metodu erken bitirir)
        /* Void metotlar değer döndüremez, ama return; ifadesiyle erken çıkış yapılabilir.*/

    }

    public static void main(String[] args) {
        show();
    }
}
// OUTPUT : Show metodu..
