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
