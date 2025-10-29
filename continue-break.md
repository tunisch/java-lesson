# Continue ve Break Komutları

## Continue Deyimi
- Java'da "continue" deyimi , döngü içinde bir koşul oluştuğunda o döngüyü tamamlamadan bir sonraki kademeye geçmeye yarar.
```java
int i = 0;
while (i < 10) {
  i++;
  if (i == 5) {
    continue;
  }
  System.out.println(i);
}
```
- Örnekte görüldüğü gibi eğer i değişkeni 5 sayısına eşit olduysa, o kod bloğundan sonraki kodlar çalışmayıp döngü bir sonraki adıma geçiş yapacaktır.

- ***Note:*** break döngüyü tamamen bitirir, ama continue döngüyü bitirmez — sadece o tek turu “pas geçer” (yani gövdenin kalan kısmını atlar, ama döngü devam eder).

```java
for (int k = 0; k < 9; k++) {
    System.out.print("*");
    if (k == 3)
        continue;
    System.out.print("-");
}
System.out.print("bitti");
```

## Break Deyimi
- Buraya kadar gördüğümüz bütün döngüler belirlediğimiz bir koşula göre kontrol ediliyor ve bu koşul sağlandığı sürece çalışıyordu. Bazı durumlarda, döngü koşulu sağlansa bile başka bir nedenden ötürü döngüyü sonlandırmak isteyebiliriz. Bu tarz durumlarda break deyimini kullanırız. Bu deyim, içinde kullanıldığı döngüyü anında sonlandırır.
- ***Note:*** break; → döngüyü hemen ve tamamen bitirir.
(Yani koşul kontrolüne bile dönülmez, k++ bile yapılmaz.)

## 🔸 Peki break’ten sonra ne olur?

- break, bulunduğu döngüyü anında durdurur.
- Yani for döngüsünün içindeki hiçbir satır artık çalışmaz.
- Döngünün dışındaki kodlar kaldığı yerden devam eder.

```java
for (int i = 0; i < 10; i++) {
  if (i == 5) {
    break;
  }
  System.out.println(i);
}
```
- Örnekte görüldüğü üzere döngü içinde ki koşul tamamlanmadan i değişkeni 5 değerine ulaştığında "break" komutu ile döngümüzü bitirebiliriz.
```java  
for (int k = 0; k < 9; k++) {
    System.out.print("*");
    if (k == 3)
        break;
    System.out.print("-"); // Bu satır "break"ten sonra çalışır mı?
}
System.out.print("bitti");
```
### Ne olur?

- k = 0, 1, 2, 3 için * basılır.
- k == 3 olduğunda break → döngüden tamamen çıkılır.
- System.out.print("-") satırı çalışmaz, çünkü break o bloğun kalanını atladı.
- Döngüden çıkıldıktan sonra System.out.print("bitti") çalışır.
```md
Output :
****bitti
```
### 🔹 Özet:

- break, sadece içinde bulunduğu döngüyü (ya da switch bloğunu) bitirir.

- break çalıştıktan sonra:

  - Aynı bloğun kalan satırları çalışmaz.

  - Dışarıdaki kod kaldığı yerden devam eder.

 
| Durum      | Ne yapar                         | Döngü devam eder mi? | Kalan satırlar çalışır mı? |
| ---------- | -------------------------------- | -------------------- | -------------------------- |
| `break`    | Döngüyü tamamen bitirir          | ❌ Hayır              | ❌ Hayır                    |
| `continue` | O turu atlar, sonraki tura geçer | ✅ Evet               | ❌ Hayır (sadece o turda)   |
