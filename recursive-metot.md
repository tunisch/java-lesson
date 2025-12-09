# Recursive (Özyineli) Metotlar

Java'da Recursive Metotlar, bir metodun kendisini çağırma tekniğidir. Bu teknik, karmaşık problemleri çözmesi daha kolay alt problemlere ayırmayı sağlar. Örneğin, iki sayıyı birbirine eklemek kolaydır, ancak bir dizi sayıyı birbirine eklemek daha karmaşıktır. Recursive metotlar sürekli kendilerini çağırdıkları için dikkat edilmesi gereken durum, en son aşama için bir koşul (temel durum) koyulmasıdır.

Aşağıdaki örnekte, recursive bir metot, bir dizi sayıyı toplamak için, her seferinde iki sayıyı ekleme basit görevine bölerek kullanılır:

```java
public class Main {
  public static void main(String[] args) {
    int sonuc = toplam(10); // toplam metodu 10 ile çağrılıyor
    System.out.println(sonuc); // Sonucu yazdırır (1'den 10'a kadar olan sayıların toplamı)
  }

  /**
   * Belirtilen sayıdan başlayarak 1'e kadar olan tüm sayıları toplayan recursive metot.
   *
   * @param k Toplamanın başlayacağı üst sınır sayı.
   * @return 1'den k'ye kadar olan sayıların toplamı.
   */
  public static int toplam(int k) {
    // Temel durum: k 0 veya daha küçük olduğunda metot sonlanır.
    if (k > 0) {
      // Recursive adım: k'yi, k-1 ile toplam metodunun sonucuna ekler.
      return k + toplam(k - 1);
    } else {
      // Temel durum: k 0 veya daha küçükse 0 döndürür.
      return 0;
    }
  }
}
```
Yukarıdaki toplam() metodu çağrıldığında, k'dan küçük tüm sayıların toplamına k parametresini ekler ve sonucu döndürür. k değişkeni 0 olduğunda, metot sadece 0 döndürerek sonlanır. Bu, sonsuz döngüyü engelleyen "temel durum"dur.

Metot çalışırken, program şu adımları izler:
- f(1) = 1; (Temel durum, toplam(0) 0 döndürür)
- f(2) = f(1) + 2; (yani 1 + 2 = 3)
- f(3) = f(2) + 3; (yani 3 + 3 = 6)
- f(4) = f(3) + 4; (yani 6 + 4 = 10)
- ..........
- ..........
- f(n) = f(n-1) + n;

Bu süreç, k değeri 0 olana kadar devam eder ve nihai toplam hesaplanır.
Recursive Metotların Görselleştirilmesi
Aşağıda, recursive bir fonksiyonun çalışma mantığını gösteren genel bir akış şeması bulunmaktadır:

<img width="1024" height="1024" alt="image" src="https://github.com/user-attachments/assets/91bb568c-96bd-46a5-899f-42c940d5763f" />

# Examples:

## 1️⃣ Basamak Toplamı (Recursion)
```java
class Recursion {
    static int basamaklarToplami(int sayi){
        if (sayi == 0){
            return 0;
        } else
            return sayi % 10 + basamaklarToplami(sayi / 10);
    }

    public static void main(String[] args){
        System.out.println("Basamak toplami: " + basamaklarToplami(45612));
    }
}
```
### Açıklama

- basamaklarToplami fonksiyonu rekürsif olarak bir sayının basamaklarını toplar.

-- Mantık:

- Eğer sayı 0 ise, toplam 0 olarak geri döner (base case).

- Değilse, sayının son basamağı (sayi % 10) ile kalan kısmın basamak toplamını toplar (basamaklarToplami(sayi / 10)).

```matlab 
45612 % 10 = 2
45612 / 10 = 4561
4561 % 10 = 1
4561 / 10 = 456
456 % 10 = 6
456 / 10 = 45
45 % 10 = 5
45 / 10 = 4
4 % 10 = 4
4 / 10 = 0
```
- Toplam = 2 + 1 + 6 + 5 + 4 = 18

## 2️⃣ Faktoriyel Hesaplama (Recursion)
```java
public class PatikaDev {
    static int as(int i) {
        if (i < 2) 
            return 1;
        else 
            return i * as(i - 1);
    }

    public static void main(String[] args) {
        System.out.println(as(3));
    }
}
```
## Açıklama

- as fonksiyonu rekürsif olarak bir sayının faktöriyelini hesaplar.

-- Mantık:

- Eğer i < 2 ise (yani 0 veya 1), faktöriyel = 1 (base case)

- Değilse, i * as(i - 1) döndürür.
```matlab
 Örnek: as(3)

as(3) = 3 * as(2)
as(2) = 2 * as(1)
as(1) = 1
```

- Hesap: 3 * 2 * 1 = 6

## 3️⃣ Basit Rekürsif Method (Void)
```java
public class PatikaDev {
    public static void main(String[] args) {
        recursiveMethod(4);
    }

    static void recursiveMethod(int num) {
        num--;
        if (num == 0)
            return;
        System.out.print(num + ",");
        recursiveMethod(num);
    }
}
```
### Açıklama

- Bu örnek void tipli bir fonksiyonla rekürsiyonu gösteriyor.

--Mantık:

- Fonksiyon parametre olarak num alır ve önce num-- yapar.

- Eğer num == 0 ise return ile fonksiyondan çıkar.

- Değilse, önce num'u yazdırır sonra kendini tekrar çağırır (recursiveMethod(num)).
```matlab
Örnek: recursiveMethod(4)

num = 4 -> num-- -> 3 -> yazdır 3,
recursiveMethod(3):
    num = 3 -> num-- -> 2 -> yazdır 2,
    recursiveMethod(2):
        num = 2 -> num-- -> 1 -> yazdır 1,
        recursiveMethod(1):
            num = 1 -> num-- -> 0 -> return
```

- Not: return sadece fonksiyonu durdurur; başka bir değer döndürmez.
