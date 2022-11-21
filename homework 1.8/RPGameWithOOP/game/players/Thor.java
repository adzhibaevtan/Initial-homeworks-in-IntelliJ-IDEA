package game.players;

import game.general.RPG_Game;

public class Thor extends Hero {

    public Thor(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.STAND);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int thorStand=RPG_Game.random.nextInt(5);

        if (thorStand == 3 && this.getHealth() > 0) {
            boss.setDamage(0);
            System.out.println(" Boss stunned");  }
        else {
                boss.setDamage(25);
            }
        }
    }

