import java.util.Scanner;
public class JavaStdinAndStdout {
    public static void main(String[] args) {

            int sayi;
            double sayi2;
            String  cumle;

            Scanner inp = new Scanner(System.in);

            sayi = inp.nextInt();
            sayi2 = inp.nextDouble();
            /* buffer temizleme eger nextInt() ya da nextDouble() kulandiktan sonra nextLine()
            kullancaksak oncesi bir nextLine() daha kullanarak buffer temizlemesi \n temizlemesi yapmamiz gerekir.*/
            inp.nextLine(); //buffer temizleme
            cumle = inp.nextLine();

            System.out.println("String: "+ cumle);
            System.out.println("Double: "+ sayi2);
            System.out.println("Int: "+ sayi);


            inp.close();
    }
}

