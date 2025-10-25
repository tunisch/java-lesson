import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {

        int birthYear;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dogum tarıhınızı giriniz: ");
        birthYear = inp.nextInt();

        int result = birthYear % 12;

        switch (result)
        {
            case 0: System.out.println("Your chınese zodiac: Maymun ");
                break;
            case 1: System.out.println("Your chınese zodiac: Horoz ");
                break;
            case 2: System.out.println("Your chınese zodiac: Dog ");
                break;
            case 3: System.out.println("Your chınese zodiac: Pig ");
                break;
            case 4: System.out.println("Your chınese zodiac: Mouse ");
                break;
            case 5: System.out.println("Your chınese zodiac: Okuz ");
                break;
            case 6: System.out.println("Your chınese zodiac: Tiger ");
                break;
            case 7: System.out.println("Your chınese zodiac: Rabbıt ");
                break;
            case 8: System.out.println("Your chınese zodiac: Dragon ");
                break;
            case 9: System.out.println("Your chınese zodiac: Snake ");
                break;
            case 10: System.out.println("Your chınese zodiac: Horse ");
                break;
            case 11: System.out.println("Your chınese zodiac: Sheep ");
                break;
            default:
                System.out.println("Hatali secim");
                break;  // ← isteğe bağlı ama önerilir
        }
    }
}
