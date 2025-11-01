/* Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz. */

import java.util.Scanner;

public class ExponentialNum {
    public static void main(String[] args) {

        int n, k ;

        Scanner inp = new Scanner(System.in);

        System.out.print("Ussu Alinacak Sayiyi giriniz: ");
        n = inp.nextInt();

        System.out.print("Us olacak Sayiyi giriniz: ");
        k = inp.nextInt();

        // 3^4 = 3 * 3 * 3 * 3
        // yani i  k kadar carpilcak yani dongu k kadar doncek
        int total = 1;
        if ( k < 0){
            System.out.println("Us olacak degeri negatif girmeyiniz!! ");
        }else {
            for (int i = 1; i <= k; i++) {
                total *= n; //ussu alinacak sayi ile carpiyoruz
            }
            System.out.println("Sayinin Us degeri: " + total);
        }
    }
}
