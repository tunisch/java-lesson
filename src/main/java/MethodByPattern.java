//import java.util.Scanner;
//
//public class MethodByPattern {
//
//    static void pattern(int n) {
//        System.out.print(n + " "); // 1. giderken yaz
//
//        if (n <= 0) {
//            // Dip noktaya ulaştık, geri dönüyoruz
//            return; // altidnakiler cali smaz basa dondurur!!
//        }
//
//        pattern(n - 5);
//
//        // Dönüş yolunda eski değerlere geri çıkıyoruz
//        System.out.print(n + " ");  // 2. dönerken yaz
//    }
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("N Sayisi: ");
//        int n = input.nextInt();
//
//        pattern(n);
//    }
//}

import java.util.Scanner;

    public class MethodByPattern {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("N Sayisi: ");
            int n = input.nextInt();

            pattern(n);
        }

        static void pattern(int n) {
            System.out.print(n + " ");

            if (n <= 0) {
                returnBack(n + 5);
            } else {
                pattern(n - 5);
            }
        }

        static void returnBack(int n) {
            System.out.print(n + " ");
            if (n == 16) {
                return;
            }
            returnBack(n + 5);
        }


    }