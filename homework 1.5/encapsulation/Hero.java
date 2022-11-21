public class Hero {
    private int Health;
    private int Damage;
    private String SuperPower;

    public Hero(int health, int damage, String superPower) {
        Health = health;
        Damage = damage;
        SuperPower = superPower;
    }

    public Hero(int health, int damage) {
        Health = health;
        Damage = damage;
    }

    public int getHealth() {
        return Health;
    }

    public int getDamage() {
        return Damage;
    }

    public String getSuperPower() {
        return SuperPower;
    }
}
