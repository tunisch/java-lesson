public class SwitchCase {
    public static void main(String[] args) {

        int points = 6;
        // points değişkenine 6 değerini atadık.

        switch(points) {
            // switch yapısı burada points değerini kontrol eder.
            // Java, points'in değerine uygun case etiketine atlar.

            case 6:
                // Burada noktalı virgül (;) dışında hiçbir komut yok.
                // break olmadığı için Java "tamam burası boşmuş" deyip aşağıya kayar.
                // Bu olaya "fall-through" denir.

            case 7:
                // Çünkü yukarıda break yoktu, buraya gelir.
                System.out.println("Java");
                // Konsola "Java" yazar.

                break;
            // break sayesinde buradan çıkar ve switch bloğundan atlar.

            case 8:
                // Bu case’e asla gelinmez çünkü program break ile yukarıda çıktı.
                // Eğer points 8 olsaydı buradan aşağı kayardı.

            case 9:
                System.out.println("101");
                break;

            case 10:
                System.out.println("Patika");
                break;

            default:
                System.out.println("Dev");
                // Hiçbir case eşleşmezse burası çalışır.
        }
    }
}

/* break; → switch bloğu biter.
- switch(6) → case 6: bulunur.
 Komut yok, break yok → bir alt case’e geçilir.

- case 7: → System.out.println("Java");
- Konsolda Java yazdırılır.
*/