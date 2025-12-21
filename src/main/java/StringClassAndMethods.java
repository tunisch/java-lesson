public class StringClassAndMethods {
    public static void main(String[] args) {

        String str = "Patika.dev";
        String str2 = "patika.dev";
        String str3 = "Java";
        String str4 = "  Hello World  ";

        System.out.println("Original String: " + str);

        // length() method stringin uzunlugunu verir
        System.out.println("Length of str: " + str.length());

        // charAt() method belirtilen indexteki karakteri verir
        System.out.println("Character at index 3: " + str.charAt(3));

        // codePointAt() method belirtilen indexteki karakterin unicode degerini verir
        System.out.println("Code point at index 0: " + str.codePointAt(0));

        // codePointBefore() method belirtilen indexteki karakterden önceki karakterin unicode degerini verir
        System.out.println("Code point before index 5: " + str.codePointBefore(5));

        // compareTo() method iki stringi alfabetik olarak karsilastirir
        System.out.println("Compare str with str2: " + str.compareTo(str2)); // Case sensitive
        System.out.println("Compare str with str3: " + str.compareTo(str3));

        // compareToIgnoreCase() method iki stringi alfabetik olarak karsilastirir (ignore case)
        System.out.println("Compare str with str2 (ignoring case): " + str.compareToIgnoreCase(str2));

        // concat() method iki stringi birlestirir
        System.out.println("Concatenated string: " + str.concat(" Akademi"));

        // contains() method belirtilen stringin icerip icermedigini kontrol eder
        System.out.println("Does str contain 'dev'? " + str.contains("dev"));

        // contentEquals() method belirtilen stringin veya karakter dizisinin ile ayni karakter dizisini icerip icermedigini kontrol eder
        System.out.println("Is str equal to str2? " + str.contentEquals(str2));

        // copyValueof() method karakter dizisinin karakterlerini temsil eden bir dizi dondurur.
        char[] charArray = str.toCharArray();
        System.out.print("Character array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // endsWith() method belirtilen stringin veya karakter dizisinin ile bitip bitmedigini kontrol eder
        System.out.println("Does str end with 'dev'? " + str.endsWith("dev"));

        // equals() method belirtilen stringin veya karakter dizisinin ile ayni karakter dizisini icerip icermedigini kontrol eder
        System.out.println("Is str equal to str2? " + str.equals(str2)); //buyuk kucuk harf duyarlidir

        // equalsIgnoreCase() method belirtilen stringin veya karakter dizisinin ile ayni karakter dizisini icerip icermedigini kontrol eder (ignore case)
        System.out.println("Is str equal to str2 (ignoring case)? " + str.equalsIgnoreCase(str2));

        // format() method belirtilen yerel ayari, bicim dizesini ve bagimsiz degiskenleri kullanarak bicimlendirilmis bir dizi dondurur.
        String formattedString = String.format("My name is %s and I am %d years old.", "Alice", 30);
        System.out.println("Formatted string: " + formattedString);

        // getBytes() method bir diziyi adlandirilmis karakter kumesini kullanarak bir bayt dizisine donusturur. sonucu yeni bir bayt dizisinde saklar.
        byte[] byteArray = str.getBytes();
        System.out.print("Byte array: ");
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
        System.out.println();

        // getChars() method karakterleri bir diziden bir karakter dizisine kopyalar.
        char[] charArray2 = new char[str.length()];
        str.getChars(0, str.length(), charArray2, 0);
        System.out.print("Character array2: ");
        for (char c : charArray2) {
            System.out.print(c + " ");
        }
        System.out.println();

        // hashCode() bir dizenin karma kodunu verir.
        System.out.println("Hash code of str: " + str.hashCode());
        System.out.println("Hash code of str2: " + str2.hashCode());

        // indexOf() method bir dizede belirtilen karakterlerin ilk bulunan indisini verir.
        System.out.println("Index of 'a' in str: " + str.indexOf('a'));
        System.out.println("Index of 'dev' in str: " + str.indexOf("dev"));

        // intern() method aramayi belirtilen dizididen baslatarak, belirtilen karakterlerin ilk olusumununun bir dizge icindeki dizini dondurur.
        System.out.println("Interned string: " + str.intern());
        System.out.println("Interned string2: " + str2.intern());

        // isEmpty() method bir dizenin bos olup olmadigini kontrol eder.
        System.out.println("Is str empty? " + str.isEmpty());

        // join() method , birden fazla metni (String) alır ve aradaki ayırıcıyı (delimiter) kullanarak tek bir String haline getirir. Yani mantık şu:
        //“Bunları al, aralarına şunu koy, tek parça yap.”
        String joinedString = String.join("-", "apple", "banana", "cherry");
        System.out.println("Joined string: " + joinedString);

        // lastIndexOf() method bir dizede belirtilen karakterlerin son bulunan indisini verir.
        System.out.println("Last index of 'a' in str: " + str.lastIndexOf('a'));
        System.out.println("Last index of 'dev' in str: " + str.lastIndexOf("dev"));

        // matches() method normal bir ifadeye karsi bir eslesme icin bir dize arar ve eslesmeleri dondurur.
        System.out.println("Does str match 'Patika.dev'? " + str.matches("Patika.dev"));
        System.out.println("Does str match 'patika.dev'? " + str.matches("patika.dev"));

        // offsetByCodePoints() method belirtilen dizinden baslayarak, belirtilen sayida kod noktasina kaydirir ve yeni bir dizin dondurur.
        System.out.println("Offset by code points from index 0: " + str.offsetByCodePoints(0, 10));

        // regionMatches() method iki dizenin belirli bir bolumunun eslesip eslesmedigini kontrol eder.
        System.out.println("Region matches from index 0 to 3 " + str.regionMatches(true, 0, str2, 0, 3));

        // repeat() method bir dizgeyi belirtilen sayida tekrarlar.
        System.out.println("Repeated str: " + str.repeat(3));

        // replace() method bir dizgede belirtilen karakterlerin tum olusumlarini degistirir.
        System.out.println("Replaced 'a' with 'e': " + str.replace('a', 'e'));
        System.out.println("Replaced 'dev' with 'org': " + str.replace("dev", "org"));

        // replaceAll() method bir dizgede belirtilen karakterlerin tum olusumlarini degistirir.
        System.out.println("Replaced all 'a' with 'e': " + str.replaceAll("a", "e"));

        // replaceFirst() method bir dizgede belirtilen karakterlerin ilk olusumunu degistirir.
        System.out.println("Replaced first 'a' with 'e': " + str.replaceFirst("a", "e"));

        // reverse() method bir diziyi tersine cevirir.
        System.out.println("Reversed str: " + new StringBuilder(str).reverse());

        // split() method bir dizeyi bir alt dizeye boler.
        String sentence = "Java is a powerful language";
        String[] words = sentence.split(" ");
        System.out.print("Split words: ");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();

        // startsWith() method bir dizenin belirtilen karakter ile baslayip baslamadigini kontrol eder.
        System.out.println("Does str start with 'Pat'? " + str.startsWith("Pat"));

        // substring() method bir dizenin belirli bir bolumunu döndurur.
        System.out.println("Substring from index 4: " + str.substring(4));
        System.out.println("Substring from index 0 to 6: " + str.substring(0, 6));

        // strip() method bir dizenin basindaki ve sonundaki bosluklari kaldirir.
        System.out.println("Stripped str4: '" + str4.strip() + "'");

        // stripLeading() method bir dizenin basindaki bosluklari kaldirir.
        System.out.println("Stripped leading spaces from str4: '" + str4.stripLeading() + "'");

        // stripTrailing() method bir dizenin sonundaki bosluklari kaldirir.
        System.out.println("Stripped trailing spaces from str4: '" + str4.stripTrailing() + "'");

        // toCharArray() method bir dizeyi yeni bir karakter dizisine donusturur.
        char[] charArray3 = str.toCharArray();
        System.out.print("Character array3: ");
        for (char c : charArray3) {
            System.out.print(c + " ");
        }
        System.out.println();

        // toLowerCase() method bir dizeyi kucuk harflere donusturur.
        System.out.println("Lowercase str3: " + str3.toLowerCase());
        System.out.println("Lowercase str4: " + str4.toLowerCase());

        // toString() method bir String nesnesini degerini verir.
        System.out.println("String value of str: " + str.toString());  // string nesnesi zaten string oldugu icin ayni degeri verir. direkt str diye basilabilir !
        System.out.println("String value of str2: " + str2.toString());

        // toUpperCase() method bir dizeyi buyuk harflere donusturur.
        System.out.println("Uppercase str3: " + str3.toUpperCase());

        // trim() method bir dizenin basindaki ve sonundaki bosluklari kaldirir.
        System.out.println("Trimmed str4: '" + str4.trim() + "'");

        // valueOf() method bir degiskenin degerini String olarak dondurur.
        int num = 123;
        String numStr = String.valueOf(num);
        System.out.println("Value of int num as String: " + numStr);
    }
}
