# Nesne Oluşturma

- Sınıflar nesneleri tarif eden şablonlardı. Nesneler ise bu şablonlardan üretilen fiziksel yapılardır.
- Her üretilen nesne Hesap Hafıza Bölgesi'nde tutulur. Böylece sınıftan fiziksel karşılığı olan bir yapı elde etmiş oluruz.
-  Sınıftan onlarca, yüzlerce nesne yaratabiliriz. Hepsi de hafıza başka adresleri gösterirler.

```java
public class Car {
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
### Java'da nesne üretmek için kullanılan sözdizimi :

```java
ClassName object = new ClassName();  
```
- ClassName : Nesne oluşturmak istediğimiz sınıfı belirtiyoruz. Bu sınıf daha öncesinde projemizde tanımlanmış olması gerekmektedir.
- object : Nesnemize verdiğimiz isimdir ve aynı isimde birden fazla nesne oluşturulamaz.
- new : Java'da nesne üretmek için "new" anahtar kelimesini kullanırız.
- ClassName(); : Sınıfa ait Kurucu (Constructor) Metodu temsil eder. Varsayılan olarak parametresiz tanımlanır.
### Car sınıfına ait örnek nesne oluşturma :
```java
Car audi = new Car();
Car bmw = new Car();
Car mercedes = new Car();
```
- Yukarıdaki örnekte "Car" sınıfına ait 3 tane farklı nesne ürettik. Bu nesnelerin her birinin nitelikleri farklı olmakla beraber hafızada ayrı ayrı yer kaplamaktadırlar.

## Sınıf Niteliklerine Erişim
- Sınıflara ait niteliklere erişim sağlamak için nokta (.) kullanılır. İlgili nesnenin ismini sonuna nokta koyularak erişilmek istenilen niteliğin ismi yazılır.
```java
public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.speed = 10;
        System.out.println("Audi Hızı : " + audi.speed);

        Car bmw = new Car();
        bmw.speed = 25;
        System.out.println("Bmw Hızı : " + bmw.speed);

        Car mercedes = new Car();
        mercedes.speed = 30;
        System.out.println("Mercedes Hızı : " + mercedes.speed);

    }
}
```
- Programın çıktısı :
```java
Audi Hızı : 10
Bmw Hızı : 25
Mercedes Hızı : 30
```

# Sınıf Metotlarına Erişim
- Sınıfa ait davranışlara yani metotlara erişmek için nokta (.) kullanılır. İlgili nesnenin ismini sonuna nokta koyularak erişilmek istenilen metodun ismi yazılır ve var ise parametreleri girilir.
```java
public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.speed = 10;
        audi.increaseSpeed(20);
        audi.printSpeed();

        Car bmw = new Car();
        bmw.increaseSpeed(10);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(5);
        bmw.decreaseSpeed(25);
        bmw.printSpeed();

        Car mercedes = new Car();
        mercedes.speed = 20;
        mercedes.printSpeed();

    }
}
```
- Programın çıktısı :
```java
Speed : 30
Speed : 15
Speed : 20
```
# Sinif metotlarinda (davranislarinda ) 
## Davranışın parametre alıp almaması
- Java’da bir metoda parametre verip vermemek tamamen metodun tanımına bağlıdır.
    - a) Parametre alan metod
      ```java
      void addTeacher(Teacher teacher) { // metod parametre istiyor
      this.teacher = teacher;
      }
      ```
        - Burada metod Teacher türünde bir nesne bekliyor.
        - Çağırırken parametre vermeliyiz
    ```java
    tarih.addTeacher(t1); // t1 burada parametre
    ```
    - Eğer parametre vermezsek → hata alırız, çünkü metodun tanımı parametre istiyor.
      
  
  
          
  


