import java.util.Scanner;

public class WeatherSituation {
    public static void main(String[] args) {

        double heat;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sicakligi giriniz : ");
        heat = inp.nextDouble();

//        if (heat < 5 ){
//            System.out.println("Kayak yapabilirsinzi sicaklik 5 derceden kucuk : " + sicaklik);
//        }
//        // NOTE : 💡 Yani Java’da Python’daki 5 < x < 15 gibi kısa yazım yok, her zaman mantıksal operatör kullanmanız gerekiyor.
//        if ( heat >= 5  && heat <= 15 ){
//            System.out.println(" Tam sinemalik hava canim!... ");
//        }
//        if (heat > 15   &&  heat <= 25){
//            System.out.println("Piknik yapmalik hava kanka");
//        }
//        if (heat > 25 ){
//            System.out.println("Yuzme etkinligi yapilabilir");
//        }

        /* Zorlastirilmis hali */

        if (heat < 5) {
            System.out.println("Kayak yapmaya gidebilirsiniz. ");
        } else if (heat <= 25) {
            if (heat <= 15) {
                System.out.println("Sinemaya gidebilirsiniz");
            }
            if (heat >= 10 ) {
                System.out.println("Piknige gidebilirsiniz.");
            }
        } else {
            System.out.println("Yuzme etkinligi yapilabilir");
        }
        inp.close(); // scanner'ı kapatmak iyi bir alışkanlıktır.
    }
}













