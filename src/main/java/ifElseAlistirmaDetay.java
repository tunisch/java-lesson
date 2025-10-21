/* ctrl + alt + l ile otomatik hizalama yapilir (reformat code) butun hepsi secilir ctrl + alt + l basilir. */

import java.util.Scanner;

//public class ifElseAlistirmaDetay {
//    public static void main(String[] args) {
//
/* Kod blogu kavrami ve else if parantezleri kulanimi */
//
//        int a = 10;
//
//        if (a > 0) {
//            System.out.println("Sayi pozitiftir.");
//            if (sayi % 2 == 0) {
//                System.out.println("Pozitif ve cifttir.");
//            } else {
//                System.out.println("Pozitif ama tektir.");
//            }
//        } else {
//            System.out.println("Sayi negatif veya sifir.");
//        }
//    }
//}
//public class ifElseAlistirmaDetay {
//    public static void main(String[] args) {
//
//        int yas;
//
//        Scanner inp = new Scanner(System.in);
//
//        System.out.print("Lutfen yasinizi giriniz :");
//        yas = inp.nextInt();
//
//        if (yas < 18) {
//            System.out.println("Kucuksun");
//        } else if (yas >= 18) {  // else olsa daha guzel olur buda mantikli ama else daha guzel cunku olumsuz durum bahsediyoz
//            System.out.println("Resitsin");
//            if (yas >= 65) {
//                System.out.println("Emekli olabilirsin.");
//            }
//        }
//    }
//}

/* else li hali */

//public class ifElseAlistirmaDetay {
//    public static void main(String[] args) {
//
//        int yas;
//
//        Scanner inp = new Scanner(System.in);
//
//        System.out.print("Lutfen yasinizi giriniz :");
//        yas = inp.nextInt();
//
//        if (yas < 18) {
//            System.out.println("Kucuksun");
//        } else {
//            System.out.println("Resitsin");
//            if (yas >= 65) {
//                System.out.println("Emekli olabilirsin.");
//            }
//        }
//    }
//}

/*  Hard Example */

// NOTE: Bu alıştırma, if-else’nin iç içe (nested), birden fazla koşullu ve mantıksal operatörlerle (&&, ||) birlikte kullanılmasını öğretecek.

/* Surucu Ehliyeti Sistemi */

//public class ifElseAlistirmaDetay {
//    public static void main(String[] args) {
//
//        int yas;
//        String rapor, teorikSinav, direksiyonSinavi;
//
//        Scanner inp = new Scanner(System.in);
//
//        System.out.print("Lutfen yasinizi giriniz :");
//        yas = inp.nextInt();
//
//        /* nextInt() + buffer temizleme */
//
//        // NOTE : nextInt() sonrası oluşan buffer sorununu her zaman hatırlamalıyım.
//        inp.nextLine(); // ENTER karakterini temizle
//
//        if (yas < 18) {
//            System.out.println("Ehliyet alamazsin");
//
//        } else { //yas 18 den buyukse burasi calisti. iceri girdi machine
//            System.out.println("Saglik Raporunuz var mi ? (evet/hayir) : ");
//            rapor = inp.nextLine();
//             // NOTE : Buradaki iç içe if'leri && operatörü kullanarak tek bir if'e düşür. Daha temiz olur.
//            if (rapor.equals("evet")) {
//                System.out.println("Teorik Sinavdan gectiniz mi ? (evet/hayir) : ");
//                teorikSinav = inp.nextLine();
//                if (teorikSinav.equals("evet")) {
//                    System.out.println("Direksiyon Sinavdan gectiniz mi ? (evet/hayir) : ");
//                    direksiyonSinavi = inp.nextLine();
//                    if (direksiyonSinavi.equals("evet")) {
//                        System.out.println("Tebrikler, Ehliyet alabilirsiniz!");
//                    } else {
//                        System.out.println("Direksiyon Sinavdan gecmeden ehliyet alamazsin");
//                    }
//                } else {
//                    System.out.println("Teorik Sinavdan gecmeden ehliyet alamazsin");
//                }
//
//            } else {
//                System.out.println("Rapor Olmadan Ehliyet alamazsin KARDESSS!");
//            }
//        }
//    }
//}

/* Burada iç içe if'leri && operatörü kullanarak tek bir if'e düşürdük boylelıkle karmasık olmadı.*/
//public class ifElseAlistirmaDetay {
//    public static void main(String[] args) {
//
//        int yas;
//        String rapor, teorikSinav, direksiyonSinavi;
//
//        Scanner inp = new Scanner(System.in);
//
//        System.out.print("Lutfen yasinizi giriniz :");
//        yas = inp.nextInt();
//        inp.nextLine(); // Buffer temizleme.
//
//        if (yas < 18) {
//            System.out.println("Ehliyet alamazsin");
//
//        } else { //yas 18 den buyukse burasi calisti. iceri girdi machine
//            System.out.println("Saglik Raporunuz var mi ? (evet/hayir) : ");
//            rapor = inp.nextLine();
//            System.out.println("Teorik Sinavdan gectiniz mi ? (evet/hayir) : ");
//            teorikSinav = inp.nextLine();
//            System.out.println("Direksiyon Sinavdan gectiniz mi ? (evet/hayir) : ");
//            direksiyonSinavi = inp.nextLine();
//
//            if(rapor.equals("evet") && teorikSinav.equals("evet") && direksiyonSinavi.equals("evet")){
//                System.out.println("Tebrikler, Ehliyet alabilirsiniz!");
//            }else {
//                System.out.println("Ehliyet alamazsınız, bazı şartlar sağlanmadı.");
//            }
//        }
//        inp.close(); // scanner'ı kapatmak iyi bir alışkanlıktır
//    }
//}

/* Daha Profesyonel Hali */

public class ifElseAlistirmaDetay {
    public static void main(String[] args) {

        int yas;
        String rapor, teorikSinav, direksiyonSinavi;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen yaşınızı giriniz: ");
        yas = inp.nextInt();
        inp.nextLine(); // buffer temizleme

        if (yas < 18) {
            System.out.println("Ehliyet alamazsınız (18 yaşından küçükler için yasak).");
        } else {
            System.out.print("Sağlık raporunuz var mı? (evet/hayir): ");
            rapor = inp.nextLine().trim().toLowerCase(); // NOTE : trim, bosluklari siler. toLowerCase, kucuk harfe cevirir.

            System.out.print("Teorik sınavdan geçtiniz mi? (evet/hayir): ");
            teorikSinav = inp.nextLine().trim().toLowerCase();

            System.out.print("Direksiyon sınavından geçtiniz mi? (evet/hayir): ");
            direksiyonSinavi = inp.nextLine().trim().toLowerCase();

            // girişlerin geçerli olup olmadığını kontrol et
            if (!(rapor.equals("evet") || rapor.equals("hayir")) ||
                    !(teorikSinav.equals("evet") || teorikSinav.equals("hayir")) ||
                    !(direksiyonSinavi.equals("evet") || direksiyonSinavi.equals("hayir"))) {
                System.out.println("⚠️ Lütfen tüm sorulara sadece 'evet' veya 'hayir' ile cevap veriniz.");
                return; // “return; görünce program çalışmayı bırakır.” yani assagisi calismaz.
            }

            // mantıksal kontrol
            if (rapor.equals("evet") && teorikSinav.equals("evet") && direksiyonSinavi.equals("evet")) {
                System.out.println("✅ Tebrikler, ehliyet alabilirsiniz!");
            } else {
                System.out.println("❌ Ehliyet alamazsınız, bazı şartlar sağlanmadı.");
            }
        }

        inp.close(); // scanner'ı kapatmak iyi bir alışkanlıktır
    }
}