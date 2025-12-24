public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    static void hit(Fighter foe, int damage) {
        foe.health -= damage;
        if (foe.dodge < damage) {
            System.out.println(foe.name + " " + damage + " hasar aldı. Kalan can: " + foe.health);
        } else {
            System.out.println(foe.name + " gelen hasarı savurdu.");
        }
        if (foe.health <= 0) {
            System.out.println(foe.name + " yenildi!");
        }
    }

    double dodge() {
        double randomValue = Math.random() * 100;

        return 1.0;
    }

}
