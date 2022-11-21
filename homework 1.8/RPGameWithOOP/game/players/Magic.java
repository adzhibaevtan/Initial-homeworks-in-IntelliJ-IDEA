package game.players;

import game.general.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int increase = RPG_Game.random.nextInt(1, 30);
        for (int i = 0; i < heroes.length; i++) {
            if ( heroes[i].getHealth() > 0) {
                boss.setHealth(boss.getHealth() - (heroes[i].getDamage() + increase));
            }
        }
        System.out.println(" Wizard increased damage to all by " + increase);
    }
}
