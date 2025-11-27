# Çok Boyutlu Diziler

Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar. Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken, matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek satır ve sütun sayısını girmemiz yeterli olacaktır.

İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar. Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

3x3 boyutunda bir matris örneği :

<img width="364" height="138" alt="image" src="https://github.com/user-attachments/assets/e4498582-8657-4f7c-95fd-9bbc4943daa2" />

Tablo oluşturup bu tablonun bilgilerini matris ile gösterelim. Örneğin, şehirler arasındaki mesafeyi gösteren bu tabloyu uzaklık değişkenimizde sakladık.

Mesafe Tablosu(KM)

<img width="537" height="278" alt="image" src="https://github.com/user-attachments/assets/3ed179c8-18fc-4ae5-8c25-0db0943cfdfb" />

```java
int[][] uzaklik ={
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };
```

# İki Boyutlu Dizi Tanımlama Yöntemleri

- İki boyutlu dizileri oluşturmanın farklı yöntemleri var şimdi bunlara bakalım.

- Bir değişkenin dizi olduğunu köşeli parantezler ile belirtmiştik. Bir tane köşeli parantez tek boyutlu dizi belirtir. Eğer çok boyutlu dizi oluşturmak istiyorsak, boyut sayısı kadar köşeli parantez belirtmeliyiz. Örneğin aşağıdaki satır 2 boyutlu bir dizi (yani matris) belirtir:

- ```java
  degiskenTipi[][] arrayIsmi;
int matrix[][];
```
yada

```java
degiskenTipi arrayIsmi[][];  //bu yöntem tercih edilmez

```
- İki boyutlu dizimizi tanımlarken değerlerini atamak istersek aşağıdaki yöntemi kullanabiliriz.
```java
int[][] array = {
{1, 2, 3}, 
{4, 5, 6}, 
{7, 8, 9}, 
{10, 11, 12} 
};
```
- İlk köşeli parantez birinci boyutu (satırları), diğeri ise ikinci boyutu (sütunları) belirtir. Aşağıdaki kodu çalıştırırsak, 3 satırlı ve 4 sütunlu bir matris oluşturur:

```java
int matrix[][] = new int[3][4];

```
yada
```java
matrix = new int[3][4];
```
- oluşturulan matrix değişkeninin default değeri (a) ile gösterilen tablodaki gibidir.

```java
[0][1][2][3]
[0] 0 0 0 
[1] 0 0 0 
[2] 0 0 0 

    (a)
```
