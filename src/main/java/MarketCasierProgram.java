import java.util.Scanner;

public class MarketCasierProgram {
    public static void main(String[] args){

        double  armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut kac kilo ? : ");
        armut = input.nextInt();

        System.out.print("Elma kac kilo ? : ");
        elma = input.nextInt();

        System.out.print("Domates kac kilo ? : ");
        domates = input.nextInt();

        System.out.print("muz kaç kilo ? : ");
        muz = input.nextInt();

        System.out.print("patlıcan kaç kilo ? : ");
        patlican = input.nextInt();

        double toplam = armut * 2.14 + elma * 3.67 + domates * 1.11 + muz * 0.95 + patlican * 5.00 ;
        System.out.print("Toplam tutar : " + toplam);


    }
}
