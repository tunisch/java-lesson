
// methodlarda parametre disardan alinan bilgileri methoda icine eklemek icin kullanilir

// FIgther bize ne yapabildigini bildirir Ringte ne oldugunu anlatir
public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodgeChance;

    public Fighter(String name, int damage, int health, int weight, double dodgeChance) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodgeChance = dodgeChance;
    }

    // Class’ın field’ı olan bir şeyi aynı ( double dodgeChance) class’ın method’una(boolean dodge icindeki paranteze yazma) parametre olarak verme
    boolean dodge() { // bu saldiriyi savurdum mu savurmadim mi cevabi verecegi icin boolean ile olusturulur
        double random = Math.random();
        if (random < dodgeChance) {
            return true;
        } else {
            return false;
        }
    }

    // yukardaki ile ayni seydir
//    boolean dodge() {
//        double random = Math.random();
//        return random < dodgeChance;
//    }


    // this  = ben(vuran) demek opponent => karsi oluyor(vurulan)
    // burada methodu this cagiriyor parametre vurulani gosterir yani methodu kim cagiririyorsa o vurur ya da o karsiyi etkiler
    public void hit(Fighter opponent) { // bir nesne baska nesneyle etkilesiyorsa bu method parametre alir *
        if (opponent.dodge()) { // Eger karsi taraf dodgelarsa hasar almaz.
            System.out.println(opponent.name + " " + this.name + " den gelen hasari blokladi ");
            return;
        }
        opponent.takeDamage(this.damage); // opponent -> etkilenen this.damage -> verilen hasar
    }


    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }

}