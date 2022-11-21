package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coefficient = RPG_Game.random.nextInt(5) + 2;
        if (this.getHealth() > 0)
        boss.setHealth(boss.getHealth() - this.getDamage() * coefficient);
        System.out.println("\n " + this.getName() + " hits critically "
                + this.getDamage() * coefficient);
    }
}
