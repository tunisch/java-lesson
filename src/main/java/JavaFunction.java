//public class JavaFunction {
//    static int toplam(int a, int b) {
//        return a + b;
//    }
//
//    public static void main(String[] args) {
//        int sonuc = toplam(5, 2);
//        System.out.println(sonuc);
//    }
//}

// ciktisi "7"

/* 🔹 1. HATALI KOD — void metot, ama int değişkene atanıyor */
//public class JavaFunction {
//    static void sum(int a, int b) {
//        int result = a + b;
//        System.out.println("Toplam: " + result);
//    }
//
//    public static void main(String[] args) {
//        int res = sum(3, 5); // ❌ Hata: sum() void döndürüyor ama sen int bekliyorsun
//    }
//}

/* ? OUTPUT:
Main.java:8: error: incompatible types: void cannot be converted to int
        int res = sum(3, 5);
                  ^
1 error
sum() hiçbir şey döndürmedi (void).

Ama sen int res = ... dedin, yani derleyiciye “bir sayı ver” dedin.

Derleyici dedi ki: “Bu metodun eli boş, sana neyi vereyim?”
 */

/* 🔹 2. DOĞRU KOD — int döndüren metot ve return kullanımı */
public class JavaFunction {
    static int sum(int a, int b) {
        int result = a + b;
        return result; // ✅ Sonucu geri gönder
    }

    public static void main(String[] args) {
        int res = sum(3, 5); // Artık geçerli: sum() bir int döndürüyor ve bizim burda int e esitlememizde sorun yok
        System.out.println("Sonuç: " + res);
    }
}

/* ? OUTPUT:
Sonuç: 8

🧠 Açıklama:

sum artık int türünde değer döndürüyor (return result).

main içindeki int res = sum(3,5); tamamen mantıklı, çünkü sum(3,5) → 8.

Artık el boş değil, elinde bir sonuç var.
 */
