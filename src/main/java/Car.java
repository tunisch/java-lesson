//class Car {
//    //Nitelikler
//    String type = "Sedan"; // burdak gibi bastan varsayilan olarakta ayarlanabilir!
//    String model = "TEST";
//    String color;
//    int speed;
//    int speedLimit = 180;
//
//    // Constructor (niteliklerden sonra tanimlanir)
//    Car(String model,int speed){
           // Varsayilan degerleri constructor icersiine girmek daha faydalidir.
//        // sinifa ait degiskenlerde(niteliklerde davranislar icinde) this. koymamiz gerekir
//        this.model = model; // burada parametre dissin diye sabit olan model this.model yani class icindeki bunu Car icindeki constructora esitleriz ve nesnede farkli kullanmsi oluruz
//        System.out.println(model);
//        //hatta class niteliklerini sabite esitlemek istersek bunu constructor icinde yapmamiz daha clean code yapar.
//
//    }
//    //Davranislar
//    void increaseSpeed(int increment) {
//        if ((speed + increment) < speedLimit) { // eger hiz speedLimitten buyuk olunca buraya girmez ve arttirma olmamis olur!
//            speed += increment;
//        }
//    }
//
//    void decreaseSpeed(int decrease) {
//        if (speed > 0) {
//            speed -= decrease;
//        }
//    }
//
//    void printSpeed() { // bu metodun amaci hizi ekrana bastirmaya yarar
//        System.out.println(model + " Hizi : " + speed); // ("Hiziniz: " + speed) bu haliyle sadce hiziniz basar ama modle olmaz  ama (model + ) yaparsak artik nesnelerde sout kullanmadan direk method adi ve modelleri ile bastirabilirz ayni recursive method gibi olcak
//    }
//}

/* Bu gosterim daha clean code dur daha dogrudur */
class Car {
    //Nitelikler
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    // Constructor (niteliklerden sonra tanimlanir)
    Car(String model,int speed,String color){
        this.type = "Sedan"; // bu gosterim daha dogrudur
//      this.model = "TEST"; // bu gosterim daha dogrudur
        this.model = model;
        this.speed = speed;
        this.color = color;
        this.speedLimit = 180;
        System.out.println("Parametreli kurucu olustu");

    }
    Car(){
        System.out.println("Bos kurucu metodu olsutu");
    }
    //Davranislar
    void increaseSpeed(int increment) {
        if ((this.speed + increment) < this.speedLimit) { // eger hiz speedLimitten buyuk olunca buraya girmez ve arttirma olmamis olur!
            this.speed += increment;
        }
    }

    void decreaseSpeed(int decrease) {
        if (this.speed > 0) {
            this.speed -= decrease;
        }
    }

    void printSpeed() { // bu metodun amaci hizi ekrana bastirmaya yarar
        System.out.println(this.model + " Hizi : " + this.speed); // ("Hiziniz: " + speed) bu haliyle sadce hiziniz basar ama modle olmaz  ama (model + ) yaparsak artik nesnelerde sout kullanmadan direk method adi ve modelleri ile bastirabilirz ayni recursive method gibi olcak
    }

    //Methodlarda overloadin asiri yuklenme devamli cagirma metodu durumu
    void printInfo(){
        System.out.println("Model \t:" + this.model);
        System.out.println("Color \t:" + this.color);
        System.out.println("Type \t:" + this.type);
        System.out.println("Speed \t:" + this.speed);


    }

}
