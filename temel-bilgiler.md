# Geliştirme Ortamı (JDK)
Java Geliştirme Kiti (JDK), JVM (Java Sanal Makinesi) ve JRE (Java Çalışma Zamanı Ortamı) ile birlikte Java programlamada kullanılan üç temel teknoloji paketinden biridir. 
JDK, geliştiricilerin JVM ve JRE tarafından çalıştırılabilen Java programları oluşturmalarına izin verir.

# Programlamaya Başlangıç

İlk öğreneceğimiz kod parçacığı, Java'da ekrana veri bastırma kodu olan System.out.println("Java101"); komutunu öğreneceğiz. Ama ilk önce bilmemiz geren bir konu Java'da kodların nereye yazıldığı ve yazım kuralları ya da diğer adıyla söz dizimi (Syntax). Genellikle Syntax olarak İngilizce adıyla duyduğumuz bu terim herhangi bir programlama dilinin yazım kuralını belirler.

# Genel Sözdizimi (Syntax)
<img width="663" height="250" alt="image" src="https://github.com/user-attachments/assets/4dbf8304-5eda-437e-b5ad-48aa246555b2" />

- Yukarıda ki örnekte göreceğiniz gibi, en üst kısımda "public class Sinif" komutu ile bir sınıf (class) oluşturuyoruz. Java'da sınıflar içerisine kodlarımızı yazarız ve ilerleyen derslerde sınıflar konusuna derin bir giriş yapacağız. Daha sonra program çalıştığında çalışan bir metot olan "Main Metodu" sınıfımızın içerisine yazarız çünkü programı çalıştırmak için derleyici ilk olarak main metot içerisindeki komutları okuyacaktır.

- Main metot içerisine "Gövde (body)" adını veririz ve komutlarımızı ya da diğer adıyla ifadelerimizi gövde içerisine yazarız. Buraya yazdığımız kodlar derleyici tarafından yorumlanır ve çıktı olarak kullanıcıya verir. Genel olarak Java'nın Genel Sözdizim kuralları bu şekildedir.

# Ekrana Veri Yazdırma
- Java'da ekrana veri yazdırmak için System.out.print("Hello World!") kod parçacığı kullanılır. Bu komuta baktığımızda, iki parantez arasında, çift tırnaklar arasına ekrana yazdırmak istediğimiz sözcüğü yazmalıyız. Bu komutun iki farklı kullanım şekli mevcuttur, yazılan komuttan sonra yeni satıra inilmesi isteniyorsa System.out.println(); kullanılırken aynı satırda kalınması isteniyorsa System.out.print(); şeklinde kullanılır.

# Escape Karakterler
- Java'da Escape (Kaçış) karakterleri ile bazı özel durumlar durumlar gerçekleştirilir. Kaçış karakterleri ( / ) ters eğik çizgi ile ifade edilip sonrasında yazılan karakter ile özel işleve sahip olurlar.

<img width="523" height="302" alt="image" src="https://github.com/user-attachments/assets/cd8b8daf-e2ee-4dfa-a87d-a9cb728ce21f" />

# Yorum Satırları

- Yorum satırları, kod içi belgeleme amacıyla kullanılan ve derleyiciler tarafından dikkate alınmayan kod parçalarıdır. Yorum satırları oluşturmamızın sebebi, Yazdığı kodun kritik kesimlerini açıklayarak, o koda daha sonra bakan kimselerin (büyük olasılıkla kendisinin) işini kolaylaştırmak amaçlanmaktadır. Java’da yorum satırları 3 farklı şekilde yazılır:

// ile yapılan yorumlar
Tek satırlık bir açıklama yapılacaksa o satırın başına // işareti yazılır. ; // işaretinden sonra satır sonuna kadar her şey yorum olarak kabul edilir. Anlaşılacağı üzere bu işaretin satırın en başında olması zorunlu değildir. Ancak kodlama alışkanlığı bakımından satır başında kullanılması daha uygundur.

```
// bu bir yorum satırıdır
int number = 10; // number değişkenine 10 değeri atandı.
```
# /* ... */ ile yapılan yorumlar
Eğer birden fazla satırda yazılan bir açıklama varsa, her satırın başına // işareti koymak programcıya zor gelebilir. 
Bunun yerine, açıklama olarak değerlendirilmesi istenen satırlar /* ve */ işaretleri arasına alınır. 
Bu iki işaret arasında kalan kesimler derleyici tarafından yorum satırı olarak kabul edilir.
```
/* Birden fazla satırdan oluşan bir yorum satırlarıdır. Ancak yorumların bu yolla ifade edilmesi için birden fazla satırdan oluşması zorunluluğu yoktur. */
int number = 10; // number değişkenine 10 değeri atandı.
```
# /** ... */ ile yapılan açıklamalar
- Bir uygulama geliştirilirken kod içi belgeleme yapmak güzel bir programlama alışkanlığıdır.
Çünkü hem yapmakta olduğunuz işi en güzel o işi yaparken açıklayabilirsiniz, hem de açıklayabildiğiniz kodu anlamışsınız demektir ve o kodu açıklayarak yazdığınız için hata yapma olasılığınız düşer.

- Öte yandan, çoğu zaman uygulamaların raporlarının oluşturulması gerekir.
Kod yazıldıktan sonra kodun içine yazılan açıklamalardan bir belge oluşturarak bu belgeyi raporun sonuna eklemek programcının yükünü hafifletecektir. İşte şimdi bahsedeceğimiz üçüncü yöntem bu amaçla kullanılır.
/** ve */ işaretleri arasına yazılan açıklamalar bir takım özel etiketler içerebilir. Kod içi belgeleme, bu etiketleri tanıyan ve etiketlerden faydalanarak belge üreten bir aracın yardımı ile belgeye dönüştürülebilmektedir.

- Bu tarzda yazılan açıklama satırlarına Javadoc adı verilmektedir. Javadoc için kullanılabilecek bazı örnekler ve ne için kullanılabilecekleri aşağıda listelenmiştir:
<img width="685" height="384" alt="image" src="https://github.com/user-attachments/assets/3fab5aba-2399-4fb1-8ab9-9a5221ea41b8" />

```
/**
 * @author M.Mustafa Çetindağ - 11.Nis.2021
 */
public class AciklamaSatiriOrnegi {
    /**
     * Verilen sayının karekökünü bularak döndürür.
     * Sayının sıfırdan küçük olmadığını varsayar.
     *
     * @param sayi Karekökü alınacak sayı
     * @return Sayının karekökü
     */public double karekok(double sayi) {
        double kkok = 0;
        // burada karekök bulma algoritmasının çalıştığını kabul edelimreturn kkok;
    }
}
```
