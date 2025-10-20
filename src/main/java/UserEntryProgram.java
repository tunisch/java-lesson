//import java.util.Scanner;
//
//public class UserEntryProgram {
//    public static void main(String[] args) {
//
//        String userName, password, sifreSifirla, yeniSifre;
//
//        Scanner inp = new Scanner(System.in);
//
//        System.out.print("Username : ");
//        userName = inp.nextLine(); // String nextLine ile alinir.
//
//        System.out.print("Sifrenizi giriniz :");
//        password = inp.nextLine();
//
//        // Stringlerde esitleme equals ile yapilir. " ." ile de javada baglamak icin kullanilir.
//        // String'lerde eşitlik kontrolü için .equals() metodu kullanılır.
//        if (userName.equals("patika") && password.equals("java123")) { // int olsaydi a == 10 gibi derdik
//            System.out.println("Hosgeldiniz !");
//        }else if (!userName.equals("patika") && password.equals("java123")) {
//                System.out.println("Kullanici adinizi yanlis girdiniz");
//                System.out.print("Kullanici adinizi tekrar giriniz :");
//                userName = inp.nextLine();
//                System.out.print("Sifrenizi tekrar giriniz :");
//                password = inp.nextLine();
//        } else if (userName.equals("patika") && !password.equals("java123")) {
//                System.out.println("Sifreyi yanlis girdiniz !");
//                System.out.print("Kullanici adinizi tekrar giriniz :");
//                userName = inp.nextLine();
//                System.out.print("Sifrenizi tekrar giriniz :");
//                password = inp.nextLine();
//        }else if (){
//            // Kullanıcı adı veya şifre yanlışsa bu blok çalışır.
//            System.out.println("Hatali giris yaptiniz.!");
//            System.out.println("Sifrenizi sifirlamak ister misiniz? (yes/no): ");
//            sifreSifirla = inp.nextLine();
//
//            // Kullanıcının cevabını kontrol et. equalsIgnoreCase, büyük/küçük harf duyarsız kontrol
//            if (sifreSifirla.equals("yes")) {
//                System.out.print("Yeni sifrenizi giriniz :");
//                yeniSifre = inp.nextLine();
//
//                // Yeni şifre, hatalı girilen şifreyle veya bilinen eski şifreyle aynı mı diye kontrol et.
//                if (yeniSifre.equals("java123")) {
//                    System.out.println("Sifre olusturulmadi,lutfen baska sifre giriniz.");
//                } else {
//                    System.out.println("Sifreniz olusturuldu.");
//                    // Bu noktada yeni şifre (newPassword) bir veritabanına kaydedilebilir.
//                    // Biz şimdilik sadece eski password değişkenini güncelleyelim.
//                    password = yeniSifre;
//                    System.out.println("Yeni sifreniz: " + password);
//                }
//            } else {
//                System.out.println("Sifre sifirlama islemi iptal edildi.");
//            }
//        }
//    }
//}

import java.util.Scanner;

public class UserEntryProgram {
    public static void main(String[] args) {

        String userName, password, sifreSifirla, yeniSifre;

        Scanner inp = new Scanner(System.in);

        System.out.print("Username : ");
        userName = inp.nextLine();

        System.out.print("Sifrenizi giriniz :");
        password = inp.nextLine();

        // String'lerde eşitlik kontrolü için .equals() metodu kullanılır.
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Hosgeldiniz !");
        } else {
            // Kullanıcı adı VEYA şifre yanlışsa bu blok çalışır.
            // Hangi bilginin yanlış olduğunu ayrı ayrı kontrol etmek yerine genel bir hata veriyoruz.
            System.out.println("Hatali giris yaptiniz!");
            System.out.print("Sifrenizi sifirlamak ister misiniz? (yes/no): ");
            sifreSifirla = inp.nextLine();

            if (sifreSifirla.equals("yes")) {
                System.out.print("Yeni sifrenizi giriniz :");
                yeniSifre = inp.nextLine();

                // Yeni şifre, hatalı girilen şifreyle veya bilinen eski şifreyle aynı mı diye kontrol et.
                if (yeniSifre.equals("java123") || yeniSifre.equals(password)) {
                    System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz: ");
                    yeniSifre = inp.nextLine();
                    if(yeniSifre.equals("java123") || yeniSifre.equals(password) ){
                        System.out.println("Ayni sifreyi tekrar girdiniz. Program sonlandiriliyor.");
                    }
                     else {
                        System.out.println("Sifre basariyla olusturuldu.");
                        // Bu noktada yeni şifre (newPassword) bir veritabanına kaydedilebilir.
                        // Biz şimdilik sadece eski password değişkenini güncelleyelim.
                        password = yeniSifre;
                        System.out.println("Yeni sifreniz: " + password);
                    }
            } else {
                    System.out.println("Sifre basariyla olusturuldu!");
                    password = yeniSifre;
                    System.out.println("Yeni sifreniz: " + password);
                }
            } else {
                System.out.println("Sifre sifirlama islemi iptal edildi. Program sonlandiriliyor.");
            }
        }
    }
}
