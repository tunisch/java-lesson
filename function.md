# 🚀 Metotlar (Fonksiyonlar)

Java'da **Metotlar** (ya da diğer adıyla **Fonksiyonlar**), sadece çağrıldığında kullanılan, belirli bir görevi yerine getiren kod bloklarıdır.

Metotlar, tıpkı matematikteki fonksiyonlar gibi, dışarıdan veri alabilir (bunlara **parametre** denir), bir işlem yapar ve isteğe bağlı olarak bir sonuç **geri döndürür**.

---

## 🤔 Neden Metot Kullanırız?

Metot kullanmanın temel amaçları şunlardır:

1.  **Tekrar Kullanılabilirlik (Reusability):** Bir kod parçasını programın birçok yerinde kullanmanız gerektiğinde, tek bir metot olarak tanımlar ve ihtiyacınız olduğunda çağırırsınız. Bu, kod tekrarını önler (DRY - Don't Repeat Yourself).
2.  **Okunabilirlik ve Düzen:** Büyük bir problemi daha küçük, yönetilebilir parçalara bölerek programınızın anlaşılmasını kolaylaştırır.
3.  **Nesne Yönelimli Programlamanın (OOP) Temeli:** Metotlar, Java'da nesnelerin davranışlarını tanımlayan temel yapı taşlarıdır.

---

## ✍️ Metot Tanımlama Sözdizimi (Syntax)

### Java'da bir metot tanımlarken aşağıdaki sözdizimi kullanılır:

```java
erişimBelirleyici geriDonusTipi metotAdi(parametre1Tipi parametre1, parametre2Tipi parametre2, ...) {
  // Metot çağrıldığında çalışacak kod bloğu
  // return; // Eğer geri dönüş tipi varsa burada kullanılır
}
```
| Bölüm Adı           | Açıklama                                                                                                       |
|----------------------|----------------------------------------------------------------------------------------------------------------|
| erişimBelirleyici    | Metodun nereden çağrılabileceğini belirler (örneğin: public, private).                                        |
| geriDonusTipi        | Metodun işlemi bittikten sonra üreteceği sonucun veri tipidir (örneğin: int, String, boolean).                |
| void                 | Eğer metot hiçbir değer geri döndürmeyecekse bu anahtar kelime kullanılır. (Sadece bir iş yapar ama bir sonuç vermez). |
| metotAdi             | Metodunuzun benzersiz adıdır.                                                                                 |
| Parametreler         | Metodun çalışması için dışarıdan alması gereken verilerdir. (Opsiyoneldir).                                   |


## Örnek Metot Tanımlamaları:
### 1. Geri Değer Döndüren Metot (Return Type: int)
```java
public int toplama(int sayi1, int sayi2) {
  // Geri dönüş tipi int olduğu için, int tipinde bir değer döndürmeliyiz.
  return sayi1 + sayi2;
}
```
### 2. Geri Değer Döndürmeyen Metot (Return Type: void)
```java
public void selamVer(String isim) {
  // Geri dönüş tipi void olduğu için return kullanmak zorunlu değildir.
  System.out.println("Merhaba, " + isim + "!");
}
```
## 📞 Metot Çağırma
Tanımladığınız bir metodu kullanmak için, erişilebilir olduğu bir yerden ismini ve ardından parantezleri () yazarak çağırırsınız. Eğer parametre alıyorsa, parantez içine istenen tipte değerler (argümanlar) yazılmalıdır.

## ⚠️ Önemli Not (Java 101 için): 
- main metodundan normal bir metodu çağırmak için, çağırdığınız metodun başına static anahtar kelimesini eklemeniz gerekir.
- metotlar siniflar icerisine yazilir. ✅
- metot icine metot yazilmaz (⚠️ class icine yazilir) ❌


### Örnek Metot Çağırma:
```java
public class JavaPatika {

    // Metot Tanımlaması: main içinde çağrılacağı için static ekledik.
    static int toplama(int a, int b) {
        return a + b;
    }

    // Ana Çalışma Bloğu
    public static void main(String[] args) {
        
        // Metodu Çağırma ve Sonucu Bir Değişkene Atama
        int sonuc = toplama(5, 2); 
        
        System.out.println("Toplama Sonucu: " + sonuc); 
        // Çıktısı: 7
        
        // Metodu Doğrudan Kullanma
        System.out.println("Yeni Toplam: " + toplama(10, 3)); 
        // Çıktısı: 13
    }
}
```

## 💡 Ekstra Detay: Metot Aşırı Yüklenmesi (Method Overloading)
İlerleyen aşamalarda göreceğiniz bu kavram, aynı isimde fakat farklı parametre sayıları veya tipleri olan birden fazla metot yazabilmenizi sağlar.
```java
// Metot 1: İki tam sayı toplar
static int topla(int a, int b) { ... } 

// Metot 2: Üç tam sayı toplar (İsim aynı, parametre sayısı farklı)
static int topla(int a, int b, int c) { ... } 

// Metot 3: İki ondalıklı sayı toplar (İsim aynı, parametre tipleri farklı)
static double topla(double a, double b) { ... }

```
