import java.util.Scanner;

public class PassTheClassSituation {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Turkce notunuzu giriniz : ");
        turkce = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Muzik notunuzu giriniz : ");
        muzik = inp.nextInt();

        // Geçersiz notları sıfırlıyoruz (yani ortalamaya katmıyoruz)
        if (mat < 0 || mat > 100) {
            mat = 0;
        }
        if (fizik < 0 || fizik > 100) {
            fizik = 0;
        }
        if (turkce < 0 || turkce > 100) {
            turkce = 0;
        }
        if (kimya < 0 || kimya > 100) {
            kimya = 0;
        }
        if (muzik < 0 || muzik > 100) {
            muzik = 0;
        }
        double average = (mat + fizik + turkce + kimya + muzik) / 5.0 ;

        if(average < 55 ){
            System.out.println("Sinifta kaldiniz ,Seneye bekleriz sekerim :) ");
            //System.out.println("Ortalamaniz : " + average);
        }else {
            System.out.println("Tebrikler Sinifi gectiniz!");
            //System.out.println("Ortalamaniz : " + average);
        }
        System.out.println("Ortalamaniz : " + average); // NOTE : yukarda ıkı kere yazmak yerıne en altta bır kere yazdık program daha az yoruldu.
    }
}
