public class PolindromNum {
    static boolean ispolindrom(int number) {

        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            System.out.println("Sayi => " + number); // debug code
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("Yeni sayi => " + reverseNumber); // debug code
            temp /= 10;
        }
        // (simplify hali basit hali) ->  return number == reverseNumber;
        if (number == reverseNumber) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(ispolindrom(929));
    }
}
