# For Döngüsü

- Java'da döngüler konusunda öğrendiğimiz gibi For döngüsü ile bir koşul belirterek döngülerimizi oluşturabiliriz.
```java
for (durum 1; durum 2; durum 3) {
  // çalışacak kod bloğu
}
```
- For döngüsü şu şekilde işler: İlk olarak döngüde sayaç işlevi görecek bir değişken oluşturulur. Bu değişkenin ilk değeri [durum 1] ile belirtilen kısımda verilir. Bu değişken [durum 3] kısmında isteğe göre artırılır veya azaltılır. Döngünün hangi koşulda çalışacağı ise [durum 2] kısmında boolean bir ifadeyle belirtilir.
```java
for (int i = 0; i < 10; i++) {
  System.out.println(i);
}
```
Bu For Döngüsü örneğinde 1'den 10'a kadar olan sayıları ekrana yazdırdık.

- İlk durumda, i adında türü int olan ve varsayılan değeri 0 olan bir değişken tanımladık. Bu değişken bizim kodumuzda sayaç görevi görecektir.
- İkinci durumda, döngünün çalışması için gerekli koşulu tanımlar (i, 10'ten küçük olmalıdır). Koşul doğruysa döngü yeniden başlayacak, yanlışsa döngü sona erecektir.
- Üçüncü durumda, döngüdeki kod bloğu her çalıştığında değeri 1 arttıran kodumuzu yazdık.

## Ne zaman kullanilir ?
- Java’da for döngüsü genel olarak, kaç kere tekrar edeceğini bildiğimiz durumlarda kullanılır. Yani döngünün başlangıç, bitiş ve artış/azalış adımlarını önceden belirleyebiliyorsak for döngüsü idealdir.
## Genel Kullanım Şekli:
```java
for (başlangıç; koşul; artış/azalış) {
    // tekrar edecek kodlar
}
```
```java
// 0'dan 4'e kadar sayıları yazdır
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```
- int i = 0 → Döngünün başlangıç değeri
- i < 5 → Döngünün çalışacağı koşul
- i++ → Her adımda i’nin artışı
  
### Ne Zaman Kullanılır?
- Belirli sayıda tekrarlama: Örneğin bir diziyi baştan sona gezmek.
- Sayaç ile işlem yapılacak durumlar: Örneğin “1’den 100’e kadar sayıları toplamak”.
- Diziler ve koleksiyonlar üzerinde işlem yapmak:

💡 Not: Eğer döngü sayısı başlangıçta bilinmiyorsa veya koşul her adımda değişiyorsa, o zaman while veya do-while kullanmak daha uygundur.

## Ornek 

```java
int sum = 0;
for (int i = 0, j = 0; i < 5 || j < 5; ++i, j = i + 1) {
   sum += i;
}
System.out.println(sum);
```
### Aciklama:
- Başlangıç: int i = 0, j = 0 → i ve j burada başlatılıyor.
- Koşul: i < 5 || j < 5 → döngü devam etmesi için en az birinin true olması yeterli. (|| mantıksal VEYA)
- Artırma: ++i, j = i + 1 → döngü sonunda i 1 artırılır, j ise i+1 olur.
 -----------------------------------------------------------------
- || operatörü: Sadece biri true olsa döngü devam eder.
- Artırma kısmı: Döngü sonunda çalışır, blok önce çalışır, sonra artırma ve j güncelleme yapılır.
- sum sonucu: 10 → yani sadece i’nin değerleri toplandı.
-----------------------------------------------------
- Döngü bloğu önce çalışır (sum += i)
- Ardından ++i ve j = i + 1 çalışır
- Koşul kontrol edilir, true ise tekrar döngü

# For ve While Döngüsü Arasındaki Farklar

- Java’da for, while ve do-while olmak üzere 3 adet döngü deyimi bulunmaktadır. Birbirinden farklı bu döngülerden hangisini kullanacağız ?

- Hiç bir algoritmada hangi döngünün kullanılması gerektiği ile ilgili kesin bir yargı ve kural söz konusu değildir. Bu döngüler uygun şekilde tasarlandıkları sürece aynı işi yapabilirler.
> ✅ **İpucu:** ***Ama genellikle, kaç kere döneceği belli olmayan, koşulun bir girdiye göre denetlendiği durumlarda While ya da do-while döngüsü kullanılırken*** , ***diziler gibi, tekrar sayısı belirli olan durumlarda ise for döngüsü kullanılması tercih edilir.*** Ama yine bu yazılımcının kendisine bağlıdır.
