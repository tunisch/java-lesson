class Car {
    //Nitelikler
    String type = "Sedan"; // burdak gibi bastan varsayilan oalrakta ayarlanabilir!
    String model;
    String color;
    int speed;
    int speedLimit = 180;

    //Davranislar
    void increaseSpeed(int increment) {
        if ((speed + increment) < speedLimit) {
            speed += increment;
        }
    }

    void decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
    }

    void printSpeed() {
        System.out.println("Hiziniz: " + speed);
    }
}
