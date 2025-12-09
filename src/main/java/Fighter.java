public class Fighter {
    String name;
    int weight;
    int health;
    int damage;
    int block;

    Fighter(String name, int weight, int health, int damage, int block) {
        this.name = name;
        this.weight = weight;
        this.health = health;
        this.damage = damage;
        this.block = block;
    }

    public int attack(Fighter foe) { //foe "rakip" demek
        int actualDamage = this.damage - foe.block; // block hasarı azaltır
        if (actualDamage < 0) {
            actualDamage = 0; // negatif hasar olmasın
            foe.health -= actualDamage;
            System.out.println(this.name + " attacks " + foe.name + " for " + actualDamage + " damage!");
        }
        return 0;
    }

    boolean isWin() {
        return this.health > 0;
    }

    void printStatus() {
        System.out.println(this.name + " | Health: " + this.health);
    }


}
