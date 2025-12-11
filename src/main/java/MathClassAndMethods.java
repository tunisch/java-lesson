/* Math methodlari bu sekilde tanimlanir kullanilir -> Math.MethodAdi(Parametreler) */

public class MathClassAndMethods {
    public static void main(String[] args) {


        /* abs(x) x in mutlak degerini verir */

        System.out.println(Math.abs(-15));

        /* cbrt(x) x in kup kokunu verir. */

        System.out.println(Math.cbrt(125));

        /* ceil(x) en yakin tam sayiya yuvarlanmis x degerini verir. */

        System.out.println(Math.ceil(13.4)); // her zaman bir uste yuvarlar

        System.out.println(Math.ceil(13.1));

        /* floor(x) en yakin tam sayiya yuvarlanmis x degerini verir. */

        System.out.println(Math.floor(13.1)); // her zaman bir alt tam sayiya yuvarlar.

        /* pow(x,y) X in degerini y nin ussune dondurur, */

        System.out.println(Math.pow(2, 3));

        /* sqrt(x) x in karekokunu verir. */

        System.out.println(Math.sqrt(4));

        /* random(x) 0 ile 1 arasinda rastgele bir sayi verir. */

        System.out.println(Math.random() * 100); //boyle olunca random double diye tam sayi vercek ama 100 ile 0 arasinda


        /* rint(x) X e en yakin ve matematiksel tam sayiya esit olan cift degeri verir */

        System.out.println(Math.rint(13.4)); // En yakın tam sayı, ortadaysan da çift sayıya git

        /* signum(x) X in isaretini verir Bir sayının sadece işaretini döndürüyor.

             Pozitifse 1.0,
             negatifse -1.0,
             sıfırsa 0.0.
        */

        System.out.println(Math.signum(22.5)); // 1.0


    }
}
