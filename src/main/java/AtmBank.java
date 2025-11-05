//import java.util.Scanner;
//
//public class AtmBank {
//    public static void main(String[] args) {
//        int right = 3, select, price, balance = 2000;
//        String userName, password, storedPass = "dev123"; // kayıtlı şifre buraya
//
//        Scanner inp = new Scanner(System.in);
//        while (true) {
//            System.out.print("Kullanici Adinizi Giriniz: ");
//            userName = inp.nextLine();
//            System.out.print("Sifrenizi Giriniz: ");
//            password = inp.nextLine().trim();
//            if (userName.equals("patika") && password.equals(storedPass)) {
//                System.out.println("Merhaba X Bankamiza Hosgeldiniz!");
//                do {
//                    System.out.println("1.Para Cekme \n" +
//                            "2.Para Yatirma \n" + "3.Bakiye Sorgulama \n" +
//                            "4.Cikis Yap");
//                    System.out.print("Lutfen Yapmak istediginiz islemi seciniz : ");
//                    select = inp.nextInt();
//                    inp.nextLine(); // buffer log clear !
//                    if (select == 1) {
//                        System.out.print("Para cekilecek tutari giriniz :");
//                        price = inp.nextInt();
//                        if (price > balance) {
//                            System.out.println("Bakiye yetersiz!");
//                        } else {
//                            balance -= price;
//                            System.out.println("Para miktari: " + balance);
//                        }
//                    } else if (select == 2) {
//                        System.out.print("Para yatirilacak tutari giriniz: ");
//                        price = inp.nextInt();
//                        balance += price;
//                        System.out.println("Para miktari: " + balance);
//                    } else if (select == 3) {
//                        System.out.println("Bakiye miktari: " + balance);
//                    }
//                } while (select != 4);
//                System.out.println("Tekrar gorusuruz! ");
//                break;
//            } else {
//                right--;
//                System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz.");
//                if (right > 0) {
//                    System.out.println("Kalan Hakkiniz: " + right);
//                } else {
//                    // hak bittiyse şifre yenileme seçeneği ver
//                    System.out.println("Hesabiniz bloke olmustur lutfen Banka ile iletisime gecip sifre yenileyiniz! ");
//                    System.out.println("Yeni sife girmek ister misiniz ? (evet/hayir) ");
//                    String result = inp.nextLine();
//                    if (result.equals("evet")) {
//                        while (true) {
//                            System.out.print("Yeni sifrenizi giriniz: ");
//                            String newPassword = inp.nextLine();
//                            if (newPassword.equals(password)) {
//                                System.out.println("eski sifreyle aynisini girdiniz baska sifre giriniz!");
//                            } else {
//                                storedPass = newPassword;
//                                System.out.println("Sifreniz basariyla olusturuldu!");
//                                right = 3; // haklari tekrar ver, kullanici tekrar deneyebilsin
//                                break;
//                            }
//                        }// döngü bittikten sonra while(true) ile başa döner ve tekrar giriş ister
//                    } else {
//                        System.out.println("Cikis yapiliyor. Iyi gunler.");
//                        break; // kullanıcı yenileme istemezse programı bitir
//                    }
//                }
//            }
//        }
//        // inp.close(); // kapatma, çünkü System.in tekrar gerekebilir
//    }
//}
/* switch-case ile */

import java.util.Scanner;

public class AtmBank {
    public static void main(String[] args) {
        int right = 3, select, price, balance = 2000;
        String userName, password, storedPass = "dev123"; // kayıtlı şifre buraya

        Scanner inp = new Scanner(System.in);
        while (true) {
            System.out.print("Kullanici Adinizi Giriniz: ");
            userName = inp.nextLine().trim();
            System.out.print("Sifrenizi Giriniz: ");
            password = inp.nextLine().trim();

            if (userName.equalsIgnoreCase("patika") && password.equals(storedPass)) { // Kullanıcı adı büyük/küçük harf duyarlı
                System.out.println("Merhaba X Bankamiza Hosgeldiniz!");
                do {
                    System.out.println("1.Para Cekme \n" + "2.Para Yatirma \n" + "3.Bakiye Sorgulama \n" +  "4.Cikis Yapiniz");
                    System.out.print("Lutfen Yapmak istediginiz islemin sayisini seciniz : ");
                    select = inp.nextInt();
                    inp.nextLine(); // buffer log clear !

                    switch (select) {
                        case 1:
                            System.out.print("Para cekilecek tutari giriniz :");
                            price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz!");
                            } else {
                                balance -= price;
                                System.out.println("Islem basarili. Kalan bakiye:" + balance);
                            }
                            break;
                        case 2:
                            System.out.println("Para yatirilacak tutari giriniz: ");
                            price = inp.nextInt();
                            balance += price;
                            System.out.println("Islem basarili. Guncel bakiye: " + balance);
                            break;
                        case 3:
                            System.out.println("Bakiye miktari: " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar gorusuruz! ");
                            break;
                        default:    // hiçbir case eşleşmezse burası çalışır
                            System.out.println("Yanlis bir secim yaptiniz! ");
                            break;
                    }
                }
                while (select != 4);

                break;  // oturumu sonlandır, programı kapat

            } else {
                right--;
                System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz.");
                if (right > 0) {
                    System.out.println("Kalan Hakkiniz: " + right);
                } else {
                    // hak bittiyse şifre yenileme seçeneği ver
                    System.out.println("Hesabiniz bloke olmustur lutfen Banka ile iletisime gecip sifre yenileyiniz! ");
                    System.out.println("Yeni sife girmek ister misiniz ? (evet/hayir) ");
                    String result = inp.nextLine().toLowerCase();

                    if (result.equals("evet")) {
                        while (true) {
                            System.out.print("Yeni sifrenizi giriniz: ");
                            String newPassword = inp.nextLine();

                            if (newPassword.equals(storedPass)) {
                                System.out.println("eski sifreyle aynisini girdiniz baska sifre giriniz!");
                            } else {
                                storedPass = newPassword; // yeni şifre kaydedildi (RAM'de)
                                right = 3; // haklari tekrar ver, kullanici tekrar deneyebilsin
                                System.out.println("Sifreniz basariyla olusturuldu! Yeni sifrenizle tekrar giris yapiniz.");
                                break;
                            }
                        }
                        continue; // döngü bittikten sonra while(true) ile başa döner ve tekrar giriş ister
                    } else {
                        System.out.println("Cikis yapiliyor. Iyi gunler.");
                        break; // kullanıcı yenileme istemezse programı bitir
                    }
                }
            }
        }
        // inp.close(); // kapatma, çünkü System.in tekrar gerekebilir
    }
}

/* try-catch ile daha profesyonel Hali*/

//import java.util.Scanner;
//
//public class AtmBank {
//    public static void main(String[] args) {
//        int right = 3, select = 0, price, balance = 2000;
//        String userName, password;
//        String storedPass = "dev123"; // başlangıçta sabit şifre
//
//        Scanner inp = new Scanner(System.in);
//
//        while (true) {
//            System.out.print("Kullanici Adinizi Giriniz: ");
//            userName = inp.nextLine().trim();
//            System.out.print("Sifrenizi Giriniz: ");
//            password = inp.nextLine().trim();
//
//            if (userName.equalsIgnoreCase("patika") && password.equals(storedPass)) {
//                System.out.println("Merhaba X Bankamiza Hosgeldiniz!");
//
//                do {
//                    System.out.println("\n1. Para Cekme");
//                    System.out.println("2. Para Yatirma");
//                    System.out.println("3. Bakiye Sorgulama");
//                    System.out.println("4. Cikis Yap");
//                    System.out.print("Lutfen yapmak istediginiz islemi seciniz: ");
//
//                    try {
//                        select = Integer.parseInt(inp.nextLine().trim());
//                    } catch (NumberFormatException e) {
//                        System.out.println("Gecersiz secim. Lutfen sayi giriniz.");
//                        continue;
//                    }
//
//                    switch (select) {
//                        case 1:
//                            System.out.print("Para cekilecek tutari giriniz: ");
//                            try {
//                                price = Integer.parseInt(inp.nextLine().trim());
//                            } catch (NumberFormatException e) {
//                                System.out.println("Gecersiz tutar.");
//                                break;
//                            }
//                            if (price <= 0) {
//                                System.out.println("Pozitif bir tutar giriniz.");
//                            } else if (price > balance) {
//                                System.out.println("Bakiye yetersiz!");
//                            } else {
//                                balance -= price;
//                                System.out.println("Islem basarili. Kalan bakiye: " + balance);
//                            }
//                            break;
//                        case 2:
//                            System.out.print("Para yatirilacak tutari giriniz: ");
//                            try {
//                                price = Integer.parseInt(inp.nextLine().trim());
//                            } catch (NumberFormatException e) {
//                                System.out.println("Gecersiz tutar.");
//                                break;
//                            }
//                            if (price <= 0) {
//                                System.out.println("Pozitif bir tutar giriniz.");
//                            } else {
//                                balance += price;
//                                System.out.println("Islem basarili. Guncel bakiye: " + balance);
//                            }
//                            break;
//                        case 3:
//                            System.out.println("Bakiye miktari: " + balance);
//                            break;
//                        case 4:
//                            System.out.println("Tekrar gorusuruz!");
//                            break;
//                        default:
//                            System.out.println("Yanlis bir secim yaptiniz!");
//                    }
//                } while (select != 4);
//
//                break; // oturumu sonlandır, programı kapat
//
//            } else {
//                right--;
//                System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz.");
//                if (right > 0) {
//                    System.out.println("Kalan Hakkiniz: " + right);
//                } else {
//                    System.out.println("Hesabiniz bloke olmustur. Banka ile iletisime geciniz.");
//                    System.out.print("Yeni sifre girmek ister misiniz? (evet/hayir): ");
//                    String result = inp.nextLine().trim().toLowerCase();
//
//                    if (result.equals("evet")) {
//                        while (true) {
//                            System.out.print("Yeni sifrenizi giriniz: ");
//                            String newPassword = inp.nextLine().trim();
//
//                            if (newPassword.isEmpty()) {
//                                System.out.println("Sifre bos olamaz. Tekrar deneyin.");
//                                continue;
//                            }
//                            if (newPassword.equals(storedPass)) {
//                                System.out.println("Eski sifreyle ayni. Baska sifre giriniz!");
//                            } else {
//                                storedPass = newPassword; // yeni şifre kaydedildi (RAM'de)
//                                right = 3; // hakları yenile
//                                System.out.println("Sifreniz basariyla olusturuldu! Yeni sifrenizle tekrar giris yapiniz.");
//                                break;
//                            }
//                        }
//                        continue; // yeniden giriş ekranına dön
//                    } else {
//                        System.out.println("Cikis yapiliyor. Iyi gunler.");
//                        break; // programdan çık
//                    }
//                }
//            }
//        }
//
//        // inp.close(); // opsiyonel
//    }
//}