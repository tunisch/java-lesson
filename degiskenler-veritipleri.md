# Java Değişken Tanımlama
```java
<veri tipi> <değişken ismi> = veri (değer)
```
İlk önce değişkenin veri tipini ve değişkenin ismini yazarız ve istenirse aynı matematikteki gibi "=" eşittir ile değerini atarız.
```java
int number;
// number isminde, int veri tipinde bir değişken tanımlanmış
```
Veri tipleri aynı olan değişkenleri aynı satırda tanımlayabiliriz
```java
int a, b, c;
// int veri tipinde 3 tane değişken tanımlanmış
```
Değişkeni tanımladıktan sonra, atama operatörü (=) kullanarak değişkene atayabiliriz.
```java
double pi; // ilk başta double türünde bir değişken tanımladık
pi = 3.14; // Daha sonra bu değişkene bir değer atadık
```
Eğer bir değişkene hemen değer atayacaksanız, bunu iki satırda yapmak yerine tek bir satırda halledebilirsiniz.
```java
double pi = 3.14;
```
Aynı satırda aynı türden birden fazla değişken tanımlıyorsak :
```java
int a = 1 , b = 2;
// Aynı satırda int türünde 2 farklı değişken tanımlanmış ve ikisine de değer verilmiş
```
Değişkene verilen değer sonrasında değiştirilebilir, ama aynı isimde ikinci bir değişken oluşturulamaz ve hata alırız.
```java
Hatalı Kullanım :

int a = 5; // a isminde bir değişken tanımlanmış
int a = 1 ; // Bu satır hataya neden olur, a değişkeni zaten var
```
```java
Doğru Kullanım :

boolean a = true; // a isminde bir değişken tanımlanmış ve varsayılan bir değer verilmiş
a = false; // a değişkeninin değeri değiştirilmiş
```
# Java'daki İlkel Veri Tipleri
- Tam Sayılar
- Byte
- Short
- Integer
- Long
- Ondalıklı Sayılar
- Float
- Double
- Karakterler
- Char
- Mantıksal Değerler
- Boolean


## Byte, Short, Int ve Long Veri Tipleri

Java'da tam sayıları belirten veri tipleri Byte, Short, Integer ve Long'tur.

### Byte
8 bit uzunluğundadır. Max 127 , Min -128 değerleri arasındadır.
Anahtar sözcük : byte
### Short
16 bit uzunluğundadır. Max 32,767 , Min -32,768 değerleri arasındadır.
Anahtar sözcük : short
### Integer
32 bit uzunluğundadır. Max 2,147,483,647 , Min -2,147,483,648 değerleri arasındadır.
En çok tercih edilen veri tipidir , sebebi ise optimize uzunluktadır.
Anahtar sözcük : int
### Long
64 bit uzunluğundadır. Max 9,223,372,036,854,775,807 , Min -9,223,372,036,854,775,808 değerleri arasındadır.
Int’in yetersiz olduğu yerlerde kullanılır
Anahtar sözcük : long

```java
public class JavaPatika {
    public static void main(String[] args) {
        byte a = 120;
        short b = 1000;
        int c = 100000;
        long d = 10000000;
    }
}
```
## Float ve Double Veri Tipleri

Java'da ondalıklı yani küsuratlı sayıları belirten veri tipleri Float ve Double'dır.

### Float
32 Bit boyutundadır ve 1.4×10^-45 ile 3.4×10^38 aralığında bir değer tanımlanabilir.
Float içerisine tam sayı yazdığımız zamanda bile o sayı 1.0 şeklinde ondalıklı olarak algılar.
Float ile double ayırmak için , float tanımlamalardan sonra ‘f’ veya ‘F’ konulmalıdır.
Anahtar Sözcük : float
### Double
64 Bit boyutundadır ve 4.9×10^-324 ile 1.8×10^308 aralığında bir değer tanımlanabilir.
Üst düzey matematiksel işlemlerde kullanılır
Anahtar Sözcük : double
## Ondalık Sayı Veri Tiplerinden Hangisi Tercih Edilmelidir ?
Bu sorunun cevabı değişken olmakla beraber hangi durumlarda Double veya Float kullanımınız için dikkat etmeniz gereken hususlar

- Double tipi, yüksek duyarlıklı ve hassas matematiksel işlemlerde kullanılır.
- Float basittir : hız ve bellek.
- Double daha yavaş ve fazla yer kaplar.(Bu işlemler arasında milisaniye oynar)
Java hassas matematiksel işlemler, örneğin sinüs kosinüs fonksiyonları, double tipi değer döndürür.

```java
public class JavaPatika {
    public static void main(String[] args) {
        float number1 = 3.14F;
        float number2 = 3.14f;

        double number3 = 3.14;
    }
}
```
## Char ve Boolean Veri Tipleri

### Char
Java'da karakter değişkenleri saklamak için Char kullanılır. Char veri tipleri birleşerek String Sınıfından bir yapıya dönüşür.

Karakterler Char ile saklanır.
Diğer dillere göre Char Java’da 16 bittir.
Java Unicode karakter setini kullanır ve tüm dilleri içerir.
Java evrensel bir dil olarak tasarlandığı için karakter seti de evrensel set olan Unicode ile tanımlanmıştır.
Anahtar Sözcük : char
### Boolean
Java, mantıksal değerleri saklamak için boolean adında bir tipe sahiptir.

Boolean sadece iki değer alabilir : True ve False
Genellikle koşul ve döngü işlemlerinde, kontrol amaçlı olarak kullanılır.
Anahtar Sözcük : boolean
```java 
public class JavaPatika {
    public static void main(String[] args) {
        char letter = 'u';
        boolean logic1 = true;
        boolean logic2 = false;
    }
}
```
## String Sınıfı

String sınıfı java.lang kütüphanelerinde bulunan ve metinlerle ilgili her türlü işlemin yapıldığı sınıftır. Java'da genellikle kelime tutmak için char yerine String sınıfı kullanılır. Basitçe şöyle düşünebiliriz , Char veri tipi tek bir karakter tutabiliyorken, charların birleşmesiyle oluşan sözcükleri String Sınıfı tutmaktadır.
```java
public class JavaPatika {
    public static void main(String[] args) {
        String words = "Hello World";
    }
}
```
