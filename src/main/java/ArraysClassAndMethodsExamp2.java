/*
        Pratik - Dizideki Maksimum ve Minimum Değerleri Bulan Program
 */


import java.util.Scanner;

public class ArraysClassAndMethodsExamp2 {
    public static void main(String[] args) {
        int[] list = {-2, -23, 123, 4, 45, 6, 4, 7, 2, 1};
        // listeden max min degeri bulmak icin herhangi bir deger seciyoruz bunu i(indeksde karsilik gelen deger ile karsilastircaz for icinde)
        int min = list[0];
        int max = list[0];
        // for each ile arrayin elemanlari arasinda gezebiliriz for a gerek kalmaz!!
//        for (int i = 0; i < list.length; i++) {
//            System.out.print(list[i] + " ");
//        }
//        System.out.println();
        /* for-each */
        for (int i : list) {
            System.out.print(i + " ");
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("\nEn buyuk deger: " + max);
        System.out.println("En kucuk deger: " + min);


        /* Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız. */
        //Dizi : {15,12,788,1,-1,-778,2,0}
        //Girilen Sayı : 5
        //Girilen sayıdan küçük en yakın sayı : 2
        //Girilen sayıdan büyük en yakın sayı : 12

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayinizi giriniz: ");
        int x = inp.nextInt();

        for (int i : list) {
            if (i < x) {
                // x'ten küçüklerin en büyüğü
                if (i > min || min >= x) {
                    min = i; // tek tek deger atar ve basa dondugunde min degeri bir onceki i degeri olur
                }
            }
            if (i > x) {
                // x'ten büyüklerin en küçüğü
                if (i < max || max <= x) {
                    max = i;
                }
            }
        }
        System.out.println(x + " sayısindan küçük en yakın sayı : " + min);
        System.out.println(x + " sayisindan buyuk en  yakin sayi : " + max);
    }
}
