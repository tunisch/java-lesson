# Java Değişken Tanımlama
```
<veri tipi> <değişken ismi> = veri (değer)
```
İlk önce değişkenin veri tipini ve değişkenin ismini yazarız ve istenirse aynı matematikteki gibi "=" eşittir ile değerini atarız.
```
int number;
// number isminde, int veri tipinde bir değişken tanımlanmış
```
Veri tipleri aynı olan değişkenleri aynı satırda tanımlayabiliriz
```
int a, b, c;
// int veri tipinde 3 tane değişken tanımlanmış
```
Değişkeni tanımladıktan sonra, atama operatörü (=) kullanarak değişkene atayabiliriz.
```
double pi; // ilk başta double türünde bir değişken tanımladık
pi = 3.14; // Daha sonra bu değişkene bir değer atadık
```
Eğer bir değişkene hemen değer atayacaksanız, bunu iki satırda yapmak yerine tek bir satırda halledebilirsiniz.
```
double pi = 3.14;
```
Aynı satırda aynı türden birden fazla değişken tanımlıyorsak :
```
int a = 1 , b = 2;
// Aynı satırda int türünde 2 farklı değişken tanımlanmış ve ikisine de değer verilmiş
```
Değişkene verilen değer sonrasında değiştirilebilir, ama aynı isimde ikinci bir değişken oluşturulamaz ve hata alırız.
```
Hatalı Kullanım :

int a = 5; // a isminde bir değişken tanımlanmış
int a = 1 ; // Bu satır hataya neden olur, a değişkeni zaten var
```
```
Doğru Kullanım :

boolean a = true; // a isminde bir değişken tanımlanmış ve varsayılan bir değer verilmiş
a = false; // a değişkeninin değeri değiştirilmiş
```
# Java'daki İlkel Veri Tipleri
Tam Sayılar
Byte
Short
Integer
Long
Ondalıklı Sayılar
Float
Double
Karakterler
Char
Mantıksal Değerler
Boolean
