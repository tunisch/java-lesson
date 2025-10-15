public class Operatorler {
    public static void main(String[] args){
        int a = 5, b = 6, c = 5;
        boolean kosul1 = a == c;
        boolean kosul2 = a >= b;
        boolean sonuc = kosul1 || kosul2; // " || " demek
        boolean sonuc2 = kosul1 && kosul2;

        String str = sonuc ? "Doğru " : "Degil";
        // System.out.println("|| sonucu: " + sonuc);
        // System.out.println("&& sonucu: " + sonuc2);
        // System.out.println("! sonucu: " + (!sonuc));
        /*Kosul Operatorleri*/
        System.out.println(str);
        int result = sonuc ? 1 : 0;
        System.out.println(result);

        /* KARSILASTIRMA OPERTATORLERI ORNEKLERLE  */

        // Aşağıdaki Kodları kendi IDE'nizde çalıştırarak,farklı değerlerle sonuçları test edebilirsiniz.

        int A = 50;
        int B = 30;
        int C = 15;
        int D = 2 ;
        int E = 15;

        // == Operatörü
        System.out.println(" == Durumu ");
        System.out.println(A == B);
        System.out.println(A == C);
        System.out.println(C == D);
        System.out.println(C == E);

        // != Eşit Değil Operatörü
        System.out.println(" != Durumu ");
        System.out.println(A != B);
        System.out.println(A != C);
        System.out.println(C != D);
        System.out.println(C != E);

        // > Büyüktür Operatörü
        System.out.println(" > Durumu ");
        System.out.println(A > B);
        System.out.println(C > E);
        System.out.println(D > E);
        System.out.println(B > C);

        // >= Büyük-Eşittir Operatörü
        System.out.println(" >= Durumu ");
        System.out.println(A >= B);
        System.out.println(B >= C);
        System.out.println(C >= E);
        System.out.println(D >= E);

        // < Küçüktür Operatörü
        System.out.println(" < Durumu ");
        System.out.println(A < B);
        System.out.println(C < D);
        System.out.println(E < A);
        System.out.println(C < E);

        // <= Küçük-Eşittir Operatörü
        System.out.println(" <= Durumu ");
        System.out.println(A <= B);
        System.out.println(C <= D);
        System.out.println(E <= A);
        System.out.println(D <= A);

    }
}
