//public class For {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
//    }
//}
//public class For {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i += 2) { // 2 ser arttirir. basta i =1 calisir sonra 10 dan kucukse for a girer sonra ekrana basilir sonra i +2 arttirli sonra 10 dan kucuk mu bakilir ekrana yazdirilir boyle devam eder 10 olana kadar.
//            System.out.println(i);
//        }
//        // Ayni islemi yapar ama while sonunu bilmedigimiz durumlarda kullanilir.
//        System.out.println("-------------");
//        int k = 1;
//        while(k <= 10){
//            System.out.println(k);
//            k += 2;
//        }
//    }
//}

/* other examples with Logic operators */
public class For {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0, j = 0; i < 5 || j < 5; ++i, j = i + 1) {
            sum += i;
        }
        System.out.println(sum);
    }
}