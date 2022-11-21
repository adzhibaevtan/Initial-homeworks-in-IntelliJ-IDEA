package game.players;

import game.general.RPG_Game;

public class Burglar extends Hero {
    private SuperAbility looting;

    public Burglar(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.LOOT);
    }

    public void applySuperPower(Boss boss, Hero[] heroes) {
        int randomIndex = RPG_Game.random.nextInt(heroes.length);
        for (int i = 0; i < heroes.length; i++) {
            if (this.getHealth() > 0 && this != heroes[i])
                this.looting = heroes[randomIndex].getAbility();
        }
        System.out.println(" Burglar stael super ability of " + heroes[randomIndex].getAbility());
    }
}