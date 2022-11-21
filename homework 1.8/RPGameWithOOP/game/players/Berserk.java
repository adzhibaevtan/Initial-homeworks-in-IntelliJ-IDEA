package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Berserk extends Hero {

    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.RAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int rage = (boss.getDamage() / 5);

        boss.setHealth(boss.getHealth() - rage);
        System.out.println(" Berserker repulse " + rage);

    }


}