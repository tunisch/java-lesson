public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    // this  = ben demek foe => karsi oluyor
    public int hit(Fighter foe) { // bir nesne baska nesneyle etkilesiyorsa bu method parametre alir *
        System.out.println(this.name + " => " + foe.name + " 'a " + this.damage + " hasar vurdu. ");
        if (foe.health - this.damage < 0) {
            return foe.health = 0;
        }
        return foe.health -= this.damage;
    }

    public boolean dodge() { // bu saldiriyi savurdum mu savurmadim mi cevabi verecegi icin boolean ile olusturulur
        double number = Math.random() * 100; // ne demek isteniyor?
        if (number <= dodge) {
            System.out.println("Savurdu ");
            return true;
        }
        return false;
    }
}
