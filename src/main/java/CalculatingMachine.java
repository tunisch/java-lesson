import java.util.Scanner;

public class CalculatingMachine {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("ilk Sayiyi giriniz :");
        n1 = input.nextInt();
        System.out.print("Ikinci Sayiyi giriniz :");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciminiz : ");

        select = input.nextInt();
        /* Switch with using */
        switch (select) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Cikarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Carpma : " + (n1 * n2));
                break;
            case 4:
                    if (n2 != 0){
                        System.out.println("Bolme : " + (n1 / n2));
                    }else {
                        System.out.println("Ikinci Sayiyi sifir secmeyiniz!!! ");
                    }
                break;
            default:
                System.out.println("Hatali secim");
                break; // ← isteğe bağlı ama önerilir

        }

        /* If else with using */
//        if (select == 1){
//            System.out.println("Toplam : " + (n1 + n2));
//        }else if (select == 2) {
//            System.out.println("Cikarma : " + (n1 - n2));
//        }else if (select == 3) {
//            System.out.println("Carpma : " + (n1 * n2));
//        }else if (select == 4) {
//            if (n2 != 0) {
//                System.out.println("Bolme : " + (n1 / n2));
//            }else {
//                System.out.println("Ikinci Sayiyi sifir secmeyiniz!!! ");
//                }
//        }else {
//            System.out.println("Hatali secim");
//        }
   }
}
