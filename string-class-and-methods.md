# String Sınıfı ve Metotları
- Java'da String sınıfları char türünden verilerden oluşmuş bir kümedir yani karakterlerden oluşur. Java işlerimizi kolaylaştırmak ve String ifadelerle işlem yapmak için String sınıfını sunar.

## Java String Sınıfı Metotları (JAVA 8 )

<img width="680" height="725" alt="image" src="https://github.com/user-attachments/assets/4edf7922-8c51-4bcd-8ae5-ac027f0de3e0" />

<img width="679" height="370" alt="image" src="https://github.com/user-attachments/assets/948cac14-76fa-48f7-b44d-82e4128eb9e4" />

### Example: Java String Sınıfı – Pekiştirici Örnek Sorular
Java'da `String` sınıfı, karakterlerden (`char`) oluşan **immutable** (değiştirilemez) bir veri tipidir.  


-  1️⃣ Java'da bir string değere ait elemanları gezmek için hangi metot kullanılır ?

**Cevap :** charAt()

**Örnek:**
```java
String s = "Java";
System.out.println(s.charAt(1)); // a
```
- 2️⃣ Bir String boş mu değil mi kontrol etmek için hangi metot kullanılır?

**Cevap :**  isEmpty()

**Örnek:**
```java
String s = "";
System.out.println(s.isEmpty()); // true
```

- 3️⃣  Bir String yalnızca boşluklardan mı oluşuyor diye kontrol etmek için hangi metot kullanılır? (Java 11+)

**Cevap :** isBlank()

**Örnek:**
```java
String s = "   ";
System.out.println(s.isBlank()); // true
```

- 4️⃣ Bir String içinde belirli bir karakter ya da kelime geçiyor mu diye kontrol etmek için hangi metot kullanılır?


**Cevap :** contains(CharSequence s)

**Örnek:**
```java
String s = "Java Programming";
System.out.println(s.contains("Java")); // true
```

- 5️⃣ Bir String’in belirli bir ifade ile başlayıp başlamadığını kontrol eden metot hangisidir?

**Cevap :** startsWith(String prefix)

**Örnek:**
```java
String s = "Java";
System.out.println(s.startsWith("Ja")); // true
```
- 6️⃣ Bir String’in belirli bir ifade ile bitip bitmediğini kontrol eden metot hangisidir?

**Cevap :** endsWith(String suffix)

**Örnek:**
```java
String s = "file.txt";
System.out.println(s.endsWith(".txt")); // true
```
- 7️⃣ Bir String içindeki bir karakterin ya da kelimenin ilk geçtiği index’i bulmak için hangi metot kullanılır?

**Cevap :** indexOf()

**Örnek:**
```java
String s = "banana";
System.out.println(s.indexOf("a")); // 1
```
- 8️⃣ Bir String içindeki bir karakterin ya da kelimenin son geçtiği index’i bulmak için hangi metot kullanılır?

**Cevap :**  lastIndexOf()

**Örnek:**
```java
String s = "banana";
System.out.println(s.lastIndexOf("a")); // 5
```
- 9️⃣ Bir String’i tamamen büyük harfe çevirmek için hangi metot kullanılır?

**Cevap :** toUpperCase()

**Örnek:**
```java
String s = "java";
System.out.println(s.toUpperCase()); // JAVA
```
- 🔟 Bir String’i tamamen küçük harfe çevirmek için hangi metot kullanılır?

**Cevap :** 
toLowerCase()

- 1️⃣1️⃣ Bir String’in başındaki ve sonundaki boşlukları silmek için hangi metot kullanılır?

**Cevap :**  trim()

**Örnek:**
```java
String s = "  Java  ";
System.out.println(s.trim()); // "Java"
```
- 1️⃣2️⃣ Bir String’in belirli bir kısmını almak için hangi metot kullanılır?

**Cevap :** substring(int beginIndex, int endIndex)

**Örnek:**
```java
String s = "Programming";
System.out.println(s.substring(0, 7)); // Program
```
- 1️⃣3️⃣İki String’in içerik olarak eşit olup olmadığını kontrol etmek için hangi metot kullanılır?

**Cevap :** equals()

**Örnek:**
```java
String a = "Java";
String b = "Java";
System.out.println(a.equals(b)); // true
```
1️⃣4️⃣Büyük/küçük harf duyarlılığı olmadan String karşılaştırmak için hangi metot kullanılır?

**Cevap :**  equalsIgnoreCase()

🧠 Mini Not

String immutable’dır.
Yani toUpperCase(), replace(), trim() gibi metotlar orijinal String’i değiştirmez, yeni bir String üretir.
