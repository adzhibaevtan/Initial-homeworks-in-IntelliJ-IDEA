package game.players;

public abstract class GameEntity {
    private int health;
    private int damage;
    private String name;

    public GameEntity(int health, int damage, String name) {
        this.health = health;
        this.damage = damage;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return this.getName() + "\u001B[32m" +" HP " + "\u001B[0m" + this.health + "\u001B[33m" + "  DAMAGE " + "\u001B[0m" +this.damage;
    }
}
