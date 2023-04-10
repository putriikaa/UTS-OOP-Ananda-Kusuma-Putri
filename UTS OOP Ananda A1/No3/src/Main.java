public class Main {
    public static void main(String[] args) {

        Zombie zombie = new Zombie("Zombie", 002, 50);
        Pocong pocong = new Pocong("Pocong", 007, 100);
        Burung burung = new Burung("Burung", 006, 200);

        zombie.walk();
        pocong.jump();
        burung.fly();
        burung.walk();

    }
}