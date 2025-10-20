public class IfElse {
    public static void main(String[] args) {
        int sayi = 10;

        // eğer sayı 5'ten büyükse bu blok çalışır
        if (sayi > 5) {
            System.out.println("sayı 5'ten büyüktür.");
        }

        // bu satır her durumda çalışır
        System.out.println("program bitti.");

        /* example_2 */
        int yas1 = 16;

        // eğer yaş 18 veya daha büyükse "reşitsiniz" yazacak
        // değilse "reşit değilsiniz" yazacak
        if (yas1 >= 18) {
            System.out.println("reşitsiniz.");
        } else {
            System.out.println("reşit değilsiniz.");
        }

        /* example_3 */
        int not = 75;

        // birden fazla koşulu sırayla test eder
        if (not >= 90) {
            System.out.println("harf notu: a");
        } else if (not >= 80) {
            System.out.println("harf notu: b");
        } else if (not >= 70) {
            System.out.println("harf notu: c");
        } else if (not >= 60) {
            System.out.println("harf notu: d");
        } else {
            System.out.println("kaldınız (f)");
        }

        /* example_4 iç içe ıf (nested ıf) */
        // bir koşulun içinde başka bir koşulu kontrol etmek istiyorsak kullanılır.
        //genellikle bir şeyin gerçekleşebilmesi için önce ana şart, sonra alt şart kontrol edilir.
        int yas2 = 20;
        boolean ehliyetvarmi = true;

        // dış if: yaş kontrolü
        if (yas2 >= 18) {
            // iç if: ehliyet kontrolü
            if (ehliyetvarmi) {
                System.out.println("araç kullanabilirsiniz.");
            } else {
                System.out.println("yaşınız yeterli ama ehliyetiniz yok!");
            }
        } else {
            System.out.println("araç kullanamazsınız. yaşınız 18'den küçük.");
        }
            /*
                bir if bloğunun içinde başka if kullanabilirsin.
                buna nested if (iç içe if) denir.
                genelde birden fazla koşulu birlikte kontrol etmek için kullanılır.
             */

        /* example_5 mantıksal operatörlerle ıf kullanımı (zor düzey) */
        // iç içe yazmak yerine, koşulları tek satırda birleştirebiliriz.
        // bunun için && (ve), || (veya), ! (değil) operatörleri kullanılır.
        int yas3 = 22;
        boolean sabikaKaydiVar = false;
        boolean saglikRaporuVar = true;

        // && = ve (her ikisi de true olmalı)
        // || = veya (biri bile true olsa yeter)
        if (yas3 >= 18 && ! sabikaKaydiVar && saglikRaporuVar) {
            System.out.println("işe kabul edildiniz.");
        } else {
            System.out.println("şartları sağlamıyorsunuz.");
        }
            /*
               && → ve operatörü. tüm koşullar doğru olmalı.
               || → veya operatörü. en az biri doğruysa çalışır.
               ! → değil anlamında (true’yu false’a çevirir).
               bu şekilde birden fazla koşulu tek satırda kontrol edebilirsin.
             */

        /* example_6 ternary ıf (kısa ıf else) */
        // if - else yapısının tek satırda yazılmış hali.
        //küçük karar yapılarında çok kullanışlıdır.
        int yas4 = 17;

        // eğer yaş >= 18 ise "erişkin", değilse "çocuk" yaz
        String sonuc = (yas4 >= 18) ? "erişkin" : "çocuk";

        System.out.println("sonuç: " + sonuc);

             /* (şart) ? doğruysa : yanlışsa
                if-else'in tek satırlık kısa versiyonudur.
                basit kontrollerde çok kullanışlıdır.
             */
    }
}
