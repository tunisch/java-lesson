/* Pratik - Palindromik Kelimleri Bulan Program */
/*
Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".

Örnek : abba , asa , kavak, kayak
*/

import java.util.Scanner;

// palindromik kelimeyi bulmak icin iki farkli yontem var biri string builder ile digeri manuel olarak karakter karakter kontrol etmek !
// 1. yontem  manuel olarak karakter karakter kontrol eden yontem daha az ram harcar cunku yeni bir string olusturmaz !
// string builder ile yapilan yontem daha cok ram harcar cunku her seferinde yeni bir string olusturur !
public class PolindromikWordsFind {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
 // genelde tercih edilmez cok ram harcar cunku her seferinde yeni bir string olusturur !
    // string i tersine cevirip kontrol eder !
    // daha az tercih edilir cunku ram harcar !
    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("abba")); // true
        System.out.println(isPalindrome2("kavak")); // true

        // kullanicidan kelime alalim ve polindromik mi degil mi kontrol edelim
        String words;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");

        words = inp.nextLine().trim().toLowerCase(); // kullanicidan cumle alindi ve bas ve sondaki bosluklar trim ile atildi. yani kucuk buyuk harf duyarsiz hale getirmek icin ne yaparim toLowerCase veya toUpperCase yaparim boylece kucuk buyuk harf farki kalmaz!
// terchihe bagli olarak iki yontemden birini kullanabiliriz !

        //reverse () methodu kullanalim.;
        if (words.equals(new StringBuilder(words).reverse().toString())) {  // new StringBuilder () bize “mutable” yani değiştirilebilir string elde etmemize olanak tanır. Böylece hafızada her seferinde yeni bir alan açılmadan var olan alan üzerinde değişiklik yapılabilir.
            System.out.println("Girdiginiz kelime polindromik bir kelimedir.");
        } else {
            System.out.println("Girdiginiz kelime polindromik bir kelime degildir.");
        }
    }
}

