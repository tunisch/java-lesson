import java.io.*;
import java.util.*; // Scanner gibi utility sınıfları için

public class HackerrankJava1DArrayExamp {


    /*
     * Bu metot şunu sorar:
     * "Şu an index konumundayım.
     *  Buradan oyunu kazanabilir miyim?"
     *
     * true  -> kazanılabilir
     * false -> bu yoldan kazanılamaz
     */

    static boolean canWin(int leap, int [] game,int index, boolean [] visited){

        // 🟢 KAZANMA DURUMU
        // Eğer dizinin dışına çıktıysak (sonu geçtiksek),
        // oyun kazanılmış demektir.

        if(index >= game.length) return true;

        // 🔴 KAYBETME / GEÇERSİZ DURUMLAR
        // 1) index < 0        -> dizinin soluna düştük
        // 2) game[index] == 1 -> duvara / yasak alana geldik
        // 3) visited[index]  -> buraya daha önce geldik (sonsuz döngü riski)

        if(index < 0 || game[index] == 1 || visited[index]) return false;

        // 📌 Bu noktaya GELDİĞİMİZİ işaretliyoruz
        // Aynı index'e tekrar gelirsek,
        // bu yolu tekrar denemeyeceğiz.

        visited[index] = true; // Ben buraya geldim. Eğer bir daha buraya gelirsem, aynı yolu tekrar denemeyeceğim.

        /*
         * Şimdi 3 ihtimali deniyoruz:
         *
         * 1) index + 1   -> bir adım ileri
         * 2) index - 1   -> bir adım geri
         * 3) index + leap-> zıplama
         *
         * || (OR) kullanmamızın sebebi:
         * - Eğer ilk çağrı true dönerse
         * - Java diğerlerini ÇAĞIRMAZ (short-circuit)
         * - Gereksiz hesap yapılmaz
         *
         * Yani:
         * "Bu yollardan EN AZ BİRİ kazandırıyorsa,
         *  ben de true dönerim"
         */

        return canWin(leap, game, index + 1,visited) || canWin(leap,game, index - 1, visited) || canWin(leap, game, index + leap, visited); // || yapmamizin sebebi ilki true gelince diger ihtimaller denenmeyip  diğerlerini çağırmaz gereksiz hesap yapmaz

    }

    public static void main(String[] args) {

        // Kullanıcıdan girdi almak için Scanner
        Scanner inp = new Scanner(System.in);

        // Kaç tane test case var
        int q = inp.nextInt();

        // Her test case için döngü
        while (q > 0) {

            // Dizinin uzunluğu
            int n = inp.nextInt();

            // Zıplama mesafesi
            int leap = inp.nextInt();

            // Oyun dizisi (0 = geçilebilir, 1 = engel)
            int [] game = new int[n];

            // visited dizisi:
            // Her index'e daha önce gidip gitmediğimizi tutar
            // Başlangıçta hepsi false
            boolean[] visited = new boolean[game.length];

            // Oyun dizisini dolduruyoruz
            for(int i = 0; i < n; i++){
                game[i] = inp.nextInt();
            }

            // Oyunu index 0'dan başlatıyoruz
            // true -> YES
            // false -> NO
            System.out.println(canWin(leap, game,0, visited) ? "YES" : "NO");

            // Bir test case bitti geriye dogru gideriz
            q--;
        }
    }
}

