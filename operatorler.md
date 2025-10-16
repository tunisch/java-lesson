# 1. Temel Operatörler

Java dilinde operatörler birçok işlemi yapabilmenize olanak tanır. Örneğin: matematiksel operatörlerle birlikte aritmetik işlemler yapabilmenizi, ilişkisel operatörlerle verileri kıyaslayabilmeyi, atama operatörleri ile değişkenlerin değerlerini değiştirmeye fırsat verir.

Java'da operatörler aşağıdaki gibi listelenebilir:

- Atama Operatörleri
- Aritmetiksel Operatörler
- İlişkisel ve Eşitlik Operatörler
- Koşul Operatörler
- Mantıksal Operatörler
🧮 Java Operatörlerinin Sözdizimleri (Formülleri)
## Atama Operatörü
<img width="689" height="364" alt="image" src="https://github.com/user-attachments/assets/8ff2e04f-fa05-490b-aaed-18a5378e6576" />

| Operatör | Sözdizimi (Formül)   | Açıklama                       |
| -------- | -------------------- | ------------------------------ |
| `=`      | `değişken = değer;`  | Sağdaki değeri sola atar       |
| `+=`     | `değişken += değer;` | `değişken = değişken + değer;` |
| `-=`     | `değişken -= değer;` | `değişken = değişken - değer;` |
| `*=`     | `değişken *= değer;` | `değişken = değişken * değer;` |
| `/=`     | `değişken /= değer;` | `değişken = değişken / değer;` |
| `%=`     | `değişken %= değer;` | `değişken = değişken % değer;` |

## Aritmetik Operatörler
Java'da Aritmetik Operatörler adından da anlaşılacağı üzere matematiksel işlemleri programlama dilinde uygulamamızı sağlarlar.

- Toplama : a + b
- Çıkarma : a – b
- Çarpma : a * b
- Bölme : a / b
- Mod alma : a % b
- 1 arttırma : a++
- 1 eksiltme : b--
### 🔢 İleri Düzey Aritmetik Operatör Örnekleri (Java)
#### 1️⃣ Modül ve Birleşik İşlem Örneği
```java
public class AdvancedMath1 {
    public static void main(String[] args) {
        int x = 17;
        int y = 5;
        int result = (x % y) + (x / y) * 2; // 2 + 6 = 8
        System.out.println("Sonuç: " + result);
    }
}
```
### 2️⃣ Üs Alma (Math.pow) ve Karekök Hesabı
```java
public class AdvancedMath2 {
    public static void main(String[] args) {
        double a = 4;
        double b = 3;
        double result = Math.pow(a, b) + Math.sqrt(a * b);
        System.out.println("Sonuç: " + result);
    }
}
```
#### Açıklama:
- Math.pow(4, 3) = 4³ = 64
- Math.sqrt(4*3) = √12 ≈ 3.464
  ➡️ Sonuç: 67.464
### 3️⃣ Artırma ve Azaltma Operatörlerinin Etkileşimi
```java
public class AdvancedMath3 {
    public static void main(String[] args) {
        int a = 5;
        int b = ++a * 2 + a--; // (6*2)+6 = 18
        System.out.println("a: " + a + ", b: " + b);
    }
}
```
#### Açıklama:

- ++a → önce artır, sonra kullan → a = 6
- a-- → önce kullan, sonra azalt
- Hesap sırası: (6 * 2) + 6 = 18
- Son durumda a = 5, b = 18
### 4️⃣ Karışık Parantezli İşlem Örneği
```java
public class AdvancedMath4 {
    public static void main(String[] args) {
        int x = 10;
        int y = 4;
        int z = 2;
        int result = (x + y) * z % (y + z) - x / z;
        System.out.println("Sonuç: " + result);
    }
}
```
#### Açıklama:
- (x + y) * z → (10 + 4) * 2 = 28
- (y + z) → 6
- 28 % 6 → 4
- x / z → 10 / 2 = 5
- 4 - 5 = -1
  ➡️ Sonuç: -1
### 5️⃣ Kombine Atama Operatörleri (+=, -=, *=, /=, %=)
```java
public class AdvancedMath5 {
    public static void main(String[] args) {
        int num = 10;
        num += 5;   // 15
        num *= 2;   // 30
        num %= 7;   // 2 (30 mod 7)
        System.out.println("Sonuç: " + num);
    }
}
```
#### Açıklama:
Sırasıyla işlemler uygulanır:
- num += 5 → 15
- num *= 2 → 30
- num %= 7 → 2
  ➡️ Sonuç: 2
### 6️⃣ Negatif ve Pozitif Operatörlerin Karışımı
```java
public class AdvancedMath6 {
    public static void main(String[] args) {
        int a = -5;
        int b = 3;
        int result = -a + ++b * (-a % b);
        System.out.println("Sonuç: " + result);
    }
}
```
#### Açıklama:
- -a → 5
- ++b → 4
- (-a % b) → 5 % 4 = 1
- 5 + 4 * 1 = 9
  ➡️ Sonuç: 9

## Karşılaştırma Operatörleri
Java'da Karşılaştırma Operatörleri iki nesnenin birbirleriyle olan durumlarını belirler.

- Eşitlik : a == b
- Eşit Değil : a != b
- Büyüktür : a > b
- Küçüktür : a < b
- Büyük Eşittir : a >= b
- Küçük Eşittir : a <= b

## Mantıksal Operatörler
Java'da Mantıksal Operatörler , nesnelerin veya ifadelerin mantıksal değerlerini yansıtır.
| Operatör | Sözdizimi (Formül)   | Açıklama                       |          |   |          |                      |
| -------- | -------------------- | ------------------------------ | -------- | - | -------- | -------------------- |
| `&&`     | `(kosul1 && kosul2)` | VE (her iki koşul da true ise) |          |   |          |                      |
| `        |                      | `                              | `(kosul1 |   | kosul2)` | VEYA (biri true ise) |
| `!`      | `!(kosul)`           | DEĞİL (sonucu tersine çevirir) |          |   |          |                      |


- Ve : a && b
- Veya : a || b
- Değil : !(a&&b)
## Koşul Operatörü
Java'da Koşul Operatörleri ifadelerin sonucunda oluşacak olayları belirler.

- a = 5 ;
- b = (a == 1) ? 1 : 0
- Çıktısı : 0

## Mantıksal Operatörler

Java'da Mantıksal Operatörler, değişkenler veya değerler arasındaki mantığı belirlemek için kullanılır. Türkçe'de ki bağlaç ekleri gibi düşünebilirsiniz.

Bir kontrol işlemi sonucunda geriye true yada false değeri döndüren operatörlerdir. True / False döndüren ifadeler veya boolean tipinde değerler tutan değişkenler üzerinde kullanılabilirler. Konuyu anlayabilmek için ilk önce mantıksal operatörlerin neler olduğu öğrenilmelidir.

## Java'da Mantıksal Operatörler
### && VE (AND)

Her iki ifade de doğruysa True döndürür.
```
Örnek
x'i 5 olarak ele alırsak;
x<10 && x<25
```
Burada sonuç True olacaktır.

### || Veya (OR)

İfadelerden biri doğruysa True döndürür.
```
Örnek
x'i 5 olarak ele alırsak;
x<10 || x<3
```
Burada sonuç True olacaktır.

### ! Ters İşlem

Sonucu tersine çevirir.
```
Örnek
x'i 5 olarak ele alalım.
x<10 ifadesi True dönecektir. Ancak !(x<5) olarak yazarsak sonuç False olacaktır.
```
### Soru İşareti Operatörü
? işareti operatörü ile Java'da mantıksal kıyaslama yapılabilir. ? ifadesi Java'daki "if-else" yapısı yerine kullanılabilir. Tek satırda bunu yapabilmemizi sağlar. Kullanımı ise if'in içerisinde yer alacak ifadeyi soru işaretinden önce yazılır, ifadenin doğru olması durumunda yapılacak işlemler soru işareti ile iki nokta arasına yazılır. İfadenin yanlış olması durumunda yapılacaklar ise iki noktadan sonra yazılır.

```
Kullanımı :
( kontrol edilecek ifade ) ? doğru olması durumunda yapılacaklar : yanlış olması durumunda yapılacaklar
```

Örnek :

```java
public class Test {

   public static void main(String args[]) {
      int a, b;
      a = 10;
      b = (a == 1) ? 20: 30;
      System.out.println( "Value of b is : " +  b );

      b = (a == 10) ? 20: 30;
      System.out.println( "Value of b is : " + b );
   }
}
```

#### Sonuç :

- Value of b is : 30
- Value of b is : 20
#### Açıklama :

- b = (a == 1) ? 20: 30; => ifadesini incelenirse, (a == 1) ? 20: 30 ifadesinden başlamak daha doğru olacaktır. a'nın 1 olması durumunda 20 değeri, a'nın 1'den farklı olması durumunda 30 değeri dönecektir. b'nin değeri buradan dönen değere göre belirlenecektir. Kodda a değeri 10 olarak verildiği için b'nin değeri 30 olarak atanmaktadır.
- b = (a == 10) ? 20: 30; => ifadesi incelenirse, yine yukarıdaki açıklamaya benzer olarak a değerinin 10 olması durumunda 20, a değeri 10'dan farklı olması durumunda ise 30 değeri geriye dönecektir. Bu durumda a değeri kodda 10 olduğu için b değeri de 20 olarak atanacaktır.

## Conditional (Ternary) Operator
Ternary Operator (üçlü operatör), Java’da if-else yapısının kısa hali olarak kullanılan bir operatördür.
Kısaca, bir koşulu (condition) test eder ve bu koşulun true veya false olmasına göre iki farklı değer döndürür.

### 🧠 Genel Sözdizimi (Syntax)
```java
variable = (condition) ? value_if_true : value_if_false;
```
- condition → test etmek istediğin ifade (örneğin: a > b)
- value_if_true → koşul doğruysa dönecek değer
- value_if_false → koşul yanlışsa dönecek değer

### 🔍 Basit Bir Örnek
```java
int a = 10;
int b = 20;

int max = (a > b) ? a : b;
System.out.println("En büyük sayı: " + max);
```
#### 🧩 Açıklama:
- (a > b) koşulu false, çünkü 10 > 20 değil.
- Bu yüzden b seçilir → max = 20.
##### ✅ Çıktı:
```
En büyük sayı: 20
```
### 💡 if-else ile aynı örnek
Yukarıdaki örneği normal if-else ile yazarsak:
```java
int max;
if (a > b) {
    max = a;
} else {
    max = b;
}
```
Ternary operatörü bunu tek satıra indirir.
Yani kodun okunabilirliğini artırır, ama karmaşık koşullarda dikkatli kullanılmalıdır.
#### ⚙️ Başka bir örnek (String ile)
```java
int yas = 18;
String sonuc = (yas >= 18) ? "Reşit" : "Reşit değil";
System.out.println(sonuc);
```

##### ✅ Çıktı:
```
Reşit
```
#### 🔁 İç içe (nested) ternary örneği
```java
int sayi = 0;
String sonuc = (sayi > 0) ? "Pozitif" : (sayi < 0) ? "Negatif" : "Sıfır";
System.out.println(sonuc);
```

##### ✅ Çıktı:
```
Sıfır
```
Ancak iç içe ternary ifadeleri okunması zorlaşabilir, bu yüzden sadece basit durumlarda tercih edilir.

### 🔒 Özet
| Özellik        | Açıklama                                    |
| -------------- | ------------------------------------------- |
| Operatör       | `?:`                                        |
| Kullanım Amacı | Kısa if-else yapısı                         |
| Avantajı       | Kodun sade ve kısa olması                   |
| Dezavantajı    | Karmaşık koşullarda okunabilirliğin düşmesi |

# 🧮 2. İleri Seviye Operatörler (Advanced Operators)
## 🧱 Bit Düzeyinde Operatörler (Bitwise)
| Operatör | Anlamı                 | Örnek      | Açıklama                             |    |                           |
| -------- | ---------------------- | ---------- | ------------------------------------ | -- | ------------------------- |
| `&`      | Bitwise AND            | `a & b`    | Bit düzeyinde VE işlemi              |    |                           |
| `        | `                      | Bitwise OR | `a                                   | b` | Bit düzeyinde VEYA işlemi |
| `^`      | XOR                    | `a ^ b`    | Farklı bitlerde 1 üretir             |    |                           |
| `~`      | NOT                    | `~a`       | Bitleri ters çevirir                 |    |                           |
| `<<`     | Sol kaydırma           | `a << 2`   | Bitleri sola kaydırır                |    |                           |
| `>>`     | Sağ kaydırma           | `a >> 2`   | Bitleri sağa kaydırır                |    |                           |
| `>>>`    | İşaretsiz sağ kaydırma | `a >>> 2`  | Negatif sayılarda işaretsiz kaydırma |    |                           |


## 🧱 instanceof Operatörü
Bir nesnenin (object) belirli bir sınıftan (class) olup olmadığını kontrol eder.
```java
String ad = "Tunahan";
boolean kontrol = ad instanceof String; // true
```
## Type Casting (Tür Dönüştürme Operatörü)

Amaç:
Bir veri tipini başka bir veri tipine dönüştürmek için kullanılır.
Java’da primitive türlerde ( ) parantez kullanılır.
Objelerde ise upcasting / downcasting şeklinde yapılır.

### Sözdizimi:
```java
(targetType) value;
```
#### Örnek:
```java
int num = 10;
double converted = (double) num; // int → double

System.out.println(converted); // 10.0
```
### Object Casting (Downcasting):
```java
Animal a = new Dog(); // upcasting
Dog d = (Dog) a;      // downcasting
d.bark();
```
## Object / Member Access Operator (.)
Amaç:
Bir sınıfın (class) özelliklerine (fields) veya metotlarına (methods) erişmek için kullanılır.
| Operatör | Sözdizimi (Formül) | Açıklama                |
| -------- | ------------------ | ----------------------- |
| `.`      | `nesne.üyeAdi`     | Alan veya metot erişimi |


### Sözdizimi:
```java
objectName.memberName
```
#### Örnek:
```java
public class Person {
    String name = "Ahmet";
    void greet() {
        System.out.println("Merhaba " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name); // field erişimi
        p.greet(); // metot çağrısı
    }
}
```
## Lambda Expression Operator (->)

Amaç:
Java 8 ile gelen functional programming yapısını destekler.
Lambda ifadesi, anonim (ismi olmayan) fonksiyonlar tanımlamak için kullanılır.
-> operatörü, parametreleri ve fonksiyon gövdesini birbirinden ayırır.

| Operatör | Sözdizimi (Formül)               | Açıklama            |
| -------- | -------------------------------- | ------------------- |
| `->`     | `(parametreler) -> ifade`        | Tek satırlık lambda |
| `->`     | `(parametreler) -> { kodBloğu }` | Çok satırlı lambda  |


### Sözdizimi:
```java
(parameters) -> expression
(parameters) -> { statements }
```

#### Örnek:
```java
// Tek satırlık lambda
Runnable r = () -> System.out.println("Çalıştı!");
r.run();

// Parametreli lambda
Function<Integer, Integer> kareAl = x -> x * x;
System.out.println(kareAl.apply(5)); // 25
```
## Method Reference Operator (::)

Amaç:
Lambda ifadelerinin kısa yazımıdır.
Var olan bir metodu referans olarak aktarır.

| Operatör | Sözdizimi (Formül)   | Açıklama        |
| -------- | -------------------- | --------------- |
| `::`     | `SınıfAdi::metotAdi` | Lambda kısayolu |

### Sözdizimi:
```java
ClassName::methodName
```

#### Örnek:
```java
List<String> isimler = Arrays.asList("Ali", "Veli", "Ayşe");

// Lambda ile
isimler.forEach(isim -> System.out.println(isim));

// Method reference ile
isimler.forEach(System.out::println);
```
## Annotation Operator (@)

Amaç:
Kod hakkında ek bilgi (metadata) sağlar.
Derleyiciye veya çalışma zamanına özel bilgi verir.
Örnekler: @Override, @Deprecated, @SuppressWarnings

### Sözdizimi:
```java
@AnnotationName
```

#### Örnek:
```java
class Parent {
    void speak() {
        System.out.println("Parent konuşuyor");
    }
}

class Child extends Parent {
    @Override
    void speak() {
        System.out.println("Child konuşuyor");
    }
}
```

# 📚 Referanslar

1. [Oracle Docs - Conditional Operator (?:)](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html)
2. [GeeksforGeeks - Ternary Operator in Java](https://www.geeksforgeeks.org/ternary-operator-in-java/)
3. [W3Schools - Java Ternary Operator](https://www.w3schools.com/java/java_ternary.asp)
4. [Programiz - Java Ternary Operator](https://www.programiz.com/java-programming/ternary-operator)
