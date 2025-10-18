public class SwitchCase {
    public static void main(String[] args) {
        int points = 6;
        switch(points)
        {
            case 6: ; //komut ve break yok bu yuzden derleyici burayi direkt gecer.
            case 7: System.out.println("Java");break; // break var komut var o yuzden ilkde burasi oldugu icin burayi derler.(yanlis olsa bile)
            case 8: ;
            case 9: System.out.println("101");break;
            case 10: System.out.println("Patika"); break;
            default: System.out.println("Dev");
        }

    }
}
