/* Makine code u okumaya once mainden baslar */

//public class LocalMetot {
//    public static void main(String[] args) {
//        int x = 10;  // main'e özel
//        yazdir();
//        System.out.println(x); // çalışır
//    }
//
//    static void yazdir() {
//        int y = 20;  // sadece yazdir() içinde geçerli
//        System.out.println(y);
//    }
//}

//public class LocalMetot {
//    static void number(int x, int z) {
//        int y = 2;
//        x = x * y;
//        System.out.println(x);
//    }
//    public static void main(String[] args) {
//        int y = 3;
//        int z = 2;
//        if (y != z) {
//            int x = 20;
//        }
//        int x = 50;
//        number(x, z);
//    }
//}

/* 🔹 Örnek 1 – Değişmiyor (void’li hali) */

//public class LocalMetot {
//    public static void main(String args[]) {
//        String x = "Patika.dev";           // main'de x değişkeni oluşturuluyor
//        kodluyoruz(x);                     // x değeri metota gönderiliyor (kopya olarak)
//        System.out.println(x);             // main'deki x yazdırılıyor
//    }
//
//    static void kodluyoruz(String y) {     // y parametresi, x'in bir kopyası
//        String x = "Java101";              // bu x sadece bu metoda ait (lokal)
//        y = "Kodluyoruz";                  // bu da sadece metodun içindeki y'yi değiştirir >YANI> y de kodluyoruz metodunun parametresi → local
//    }
//}

/* 🔹 Örnek 2 – Dönüşle değişiyor (return kullanırsak) */

public class LocalMetot {
    public static void main(String args[]) {
        String x = "Patika.dev";
        x = kodluyoruz(x);        // metottan gelen değeri x'e atıyoruz
        System.out.println(x);
    }

    static String kodluyoruz(String y) {
        y = "Kodluyoruz";         // kopyayı değiştir
        return y;                 // o kopyayı geri gönder
    }
}