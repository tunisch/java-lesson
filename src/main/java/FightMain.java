public class FightMain {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Alex", 5, 100, 80, 0.5);
        Fighter f2 = new Fighter("Jack", 10, 90, 90, 0.3);
        f1.hit(f2);

        Ring r1 = new Ring(f1, f2, 75,95);
        r1.startFight(); // fight baslatmaya yarar

    }
}