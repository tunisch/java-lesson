import java.util.Scanner;
import java.lang.Math;

public class CircleAreaPerimeter {
    public static void main (String [] args){
        double yaricap, merkezAcisi, alan, cevre, dilimAlan, pi = 3.14 ;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin Yaricapini giriniz : ");// yazi gelir
        yaricap = input.nextDouble();// sonra yazinin inputu girilir.

        System.out.print("Dairenin Merkez acisini giriniz : ");// sonra tekrar yazi gelir
        merkezAcisi = input.nextDouble();// sonra bu yazini inputu girilir.

        // alan =  Math.PI * Math.pow(yaricap, 2);
        alan = pi * Math.pow(yaricap, 2);

        // cevre = 2 * Math.PI * yaricap;
        cevre = 2 * pi * yaricap;

        dilimAlan = (pi * Math.pow(yaricap, 2) * merkezAcisi) / 360;

        System.out.println("Dairenin Alani : " + alan);
        System.out.println("Dairenin Cevresi : " + cevre);
        System.out.println("Daire Diliminin Alani : " + dilimAlan);
    }
}
