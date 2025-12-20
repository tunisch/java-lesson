/* break; → döngüyü hemen ve tamamen bitirir.
(Yani koşul kontrolüne bile dönülmez, k++ bile yapılmaz.)

🔸 Peki break’ten sonra ne olur?

break, bulunduğu döngüyü anında durdurur. YANI WHILE DAN DO- WHILEDAN FOR DAN CIKMAYA YARAR!!!

Yani for döngüsünün içindeki hiçbir satır artık çalışmaz.

Döngünün dışındaki kodlar kaldığı yerden devam eder.

 */

/* break kullanimi for ile */
//public class ContinueBreak {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            if (i == 5) {
//                System.out.println("i degeri 5 tir");
//                break; // for dongusunden otomatik cikti ve program bitti. breakten sonraki hiçbir kod satırı çalışmaz.
//            }
//            System.out.println(i);
//        }
//    }
//}

/* continue kullanimi for ile */

public class ContinueBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // continue olan yerde dongunun icindeki continue altinda kalana hic bir yeri yapmayip basa donup for dongusunde bir sonraki duruma doner Boylelikle 5 ekrana yazilmamis olur.
            }
            System.out.println(i);
        }
    }
}

/* continue kullanimi while ile */
/* continue kullandığında, değişkeni artırma işlemini i++ continue’dan önce yapman gerekir.   */
/* DO-WHILE DAN CIKAMAZSIN YA DA FOR DAN */


//public class ContinueBreak {
//    public static void main(String[] args) {
//        int i = 1;
//
//        while (i <= 10) {
//            i++;
//            if (i % 2 == 0){ // cift ise dongu devam edecek cift degilse ekrana basilcak
//                continue; // assagidaki kod blogu calismaz.!!
//            }
//            System.out.println(i);
//            /* diger sekilde if yazilmis hali {} olmadan da olur tek satir islem oldugu icin kullanilmiyor */

/// /            int i=0;
/// /            for(i=1; i<=6;i++)
/// /            {
/// /                if(i%3==0)
/// /                    continue;
/// /                System.out.print(i+",");
/// /            }
//        }
//    }
//}
/*
4️⃣ Kısaca özet:

- for’da arttırma işlemi her turun sonunda yapılır, gövdenin başında değil gövdenin sonunda yapılır.
- ++i ile i++ arasındaki fark burada önemsiz, çünkü ikisi de sadece arttırır, değeri kullanmıyoruz.
- continue ifadesi, gövdenin kalan kısmını atlar ama arttırma kısmını atlamaz.
- Bu yüzden “başta i neden artmıyor?” sorusunun cevabı: Çünkü for’un doğası gereği i başta değil, her turun sonunda artar.
- Ic dongu bitmeden yani (for dongusu) dış dongu yani distaki for dongusu calismaz!!!
 */

//public class ContinueBreak {
//    public static void main(String[] args) {
//
//        for (int i = 1; i <= 2; ++i) {
//            for (int j = 1; j < 4; ++j) {
//                if (i == 1) continue;
//                System.out.print(i + j);
//            }
//        }
//
//    }
//}