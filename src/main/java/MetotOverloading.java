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
