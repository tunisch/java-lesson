import java.util.Arrays;

/* Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program */
public class ArrayClassAndMethodExamp8 {

    static boolean isDuplicate(int[] list, int index, int value) { // Java’da parametreler küçük harfle başlar:
        for (int i = 0; i < index; i++) {
            if (list[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 10, 5, 2, 5, 13, 10, 1, 8, 7};

        int againIndex = 0; // tekrar eden eleman sayısı
        int[] againList = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j] && arr[j] % 2 == 0) {
                    if (!isDuplicate(againList, againIndex, arr[j])) { // ! => demek once Duplicate methodu calsitirilri cikan sonuc tersine cevrilir demek yani anlamca benzeri yok ise anlami cikacak benzer cikanlar da sonuc true cikinca !isDuplicate den dolayi false yapilir assagida ekleme yapilmamis olur
                        againList[againIndex] = arr[j];
                        againIndex++; // Bir sayı, dizide İLK KEZ tekrar ettiği anda againIndex bir artar.
                    }
                    break;
                }
            }
        }
        for (int i = 0; i < againIndex; i++) {
            System.out.print(againList[i] + " ");
        }
    }
}
