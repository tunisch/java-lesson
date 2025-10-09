public class Operatorler {
    public static void main(String[] args){
        int a = 5, b = 6, c = 5;
        boolean kosul1 = a == c;
        boolean kosul2 = a >= b;
        boolean sonuc = kosul1 || kosul2;
        boolean sonuc2 = kosul1 && kosul2;

        String str = sonuc ? "Doğru " : "Degil";
        // System.out.println("|| sonucu: " + sonuc);
        // System.out.println("&& sonucu: " + sonuc2);
        // System.out.println("! sonucu: " + (!sonuc));
        /*Kosul Operatorleri*/
        System.out.println(str);
        int result = sonuc ? 1 : 0;
        System.out.println(result);
    }
}
