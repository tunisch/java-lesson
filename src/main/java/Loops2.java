import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int q,a,b,n;

        Scanner inp = new Scanner(System.in);
        System.out.print("q degeri giriniz: ");
        q = inp.nextInt();
        for(int i = 0; i < q ; i++){
            System.out.print("a degeri giriniz: ");
            a = inp.nextInt();

            System.out.print("b degeri giriniz: ");
            b = inp.nextInt();

            System.out.print("n degeri giriniz: ");
            n = inp.nextInt();

            int sum = a;

            for(int t  = 0; t< n; t++){

                sum += (int) (Math.pow(2,t) * b);

                System.out.print(sum + " ");
            }
            System.out.println();
        }
        inp.close();
    }
}

