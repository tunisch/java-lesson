# 1. Temel Operatörler

Java dilinde operatörler birçok işlemi yapabilmenize olanak tanır. Örneğin: matematiksel operatörlerle birlikte aritmetik işlemler yapabilmenizi, ilişkisel operatörlerle verileri kıyaslayabilmeyi, atama operatörleri ile değişkenlerin değerlerini değiştirmeye fırsat verir.

Java'da operatörler aşağıdaki gibi listelenebilir:

- Atama Operatörleri
- Aritmetiksel Operatörler
- İlişkisel ve Eşitlik Operatörler
- Koşul Operatörler
- Mantıksal Operatörler

## Atama Operatörü
<img width="689" height="364" alt="image" src="https://github.com/user-attachments/assets/8ff2e04f-fa05-490b-aaed-18a5378e6576" />

## Aritmetik Operatörler
Java'da Aritmetik Operatörler adından da anlaşılacağı üzere matematiksel işlemleri programlama dilinde uygulamamızı sağlarlar.

- Toplama : a + b
- Çıkarma : a – b
- Çarpma : a * b
- Bölme : a / b
- Mod alma : a % b
- 1 arttırma : a++
- 1 eksiltme : b--

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

- Ve : a && b
- Veya : a || b
- Değil : !(a&&b)
## Koşul Operatörü
Java'da Koşul Operatörleri ifadelerin sonucunda oluşacak olayları belirler.

- a = 5 ;
- b = (a == 1) ? 1 : 0
- Çıktısı : 0

## Conditional (Ternary) Operator
Ternary Operator (üçlü operatör), Java’da if-else yapısının kısa hali olarak kullanılan bir operatördür.
Kısaca, bir koşulu (condition) test eder ve bu koşulun true veya false olmasına göre iki farklı değer döndürür.

### 🧠 Genel Sözdizimi (Syntax)
```
variable = (condition) ? value_if_true : value_if_false;
```
- condition → test etmek istediğin ifade (örneğin: a > b)
- value_if_true → koşul doğruysa dönecek değer
- value_if_false → koşul yanlışsa dönecek değer

### 🔍 Basit Bir Örnek
```
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
```
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
```
int yas = 18;
String sonuc = (yas >= 18) ? "Reşit" : "Reşit değil";
System.out.println(sonuc);
```

##### ✅ Çıktı:
```
Reşit
```
#### 🔁 İç içe (nested) ternary örneği
```
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
```
String ad = "Tunahan";
boolean kontrol = ad instanceof String; // true
```
## Type Casting (Tür Dönüştürme Operatörü)

Amaç:
Bir veri tipini başka bir veri tipine dönüştürmek için kullanılır.
Java’da primitive türlerde ( ) parantez kullanılır.
Objelerde ise upcasting / downcasting şeklinde yapılır.

### Sözdizimi:
```
(targetType) value;
```
#### Örnek:
```
int num = 10;
double converted = (double) num; // int → double

System.out.println(converted); // 10.0
```
### Object Casting (Downcasting):
```
Animal a = new Dog(); // upcasting
Dog d = (Dog) a;      // downcasting
d.bark();
```
## Object / Member Access Operator (.)
Amaç:
Bir sınıfın (class) özelliklerine (fields) veya metotlarına (methods) erişmek için kullanılır.

### Sözdizimi:
```
objectName.memberName
```
#### Örnek:
```
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

### Sözdizimi:
```
(parameters) -> expression
(parameters) -> { statements }
```

#### Örnek:
```
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

### Sözdizimi:
```
ClassName::methodName
```

#### Örnek:
```
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
```
@AnnotationName
```

#### Örnek:
```
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
