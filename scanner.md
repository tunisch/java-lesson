# Kullanıcıdan Veri Alma

Java’da kullanıcıdan veri almak için Scanner sınıfı kullanılır. Ama bu sınıfı kullanmadan önce kodumuza Scanner sınıfını dahil etmemiz gerekir. Bunun için import deyimi kullanılır ;

import java.util.Scanner;

- İmport deyimi projenin en başına yazılır. Kullanıcıdan verileri almak için değişkenlere ihtiyacımız vardır. 
- İlk önce "a" adında veri tipi integer olan bir değişken oluşturalım. Oluşturduğumuz "a" değişkenine veriyi kullanıcıdan almak için yapmamız gereken Scanner sınıfını kullanmak. 
- Scanner sınıfından türeyen adı "input" olan bir nesne tanımlayalım. Sınıf ve Nesne kavramları ilerleyen derslerde detaylıca anlatılacaktır. 
- Scanner sınıfından nesne ürettikten sonra değişkenimize veri almak için, değişkenimizin türüne göre bir kod yazmamız gerekecektir. Eğer değişkenimizin "integer" türünde ise "input.nextInt()" veya double türünde ise "input.nextDouble()" kod bloğu kullanılmalıdır.

```
import java.util.Scanner;

public class JavaPatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;

        System.out.println("A sayısını giriniz : ");
        a = input.nextInt();

        System.out.println("B sayısını giriniz : ");
        b = input.nextInt();

        System.out.println("A Sayısı : " + a);
        System.out.println("B Sayısı : " + b);
    }
}
```
## Veri Tiplerine Göre Scanner Metotları
<img width="510" height="301" alt="image" src="https://github.com/user-attachments/assets/6e437b87-a537-4bd1-bc71-fce261c3bf67" />

```
import java.util.Scanner;

public class JavaPatika {public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        // String ÖrneğiString adSoyad = inp.nextLine();
        
        // Sayı Örnekleriint yas = inp.nextInt();
        double maas = inp.nextDouble();
        
        // Çıktılar
        System.out.println("Ad Soyad: " + adSoyad);
        System.out.println("Yaş : " + yas);
        System.out.println("Maaş : " + maas);
    }
}
```

1. Scanner sınıfını içe aktarma (import)

Scanner sınıfı java.util paketinde yer alır. Dolayısıyla kodun en üst kısmına şöyle bir satır eklemeliyiz:

import java.util.Scanner;


Ya da birden fazla sınıf kullanacaksak:

import java.util.*;


Bu sayede Scanner sınıfını doğrudan kullanabiliriz. 
Medium
+2
w3schools.com
+2

2. Scanner nesnesi oluşturma

Konsoldan (klavyeden) girdi almak için System.in kullanılır. Scanner ile bunu şöyle yaparsınız:

Scanner scanner = new Scanner(System.in);


Burada scanner objesinin adı sizin tercihinizdir (örneğin input, reader gibi). 
Medium
+2
Udemy Blog
+2

3. Kullanıcıdan veri okuma

Scanner sınıfı, farklı veri tiplerini okumak için farklı metotlara sahiptir. Genel yapı:

değişkenTipi değişkenAdı = scanner.nextXXX();


Burada nextXXX() kısmı, okunacak verinin tipiyle uyumlu olmalıdır. İşte bazı yaygın metotlar:

Metot	Ne okur?	Açıklama
nextInt()	int	Tam sayı okur (örneğin 5, 10, -3)
nextDouble()	double	Ondalıklı sayılar (örneğin 3.14)
nextFloat()	float	Ondalıklı ama float tipinde
nextLong()	long	Daha büyük tam sayı değeri
next()	String	Bir kelime okur (boşlukla ayrılmış kısmı)
nextLine()	String	Satırın tamamını okur (boşluk dahil)
nextBoolean()	boolean	true veya false okur

Örneğin:

int a = scanner.nextInt();
double d = scanner.nextDouble();
String s = scanner.next();       // tek kelime
String line = scanner.nextLine(); // tam satır


Java documentation da bu metotların kullanımını gösteriyor.
