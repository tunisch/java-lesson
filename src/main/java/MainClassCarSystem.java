//public class MainClassCarSystem {
//    public static void main(String[] args) {
//        Car audi = new Car("Audi A3", 10,"blue"); // Nesneler new ile olusturulur Car sinifindan audi nesnesi olusturduk

/// /        audi.model = "Audi A3"; // nokta ile Car sinifin niteliklerine erismis oluyor audi nesnesi ile/
//        audi.type = "Sports"; // boyle yaparsak class icindeki constructor da tanimlanan nitelik nesne de farklilastigi icin en son nesnedeki kabule dilmis olur !!
//        audi.speed = 10; // artik Car constractor icinde tanimlariz daha guzel gozukur
//        audi.increaseSpeed(20);
//        audi.decreaseSpeed(10);
//        System.out.println(audi.model + " Hizi : " + audi.speed); // nokta ile nesneIsmi (.) model der isek ekrana mdoeli bastirabiliriz
//        audi.printSpeed(); // printSpeed metodu ile sout yapmis oluruz bu daha guzel gozukur
//        audi.printInfo();
//        Car bmw = new Car(); // Car sinifindan bmw adinda yeni bir Car uret demis oluyoruz
//        bmw.increaseSpeed(20);
//        bmw.increaseSpeed(25);
//        bmw.increaseSpeed(60);
//        bmw.increaseSpeed(100); //  limit 180 gecince en son hizda kaldi arttirma olmadi
//        bmw.printSpeed();
//
//        System.out.println(bmw.model + " Hizi : " + bmw.speed); // boyle yazmak yerine printSpeed ile sout yazmadan sadce cagirarak yazilabilir
//
//        Car mercedes = new Car();
//        mercedes.model = "Mercedes sls amg";
//        mercedes.speed = 30;
//        mercedes.printSpeed();
//        System.out.println(mercedes.model + " Hizi : " + mercedes.speed);
//

/* Daha temiz clean code hali */

public class MainClassCarSystem {
    public static void main(String[] args) {
        Car audi = new Car("Audi A3", 10, "blue"); // Nesneler new ile olusturulur Car sinifindan audi nesnesi olusturduk
        audi.printInfo();


        Car bmw = new Car(); // Car sinifindan bmw adinda yeni bir Car uret demis oluyoruz

        // Sinifa ait davranislara erismek icin olusturualn nesnenin sonuna (.) konulur!
        bmw.increaseSpeed(20);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(60);
        bmw.increaseSpeed(100); //  limit 180 gecince en son hizda kaldi arttirma olmadi


        Car mercedes = new Car();
        mercedes.model = "Mercedes sls amg";
        mercedes.speed = 30;


    }
}
