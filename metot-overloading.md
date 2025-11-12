# Metotlarda Overloading (Aşırı Yüklenme)

## 🧠 Metot Overloading Mantığı

-  Java’da metot overloading, aynı isimli metotların farklı parametre listeleriyle tanımlanmasıdır.
-  Bu sayede aynı işlevi farklı tür veya sayıda veriyle yapabiliriz.
⚠️ Ancak yalnızca return tipi değişikliği overloading sayılmaz.
### 🧩 Örnek Kod
```java
public class PatikaDev {

    // 1️⃣ int parametre alan versiyon
    static int info(int x) {
        System.out.println("Patika");
        return 0;
    }

    // 2️⃣ parametresiz versiyon (void)
    static void info() {
        System.out.println("Dev");
    }

    public static void main(String[] args) {
        info();     // 2️⃣ numaralı metot çalışır
        info(5);    // 1️⃣ numaralı metot çalışır
    }
}
```
### 🧾 Program Çıktısı
```java
Dev
Patika
```
### 💬 Açıklama:
- info() → parametre almadığı için void versiyonu çağrılır.
- info(5) → int parametre aldığı için int versiyonu çağrılır.
- Overloading farkı sadece parametre listesinden anlaşılır; dönüş tipi farkı (örneğin int vs void) tek başına geçerli değildir.

- Java'da, iki veya daha fazla metot, parametreler açısından farklılık gösteriyorsa (farklı sayıda parametre, farklı türde parametre veya her ikisi) aynı isime sahip olabilir. Bu duruma metotlarda "Overloading" yani aşırı yüklenme işlemi denir.

- Buradaki amaç aynı işlemi farklı parametrelerle yapacak olan metot ismini tek seferde kullanmaktır. Overloading işlemi "Nesne Yönelimli Programlamada" da çok kullanılmaktadır.
```java
void func() { ... }
void func(int a) { ... }
float func(double a) { ... }
float func(int a, float b) { ... }
```
- Burada func() metodu (overloading) aşırı yüklenmiştir. Bu metotlar aynı isime sahiptir ancak farklı parametreler kabul eder.

## ⚠️ Not: 
- Yukarıdaki metotların dönüş türleri aynı değildir. Bunun nedeni, metot aşırı yüklemesinin dönüş türleriyle ilişkili olmamasıdır. Aşırı yüklenmiş metotlar aynı veya farklı dönüş türlerine sahip olabilir, ancak parametreler açısından farklılık göstermeleri gerekir.
```java
public class JavaPatika {static void ekranaYaz(int a) {
        System.out.println("Parametreler : " + a);
    }

    static void ekranaYaz(int a, int b) {
        System.out.println("Parametreler : " + a + " ve " + b);
    }

    public static void main(String[] args) {
        ekranaYaz(5);
        ekranaYaz(10, 2);
    }
}
```

```java
// Çıktısı :
// Parametreler : 5
// Parametreler : 10 ve 2
```
