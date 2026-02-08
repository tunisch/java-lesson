// Ring bize ne oldugunu anlatir figther ile etkilesimleri vs cikan sonuclari , yani Ekrana yazmak onun görevidir.
public class Ring {
    Fighter f1;
    Fighter f2;

    Fighter current;
    Fighter opponent;

    int minWeight;
    int maxWeight;
    int roundCount = 1;


    // Ring de Constructor olsutrmamizim sebebi Ring = iki dövüşçünün dövüştüğü yer var olmak icin iki douscuye ihtiyaci var !!
    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) { // Ring nesnesi olusturup icinde fighter lari koymaya yarar.
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight; // Fighter kendi kilosunu bilir Ama “rakiple uyumlu mu?” sorusu Ring’e aittir ve agirliklari Ringte yerlestirdik
        this.maxWeight = maxWeight;

    }
    // this.f1 neden deriz ? > this.f1 → sınıfın alanı (field) cagirir eger checkWeight icinde parametre Figther f1 deseydik karismasin diye boyle ayirt edilir o zaman sadece f1 → metodun içindeki parametre / lokal değişken yazardik (parametresi olursa f1.weight yazilmali ) field(this.f1) ile karismasin diye
    boolean checkWeight() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight)
                && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean startFight() {
        if (checkWeight()) { // agirliklar esit ise match baslar
            double random = Math.random(); // random sayi olusturulru adaletli olsun diye
            if (random < 0.5) { // eger random sayi %50 den kucukse
                current = f1; // f1 baslasin
            } else { // 50 den buyuk ise f2 baslasin bu da esit oranda duruma gore izlenim verir.
                current = f2;
            }

        } else {
            System.out.println(this.f1.name + " ve " + this.f2.name + " ayni siklette olunmadigindan mac yapilamaz !");
            return false;
        }
        System.out.println("Mac basladi!");
        System.out.println("Ilk vuran " + current.name);

        while (!round()) {
            printScore();
        }
        return true; // mac bitti anlamina gelir.(round bitti daha dogrusu)
    }

    // round() parametre almamalı cunku Ring zaten yukarda field olarak Fighter f1,f2 biliyor
    boolean round() {
        if (current == f1) {
            opponent = f2;
        } else {
            opponent = f1;
        }

        current.hit(opponent);
        // current = vuran , opponent = vurulan
        System.out.println(current.name + " , " + opponent.name + " den " + opponent.damage + " hasar aldi ");

        if (isWin(opponent)) {
            return true;
        }

        current = opponent;

        if (current == f2) {
            opponent = f1;
        } else {
            opponent = f2;
        }

        current.hit(opponent);
        // current = vuran , opponent = vurulan
        System.out.println(opponent.name + " , " + current.name + " den " + current.damage + " hasar aldi ");
        if (isWin(opponent)) {
            return true;
        }
        roundCount++;
        return false; // round bitt ama kazanan yok !
    }


    boolean isWin(Fighter opponent) {
        if (opponent.health <= 0) {
            System.out.println(current.name + " kazandı!");
            return true;
        }
        return false; //
    }


    void printScore() {
        System.out.println("---- ROUND " + roundCount + " ----");
        System.out.println(this.f1.name + "'nin Saglik : " + this.f1.health);
        System.out.println(this.f2.name + "'nin Saglik : " + this.f2.health);
    }
}