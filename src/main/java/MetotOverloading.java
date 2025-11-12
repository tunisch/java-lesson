public class MetotOverloading {
    static void sum(int a, int b) {
        System.out.println("İki parametreli metot: " + (a + b));
    }
    /* metot overloading olmasi icin; metotlarin parametreleri farkli olmalidir */
//    static void sum(int b, int a) {
//        System.out.println("İki parametreli metot: " + (a + b));
//    }

    static void sum(int a, int b, int c) {
        System.out.println("Üç parametreli metot: " + (a + b + c));
    }

    static void sum(double a, double b) {
        System.out.println("Double parametreli metot: " + (a + b));
    }

    public static void main(String[] args) {
        sum(5.5, 10.5);
        sum(5, 10, 15);
        sum(5, 10);
//        sum(10, 5); sirasi farkli olsada calismaz hata verir!
    }
}


    /* metot - overloafing derleme hatasi exampl */

//    public class MetotOverloading {
//        static int info() {
//            System.out.println("Patika");
//            return 0;
//        }
//
//        static void info() {
//            System.out.println("Dev");
//        }
//
//        public static void main(String[] args) {
//            info();
//        }
//    }
//}

/* Çünkü overloading’de Java metotları parametre listesine göre ayırır.
Ama senin iki info() metodunun parametre listesi tamamen aynı: ()
static int info() → parametre yok
static void info() → parametre yok
 */
