/*
- Armstrong Sayı Nedir ? :
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.

1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634

54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748
 */

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = inp.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int result = 0;

        while (true) {

            while (tempNumber != 0) {
                tempNumber /= 10;
                basNumber++; // 407 girersek 3 kere calisacak basamak numb 3 olcak sonra bitecek while assagi gececek
            }
//        System.out.println(basNumber);
            tempNumber = number; // 0 olmustu simdi 407 tekrar yaptik!!
            while (tempNumber != 0) {
                int basValue = tempNumber % 10; // 407 nin 10 ile bol kalan 7 value ilk 7 olcak
                int basPow = 1;
                for (int i = 1; i <= basNumber; i++) {
                    basPow *= basValue;
                }
                result += basPow;
                tempNumber /= 10;
//            System.out.println(tempNumber);
            }
            if (result == number) {
                System.out.println(number + " sayisi bir Armstrong sayidir. ");
                break; // Armstrong bulundu, döngü biter

            } else {
                System.out.println(number + " bir Armstrong sayısı değildir, tekrar deneyin.\n");
            }
        }
    }
}
