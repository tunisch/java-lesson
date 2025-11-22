# Sınıflar (Classes)

- Java Nesne Yönelimli bir programlama dilidir. Java'daki her şey, değişkenleri ve metotları ile birlikte sınıflar ve nesnelerle ilişkilidir. Örneğin: gerçek hayatta araba bir nesnedir. Otomobilin ağırlık ve renk gibi değişkenleri ve sürüş ve fren gibi metotları vardır. Nesne yönelimli programlamanın amacı yazdığımız kodlara soyut bir kavrama dönüştürmektir.

- Sınıflara ait nitelikler ve davranışlar vardır. Programlamada nitelikler için değişkenler (variable), davranışlar için ise metotlar (method) tanımlanır.
- Yani bir sinifin niteliklerini degiskenlerle tanimlariz, bir sinifa ait davransilari da metotlaral (functions) tanimlariz.
- Nitelikler Jargon a gore sinifin en basinda tanimlanir (Sınıfın ıcınde ve en basta tanımlanır).

## Sözdizimi (Syntax)

```java
class <class_name> {
	<variable>;
	<methods>;
}
```
- Java'da "sınıf" tanımlanırken "class" deyimi kullanılır ve sonrasında sınıf ismi yazılır. Java'da sınıf isimleri her zaman büyük harf ile başlaması gerekmektedir ve oluşturulan Java dosyası ile aynı isimde olmalıdır.
- Sınıf ismini de verdikten sonra "{" işareti ile sınıfa ait kapsamı yani kod bloğunu oluştururuz. "}" parantezi ile de sınıfa ait kapsamı kapatırız. Böylece, sınıfımız için yazacağımız kodlar "{}" arasında kalan alanda yazılacaktır. Bu da sınıfın kapsamını ifade eder.
- Sınıf kod bloğunu açtıktan sonra bu kod bloğu için değişkenleri ve metotları yazarız. Unutmayınız ki metotlar da kendilerine ait kod blokları, yani kapsamları vardır. Onları da "{}" ile belirtiriz.

```java
class Car {
    // nitelikler
    String type;
    String model;
    String color;
    int speed;

    // davranışlar
    int increaseSpeed(int increment) {
        speed += increment;
        return speed;
    }

    int decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
        return speed;
    }
    
    void printSpeed() {
        System.out.println("Speed : " + speed);
    }
    // ...
}
```

## Yukarıda sınıf ve fonksiyon tanımlamalarına detaylıca yer verilmiştir.
- Sınıflar nesneler oluşturabilmek için yazılım dünyasında oluşturulmuş şablonladır. Bu şablon nesne ile ilgili modellenecek tüm özellikleri ve davranışları bir taslak halinde kodlanmasını sağlar. Böylece, tanımlanmış bir sınıftan binlerce nesne oluşturabiliriz.

### Examples
- Sınıflara ait nitelikler Java'da hangisi ile ifade edilir ?

- a) Değişkenler
- b) Döngüler
- c) Karar Yapıları
- d) Metotlar

#### Cevap | a

- Sınıflara ait davranışlar Java'da hangisi ile ifade edilir ?

- a) Metotlar
- b) If ve Else
- c) Döngüler
- d) Değişkenler

#### Cevap | a

- Sınıflar ile ilgili hangi ifade doğrudur ?

- a) Sınıflarda main() metodu tanımlanmak zorundadır.
- b) Sınıflarda constructor (yapıcı) metot tanımlanmalıdır.
- c) Sınıf ismi ile java dosya ismi aynı olmalıdır.
- d) Sınıflar başka sınııflardan çağrılamazlar.

#### Cevap | c
