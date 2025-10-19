# If ve Else Blokları

Java'da mantıksal ve koşullu ifadeler için if blokları kullanılır. Java 'da if blokları Türkçede "eğer" cümlesinin verdiği anlamla aynı şeyi ifade etmektedir. Programlamada koşul oluşturmak için if ve else bloklarını kullanırız. Else deyimi "değil ise" anlamı katmaktadır ve if deyiminden sonra kullanılır. Programlama da if ve else deyimleri çok önemlidir ve kodlamanın temel yapı taşlarını oluştururlar. If ve Else blokları ile programımız içerisinde ki algoritmalarımızı oluştururuz.

Koşula göre program içinde farklı işlemleri yerine getirmek gerekebilir. If-else muhtemelen yazılım programlarında en yaygın kullanılan karar mekanizmasıdır. Bu tarz durumları Java'da kodlayabilmek için if-else karar mekanizmasının yanında switch-case gibi yapılarda kullanılmaktadır. İf-else karar mekanizması istenilen koşul gerçekleştiği takdirde çalışır. Kısacası belirlenen koşul doğruysa yazılan kod çalışır.

## Java'da Karar Mekanizmaları
Java'da koşullu ifade ve şart oluşturmak için if ve else kullanılırız. Ayrıca else if, switch gibi koşullu ifadelere sahiptir.
- Programımızda belirtilen bir koşul doğruysa yürütülecek bir kod bloğu belirtmek için if kullanılır.
- Aynı koşul yanlışsa yürütülecek bir kod bloğu belirtmek için else deyimi kullanılır.
- İlk koşul yanlışsa, test edilecek yeni bir koşul belirtmek için eğer if else deyimi kullanılır.
- Yürütülecek birçok alternatif kod bloğu belirtmek için switch deyimi kullanılır.
```java
Örneğin: "yaşı 50'den küçük olanların personel kayıtlarını getir" gibi bir ifadede yaşı 50'den küçük olanları tespit etmek için karar mekanizmaları kullanılır. Eğer koşul sağlanmıyorsa başka bir kod bloğu işletilir. İfadenin yazılımsal olarak Java'da karşılığı aşağıdaki gibidir.

if(age < 50) {
	// personel kayıtlarını getir
}
```
- Koşulun gerçekleşip gerçekleşmediği "if" cümlesi içindeki ifadeye bağlıdır. Eğer mantıksal ifade true ise "if" kod bloğu çalıştırılır. Tabi ifadenin false döndüğü durumda da programın bir şeyler yapmasını isteyebiliriz. Bu durumda ise "else" ifadesi kullanılır. Aşağıdaki gibi bir örnekle açıklayabiliriz.

- Eğer, faiz oranı %70'den büyükse "Kurumsal Müşteri" tipinde kredi ver, değilse "Standart Müşteri" tipinde kredi ver şeklinde bir karar mekanizması aşağıdaki gibi tasarlanabilir.
```java
if(creditRatio > 0.7) {
	System.out.println("Kurumsal müşteri tipinde kredi");
}
else {
	System.out.println("Standart müşteri tipinde kredi");
}
```

- Koşullar birden fazla olabilir ve hiçbir koşula uymuyorsa en sonunda varsayılan bir duruma girilir ve o kod bloğunu çalıştırmak gerekir. Bu tarz durumlarda ise "if - else if - else" gibi yapılar kullanılır. If-else yapısına bir örnek daha aşağıdaki gibi olabilir.
```java
if(ortalama >= 50){
  System.out.println("Dersi Geçtiniz");
}else{      
System.out.println("Dersten Kaldınız");
}
```
- Bu kod bloğunda karar yapımda eğer ortalama 50 ve üstü ise Dersi Geçtiniz yazar, değilse Dersten Kaldınız yazar. if kısmı koşulun doğruluğunu kontrol ediyor, else kısmı ise koşul yanlış ise devamında yazan kodu çalıştırıyor. Yani eğer ilk kısımda TRUE dönerse Dersi Geçtiniz yazacak, FALSE dönerse else kısmındaki kod çalışacak.
```
else if
if - else - if
```

- if-else-if kalıbında, bir if satırı, istediğiniz sayıda else-if satırı ve isteğe bağlı olarak tanımlanan bir else satırı bulunur. Yani, else satırının tanımlanması şart değildir. Program, en başta yer alan if satırı ile if-else-if kalıbını değerlendirmeye başlar. İlk doğru ifadenin bulunduğu if veya else-if satırı ile karşılaştığında ilgili işlem satırını çalıştırır. Kalıbın geri kalan tüm satırlarını değerlendirmeye almadan geçer. Eğer if ve else if satırlarında yer alan ifadelerden hiç biri doğru bir sonuç vermezse, else satırında yer alan işlem satırını çalıştırır. else satırı da mevcut değilse, program if-else-if kalıbının hiç bir satırını çalıştırmadan bir sonraki satırdan çalışmasına devam eder. if-else-if kalıbında sadece tek bir satır işlem görür.

* Konumuzu açıklamak amacıyla aşağıdaki kodu inceleyebiliriz.
```java
if(i==10){
  System.out.println("i nin degeri 10'dur.");
}
else if(i<10){
  System.out.println("i nin degeri 10'dan kücüktür.");   
}
else{
  System.out.println("i nin degeri 10'dan farklıdır ve 10'dan kücük degildir.");   
}
```
- Sizce yukarıda yazdığımız kodun Console çıktısı nedir ?

* i nin degeri 10'dan farklıdır ve 10'dan kücük degildir.
Örneğin tuz oranı %80 ve üzerinde ise "yüksek derecede tuzlu", %80 ile %50 arasında ise "orta derecede tuzlu", bunların dışında bir durumda ise "düşük derecede tuzlu" şeklinde ekrana bilgiler yazan bir program yazmak istediğimizde if-else if-else yapısını kullanabiliriz.
```java
float saltRatio = 0.9f;
if(saltRatio >= 0.8) {
	System.out.println("yüksek derecede tuzlu");
}
else if(0.5 < saltRatio && saltRatio < 0.8 ) {
	System.out.println("orta derecede tuzlu");
}
else {
	System.out.println("düşük derecede tuzlu");
}
```
### 🧩 1️⃣ İç içe if (Nested if) — “Şartlar sırayla test edilecekse”
#### 🧠 Ne zaman kullanılır:
- Bir koşul doğru olduktan sonra ancak o durumda başka bir koşulu kontrol etmek istiyorsan.
- Yani: “Eğer şu oluyorsa, o zaman bu da olmalı.”

##### 📘 Kullanım senaryoları:
- Bir işlem adım adım ilerliyorsa
- Önce temel bir şart, sonra alt detaylar kontrol ediliyorsa
- Her koşulun içinde farklı bir hata veya açıklama mesajı göstermek istiyorsan
```java
Örneğin: 18 yaşından küçük olanlar kan bağışı yapamazlar, fakat, 18 yaşına eşit ve büyük olan bir kişi eğer kilosu 48'den büyükse kan verebilir, kilosu 48'den küçükse kan veremez gibi basit bir kuralı Java'da kodlayalım.

int age=25;    
int weight=48;

if(age>=18){  

    if(weight>=48){    
        System.out.println("Kan verebilirsiniz");    
    } 
    else{  
        System.out.println("Kan veremezsiniz");    
    }  

} 
else{  
  System.out.println("Kan verebilmek için yaşınız 18'den büyük olmalıdır.");  
} 
```
- Sizce yukarıda yazdığımız kodun Console çıktısı nedir ?
```
Kan verebilirsiniz.
```
### ⚙️ 2️⃣ Mantıksal Operatörlerle If (&&, ||, !) — “Tüm şartlar aynı anda geçerli olmalıysa”
#### 🧠 Ne zaman kullanılır:

- Birden fazla koşulu tek seferde kontrol etmek istiyorsan.
- Yani tüm şartlar aynı seviyedeyse, biri diğerine bağlı değilse.

##### 📘 Kullanım senaryoları:

- Giriş izni, yetki, form doğrulama gibi durumlar
- “Hepsi doğru olmalı” veya “en az biri doğru olmalı” kontrollerinde
- İç içe if yazmak istemediğinde
```java
if (yas >= 18 && ehliyetVarMi && gozTestiGectiMi) {
    System.out.println("Araba kullanabilirsiniz.");
} else {
    System.out.println("Şartlardan biri sağlanmıyor.");
}
```
##### 🟢 Avantajı:

- Daha kısa ve okunabilir
- İç içe if’e göre daha temiz
- “Hepsi doğruysa” mantığını tek satırda yazar

##### 🔴 Dezavantajı:
- Hangi şartın neden yanlış olduğunu görmek zordur.
- “Neden başarısız?” sorusuna net yanıt vermez (tek bir else bloğu vardır).
### ⚡ 3️⃣ Ternary If (?:) — “Basit true/false kararlarında”
#### 🧠 Ne zaman kullanılır:
Bir koşula göre tek bir değer atayacaksan veya tek satırlık karar vereceksen.

#### 📘 Kullanım senaryoları:

- Kısa çıktı üretmek
- Değişken ataması yapmak
- Konsola veya GUI’ye kısa mesaj yazmak
```java
String mesaj = (puan >= 50) ? "Geçti" : "Kaldı";
System.out.println(mesaj);
```
##### 🟢 Avantajı:
- Çok kısa ve temiz
- Bir değişkene atama yaparken pratik

##### 🔴 Dezavantajı:
- Koşul karmaşık hale gelirse okunması zorlaşır.

```java
String sonuc = (a > b && c < d) ? (x == y ? "A" : "B") : "C"; // Okuması zor!
```
Bu gibi durumlarda klasik if-else daha okunabilir olur.
### Hangisi Ne Zaman Kullanılır?

| Kullanım Türü                   | Ne Zaman Tercih Edilir                                        | Avantaj                                              | Dezavantaj                              |
| :-------------------------------| :------------------------------------------------------------ | :--------------------------------------------------- | :-------------------------------------- |
| **İç içe if (nested if)**       | Şartlar **birbirine bağlı** olduğunda                         | Her adımın neden başarısız olduğunu anlayabilirsin   | Uzarsa karışır                          |
| **Ternary if (?:)**             | Tek satırda **basit kararlar** için                           | En kısa yöntem                                       | Karar karmaşıklaşırsa okunamaz olur     |
| **Mantıksal if (&&,! ya da sembolu)**         | Şartlar **bağımsız ama aynı anda kontrol edilecekse** olursa  | Kısa ve temiz                                        | Hangi şartın hatalı olduğunu bilemezsin |



