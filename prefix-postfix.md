# 1. ++i (Önden artırma – prefix)

- İşlem sırası: Önce i 1 artırılır, sonra değeri kullanılır.
- Kullanıldığı yer: Atama veya başka bir işlemde kullanıldığında artırılmış değeri verir.

```java
int i = 5;
int a = ++i; // i = 6, a = 6
```
# 2. i++ (Sonradan artırma – postfix)

- İşlem sırası: Önce mevcut i değeri kullanılır, sonra i 1 artırılır.
- Kullanıldığı yer: Atama veya işlemde önce eski değeri verir, artırma sonra gerçekleşir.

```java
int i = 5;
int a = i++; // a = 5, i = 6
```
## Özet:

- ++i → önce artır, sonra kullan.
- i++ → önce kullan, sonra artır.

- Önemli: Eğer tek başına yazarsan (i++; veya ++i;) sonuç aynıdır, çünkü değer başka bir işlemde kullanılmıyor. Fark başka bir işlem ile birlikte kullanıldığında görülür.


## Tek başına kullanım:
```java
int i = 5;

i++;   // i = 6 olur
++i;   // i = 7 olur
```
- Burada fark yok, çünkü i değeri başka bir değişkene atanmıyor veya başka bir işlemde kullanılmıyor.

- Yani hem i++ hem de ++i, sadece i’yi 1 artırır.
## Başka bir işlemle birlikte kullanım:
```java
int i = 5;

int a = i++;  // a = 5, i = 6
int b = ++i;  // i = 7, b = 7
```
- i++ → önce değeri a’ya atar (5), sonra i 1 artar (6).
  
- ++i → önce i’yi 1 artırır (7), sonra değeri b’ye atar (7).

  Atama veya işlem içinde kullanıldığında: ++i artırılmış değeri verir, i++ önce eski değeri verir, sonra artırır.
