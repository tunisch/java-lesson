import java.util.Scanner;

public class ZodiacSignFinderProgram {
    public static void main(String[] args) {
        int day, month;
        String sign = ""; // boş string ile başlatıyoruz
//            Çünkü Java’da her değişken kullanılmadan önce mutlaka bir başlangıç değeri (initialize) almalıdır.
//            Yani, bir değişken tanımlayıp ona değer atamazsan ve sonra kullanırsan, Java hata verir.
        boolean validDate = true; // geçerli tarih kontrolü

        Scanner inp = new Scanner(System.in);

        System.out.print("Mont : ");
        month = inp.nextInt();

        System.out.print("Day : ");
        day = inp.nextInt();

// NOTE : Eger if else uzun oluyorsa ve tekrarlayan durumsa ortak variable sahipse "sign" gibi if else Ternary operatore cevrilebilir.
//    if(day <= 21){
//                    sign = "Capricorn";
//                }else {
//                    sign = "Aquarius";
//                }
//  sign = (day <= 21) ? "Capricorn" : "Aquarius"; gibi olcak

        if (month == 1) {
            if (day >= 1 && day <= 31){
                sign = (day <= 21) ? "Capricorn" : "Aquarius";
            }else validDate = false; // NOTE : tek satirda { } parantez kullanmayabiliriz.
        } else if (month == 2) {
            if (day >= 1 && day <= 29) { // artık yıllar için 29 eklenebilir
                sign = (day <= 19) ? "Aquarius" : "Pisces";
            } else validDate = false;
        } else if (month == 3) {
            if (day >= 1 && day <= 31) {
                sign = (day <= 20) ? "Pisces" : "Aries";
            } else validDate = false;
        } else if (month == 4) {
            if (day >= 1 && day <= 30) {
                sign = (day <= 20) ? "Aries" : "Taurus";
            } else validDate = false;
        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                sign = (day <= 21) ? "Taurus" : "Gemini";
            } else validDate = false;
        } else if (month == 6) {
            if (day >= 1 && day <= 30) {
                sign = (day <= 22) ? "Gemini" : "Cancer";
            } else validDate = false;
        } else if (month == 7) {
            if (day >= 1 && day <= 31) {
                sign = (day <= 22) ? "Cancer" : "Leo";
            } else validDate = false;
        } else if (month == 8) {
            if (day >= 1 && day <= 31) {
                sign = (day <= 22) ? "Leo" : "Virgo";
            } else validDate = false;
        } else if (month == 9) {
            if (day >= 1 && day <= 30) {
                sign = (day <= 22) ? "Virgo" : "Libra";
            } else validDate = false;
        } else if (month == 10) {
            if (day >= 1 && day <= 31) {
                sign = (day <= 22) ? "Libra" : "Scorpio";
            } else validDate = false;
        } else if (month == 11) {
            if (day >= 1 && day <= 30) {
                sign = (day <= 21) ? "Scorpio" : "Sagittarius";
            } else validDate = false;
        } else if (month == 12) {
            if (day >= 1 && day <= 31) {
                sign = (day <= 21) ? "Sagittarius" : "Capricorn";
            } else validDate = false;
        }else {
            validDate = false;
        }
        // validDate = true olursa yani yukardaki ifler calisirsa assagidaki if calisacak ,
        // calismazsa assagidaki else calismis olur.

        if (validDate) {
            System.out.println("Your Zodiac sign is: " + sign);
        }else {
            System.out.println("Invalid date");
        }
        inp.close();
    }
}
