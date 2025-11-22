# Constructor (Kurucu) Metotlar :

- Kurucu metotlar sınıf tasarlanırken yazılırlar. Sınıfınızı yazarken kurucu metotlarınızı da tanımlayabilirsiniz.
- Eğer sınıf içinde hiç kurucu metot tanımlamazsınız parametresiz boş bir kurucu metot Java tarafından otomatik olarak tanımlanır.

- Kurucu metotlar ilgili sınıftan bir nesne üretmeye çalıştığınızda daha nesne üretme aşamasında çalıştırılan özel metotlardır (fonksiyonlardır).
- Java'da "this" anahtar kelimesinin neden kullanılır ?
   - Sınıfa ait niteliklere erişmek için kullanılır.
- Sinifin icinde sinifin niteliklerinden sonra Constructorlar tanimlanir( jargon olarak siralama budur)
- Constructorlar nesne olusturmaya yararlar.
# this. kullanimi :
- Bir degiskenin basina "this." koyarsak bu sinifa ait degisken oldugunu anlamis oluruz.
- Basina this koydugumuzda o sinifa ait olan niteligi belirtebiliriz (cagirabiliriz)

  (Jargon olarak clean code icin yani)
  - Desgiskenlerin sinifa ait bir degisken oldugunu belirtirken (davranis icinde de olabilr bu degiskenler vs..) basina this. koymamiz gerekir.
  - ```java
    void increaseSpeed(int increment){
    this.speed += increment;
    }
    ```
   - Sinif niteliklerinde varsayilan degerleri constructor icine girmek daha dogrudur.
       - ```java
         Car audi = new Car("Sports", "Audi", "red"); 
         ```
- "new" anahtar kelimesi ile nesne üretirken kurucu metot çağrımı yapılır. İki tip kurucu metot vardır:

   - Parametresiz Varsayılan Kurucu Metot
   - Parametreli Kurucu MetotKurucu metotların isimleri Sınıf ismiyle aynı olmak zorundadır. Dönüş tipi olarak veya void olarak herhangi bir tanımlama yapılmasına gerek yoktur.


## Car sınıfımız :

```java
public class Car {
    // nitelikler
    String type;
    String model;
    String color;
    int speed;

    // Constructor (Kurucu) Metot
    Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

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

    void printInfo() {
        System.out.println("================");
        System.out.println("Model : " + this.model);
        System.out.println("Color : " + this.color);
        System.out.println("Type : " + this.type);
        System.out.println("Speed : " + this.speed);
    }
    // ...
}
```
## Nesnelerimiz :
```java
public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Sports", "Audi", "red");
        audi.increaseSpeed(20);
        audi.printInfo();

        Car bmw = new Car("Sports" , "BMW" , "blue");
        bmw.increaseSpeed(10);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(5);
        bmw.decreaseSpeed(25);
        bmw.printInfo();

        Car mercedes = new Car("Corporate" , "Mercedes" , "black");
        mercedes.speed = 20;
        mercedes.printInfo();

    }
}
```
## Programın çıktısı :
```java
================
Model  : Audi
Color  : red
Type  : Sports
Speed  : 20
================
Model  : BMW
Color  : blue
Type  : Sports
Speed : 15 ================
Model  : Mercedes
Color  : black
Type  : Corporate
Speed  : 20
```

### EXAMPLES :

```java
public class Test
{
    public Test()
    {
        System.out.printf("1");
        new Test(10);
        System.out.printf("5");
    }
    public Test(int temp)
    {
        System.out.printf("2");
        new Test(10, 20);
        System.out.printf("4");
    }
    public Test(int data, int temp)
    {
        System.out.printf("3");
          
    }
      
    public static void main(String[] args)
    {
        Test obj = new Test();          
    }
}
```
#### ACIKLAMA:
##### 1) new Test() çağrılıyor.

Bu, parametresiz olan konstrüktör.

Parametresiz konstrüktöre girince:

- Konsola "1" yazacak.
- Ardından new Test(10) çağrılacak.
- O iş bitince "5" yazacak.

Ama "5" henüz değil... önce içeriye gidiyoruz.

##### 2) new Test(10) çağrılıyor.

Burada:

- Konsola "2" yazacak.
- Ardından new Test(10,20) çağrılacak.
- O iş bitince "4" yazacak.

Ama yine “4” hiiiç acele etmiyor, çünkü içeride başka matruşka var.

##### 3) new Test(10,20) çağrılıyor.

Burada:

- Konsola "3" yazacak.
- Başka çağrı olmadığı için burada iş biter ve geri yukarı çıkar.
Bu en içteki matruşka bebek. Artık açılacak matruşka kalmadı.

##### Şimdi stack geri sarılıyor:

- Test(10,20) bitti → geri dön → Test(10) içindeki "4" yazılır
- Test(10) bitti → geri dön → Test() içindeki "5" yazılır
- Test() bitti → program biter

### CIKTI :
```java
1 → (içeri gir) → 2 → (daha içeri) → 3 → (geri) → 4 → (geri) → 5
```
