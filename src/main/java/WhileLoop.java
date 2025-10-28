/* Basic WhileLopp Examp */
//public class WhileLoop {
//    public static void main(String[] args) {
//
//        int i = 1;
//
//        System.out.println("Program basladi.");
//        while(i <= 5){ // while ici her zaman true olmaliki dongu calisabilsin!!
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("Program bitti.");
//    }
//}

/* Nested While Loop Example */

//public class WhileLoop {
//    public static void main(String[] args) {
//        int i = 1;
/// /      int k = 1;
//        System.out.println("Program basladi.");
//        while(i <= 5){ // while ici her zaman true olmaliki dongu calisabilsin!!
//            System.out.println(i);
//            int k = 1; //ic ice dongu olmasi icin ic dongu degeri burda tanimlariz.
//            while(k <= 10){
//                System.out.print(k + ",");
//                k+=2; //k = k + 2 demektir k yi ikiser arttir
//            }
//            System.out.println();
//            i++; // i = i + 1 demektir iyi birer arttir demektir.
//        }
//        System.out.println("Program bitti.");
//    }
//}

/* example to Password with While : The user asks the programmer until he enters the correct password */

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int password;
        boolean isPasswordSuccess = false; // paraola durumu false ise kullanicidan sifre girmesini saglaycagiz o yuzden false girdik.

        Scanner inp = new Scanner(System.in);

        while (!isPasswordSuccess) { // while ici (condition) her zaman true olmaliki dongu calisabilsin!!
            System.out.print("Sifrenizi giriniz: "); // Tanimlamayi while icinde yapiyoruz !!
            password = inp.nextInt();
            if (password == 123) {
                System.out.println("Dogru");
                isPasswordSuccess = true; //eger true olursa while ici false olcak ve while dan cikmis olcaz o yuzden sonsuz dongu olmasin diye yaptik!!
            } else {
                System.out.println("Yanlis");
            }

        }
    }
}

























