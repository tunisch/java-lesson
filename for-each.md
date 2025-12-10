# ForEach Kullanımı

- Java'da ForEach deyimi adında da anlaşılacağı gibi bir döngüyü ifade eder.
- Genelde dizilerdeki ve listelerdeki elemanları daha hızlı şekilde ulaşmak için kullanılan kısa bir yöntemdir. Kısacası for döngüsünün modifiye edilmiş halidir.

```java
for (veritipi degisken(⚠ **Elemani temsil eden harf** ⚠) : diziAdi) {
  // kod bloğu
}
for (ElemanTipi geçici_değişken_adı : Dizi_veya_Koleksiyon_Adı) {
    // Geçici değişkeni kullanarak her elemanla yapılacak işlem
}
```
- Örnekte Java'da ForEach kullanımını görmektesiniz, yine bir for döngüsü oluşturuyoruz ama iki parametreyi iki nokta ile ayırıyoruz. İlk kısmında dizinin döndüreceği veri tipini ve for içinde dizinin elemanı olarak kullanacağınız değişkeni tanımlıyorsunuz, diğer kısımda ise dizimizin ismini yazıyoruz.
- Bu örneğimizde arabalar dizisinin forEach ile nasıl kullanıldığını görmektesiniz.

```java
String[] arabalar = {"BMW", "Mercedes", "Ford", "Ferrari"};
for (String i : arabalar) { // i burada dizinin elemanlarini temsil eder index'i degil ⚠️⚠️⚠️
  System.out.println(i);
}

// Çıktısı
// BMW
// Mercedes
// Ford
// Ferrari
```

- Çok boyutlu dizilerde forEach kullanımı      
```java
public class Main {public static void main(String[] args) {
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

         for (int[] array : matris) {   //  matrisin elemanları: int[]diziler
            for (int value : array) {     // array'in elemanları(value): int sayılar
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
OUTPUT :
1 2 3 
4 5 6
7 8 9
10 11 12
```
## Question
### Examp_1:
- Bir koleksiyondaki elemanlara ulaşmak için java 8'de sunulan yeni yöntem hangisidir?

  - foreach (String i : StringList)
  - for (String i : StringList)
  - StringList.forEach()
  - List.for()
    - cevap : for (String i : StringList)
### Examp_2 :
```java
public class PatikaDev {
    public static void main(String[] args) {
        int[] scores = new int[10];
        scores = new int[3];
        scores = new int[]{215, 234, 218, 189, 221, 290};

        for (int score : scores) {
            System.out.print(score + "  ");
        }
    }
}
```
#### Yukardaki code aciklamasi: 
- Yukardaki kod blogunda ilk 10 boyutlu dizi tanimlanir
- Sonra 3 boyutlu dizi tanimlanir yani ilk tanimlanan silinir hafizadan
- Sonra Scores dizisi 6 boyutlu tanimlanip elemanlariyla verilir direkt
- ekrana en son tanimlanan 6 bouytlu elemani verilen dizi veriler.
